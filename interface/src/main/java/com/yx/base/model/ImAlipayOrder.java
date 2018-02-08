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
 * ImAlipayOrder generated by hbm2java
 */
@Entity
@Table(name = "im_alipay_order", catalog = "imdb")
public class ImAlipayOrder implements java.io.Serializable {

	private Long id;
	private String tradeNo;
	private Long userId;
	private Integer tradeType;
	private BigDecimal amount;
	private Long createTime;
	private Integer status;
	private String productNo;

	public ImAlipayOrder() {
	}

	public ImAlipayOrder(String tradeNo, Long userId, Integer tradeType, BigDecimal amount, Long createTime,
			Integer status, String productNo) {
		this.tradeNo = tradeNo;
		this.userId = userId;
		this.tradeType = tradeType;
		this.amount = amount;
		this.createTime = createTime;
		this.status = status;
		this.productNo = productNo;
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

	@Column(name = "tradeNo")
	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	@Column(name = "userId")
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "tradeType")
	public Integer getTradeType() {
		return this.tradeType;
	}

	public void setTradeType(Integer tradeType) {
		this.tradeType = tradeType;
	}

	@Column(name = "amount", precision = 10)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	@Column(name = "productNo")
	public String getProductNo() {
		return this.productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

}
