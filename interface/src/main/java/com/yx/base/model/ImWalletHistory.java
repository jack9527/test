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
 * ImWalletHistory generated by hbm2java
 */
@Entity
@Table(name = "im_wallet_history", catalog = "imdb")
public class ImWalletHistory implements java.io.Serializable {

	private Long id;
	private long userId;
	private int moneyType;
	private BigDecimal amount;
	private Integer destType;
	private long destId;
	private Integer moneyDirect;
	private String content;
	private long occurTime;

	public ImWalletHistory() {
	}

	public ImWalletHistory(long userId, int moneyType, BigDecimal amount, long destId, long occurTime) {
		this.userId = userId;
		this.moneyType = moneyType;
		this.amount = amount;
		this.destId = destId;
		this.occurTime = occurTime;
	}

	public ImWalletHistory(long userId, int moneyType, BigDecimal amount, Integer destType, long destId,
			Integer moneyDirect, String content, long occurTime) {
		this.userId = userId;
		this.moneyType = moneyType;
		this.amount = amount;
		this.destType = destType;
		this.destId = destId;
		this.moneyDirect = moneyDirect;
		this.content = content;
		this.occurTime = occurTime;
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

	@Column(name = "userId", nullable = false)
	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column(name = "moneyType", nullable = false)
	public int getMoneyType() {
		return this.moneyType;
	}

	public void setMoneyType(int moneyType) {
		this.moneyType = moneyType;
	}

	@Column(name = "amount", nullable = false, precision = 10)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "destType")
	public Integer getDestType() {
		return this.destType;
	}

	public void setDestType(Integer destType) {
		this.destType = destType;
	}

	@Column(name = "destId", nullable = false)
	public long getDestId() {
		return this.destId;
	}

	public void setDestId(long destId) {
		this.destId = destId;
	}

	@Column(name = "moneyDirect")
	public Integer getMoneyDirect() {
		return this.moneyDirect;
	}

	public void setMoneyDirect(Integer moneyDirect) {
		this.moneyDirect = moneyDirect;
	}

	@Column(name = "content", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "occurTime", nullable = false)
	public long getOccurTime() {
		return this.occurTime;
	}

	public void setOccurTime(long occurTime) {
		this.occurTime = occurTime;
	}

}
