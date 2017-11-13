package com.example.cachuelosfrontend.model;

// Generated 05-oct-2014 14:18:06 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


import javax.xml.bind.annotation.XmlRootElement;

/**
 * Offer generated by hbm2java
 */
@Entity
@Table(name = "offer"
      , catalog = "cachuelos")
@XmlRootElement
public class Offer implements java.io.Serializable
{

   private Integer idOffer;
   private User user;
   private Cachuelo cachuelo;
   private String price;
   private Date createdAt;
   private String updatedAt;
   private Integer isAccepted;
   private boolean accepted;
   private String acceptedStr;

   public Offer()
   {
   }

   public Offer(User user, Cachuelo cachuelo, String price, Date createdAt)
   {
      this.user = user;
      this.cachuelo = cachuelo;
      this.price = price;
      this.createdAt = createdAt;
   }

   public Offer(User user, Cachuelo cachuelo, String price, Date createdAt, String updatedAt, Integer isAccepted)
   {
      this.user = user;
      this.cachuelo = cachuelo;
      this.price = price;
      this.createdAt = createdAt;
      this.updatedAt = updatedAt;
      this.isAccepted = isAccepted;
   }
   
   	@Transient
	public boolean getAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
	
	@Transient
	public String getAcceptedStr() {
		return acceptedStr;
	}

	public void setAcceptedStr(String acceptedStr) {
		this.acceptedStr = acceptedStr;
	}

   @Id
   @GeneratedValue(strategy = IDENTITY)
   @Column(name = "idOffer", unique = true, nullable = false)
   public Integer getIdOffer()
   {
      return this.idOffer;
   }

   public void setIdOffer(Integer idOffer)
   {
      this.idOffer = idOffer;
   }

   
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "idUser", nullable = false)
   public User getUser()
   {
      return this.user;
   }

   public void setUser(User user)
   {
      this.user = user;
   }

   
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "idCachuelo", nullable = false)
   public Cachuelo getCachuelo()
   {
      return this.cachuelo;
   }

   public void setCachuelo(Cachuelo cachuelo)
   {
      this.cachuelo = cachuelo;
   }

   @Column(name = "price", nullable = false, length = 20)
   public String getPrice()
   {
      return this.price;
   }

   public void setPrice(String price)
   {
      this.price = price;
   }

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name = "created_at", nullable = false, length = 19)
   public Date getCreatedAt()
   {
      return this.createdAt;
   }

   public void setCreatedAt(Date createdAt)
   {
      this.createdAt = createdAt;
   }

   @Column(name = "updated_at", length = 20)
   public String getUpdatedAt()
   {
      return this.updatedAt;
   }

   public void setUpdatedAt(String updatedAt)
   {
      this.updatedAt = updatedAt;
   }

   @Column(name = "isAccepted")
   public Integer getIsAccepted()
   {
      return this.isAccepted;
   }

   public void setIsAccepted(Integer isAccepted)
   {
      this.isAccepted = isAccepted;
   }
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append(price);
		return buffer.toString();
	}

}