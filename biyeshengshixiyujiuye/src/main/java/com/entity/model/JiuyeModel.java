package com.entity.model;

import com.entity.JiuyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 就业信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiuyeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 企业
     */
    private Integer qiyeId;


    /**
     * 入职时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiuyeKaishiTime;


    /**
     * 入职岗位
     */
    private String jiuyeGangweiName;


    /**
     * 相关文件
     */
    private String jiuyeFile;


    /**
     * 就业备注
     */
    private String jiuyeContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：企业
	 */
    public Integer getQiyeId() {
        return qiyeId;
    }


    /**
	 * 设置：企业
	 */
    public void setQiyeId(Integer qiyeId) {
        this.qiyeId = qiyeId;
    }
    /**
	 * 获取：入职时间
	 */
    public Date getJiuyeKaishiTime() {
        return jiuyeKaishiTime;
    }


    /**
	 * 设置：入职时间
	 */
    public void setJiuyeKaishiTime(Date jiuyeKaishiTime) {
        this.jiuyeKaishiTime = jiuyeKaishiTime;
    }
    /**
	 * 获取：入职岗位
	 */
    public String getJiuyeGangweiName() {
        return jiuyeGangweiName;
    }


    /**
	 * 设置：入职岗位
	 */
    public void setJiuyeGangweiName(String jiuyeGangweiName) {
        this.jiuyeGangweiName = jiuyeGangweiName;
    }
    /**
	 * 获取：相关文件
	 */
    public String getJiuyeFile() {
        return jiuyeFile;
    }


    /**
	 * 设置：相关文件
	 */
    public void setJiuyeFile(String jiuyeFile) {
        this.jiuyeFile = jiuyeFile;
    }
    /**
	 * 获取：就业备注
	 */
    public String getJiuyeContent() {
        return jiuyeContent;
    }


    /**
	 * 设置：就业备注
	 */
    public void setJiuyeContent(String jiuyeContent) {
        this.jiuyeContent = jiuyeContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
