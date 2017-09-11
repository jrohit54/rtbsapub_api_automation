package com.ResponsePojo;

import java.math.BigDecimal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RtbsapubResponsePojo {

	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("bidderId")
	@Expose
	private String bidderId;
	@SerializedName("adm")
	@Expose
	private String adm;
	@SerializedName("price")
	@Expose
	private BigDecimal price;
	@SerializedName("cur")
	@Expose
	private String cur;
	@SerializedName("noBid")
	@Expose
	private Boolean noBid;
	@SerializedName("crid")
	@Expose
	private String crid;
	@SerializedName("region")
	@Expose
	private String region;

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public RtbsapubResponsePojo withId(String id) {
	this.id = id;
	return this;
	}

	public String getBidderId() {
	return bidderId;
	}

	public void setBidderId(String bidderId) {
	this.bidderId = bidderId;
	}

	public RtbsapubResponsePojo withBidderId(String bidderId) {
	this.bidderId = bidderId;
	return this;
	}

	public String getAdm() {
	return adm;
	}

	public void setAdm(String adm) {
	this.adm = adm;
	}

	public RtbsapubResponsePojo withAdm(String adm) {
	this.adm = adm;
	return this;
	}

	public BigDecimal getPrice() {
	return price;
	}

	public void setPrice(BigDecimal price) {
	this.price = price;
	}

	public RtbsapubResponsePojo withPrice(BigDecimal price) {
	this.price = price;
	return this;
	}

	public String getCur() {
	return cur;
	}

	public void setCur(String cur) {
	this.cur = cur;
	}

	public RtbsapubResponsePojo withCur(String cur) {
	this.cur = cur;
	return this;
	}

	public Boolean getNoBid() {
	return noBid;
	}

	public void setNoBid(Boolean noBid) {
	this.noBid = noBid;
	}

	public RtbsapubResponsePojo withNoBid(Boolean noBid) {
	this.noBid = noBid;
	return this;
	}

	public String getCrid() {
	return crid;
	}

	public void setCrid(String crid) {
	this.crid = crid;
	}

	public RtbsapubResponsePojo withCrid(String crid) {
	this.crid = crid;
	return this;
	}

	public String getRegion() {
	return region;
	}

	public void setRegion(String region) {
	this.region = region;
	}

	public RtbsapubResponsePojo withRegion(String region) {
	this.region = region;
	return this;
	}

}
