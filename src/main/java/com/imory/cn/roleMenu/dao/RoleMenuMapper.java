package com.imory.cn.roleMenu.dao;

import com.imory.cn.roleMenu.dto.RoleMenu;
import com.imory.cn.roleMenu.dto.RoleMenuExample;
import com.imory.cn.roleMenu.dto.RoleMenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface RoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Tue Dec 05 13:14:08 CST 2017
     */
    @SelectProvider(type=RoleMenuSqlProvider.class, method="countByExample")
    int countByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Tue Dec 05 13:14:08 CST 2017
     */
    @DeleteProvider(type=RoleMenuSqlProvider.class, method="deleteByExample")
    int deleteByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Tue Dec 05 13:14:08 CST 2017
     */
    @Delete({
        "delete from role_menu",
        "where menuid = #{menuid,jdbcType=INTEGER}",
          "and roleid = #{roleid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(RoleMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Tue Dec 05 13:14:08 CST 2017
     */
    @Insert({
        "insert into role_menu (menuid, roleid, ",
        "flag, creator, create_time)",
        "values (#{menuid,jdbcType=INTEGER}, #{roleid,jdbcType=INTEGER}, ",
        "#{flag,jdbcType=INTEGER}, #{creator,jdbcType=INTEGER}, #{create_time,jdbcType=TIMESTAMP})"
    })
    int insert(RoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Tue Dec 05 13:14:08 CST 2017
     */
    @InsertProvider(type=RoleMenuSqlProvider.class, method="insertSelective")
    int insertSelective(RoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Tue Dec 05 13:14:08 CST 2017
     */
    @SelectProvider(type=RoleMenuSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="menuid", property="menuid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleid", property="roleid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="creator", property="creator", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="create_time", jdbcType=JdbcType.TIMESTAMP)
    })
    List<RoleMenu> selectByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Tue Dec 05 13:14:08 CST 2017
     */
    @Select({
        "select",
        "menuid, roleid, flag, creator, create_time",
        "from role_menu",
        "where menuid = #{menuid,jdbcType=INTEGER}",
          "and roleid = #{roleid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="menuid", property="menuid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleid", property="roleid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="creator", property="creator", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="create_time", jdbcType=JdbcType.TIMESTAMP)
    })
    RoleMenu selectByPrimaryKey(RoleMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Tue Dec 05 13:14:08 CST 2017
     */
    @UpdateProvider(type=RoleMenuSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Tue Dec 05 13:14:08 CST 2017
     */
    @UpdateProvider(type=RoleMenuSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Tue Dec 05 13:14:08 CST 2017
     */
    @UpdateProvider(type=RoleMenuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(RoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Tue Dec 05 13:14:08 CST 2017
     */
    @Update({
        "update role_menu",
        "set flag = #{flag,jdbcType=INTEGER},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{create_time,jdbcType=TIMESTAMP}",
        "where menuid = #{menuid,jdbcType=INTEGER}",
          "and roleid = #{roleid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RoleMenu record);
}