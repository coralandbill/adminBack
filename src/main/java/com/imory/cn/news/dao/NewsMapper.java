package com.imory.cn.news.dao;

import com.imory.cn.news.dto.News;
import com.imory.cn.news.dto.NewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface NewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    @SelectProvider(type=NewsSqlProvider.class, method="countByExample")
    int countByExample(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    @DeleteProvider(type=NewsSqlProvider.class, method="deleteByExample")
    int deleteByExample(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    @Delete({
        "delete from news",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    @Insert({
        "insert into news (title, createTime, ",
        "source, imgUrl, ",
        "newsDate, updateTime, ",
        "newsType, creator, ",
        "content)",
        "values (#{title,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{source,jdbcType=VARCHAR}, #{imgUrl,jdbcType=VARCHAR}, ",
        "#{newsDate,jdbcType=DATE}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{newsType,jdbcType=INTEGER}, #{creator,jdbcType=INTEGER}, ",
        "#{content,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    @InsertProvider(type=NewsSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    @SelectProvider(type=NewsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="imgUrl", property="imgUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="newsDate", property="newsDate", jdbcType=JdbcType.DATE),
        @Result(column="updateTime", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="newsType", property="newsType", jdbcType=JdbcType.INTEGER),
        @Result(column="creator", property="creator", jdbcType=JdbcType.INTEGER),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<News> selectByExampleWithBLOBs(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    @SelectProvider(type=NewsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="imgUrl", property="imgUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="newsDate", property="newsDate", jdbcType=JdbcType.DATE),
        @Result(column="updateTime", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="newsType", property="newsType", jdbcType=JdbcType.INTEGER),
        @Result(column="creator", property="creator", jdbcType=JdbcType.INTEGER)
    })
    List<News> selectByExample(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    @Select({
        "select",
        "id, title, createTime, source, imgUrl, newsDate, updateTime, newsType, creator, ",
        "content",
        "from news",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="imgUrl", property="imgUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="newsDate", property="newsDate", jdbcType=JdbcType.DATE),
        @Result(column="updateTime", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="newsType", property="newsType", jdbcType=JdbcType.INTEGER),
        @Result(column="creator", property="creator", jdbcType=JdbcType.INTEGER),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    News selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    @UpdateProvider(type=NewsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    @UpdateProvider(type=NewsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") News record, @Param("example") NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    @UpdateProvider(type=NewsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    @UpdateProvider(type=NewsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    @Update({
        "update news",
        "set title = #{title,jdbcType=VARCHAR},",
          "createTime = #{createTime,jdbcType=TIMESTAMP},",
          "source = #{source,jdbcType=VARCHAR},",
          "imgUrl = #{imgUrl,jdbcType=VARCHAR},",
          "newsDate = #{newsDate,jdbcType=DATE},",
          "updateTime = #{updateTime,jdbcType=TIMESTAMP},",
          "newsType = #{newsType,jdbcType=INTEGER},",
          "creator = #{creator,jdbcType=INTEGER},",
          "content = #{content,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sat Dec 09 15:06:40 CST 2017
     */
    @Update({
        "update news",
        "set title = #{title,jdbcType=VARCHAR},",
          "createTime = #{createTime,jdbcType=TIMESTAMP},",
          "source = #{source,jdbcType=VARCHAR},",
          "imgUrl = #{imgUrl,jdbcType=VARCHAR},",
          "newsDate = #{newsDate,jdbcType=DATE},",
          "updateTime = #{updateTime,jdbcType=TIMESTAMP},",
          "newsType = #{newsType,jdbcType=INTEGER},",
          "creator = #{creator,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(News record);
}