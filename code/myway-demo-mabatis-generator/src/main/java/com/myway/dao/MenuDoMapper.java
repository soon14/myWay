package com.myway.dao;

import com.myway.domain.MenuDo;
import com.myway.domain.MenuDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated
     */
    long countByExample(MenuDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated
     */
    int deleteByExample(MenuDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated
     */
    int insert(MenuDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated
     */
    int insertSelective(MenuDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated
     */
    List<MenuDo> selectByExample(MenuDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MenuDo record, @Param("example") MenuDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MenuDo record, @Param("example") MenuDoExample example);
}