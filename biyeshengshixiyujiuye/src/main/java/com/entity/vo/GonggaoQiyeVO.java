package com.entity.vo;

import com.entity.GonggaoQiyeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 企业发布的公告
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gonggao_qiye")
public class GonggaoQiyeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 企业
     */

    @TableField(value = "qiye_id")
    private Integer qiyeId;


    /**
     * 公告名称
     */

    @TableField(value = "gonggao_qiye_name")
    private String gonggaoQiyeName;


    /**
     * 公告类型
     */

    @TableField(value = "gonggao_qiye_types")
    private Integer gonggaoQiyeTypes;


    /**
     * 公告发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 公告详情
     */

    @TableField(value = "gonggao_qiye_content")
    private String gonggaoQiyeContent;


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
	 * 设置：公告名称
	 */
    public String getGonggaoQiyeName() {
        return gonggaoQiyeName;
    }


    /**
	 * 获取：公告名称
	 */

    public void setGonggaoQiyeName(String gonggaoQiyeName) {
        this.gonggaoQiyeName = gonggaoQiyeName;
    }
    /**
	 * 设置：公告类型
	 */
    public Integer getGonggaoQiyeTypes() {
        return gonggaoQiyeTypes;
    }


    /**
	 * 获取：公告类型
	 */

    public void setGonggaoQiyeTypes(Integer gonggaoQiyeTypes) {
        this.gonggaoQiyeTypes = gonggaoQiyeTypes;
    }
    /**
	 * 设置：公告发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：公告发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：公告详情
	 */
    public String getGonggaoQiyeContent() {
        return gonggaoQiyeContent;
    }


    /**
	 * 获取：公告详情
	 */

    public void setGonggaoQiyeContent(String gonggaoQiyeContent) {
        this.gonggaoQiyeContent = gonggaoQiyeContent;
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
