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
 * 企业发布的公告
 *
 * @author 
 * @email
 */
@TableName("gonggao_qiye")
public class GonggaoQiyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GonggaoQiyeEntity() {

	}

	public GonggaoQiyeEntity(T t) {
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "GonggaoQiye{" +
            "id=" + id +
            ", qiyeId=" + qiyeId +
            ", gonggaoQiyeName=" + gonggaoQiyeName +
            ", gonggaoQiyeTypes=" + gonggaoQiyeTypes +
            ", insertTime=" + insertTime +
            ", gonggaoQiyeContent=" + gonggaoQiyeContent +
            ", createTime=" + createTime +
        "}";
    }
}
