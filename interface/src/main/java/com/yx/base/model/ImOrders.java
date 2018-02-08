package com.yx.base.model;
// Generated 2018-1-28 22:30:03 by Hibernate Tools 5.2.3.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ImOrders generated by hbm2java
 */
@Entity
@Table(name = "im_orders", catalog = "imdb")
public class ImOrders implements java.io.Serializable {

	private Long id;
	private String orderSn;
	private BigDecimal fee;
	private int createtime;
	private String token;
	private short status;
	private long userId;
	private BigDecimal tradefee;
	private int type;
	private String desc;
	private String currencyCode;
	private String plat;

	public ImOrders() {
	}

	public ImOrders(String orderSn, BigDecimal fee, int createtime, String token, short status, long userId,
			BigDecimal tradefee, int type, String desc, String currencyCode, String plat) {
		this.orderSn = orderSn;
		this.fee = fee;
		this.createtime = createtime;
		this.token = token;
		this.status = status;
		this.userId = userId;
		this.tradefee = tradefee;
		this.type = type;
		this.desc = desc;
		this.currencyCode = currencyCode;
		this.plat = plat;
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

	@Column(name = "order_sn", nullable = false)
	public String getOrderSn() {
		return this.orderSn;
	}

	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}

	@Column(name = "fee", nullable = false, precision = 18)
	public BigDecimal getFee() {
		return this.fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	@Column(name = "createtime", nullable = false)
	public int getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(int createtime) {
		this.createtime = createtime;
	}

	@Column(name = "token", nullable = false)
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Column(name = "status", nullable = false)
	public short getStatus() {
		return this.status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	@Column(name = "userId", nullable = false)
	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column(name = "tradefee", nullable = false, precision = 18)
	public BigDecimal getTradefee() {
		return this.tradefee;
	}

	public void setTradefee(BigDecimal tradefee) {
		this.tradefee = tradefee;
	}

	@Column(name = "type", nullable = false)
	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Column(name = "desc", nullable = false, length = 65535)
	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Column(name = "currencyCode", nullable = false)
	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@Column(name = "plat", nullable = false)
	public String getPlat() {
		return this.plat;
	}

	public void setPlat(String plat) {
		this.plat = plat;
	}

}
