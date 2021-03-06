package com.example.cachuelosfrontend.model;

// Generated 05-oct-2014 14:18:06 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Workerbytypecachuelo generated by hbm2java
 */
@Entity
@Table(name = "workerbytypecachuelo", catalog = "cachuelos")
public class Workerbytypecachuelo implements java.io.Serializable {

	private WorkerbytypecachueloId id;
	private Typecachuelo typecachuelo;
	private User user;
	private Integer isAvailable;
	private boolean available = false;

	public Workerbytypecachuelo() {
	}

	public Workerbytypecachuelo(WorkerbytypecachueloId id,
			Typecachuelo typecachuelo, User user) {
		this.id = id;
		this.typecachuelo = typecachuelo;
		this.user = user;
	}

	public Workerbytypecachuelo(WorkerbytypecachueloId id,
			Typecachuelo typecachuelo, User user, Integer isAvailable) {
		this.id = id;
		this.typecachuelo = typecachuelo;
		this.user = user;
		this.isAvailable = isAvailable;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idUserWorker", column = @Column(name = "idUserWorker", nullable = false)),
			@AttributeOverride(name = "idTypeCachuelo", column = @Column(name = "idTypeCachuelo", nullable = false)) })
	public WorkerbytypecachueloId getId() {
		return this.id;
	}

	public void setId(WorkerbytypecachueloId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idTypeCachuelo", nullable = false, insertable = false, updatable = false)
	public Typecachuelo getTypecachuelo() {
		return this.typecachuelo;
	}

	public void setTypecachuelo(Typecachuelo typecachuelo) {
		this.typecachuelo = typecachuelo;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idUserWorker", nullable = false, insertable = false, updatable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "isAvailable")
	public Integer getIsAvailable() {
		return this.isAvailable;
	}

	public void setIsAvailable(Integer isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Transient
	public boolean getAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
