package com.yx.base.model;
// Generated 2018-1-28 22:30:03 by Hibernate Tools 5.2.3.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ImRockView generated by hbm2java
 */
@Entity
@Table(name = "im_rock_view", catalog = "imdb")
public class ImRockView implements java.io.Serializable {

	private ImRockViewId id;

	public ImRockView() {
	}

	public ImRockView(ImRockViewId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "userid", column = @Column(name = "userid", nullable = false)),
			@AttributeOverride(name = "lat", column = @Column(name = "lat", nullable = false, length = 50)),
			@AttributeOverride(name = "lng", column = @Column(name = "lng", nullable = false, length = 50)),
			@AttributeOverride(name = "updatetime", column = @Column(name = "updatetime", nullable = false)),
			@AttributeOverride(name = "sex", column = @Column(name = "sex", length = 11)),
			@AttributeOverride(name = "headUrl", column = @Column(name = "headUrl", length = 65535)),
			@AttributeOverride(name = "name", column = @Column(name = "name")) })
	public ImRockViewId getId() {
		return this.id;
	}

	public void setId(ImRockViewId id) {
		this.id = id;
	}

}
