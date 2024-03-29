package com.yjdz.zncdz.dao;

import com.yjdz.zncdz.entity.Accountinfo;
import com.yjdz.zncdz.entity.AccountinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AccountinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountinfo
     *
     * @mbg.generated
     */
    long countByExample(AccountinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountinfo
     *
     * @mbg.generated
     */
    int deleteByExample(AccountinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountinfo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountinfo
     *
     * @mbg.generated
     */
    int insert(Accountinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountinfo
     *
     * @mbg.generated
     */
    int insertSelective(Accountinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountinfo
     *
     * @mbg.generated
     */
    List<Accountinfo> selectByExample(AccountinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountinfo
     *
     * @mbg.generated
     */
    Accountinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountinfo
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Accountinfo record, @Param("example") AccountinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountinfo
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Accountinfo record, @Param("example") AccountinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountinfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Accountinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountinfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Accountinfo record);
}