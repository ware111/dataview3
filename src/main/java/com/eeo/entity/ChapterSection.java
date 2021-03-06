package com.eeo.entity;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table tb_chapter_section
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class ChapterSection implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chapter_section.section_id
     *
     * @mbg.generated
     */
    private Integer sectionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chapter_section.chapter_id
     *
     * @mbg.generated
     */
    private String chapterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chapter_section.section_name
     *
     * @mbg.generated
     */
    private String sectionName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chapter_section.section_content
     *
     * @mbg.generated
     */
    private String sectionContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chapter_section.section_times
     *
     * @mbg.generated
     */
    private String sectionTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chapter_section.section_questions
     *
     * @mbg.generated
     */
    private String sectionQuestions;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chapter_section.section_createtime
     *
     * @mbg.generated
     */
    private String sectionCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chapter_section.section_author
     *
     * @mbg.generated
     */
    private String sectionAuthor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chapter_section.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_chapter_section
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chapter_section.section_id
     *
     * @return the value of tb_chapter_section.section_id
     *
     * @mbg.generated
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chapter_section.section_id
     *
     * @param sectionId the value for tb_chapter_section.section_id
     *
     * @mbg.generated
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chapter_section.chapter_id
     *
     * @return the value of tb_chapter_section.chapter_id
     *
     * @mbg.generated
     */
    public String getChapterId() {
        return chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chapter_section.chapter_id
     *
     * @param chapterId the value for tb_chapter_section.chapter_id
     *
     * @mbg.generated
     */
    public void setChapterId(String chapterId) {
        this.chapterId = chapterId == null ? null : chapterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chapter_section.section_name
     *
     * @return the value of tb_chapter_section.section_name
     *
     * @mbg.generated
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chapter_section.section_name
     *
     * @param sectionName the value for tb_chapter_section.section_name
     *
     * @mbg.generated
     */
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chapter_section.section_content
     *
     * @return the value of tb_chapter_section.section_content
     *
     * @mbg.generated
     */
    public String getSectionContent() {
        return sectionContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chapter_section.section_content
     *
     * @param sectionContent the value for tb_chapter_section.section_content
     *
     * @mbg.generated
     */
    public void setSectionContent(String sectionContent) {
        this.sectionContent = sectionContent == null ? null : sectionContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chapter_section.section_times
     *
     * @return the value of tb_chapter_section.section_times
     *
     * @mbg.generated
     */
    public String getSectionTimes() {
        return sectionTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chapter_section.section_times
     *
     * @param sectionTimes the value for tb_chapter_section.section_times
     *
     * @mbg.generated
     */
    public void setSectionTimes(String sectionTimes) {
        this.sectionTimes = sectionTimes == null ? null : sectionTimes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chapter_section.section_questions
     *
     * @return the value of tb_chapter_section.section_questions
     *
     * @mbg.generated
     */
    public String getSectionQuestions() {
        return sectionQuestions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chapter_section.section_questions
     *
     * @param sectionQuestions the value for tb_chapter_section.section_questions
     *
     * @mbg.generated
     */
    public void setSectionQuestions(String sectionQuestions) {
        this.sectionQuestions = sectionQuestions == null ? null : sectionQuestions.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chapter_section.section_createtime
     *
     * @return the value of tb_chapter_section.section_createtime
     *
     * @mbg.generated
     */
    public String getSectionCreatetime() {
        return sectionCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chapter_section.section_createtime
     *
     * @param sectionCreatetime the value for tb_chapter_section.section_createtime
     *
     * @mbg.generated
     */
    public void setSectionCreatetime(String sectionCreatetime) {
        this.sectionCreatetime = sectionCreatetime == null ? null : sectionCreatetime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chapter_section.section_author
     *
     * @return the value of tb_chapter_section.section_author
     *
     * @mbg.generated
     */
    public String getSectionAuthor() {
        return sectionAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chapter_section.section_author
     *
     * @param sectionAuthor the value for tb_chapter_section.section_author
     *
     * @mbg.generated
     */
    public void setSectionAuthor(String sectionAuthor) {
        this.sectionAuthor = sectionAuthor == null ? null : sectionAuthor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chapter_section.remark
     *
     * @return the value of tb_chapter_section.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chapter_section.remark
     *
     * @param remark the value for tb_chapter_section.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}