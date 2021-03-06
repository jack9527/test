package com.yx.base.model;
// Generated 2018-1-28 22:30:03 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ImFavorite generated by hbm2java
 */
@Entity
@Table(name = "im_favorite", catalog = "imdb")
public class ImFavorite implements java.io.Serializable {

	private Long id;
	private Integer category;
	private Long fromId;
	private String fromName;
	private String fromHeadUrl;
	private Long createTime;
	private String content;
	private Long userId;

	public ImFavorite() {
	}

	public ImFavorite(Integer category, Long fromId, String fromName, String fromHeadUrl, Long createTime,
			String content, Long userId) {
		this.category = category;
		this.fromId = fromId;
		this.fromName = fromName;
		this.fromHeadUrl = fromHeadUrl;
		this.createTime = createTime;
		this.content = content;
		this.userId = userId;
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

	@Column(name = "category")
	public Integer getCategory() {
		return this.category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	@Column(name = "from_id")
	public Long getFromId() {
		return this.fromId;
	}

	public void setFromId(Long fromId) {
		this.fromId = fromId;
	}

	@Column(name = "from_name")
	public String getFromName() {
		return this.fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	@Column(name = "from_head_url")
	public String getFromHeadUrl() {
		return this.fromHeadUrl;
	}

	public void setFromHeadUrl(String fromHeadUrl) {
		this.fromHeadUrl = fromHeadUrl;
	}

	@Column(name = "create_time")
	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	@Column(name = "content", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "user_id")
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
