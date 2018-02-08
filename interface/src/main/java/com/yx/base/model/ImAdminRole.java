package com.yx.base.model;
// Generated 2018-1-28 22:30:03 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ImAdminRole generated by hbm2java
 */
@Entity
@Table(name = "im_admin_role", catalog = "imdb")
public class ImAdminRole implements java.io.Serializable {

	private Long id;
	private String name;
	private boolean status;
	private String desc;

	public ImAdminRole() {
	}

	public ImAdminRole(String name, boolean status, String desc) {
		this.name = name;
		this.status = status;
		this.desc = desc;
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

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Column(name = "desc", nullable = false, length = 65535)
	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
