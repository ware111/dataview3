package com.eeo.entity;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table tb_course_chapter
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class CourseChapter implements Serializable {
    /**
     * Database Column Remarks:
     *   章节id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_course_chapter.chapter_id
     *
     * @mbg.generated
     */
    private Integer chapterId;

    /**
     * Database Column Remarks:
     *   课程id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_course_chapter.course_id
     *
     * @mbg.generated
     */
    private String courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_course_chapter.chapter_name
     *
     * @mbg.generated
     */
    private String chapterName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_course_chapter.chapter_content
     *
     * @mbg.generated
     */
    private String chapterContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_course_chapter
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_course_chapter.chapter_id
     *
     * @return the value of tb_course_chapter.chapter_id
     *
     * @mbg.generated
     */
    public Integer getChapterId() {
        return chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_course_chapter.chapter_id
     *
     * @param chapterId the value for tb_course_chapter.chapter_id
     *
     * @mbg.generated
     */
    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_course_chapter.course_id
     *
     * @return the value of tb_course_chapter.course_id
     *
     * @mbg.generated
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_course_chapter.course_id
     *
     * @param courseId the value for tb_course_chapter.course_id
     *
     * @mbg.generated
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_course_chapter.chapter_name
     *
     * @return the value of tb_course_chapter.chapter_name
     *
     * @mbg.generated
     */
    public String getChapterName() {
        return chapterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_course_chapter.chapter_name
     *
     * @param chapterName the value for tb_course_chapter.chapter_name
     *
     * @mbg.generated
     */
    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_course_chapter.chapter_content
     *
     * @return the value of tb_course_chapter.chapter_content
     *
     * @mbg.generated
     */
    public String getChapterContent() {
        return chapterContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_course_chapter.chapter_content
     *
     * @param chapterContent the value for tb_course_chapter.chapter_content
     *
     * @mbg.generated
     */
    public void setChapterContent(String chapterContent) {
        this.chapterContent = chapterContent == null ? null : chapterContent.trim();
    }
}