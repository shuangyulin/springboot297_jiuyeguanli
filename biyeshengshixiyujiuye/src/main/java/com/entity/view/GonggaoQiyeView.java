package com.entity.view;

import com.entity.GonggaoQiyeEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 企业发布的公告
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gonggao_qiye")
public class GonggaoQiyeView extends GonggaoQiyeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 公告类型的值
		*/
		private String gonggaoQiyeValue;



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

	public GonggaoQiyeView() {

	}

	public GonggaoQiyeView(GonggaoQiyeEntity gonggaoQiyeEntity) {
		try {
			BeanUtils.copyProperties(this, gonggaoQiyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 公告类型的值
			*/
			public String getGonggaoQiyeValue() {
				return gonggaoQiyeValue;
			}
			/**
			* 设置： 公告类型的值
			*/
			public void setGonggaoQiyeValue(String gonggaoQiyeValue) {
				this.gonggaoQiyeValue = gonggaoQiyeValue;
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






}
