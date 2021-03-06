package com.yx.base.model;
// Generated 2018-1-28 22:30:03 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ImUser generated by hbm2java
 */
@Entity
@Table(name = "im_user", catalog = "imdb")
public class ImUser implements java.io.Serializable {

	private Long id;
	private String name;
	private String account;
	private String idNo;
	private String nickName;
	private String realName;
	private String pwd;
	private String mobile;
	private String mail;
	private String sex;
	private Long birthday;
	private String sign;
	private String province;
	private Integer isOnline;
	private Integer needAuth;
	private String period;
	private Integer searchMobile;
	private Integer newNotification;
	private String city;
	private String district;
	private Long createTime;
	private Integer status;
	private String detail;
	private Integer isAuth;
	private String headUrl;
	private Long recommandUserId;
	private String longitude;
	private String feedBackImage;
	private String latitude;
	private String alipayName;
	private String alipayAccount;

	public ImUser() {
	}

	public ImUser(String name, String account, String idNo, String nickName, String realName, String pwd, String mobile,
			String mail, String sex, Long birthday, String sign, String province, Integer isOnline, Integer needAuth,
			String period, Integer searchMobile, Integer newNotification, String city, String district, Long createTime,
			Integer status, String detail, Integer isAuth, String headUrl, Long recommandUserId, String longitude,
			String feedBackImage, String latitude, String alipayName, String alipayAccount) {
		this.name = name;
		this.account = account;
		this.idNo = idNo;
		this.nickName = nickName;
		this.realName = realName;
		this.pwd = pwd;
		this.mobile = mobile;
		this.mail = mail;
		this.sex = sex;
		this.birthday = birthday;
		this.sign = sign;
		this.province = province;
		this.isOnline = isOnline;
		this.needAuth = needAuth;
		this.period = period;
		this.searchMobile = searchMobile;
		this.newNotification = newNotification;
		this.city = city;
		this.district = district;
		this.createTime = createTime;
		this.status = status;
		this.detail = detail;
		this.isAuth = isAuth;
		this.headUrl = headUrl;
		this.recommandUserId = recommandUserId;
		this.longitude = longitude;
		this.feedBackImage = feedBackImage;
		this.latitude = latitude;
		this.alipayName = alipayName;
		this.alipayAccount = alipayAccount;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "account")
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "idNo")
	public String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	@Column(name = "nickName")
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "realName")
	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	@Column(name = "pwd")
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Column(name = "mobile")
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "mail")
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name = "sex", length = 11)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "birthday")
	public Long getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}

	@Column(name = "sign")
	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Column(name = "province", length = 11)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "isOnline")
	public Integer getIsOnline() {
		return this.isOnline;
	}

	public void setIsOnline(Integer isOnline) {
		this.isOnline = isOnline;
	}

	@Column(name = "needAuth")
	public Integer getNeedAuth() {
		return this.needAuth;
	}

	public void setNeedAuth(Integer needAuth) {
		this.needAuth = needAuth;
	}

	@Column(name = "period")
	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	@Column(name = "searchMobile")
	public Integer getSearchMobile() {
		return this.searchMobile;
	}

	public void setSearchMobile(Integer searchMobile) {
		this.searchMobile = searchMobile;
	}

	@Column(name = "newNotification")
	public Integer getNewNotification() {
		return this.newNotification;
	}

	public void setNewNotification(Integer newNotification) {
		this.newNotification = newNotification;
	}

	@Column(name = "city", length = 11)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "district", length = 11)
	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Column(name = "createTime")
	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "detail")
	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Column(name = "isAuth")
	public Integer getIsAuth() {
		return this.isAuth;
	}

	public void setIsAuth(Integer isAuth) {
		this.isAuth = isAuth;
	}

	@Column(name = "headUrl", length = 65535)
	public String getHeadUrl() {
		return this.headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	@Column(name = "recommandUserId")
	public Long getRecommandUserId() {
		return this.recommandUserId;
	}

	public void setRecommandUserId(Long recommandUserId) {
		this.recommandUserId = recommandUserId;
	}

	@Column(name = "longitude")
	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Column(name = "feedBackImage", length = 65535)
	public String getFeedBackImage() {
		return this.feedBackImage;
	}

	public void setFeedBackImage(String feedBackImage) {
		this.feedBackImage = feedBackImage;
	}

	@Column(name = "latitude")
	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name = "alipayName")
	public String getAlipayName() {
		return this.alipayName;
	}

	public void setAlipayName(String alipayName) {
		this.alipayName = alipayName;
	}

	@Column(name = "alipayAccount")
	public String getAlipayAccount() {
		return this.alipayAccount;
	}

	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

}
