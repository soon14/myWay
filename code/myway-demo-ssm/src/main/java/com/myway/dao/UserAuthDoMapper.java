package com.myway.dao;

import com.myway.domain.UserAuthDo;
import com.myway.domain.UserAuthDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAuthDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    long countByExample(UserAuthDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    int deleteByExample(UserAuthDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    int insert(UserAuthDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    int insertSelective(UserAuthDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    List<UserAuthDo> selectByExample(UserAuthDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserAuthDo record, @Param("example") UserAuthDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserAuthDo record, @Param("example") UserAuthDoExample example);
}