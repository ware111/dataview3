package com.eeo.socket;


import com.eeo.service.ClassRoomService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@EnableScheduling
@Component
@ServerEndpoint("/dayClassRoom")
public class DayClassRoomSocketServer {

    @Autowired
    ClassRoomService roomService;

   //静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
    private static int onlineCount = 0;

    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。若要实现服务端与单一客户端通信的话，可以使用Map来存放，其中Key可以为用户标识
    private static CopyOnWriteArraySet<DayClassRoomSocketServer> webSocketSet = new CopyOnWriteArraySet<DayClassRoomSocketServer>();

    private static CopyOnWriteArraySet<Session> webSessionSet = new CopyOnWriteArraySet<Session>();

    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    public static Session session;

    public static KafkaConsumer< String,String> dayClassRoomConsumer;


    /**
     * 连接建立成功调用的方法
     * @param session  可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
     */
    @OnOpen
    public void onOpen(Session session) throws EncodeException, IOException {
        this.session = session;
        webSocketSet.add(this);     //加入set中
        addOnlineCount();           //在线数加1
        webSessionSet.add(session);
    }


    @OnError
    public void onError(Throwable throwable, Session session) {
        System.out.println("pathParams:" + session.getPathParameters());
        System.out.println("requestParams" + session.getRequestParameterMap());
        System.out.print("onError" + throwable.toString());
    }

    /**
     * 关闭连接时触发
     *

     */
    @OnClose
    public void onClose(Session session) {
        webSocketSet.remove(this);  //从set中删除
        webSessionSet.remove(session);
        subOnlineCount();           //在线数减1
        System.out.println("pathParams:" + session.getPathParameters());
        System.out.println("requestParams" + session.getRequestParameterMap());
        System.out.print("onClose ");

    }
    /**
     * 接收前端传过来的数据。
     * 虽然在实现推送逻辑中并不需要接收前端数据，但是作为一个webSocket的教程或叫备忘，还是将接收数据的逻辑加上了。
     */
    @OnMessage
    public void onMessage(String message ,Session session){
        System.out.println(message + "from " + session.getId());
    }
    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        DayClassRoomSocketServer.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        DayClassRoomSocketServer.onlineCount--;
    }

    public static CopyOnWriteArraySet<DayClassRoomSocketServer> getWebSocketSet() {
        return webSocketSet;
    }

    public static void setWebSocketSet(CopyOnWriteArraySet<DayClassRoomSocketServer> webSocketSet) {
        DayClassRoomSocketServer.webSocketSet = webSocketSet;
    }

    public static Session getSession(){
        return session;
    }

    public static CopyOnWriteArraySet<Session> getWebSessionSet() {
        return webSessionSet;
    }

    public static void setWebSessionSet(CopyOnWriteArraySet<Session> webSessionSet) {
        DayClassRoomSocketServer.webSessionSet = webSessionSet;
    }
}
