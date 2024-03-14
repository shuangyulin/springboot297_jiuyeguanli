package com.entity.vo;

import com.entity.QiyeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 企业
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qiye")
public class QiyeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 企业名称
     */

    @TableField(value = "qiye_name")
    private String qiyeName;


    /**
     * 企业地址
     */

    @TableField(value = "qiye_address")
    private String qiyeAddress;


    /**
     * 企业图片
     */

    @TableField(value = "qiye_photo")
    private String qiyePhoto;


    /**
     * 企业联系方式
     */

    @TableField(value = "qiye_phone")
    private String qiyePhone;


    /**
     * 企业邮箱
     */

    @TableField(value = "qiye_email")
    private String qiyeEmail;


    /**
     * 所在行业
     */

    @TableField(value = "qiye_types")
    private Integer qiyeTypes;


    /**
     * 企业详情
     */

    @TableField(value = "qiye_content")
    private String qiyeContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：企业名称
	 */
    public String getQiyeName() {
        return qiyeName;
    }


    /**
	 * 获取：企业名称
	 */

    public void setQiyeName(String qiyeName) {
        this.qiyeName = qiyeName;
    }
    /**
	 * 设置：企业地址
	 */
    public String getQiyeAddress() {
        return qiyeAddress;
    }


    /**
	 * 获取：企业地址
	 */

    public void setQiyeAddress(String qiyeAddress) {
        this.qiyeAddress = qiyeAddress;
    }
    /**
	 * 设置：企业图片
	 */
    public String getQiyePhoto() {
        return qiyePhoto;
    }


    /**
	 * 获取：企业图片
	 */

    public void setQiyePhoto(String qiyePhoto) {
        this.qiyePhoto = qiyePhoto;
    }
    /**
	 * 设置：企业联系方式
	 */
    public String getQiyePhone() {
        return qiyePhone;
    }


    /**
	 * 获取：企业联系方式
	 */

    public void setQiyePhone(String qiyePhone) {
        this.qiyePhone = qiyePhone;
    }
    /**
	 * 设置：企业邮箱
	 */
    public String getQiyeEmail() {
        return qiyeEmail;
    }


    /**
	 * 获取：企业邮箱
	 */

    public void setQiyeEmail(String qiyeEmail) {
        this.qiyeEmail = qiyeEmail;
    }
    /**
	 * 设置：所在行业
	 */
    public Integer getQiyeTypes() {
        return qiyeTypes;
    }


    /**
	 * 获取：所在行业
	 */

    public void setQiyeTypes(Integer qiyeTypes) {
        this.qiyeTypes = qiyeTypes;
    }
    /**
	 * 设置：企业详情
	 */
    public String getQiyeContent() {
        return qiyeContent;
    }


    /**
	 * 获取：企业详情
	 */

    public void setQiyeContent(String qiyeContent) {
        this.qiyeContent = qiyeContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
