package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 老师发布的公告
 *
 * @author 
 * @email
 */
@TableName("gonggao_laoshi")
public class GonggaoLaoshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GonggaoLaoshiEntity() {

	}

	public GonggaoLaoshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

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
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "GonggaoLaoshi{" +
            "id=" + id +
            ", laoshiId=" + laoshiId +
            ", gonggaoLaoshiName=" + gonggaoLaoshiName +
            ", gonggaoLaoshiTypes=" + gonggaoLaoshiTypes +
            ", insertTime=" + insertTime +
            ", gonggaoLaoshiContent=" + gonggaoLaoshiContent +
            ", createTime=" + createTime +
        "}";
    }
}
