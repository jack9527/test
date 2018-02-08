package com.yx.base.model;
// Generated 2018-1-28 22:30:03 by Hibernate Tools 5.2.3.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ImSharePraiseView generated by hbm2java
 */
@Entity
@Table(name = "im_share_praise_view", catalog = "imdb")
public class ImSharePraiseView implements java.io.Serializable {

	private ImSharePraiseViewId id;

	public ImSharePraiseView() {
	}

	public ImSharePraiseView(ImSharePraiseViewId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "sid", column = @Column(name = "sid")),
			@AttributeOverride(name = "userId", column = @Column(name = "userId")),
			@AttributeOverride(name = "createtime", column = @Column(name = "createtime", length = 19)),
			@AttributeOverride(name = "nickName", column = @Column(name = "nickName")) })
	public ImSharePraiseViewId getId() {
		return this.id;
	}

	public void setId(ImSharePraiseViewId id) {
		this.id = id;
	}

}
