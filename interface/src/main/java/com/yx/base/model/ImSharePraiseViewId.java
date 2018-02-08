package com.yx.base.model;
// Generated 2018-1-28 22:30:03 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ImSharePraiseViewId generated by hbm2java
 */
@Embeddable
public class ImSharePraiseViewId implements java.io.Serializable {

	private Long sid;
	private Long userId;
	private Date createtime;
	private String nickName;

	public ImSharePraiseViewId() {
	}

	public ImSharePraiseViewId(Long sid, Long userId, Date createtime, String nickName) {
		this.sid = sid;
		this.userId = userId;
		this.createtime = createtime;
		this.nickName = nickName;
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

	@Column(name = "createtime", length = 19)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "nickName")
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ImSharePraiseViewId))
			return false;
		ImSharePraiseViewId castOther = (ImSharePraiseViewId) other;

		return ((this.getSid() == castOther.getSid())
				|| (this.getSid() != null && castOther.getSid() != null && this.getSid().equals(castOther.getSid())))
				&& ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
						&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this.getCreatetime() != null
						&& castOther.getCreatetime() != null && this.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getNickName() == castOther.getNickName()) || (this.getNickName() != null
						&& castOther.getNickName() != null && this.getNickName().equals(castOther.getNickName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSid() == null ? 0 : this.getSid().hashCode());
		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getNickName() == null ? 0 : this.getNickName().hashCode());
		return result;
	}

}