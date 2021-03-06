package com.yx.base.model;
// Generated 2018-1-28 22:30:03 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ImGroup generated by hbm2java
 */
@Entity
@Table(name = "im_group", catalog = "imdb")
public class ImGroup implements java.io.Serializable {

	private Long id;
	private String name;
	private String descriptions;
	private String detail;
	private String headUrl;
	private Long createrId;
	private Long createTime;

	public ImGroup() {
	}

	public ImGroup(String name, String descriptions, String detail, String headUrl, Long createrId, Long createTime) {
		this.name = name;
		this.descriptions = descriptions;
		this.detail = detail;
		this.headUrl = headUrl;
		this.createrId = createrId;
		this.createTime = createTime;
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

	@Column(name = "descriptions")
	public String getDescriptions() {
		return this.descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	@Column(name = "detail")
	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Column(name = "headUrl", length = 65535)
	public String getHeadUrl() {
		return this.headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	@Column(name = "createrId")
	public Long getCreaterId() {
		return this.createrId;
	}

	public void setCreaterId(Long createrId) {
		this.createrId = createrId;
	}

	@Column(name = "createTime")
	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

}
