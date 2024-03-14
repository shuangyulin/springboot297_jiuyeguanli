package com.entity.view;

import com.entity.JiuyeEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 就业信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiuye")
public class JiuyeView extends JiuyeEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 qiye
			/**
			* 企业名称
			*/
			private String qiyeName;
			/**
			* 企业地址
			*/
			private String qiyeAddress;
			/**
			* 企业图片
			*/
			private String qiyePhoto;
			/**
			* 企业联系方式
			*/
			private String qiyePhone;
			/**
			* 企业邮箱
			*/
			private String qiyeEmail;
			/**
			* 所在行业
			*/
			private Integer qiyeTypes;
				/**
				* 所在行业的值
				*/
				private String qiyeValue;
			/**
			* 企业详情
			*/
			private String qiyeContent;

		//级联表 xuesheng
			/**
			* 学生姓名
			*/
			private String xueshengName;
			/**
			* 学生手机号
			*/
			private String xueshengPhone;
			/**
			* 学生身份证号
			*/
			private String xueshengIdNumber;
			/**
			* 学生头像
			*/
			private String xueshengPhoto;
			/**
			* 院系
			*/
			private Integer yuanxiTypes;
				/**
				* 院系的值
				*/
				private String yuanxiValue;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;
			/**
			* 电子邮箱
			*/
			private String xueshengEmail;

	public JiuyeView() {

	}

	public JiuyeView(JiuyeEntity jiuyeEntity) {
		try {
			BeanUtils.copyProperties(this, jiuyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}























				//级联表的get和set qiye

					/**
					* 获取： 企业名称
					*/
					public String getQiyeName() {
						return qiyeName;
					}
					/**
					* 设置： 企业名称
					*/
					public void setQiyeName(String qiyeName) {
						this.qiyeName = qiyeName;
					}

					/**
					* 获取： 企业地址
					*/
					public String getQiyeAddress() {
						return qiyeAddress;
					}
					/**
					* 设置： 企业地址
					*/
					public void setQiyeAddress(String qiyeAddress) {
						this.qiyeAddress = qiyeAddress;
					}

					/**
					* 获取： 企业图片
					*/
					public String getQiyePhoto() {
						return qiyePhoto;
					}
					/**
					* 设置： 企业图片
					*/
					public void setQiyePhoto(String qiyePhoto) {
						this.qiyePhoto = qiyePhoto;
					}

					/**
					* 获取： 企业联系方式
					*/
					public String getQiyePhone() {
						return qiyePhone;
					}
					/**
					* 设置： 企业联系方式
					*/
					public void setQiyePhone(String qiyePhone) {
						this.qiyePhone = qiyePhone;
					}

					/**
					* 获取： 企业邮箱
					*/
					public String getQiyeEmail() {
						return qiyeEmail;
					}
					/**
					* 设置： 企业邮箱
					*/
					public void setQiyeEmail(String qiyeEmail) {
						this.qiyeEmail = qiyeEmail;
					}

					/**
					* 获取： 所在行业
					*/
					public Integer getQiyeTypes() {
						return qiyeTypes;
					}
					/**
					* 设置： 所在行业
					*/
					public void setQiyeTypes(Integer qiyeTypes) {
						this.qiyeTypes = qiyeTypes;
					}


						/**
						* 获取： 所在行业的值
						*/
						public String getQiyeValue() {
							return qiyeValue;
						}
						/**
						* 设置： 所在行业的值
						*/
						public void setQiyeValue(String qiyeValue) {
							this.qiyeValue = qiyeValue;
						}

					/**
					* 获取： 企业详情
					*/
					public String getQiyeContent() {
						return qiyeContent;
					}
					/**
					* 设置： 企业详情
					*/
					public void setQiyeContent(String qiyeContent) {
						this.qiyeContent = qiyeContent;
					}





				//级联表的get和set xuesheng

					/**
					* 获取： 学生姓名
					*/
					public String getXueshengName() {
						return xueshengName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setXueshengName(String xueshengName) {
						this.xueshengName = xueshengName;
					}

					/**
					* 获取： 学生手机号
					*/
					public String getXueshengPhone() {
						return xueshengPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setXueshengPhone(String xueshengPhone) {
						this.xueshengPhone = xueshengPhone;
					}

					/**
					* 获取： 学生身份证号
					*/
					public String getXueshengIdNumber() {
						return xueshengIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setXueshengIdNumber(String xueshengIdNumber) {
						this.xueshengIdNumber = xueshengIdNumber;
					}

					/**
					* 获取： 学生头像
					*/
					public String getXueshengPhoto() {
						return xueshengPhoto;
					}
					/**
					* 设置： 学生头像
					*/
					public void setXueshengPhoto(String xueshengPhoto) {
						this.xueshengPhoto = xueshengPhoto;
					}

					/**
					* 获取： 院系
					*/
					public Integer getYuanxiTypes() {
						return yuanxiTypes;
					}
					/**
					* 设置： 院系
					*/
					public void setYuanxiTypes(Integer yuanxiTypes) {
						this.yuanxiTypes = yuanxiTypes;
					}


						/**
						* 获取： 院系的值
						*/
						public String getYuanxiValue() {
							return yuanxiValue;
						}
						/**
						* 设置： 院系的值
						*/
						public void setYuanxiValue(String yuanxiValue) {
							this.yuanxiValue = yuanxiValue;
						}

					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}

					/**
					* 获取： 电子邮箱
					*/
					public String getXueshengEmail() {
						return xueshengEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setXueshengEmail(String xueshengEmail) {
						this.xueshengEmail = xueshengEmail;
					}




}
