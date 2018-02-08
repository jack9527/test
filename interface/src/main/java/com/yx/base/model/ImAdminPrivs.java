package com.yx.base.model;
// Generated 2018-1-28 22:30:03 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ImAdminPrivs generated by hbm2java
 */
@Entity
@Table(name = "im_admin_privs", catalog = "imdb")
public class ImAdminPrivs implements java.io.Serializable {

	private Long id;
	private long roleid;
	private String menus;

	public ImAdminPrivs() {
	}

	public ImAdminPrivs(long roleid, String menus) {
		this.roleid = roleid;
		this.menus = menus;
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

	@Column(name = "roleid", nullable = false)
	public long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(long roleid) {
		this.roleid = roleid;
	}

	@Column(name = "menus", nullable = false, length = 65535)
	public String getMenus() {
		return this.menus;
	}

	public void setMenus(String menus) {
		this.menus = menus;
	}

}