package com.entity.vo;

import com.entity.GonggaoLaoshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 老师发布的公告
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gonggao_laoshi")
public class GonggaoLaoshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 老师
     */

    @TableField(value = "laoshi_id")
    private Integer laoshiId;


    /**
     * 公告名称
     */

    @TableField(value = "gonggao_laoshi_name")
    private String gonggaoLaoshiName;


    /**
     * 公告类型
     */

    @TableField(value = "gonggao_laoshi_types")
    private Integer gonggaoLaoshiTypes;


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

    @TableField(value = "gonggao_laoshi_content")
    private String gonggaoLaoshiContent;


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
	 * 设置：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 获取：老师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：公告名称
	 */
    public String getGonggaoLaoshiName() {
        return gonggaoLaoshiName;
    }


    /**
	 * 获取：公告名称
	 */

    public void setGonggaoLaoshiName(String gonggaoLaoshiName) {
        this.gonggaoLaoshiName = gonggaoLaoshiName;
    }
    /**
	 * 设置：公告类型
	 */
    public Integer getGonggaoLaoshiTypes() {
        return gonggaoLaoshiTypes;
    }


    /**
	 * 获取：公告类型
	 */

    public void setGonggaoLaoshiTypes(Integer gonggaoLaoshiTypes) {
        this.gonggaoLaoshiTypes = gonggaoLaoshiTypes;
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
    public String getGonggaoLaoshiContent() {
        return gonggaoLaoshiContent;
    }


    /**
	 * 获取：公告详情
	 */

    public void setGonggaoLaoshiContent(String gonggaoLaoshiContent) {
        this.gonggaoLaoshiContent = gonggaoLaoshiContent;
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
