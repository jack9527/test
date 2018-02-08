package com.yx.base.model;
// Generated 2018-1-28 22:30:03 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ImGroupMember generated by hbm2java
 */
@Entity
@Table(name = "im_group_member", catalog = "imdb")
public class ImGroupMember implements java.io.Serializable {

	private Long id;
	private Long groupId;
	private Long userId;
	private String markName;
	private Integer role;
	private Long creatorId;
	private Long createTime;
	private Integer receiveTip;
	private Integer isAccept;

	public ImGroupMember() {
	}

	public ImGroupMember(Long groupId, Long userId, String markName, Integer role, Long creatorId, Long createTime,
			Integer receiveTip, Integer isAccept) {
		this.groupId = groupId;
		this.userId = userId;
		this.markName = markName;
		this.role = role;
		this.creatorId = creatorId;
		this.createTime = createTime;
		this.receiveTip = receiveTip;
		this.isAccept = isAccept;
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

	@Column(name = "groupId")
	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	@Column(name = "userId")
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "markName")
	public String getMarkName() {
		return this.markName;
	}

	public void setMarkName(String markName) {
		this.markName = markName;
	}

	@Column(name = "role")
	public Integer getRole() {
		return this.role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	@Column(name = "creatorId")
	public Long getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	@Column(name = "createTime")
	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	@Column(name = "receiveTip")
	public Integer getReceiveTip() {
		return this.receiveTip;
	}

	public void setReceiveTip(Integer receiveTip) {
		this.receiveTip = receiveTip;
	}

	@Column(name = "isAccept")
	public Integer getIsAccept() {
		return this.isAccept;
	}

	public void setIsAccept(Integer isAccept) {
		this.isAccept = isAccept;
	}

}
