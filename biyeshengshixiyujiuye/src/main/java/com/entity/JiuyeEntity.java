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
 * 就业信息
 *
 * @author 
 * @email
 */
@TableName("jiuye")
public class JiuyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiuyeEntity() {

	}

	public JiuyeEntity(T t) {
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
     * 入职时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jiuye_kaishi_time")

    private Date jiuyeKaishiTime;


    /**
     * 入职岗位
     */
    @TableField(value = "jiuye_gangwei_name")

    private String jiuyeGangweiName;


    /**
     * 相关文件
     */
    @TableField(value = "jiuye_file")

    private String jiuyeFile;


    /**
     * 就业备注
     */
    @TableField(value = "jiuye_content")

    private String jiuyeContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：入职时间
	 */
    public Date getJiuyeKaishiTime() {
        return jiuyeKaishiTime;
    }
    /**
	 * 获取：入职时间
	 */

    public void setJiuyeKaishiTime(Date jiuyeKaishiTime) {
        this.jiuyeKaishiTime = jiuyeKaishiTime;
    }
    /**
	 * 设置：入职岗位
	 */
    public String getJiuyeGangweiName() {
        return jiuyeGangweiName;
    }
    /**
	 * 获取：入职岗位
	 */

    public void setJiuyeGangweiName(String jiuyeGangweiName) {
        this.jiuyeGangweiName = jiuyeGangweiName;
    }
    /**
	 * 设置：相关文件
	 */
    public String getJiuyeFile() {
        return jiuyeFile;
    }
    /**
	 * 获取：相关文件
	 */

    public void setJiuyeFile(String jiuyeFile) {
        this.jiuyeFile = jiuyeFile;
    }
    /**
	 * 设置：就业备注
	 */
    public String getJiuyeContent() {
        return jiuyeContent;
    }
    /**
	 * 获取：就业备注
	 */

    public void setJiuyeContent(String jiuyeContent) {
        this.jiuyeContent = jiuyeContent;
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

    @Override
    public String toString() {
        return "Jiuye{" +
            "id=" + id +
            ", xueshengId=" + xueshengId +
            ", qiyeId=" + qiyeId +
            ", jiuyeKaishiTime=" + jiuyeKaishiTime +
            ", jiuyeGangweiName=" + jiuyeGangweiName +
            ", jiuyeFile=" + jiuyeFile +
            ", jiuyeContent=" + jiuyeContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
