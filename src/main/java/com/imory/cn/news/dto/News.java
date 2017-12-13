package com.imory.cn.news.dto;

import org.joda.time.DateTime;

import java.util.Date;

public class News {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.id
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.title
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.createTime
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.source
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.imgUrl
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    private String imgUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.newsDate
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    private Date newsDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.updateTime
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.newsType
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    private Integer newsType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.creator
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    private Integer creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.content
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.id
     *
     * @return the value of news.id
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.id
     *
     * @param id the value for news.id
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.title
     *
     * @return the value of news.title
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.title
     *
     * @param title the value for news.title
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.createTime
     *
     * @return the value of news.createTime
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.createTime
     *
     * @param createTime the value for news.createTime
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.source
     *
     * @return the value of news.source
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.source
     *
     * @param source the value for news.source
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.imgUrl
     *
     * @return the value of news.imgUrl
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.imgUrl
     *
     * @param imgUrl the value for news.imgUrl
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.newsDate
     *
     * @return the value of news.newsDate
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public Date getNewsDate() {
        return newsDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.newsDate
     *
     * @param newsDate the value for news.newsDate
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.updateTime
     *
     * @return the value of news.updateTime
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.updateTime
     *
     * @param updateTime the value for news.updateTime
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.newsType
     *
     * @return the value of news.newsType
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public Integer getNewsType() {
        return newsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.newsType
     *
     * @param newsType the value for news.newsType
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public void setNewsType(Integer newsType) {
        this.newsType = newsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.creator
     *
     * @return the value of news.creator
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.creator
     *
     * @param creator the value for news.creator
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.content
     *
     * @return the value of news.content
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.content
     *
     * @param content the value for news.content
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}