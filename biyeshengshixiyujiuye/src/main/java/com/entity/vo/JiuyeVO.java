package com.entity.vo;

import com.entity.JiuyeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 就业信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiuye")
public class JiuyeVO implements Serializable {
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

}
