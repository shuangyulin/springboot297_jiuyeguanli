package com.entity.model;

import com.entity.GonggaoLaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 老师发布的公告
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GonggaoLaoshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 老师
     */
    private Integer laoshiId;


    /**
     * 公告名称
     */
    private String gonggaoLaoshiName;


    /**
     * 公告类型
     */
    private Integer gonggaoLaoshiTypes;


    /**
     * 公告发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 公告详情
     */
    private String gonggaoLaoshiContent;


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
	 * 获取：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 设置：老师
	 */
    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 获取：公告名称
	 */
    public String getGonggaoLaoshiName() {
        return gonggaoLaoshiName;
    }


    /**
	 * 设置：公告名称
	 */
    public void setGonggaoLaoshiName(String gonggaoLaoshiName) {
        this.gonggaoLaoshiName = gonggaoLaoshiName;
    }
    /**
	 * 获取：公告类型
	 */
    public Integer getGonggaoLaoshiTypes() {
        return gonggaoLaoshiTypes;
    }


    /**
	 * 设置：公告类型
	 */
    public void setGonggaoLaoshiTypes(Integer gonggaoLaoshiTypes) {
        this.gonggaoLaoshiTypes = gonggaoLaoshiTypes;
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
    public String getGonggaoLaoshiContent() {
        return gonggaoLaoshiContent;
    }


    /**
	 * 设置：公告详情
	 */
    public void setGonggaoLaoshiContent(String gonggaoLaoshiContent) {
        this.gonggaoLaoshiContent = gonggaoLaoshiContent;
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
