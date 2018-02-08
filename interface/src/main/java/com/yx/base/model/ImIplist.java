package com.yx.base.model;
// Generated 2018-1-28 22:30:03 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ImIplist generated by hbm2java
 */
@Entity
@Table(name = "im_iplist", catalog = "imdb")
public class ImIplist implements java.io.Serializable {

	private Long id;
	private String country;
	private String provinces;
	private String ip;
	private Integer status;

	public ImIplist() {
	}

	public ImIplist(String country, String provinces, String ip, Integer status) {
		this.country = country;
		this.provinces = provinces;
		this.ip = ip;
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

	@Column(name = "country")
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "provinces", length = 65535)
	public String getProvinces() {
		return this.provinces;
	}

	public void setProvinces(String provinces) {
		this.provinces = provinces;
	}

	@Column(name = "ip")
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
