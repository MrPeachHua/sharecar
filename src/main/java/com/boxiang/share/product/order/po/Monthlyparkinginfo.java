package com.boxiang.share.product.order.po;

import java.io.Serializable;

public class Monthlyparkinginfo implements Serializable {
	//private static final long serialVersionUID = 1L;

	/** 小区ID */
	private java.lang.String villageName;
	/** 车牌号 */
	private java.lang.String carNumber;

	/** 车主姓名 */
	private java.lang.String owner;

	/** 身份信息 */
	private java.lang.String certificate;

	/** 车主联系地址 */
	private java.lang.String address;

	/** 车主联系电话 */
	private java.lang.String phone;

	/** 车辆颜色(1黑2白3其他) */
	private java.lang.Integer carColor;

	/** 月租单价 */
	private Long monthlyRentalPrice;

	/** 是否有违规情况 */
	private java.lang.String iillegalFlg;

	/** 当月有效标识 0：有效;1：无效 */
	private java.lang.String validityFlg;
	

	//开始时间结束时间
	private java.util.Date effect_begin_time;
	
	private java.util.Date effect_end_time;
	
	private java.util.Date max_date;
	private java.lang.String onlinePayment;//是否开通线上支付 0 不开通 1 开通
	private String isUsed;
	private String moduleName;
	private String parkCode;

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	/** 创建时间 */
	private java.util.Date createTime;

	/** 创建者 */
	private java.lang.String createUser;

	/** 更新时间 */
	private java.util.Date updateTime;

	/** 更新者 */
	private java.lang.String updateUser;

	/**  */
	private java.lang.String item01;

	/**  */
	private java.lang.String item02;

	/**  */
	private java.lang.String item03;

	/**  */
	private java.lang.String item04;

	/**  */
	private java.lang.String item05;
	
	private java.lang.String villageId;
	
	private String parkingStr;
	private String module;
	private String newCarNumber;


	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getNewCarNumber() {
		return newCarNumber;
	}

	public void setNewCarNumber(String newCarNumber) {
		this.newCarNumber = newCarNumber;
	}

	public String getParkingStr() {
		return parkingStr;
	}

	public void setParkingStr(String parkingStr) {
		this.parkingStr = parkingStr;
	}

	/** 月租订单看是时间*/
	private String validityStartTime;
	
	/** 月租订单结束时间*/
	private String validityEndTime;
	
	private String makeUp;

	public String getMakeUp() {
		return makeUp;
	}

private String isExpired;//是否过期 0 过期  1 未过期

	public String getIsExpired() {
		return isExpired;
	}

	public void setIsExpired(String isExpired) {
		this.isExpired = isExpired;
	}

	public String getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(String isUsed) {
		this.isUsed = isUsed;
	}

	public void setMakeUp(String makeUp) {
		this.makeUp = makeUp;
	}

	public String getValidityStartTime() {
		return validityStartTime;
	}

	public void setValidityStartTime(String validityStartTime) {
		this.validityStartTime = validityStartTime;
	}

	public String getValidityEndTime() {
		return validityEndTime;
	}

	public void setValidityEndTime(String validityEndTime) {
		this.validityEndTime = validityEndTime;
	}

	public String getParkCode() {
		return parkCode;
	}

	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}

	public java.lang.String getOnlinePayment() {
		return onlinePayment;
	}

	public void setOnlinePayment(java.lang.String onlinePayment) {
		this.onlinePayment = onlinePayment;
	}

	public java.util.Date getMax_date() {
		return max_date;
	}

	public void setMax_date(java.util.Date max_date) {
		this.max_date = max_date;
	}

	public java.lang.String getVillageName() {
		return villageName;
	}

	public void setVillageName(java.lang.String villageName) {
		this.villageName = villageName;
	}

	public java.util.Date getEffect_begin_time() {
		return effect_begin_time;
	}

	public void setEffect_begin_time(java.util.Date effect_begin_time) {
		this.effect_begin_time = effect_begin_time;
	}

	public java.util.Date getEffect_end_time() {
		return effect_end_time;
	}

	public void setEffect_end_time(java.util.Date effect_end_time) {
		this.effect_end_time = effect_end_time;
	}

	public void setVillageId(java.lang.String villageId) {
		this.villageId = villageId;
	}
	
	public java.lang.String getVillageId() {
		return this.villageId;
	}

	public void setCarNumber(java.lang.String carNumber) {
		this.carNumber = carNumber;
	}
	
	public java.lang.String getCarNumber() {
		return this.carNumber;
	}

	public void setOwner(java.lang.String owner) {
		this.owner = owner;
	}
	
	public java.lang.String getOwner() {
		return this.owner;
	}

	public void setCertificate(java.lang.String certificate) {
		this.certificate = certificate;
	}
	
	public java.lang.String getCertificate() {
		return this.certificate;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}
	
	public java.lang.String getAddress() {
		return this.address;
	}

	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}
	
	public java.lang.String getPhone() {
		return this.phone;
	}

	public void setCarColor(java.lang.Integer carColor) {
		this.carColor = carColor;
	}
	
	public java.lang.Integer getCarColor() {
		return this.carColor;
	}

	public void setMonthlyRentalPrice(Long monthlyRentalPrice) {
		this.monthlyRentalPrice = monthlyRentalPrice;
	}
	
	public Long getMonthlyRentalPrice() {
		return this.monthlyRentalPrice;
	}

	public void setIillegalFlg(java.lang.String iillegalFlg) {
		this.iillegalFlg = iillegalFlg;
	}
	
	public java.lang.String getIillegalFlg() {
		return this.iillegalFlg;
	}

	public void setValidityFlg(java.lang.String validityFlg) {
		this.validityFlg = validityFlg;
	}
	
	public java.lang.String getValidityFlg() {
		return this.validityFlg;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	
	public java.util.Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateUser(java.lang.String createUser) {
		this.createUser = createUser;
	}
	
	public java.lang.String getCreateUser() {
		return this.createUser;
	}

	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateUser(java.lang.String updateUser) {
		this.updateUser = updateUser;
	}
	
	public java.lang.String getUpdateUser() {
		return this.updateUser;
	}

	public void setItem01(java.lang.String item01) {
		this.item01 = item01;
	}
	
	public java.lang.String getItem01() {
		return this.item01;
	}

	public void setItem02(java.lang.String item02) {
		this.item02 = item02;
	}
	
	public java.lang.String getItem02() {
		return this.item02;
	}

	public void setItem03(java.lang.String item03) {
		this.item03 = item03;
	}
	
	public java.lang.String getItem03() {
		return this.item03;
	}

	public void setItem04(java.lang.String item04) {
		this.item04 = item04;
	}
	
	public java.lang.String getItem04() {
		return this.item04;
	}

	public void setItem05(java.lang.String item05) {
		this.item05 = item05;
	}
	
	public java.lang.String getItem05() {
		return this.item05;
	}

}