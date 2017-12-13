package com.imory.cn.role.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.imory.cn.role.dto.Role;
import com.imory.cn.role.dto.RoleExample.Criteria;
import com.imory.cn.role.dto.RoleExample.Criterion;
import com.imory.cn.role.dto.RoleExample;
import java.util.List;
import java.util.Map;

public class RoleSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Dec 05 13:11:53 CST 2017
     */
    public String countByExample(RoleExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("role");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Dec 05 13:11:53 CST 2017
     */
    public String deleteByExample(RoleExample example) {
        BEGIN();
        DELETE_FROM("role");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Dec 05 13:11:53 CST 2017
     */
    public String insertSelective(Role record) {
        BEGIN();
        INSERT_INTO("role");
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getCreate_time() != null) {
            VALUES("create_time", "#{create_time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreator() != null) {
            VALUES("creator", "#{creator,jdbcType=INTEGER}");
        }
        
        if (record.getDescription() != null) {
            VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdate_user() != null) {
            VALUES("update_user", "#{update_user,jdbcType=INTEGER}");
        }
        
        if (record.getUpdate_time() != null) {
            VALUES("update_time", "#{update_time,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Dec 05 13:11:53 CST 2017
     */
    public String selectByExample(RoleExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("name");
        SELECT("create_time");
        SELECT("creator");
        SELECT("description");
        SELECT("update_user");
        SELECT("update_time");
        FROM("role");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Dec 05 13:11:53 CST 2017
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Role record = (Role) parameter.get("record");
        RoleExample example = (RoleExample) parameter.get("example");
        
        BEGIN();
        UPDATE("role");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getCreate_time() != null) {
            SET("create_time = #{record.create_time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreator() != null) {
            SET("creator = #{record.creator,jdbcType=INTEGER}");
        }
        
        if (record.getDescription() != null) {
            SET("description = #{record.description,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdate_user() != null) {
            SET("update_user = #{record.update_user,jdbcType=INTEGER}");
        }
        
        if (record.getUpdate_time() != null) {
            SET("update_time = #{record.update_time,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Dec 05 13:11:53 CST 2017
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("role");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("name = #{record.name,jdbcType=VARCHAR}");
        SET("create_time = #{record.create_time,jdbcType=TIMESTAMP}");
        SET("creator = #{record.creator,jdbcType=INTEGER}");
        SET("description = #{record.description,jdbcType=VARCHAR}");
        SET("update_user = #{record.update_user,jdbcType=INTEGER}");
        SET("update_time = #{record.update_time,jdbcType=TIMESTAMP}");
        
        RoleExample example = (RoleExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Dec 05 13:11:53 CST 2017
     */
    public String updateByPrimaryKeySelective(Role record) {
        BEGIN();
        UPDATE("role");
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getCreate_time() != null) {
            SET("create_time = #{create_time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreator() != null) {
            SET("creator = #{creator,jdbcType=INTEGER}");
        }
        
        if (record.getDescription() != null) {
            SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdate_user() != null) {
            SET("update_user = #{update_user,jdbcType=INTEGER}");
        }
        
        if (record.getUpdate_time() != null) {
            SET("update_time = #{update_time,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Dec 05 13:11:53 CST 2017
     */
    protected void applyWhere(RoleExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}