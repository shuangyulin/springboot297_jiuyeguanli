package com.entity.model;

import com.entity.GonggaoQiyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 企业发布的公告
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GonggaoQiyeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 企业
     */
    private Integer qiyeId;


    /**
     * 公告名称
     */
    private String gonggaoQiyeName;


    /**
     * 公告类型
     */
    private Integer gonggaoQiyeTypes;


    /**
     * 公告发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 公告详情
     */
    private String gonggaoQiyeContent;


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
	 * 获取：公告名称
	 */
    public String getGonggaoQiyeName() {
        return gonggaoQiyeName;
    }


    /**
	 * 设置：公告名称
	 */
    public void setGonggaoQiyeName(String gonggaoQiyeName) {
        this.gonggaoQiyeName = gonggaoQiyeName;
    }
    /**
	 * 获取：公告类型
	 */
    public Integer getGonggaoQiyeTypes() {
        return gonggaoQiyeTypes;
    }


    /**
	 * 设置：公告类型
	 */
    public void setGonggaoQiyeTypes(Integer gonggaoQiyeTypes) {
        this.gonggaoQiyeTypes = gonggaoQiyeTypes;
    }
    /**
	 * 获取：公告发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：公告发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：公告详情
	 */
    public String getGonggaoQiyeContent() {
        return gonggaoQiyeContent;
    }


    /**
	 * 设置：公告详情
	 */
    public void setGonggaoQiyeContent(String gonggaoQiyeContent) {
        this.gonggaoQiyeContent = gonggaoQiyeContent;
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
