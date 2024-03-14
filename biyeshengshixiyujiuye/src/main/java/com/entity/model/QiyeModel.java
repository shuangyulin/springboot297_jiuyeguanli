package com.entity.model;

import com.entity.QiyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 企业
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QiyeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 企业名称
     */
    private String qiyeName;


    /**
     * 企业地址
     */
    private String qiyeAddress;


    /**
     * 企业图片
     */
    private String qiyePhoto;


    /**
     * 企业联系方式
     */
    private String qiyePhone;


    /**
     * 企业邮箱
     */
    private String qiyeEmail;


    /**
     * 所在行业
     */
    private Integer qiyeTypes;


    /**
     * 企业详情
     */
    private String qiyeContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：企业名称
	 */
    public String getQiyeName() {
        return qiyeName;
    }


    /**
	 * 设置：企业名称
	 */
    public void setQiyeName(String qiyeName) {
        this.qiyeName = qiyeName;
    }
    /**
	 * 获取：企业地址
	 */
    public String getQiyeAddress() {
        return qiyeAddress;
    }


    /**
	 * 设置：企业地址
	 */
    public void setQiyeAddress(String qiyeAddress) {
        this.qiyeAddress = qiyeAddress;
    }
    /**
	 * 获取：企业图片
	 */
    public String getQiyePhoto() {
        return qiyePhoto;
    }


    /**
	 * 设置：企业图片
	 */
    public void setQiyePhoto(String qiyePhoto) {
        this.qiyePhoto = qiyePhoto;
    }
    /**
	 * 获取：企业联系方式
	 */
    public String getQiyePhone() {
        return qiyePhone;
    }


    /**
	 * 设置：企业联系方式
	 */
    public void setQiyePhone(String qiyePhone) {
        this.qiyePhone = qiyePhone;
    }
    /**
	 * 获取：企业邮箱
	 */
    public String getQiyeEmail() {
        return qiyeEmail;
    }


    /**
	 * 设置：企业邮箱
	 */
    public void setQiyeEmail(String qiyeEmail) {
        this.qiyeEmail = qiyeEmail;
    }
    /**
	 * 获取：所在行业
	 */
    public Integer getQiyeTypes() {
        return qiyeTypes;
    }


    /**
	 * 设置：所在行业
	 */
    public void setQiyeTypes(Integer qiyeTypes) {
        this.qiyeTypes = qiyeTypes;
    }
    /**
	 * 获取：企业详情
	 */
    public String getQiyeContent() {
        return qiyeContent;
    }


    /**
	 * 设置：企业详情
	 */
    public void setQiyeContent(String qiyeContent) {
        this.qiyeContent = qiyeContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
