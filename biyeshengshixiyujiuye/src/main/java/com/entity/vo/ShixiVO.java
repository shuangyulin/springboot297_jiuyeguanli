package com.entity.vo;

import com.entity.ShixiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实习信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shixi")
public class ShixiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "xuesheng_id")
    private Integer xueshengId;


    /**
     * 企业
     */

    @TableField(value = "qiye_id")
    private Integer qiyeId;


    /**
     * 实习名称
     */

    @TableField(value = "shixi_name")
    private String shixiName;


    /**
     * 实习类型
     */

    @TableField(value = "shixi_types")
    private Integer shixiTypes;


    /**
     * 实习开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shixi_kaishi_time")
    private Date shixiKaishiTime;


    /**
     * 实习结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shixi_jieshu_time")
    private Date shixiJieshuTime;


    /**
     * 实习结果
     */

    @TableField(value = "shixi_jieguo_types")
    private Integer shixiJieguoTypes;


    /**
     * 实习岗位
     */

    @TableField(value = "shixi_gangwei_name")
    private String shixiGangweiName;


    /**
     * 实习详情
     */

    @TableField(value = "shixi_content")
    private String shixiContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：企业
	 */
    public Integer getQiyeId() {
        return qiyeId;
    }


    /**
	 * 获取：企业
	 */

    public void setQiyeId(Integer qiyeId) {
        this.qiyeId = qiyeId;
    }
    /**
	 * 设置：实习名称
	 */
    public String getShixiName() {
        return shixiName;
    }


    /**
	 * 获取：实习名称
	 */

    public void setShixiName(String shixiName) {
        this.shixiName = shixiName;
    }
    /**
	 * 设置：实习类型
	 */
    public Integer getShixiTypes() {
        return shixiTypes;
    }


    /**
	 * 获取：实习类型
	 */

    public void setShixiTypes(Integer shixiTypes) {
        this.shixiTypes = shixiTypes;
    }
    /**
	 * 设置：实习开始时间
	 */
    public Date getShixiKaishiTime() {
        return shixiKaishiTime;
    }


    /**
	 * 获取：实习开始时间
	 */

    public void setShixiKaishiTime(Date shixiKaishiTime) {
        this.shixiKaishiTime = shixiKaishiTime;
    }
    /**
	 * 设置：实习结束时间
	 */
    public Date getShixiJieshuTime() {
        return shixiJieshuTime;
    }


    /**
	 * 获取：实习结束时间
	 */

    public void setShixiJieshuTime(Date shixiJieshuTime) {
        this.shixiJieshuTime = shixiJieshuTime;
    }
    /**
	 * 设置：实习结果
	 */
    public Integer getShixiJieguoTypes() {
        return shixiJieguoTypes;
    }


    /**
	 * 获取：实习结果
	 */

    public void setShixiJieguoTypes(Integer shixiJieguoTypes) {
        this.shixiJieguoTypes = shixiJieguoTypes;
    }
    /**
	 * 设置：实习岗位
	 */
    public String getShixiGangweiName() {
        return shixiGangweiName;
    }


    /**
	 * 获取：实习岗位
	 */

    public void setShixiGangweiName(String shixiGangweiName) {
        this.shixiGangweiName = shixiGangweiName;
    }
    /**
	 * 设置：实习详情
	 */
    public String getShixiContent() {
        return shixiContent;
    }


    /**
	 * 获取：实习详情
	 */

    public void setShixiContent(String shixiContent) {
        this.shixiContent = shixiContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
