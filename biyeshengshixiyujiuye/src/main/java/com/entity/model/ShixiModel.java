package com.entity.model;

import com.entity.ShixiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实习信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShixiModel implements Serializable {
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
     * 实习名称
     */
    private String shixiName;


    /**
     * 实习类型
     */
    private Integer shixiTypes;


    /**
     * 实习开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shixiKaishiTime;


    /**
     * 实习结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shixiJieshuTime;


    /**
     * 实习结果
     */
    private Integer shixiJieguoTypes;


    /**
     * 实习岗位
     */
    private String shixiGangweiName;


    /**
     * 实习详情
     */
    private String shixiContent;


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
	 * 获取：实习名称
	 */
    public String getShixiName() {
        return shixiName;
    }


    /**
	 * 设置：实习名称
	 */
    public void setShixiName(String shixiName) {
        this.shixiName = shixiName;
    }
    /**
	 * 获取：实习类型
	 */
    public Integer getShixiTypes() {
        return shixiTypes;
    }


    /**
	 * 设置：实习类型
	 */
    public void setShixiTypes(Integer shixiTypes) {
        this.shixiTypes = shixiTypes;
    }
    /**
	 * 获取：实习开始时间
	 */
    public Date getShixiKaishiTime() {
        return shixiKaishiTime;
    }


    /**
	 * 设置：实习开始时间
	 */
    public void setShixiKaishiTime(Date shixiKaishiTime) {
        this.shixiKaishiTime = shixiKaishiTime;
    }
    /**
	 * 获取：实习结束时间
	 */
    public Date getShixiJieshuTime() {
        return shixiJieshuTime;
    }


    /**
	 * 设置：实习结束时间
	 */
    public void setShixiJieshuTime(Date shixiJieshuTime) {
        this.shixiJieshuTime = shixiJieshuTime;
    }
    /**
	 * 获取：实习结果
	 */
    public Integer getShixiJieguoTypes() {
        return shixiJieguoTypes;
    }


    /**
	 * 设置：实习结果
	 */
    public void setShixiJieguoTypes(Integer shixiJieguoTypes) {
        this.shixiJieguoTypes = shixiJieguoTypes;
    }
    /**
	 * 获取：实习岗位
	 */
    public String getShixiGangweiName() {
        return shixiGangweiName;
    }


    /**
	 * 设置：实习岗位
	 */
    public void setShixiGangweiName(String shixiGangweiName) {
        this.shixiGangweiName = shixiGangweiName;
    }
    /**
	 * 获取：实习详情
	 */
    public String getShixiContent() {
        return shixiContent;
    }


    /**
	 * 设置：实习详情
	 */
    public void setShixiContent(String shixiContent) {
        this.shixiContent = shixiContent;
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
