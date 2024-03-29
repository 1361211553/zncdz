package com.yjdz.zncdz.dao;

import com.yjdz.zncdz.entity.Powerinfo;
import com.yjdz.zncdz.entity.PowerinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PowerinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    long countByExample(PowerinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    int deleteByExample(PowerinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    int insert(Powerinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    int insertSelective(Powerinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    List<Powerinfo> selectByExample(PowerinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    Powerinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Powerinfo record, @Param("example") PowerinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Powerinfo record, @Param("example") PowerinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Powerinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Powerinfo record);
}