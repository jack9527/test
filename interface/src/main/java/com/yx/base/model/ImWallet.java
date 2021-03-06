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
 * ImWallet generated by hbm2java
 */
@Entity
@Table(name = "im_wallet", catalog = "imdb")
public class ImWallet implements java.io.Serializable {

	private Long id;
	private Long userId;
	private BigDecimal money;
	private Integer status;

	public ImWallet() {
	}

	public ImWallet(Long userId, BigDecimal money, Integer status) {
		this.userId = userId;
		this.money = money;
		this.status = status;
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

	@Column(name = "userId")
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "money", precision = 10)
	public BigDecimal getMoney() {
		return this.money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
