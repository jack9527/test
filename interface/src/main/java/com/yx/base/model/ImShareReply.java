package com.yx.base.model;
// Generated 2018-1-28 22:30:03 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ImShareReply generated by hbm2java
 */
@Entity
@Table(name = "im_share_reply", catalog = "imdb")
public class ImShareReply implements java.io.Serializable {

	private Long id;
	private Long sid;
	private Long userId;
	private Long fuserId;
	private String content;
	private Long createtime;
	private Boolean type;

	public ImShareReply() {
	}

	public ImShareReply(Long sid, Long userId, Long fuserId, String content, Long createtime, Boolean type) {
		this.sid = sid;
		this.userId = userId;
		this.fuserId = fuserId;
		this.content = content;
		this.createtime = createtime;
		this.type = type;
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

	@Column(name = "sid")
	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	@Column(name = "userId")
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "fuserId")
	public Long getFuserId() {
		return this.fuserId;
	}

	public void setFuserId(Long fuserId) {
		this.fuserId = fuserId;
	}

	@Column(name = "content", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "createtime")
	public Long getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Long createtime) {
		this.createtime = createtime;
	}

	@Column(name = "type")
	public Boolean getType() {
		return this.type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

}
