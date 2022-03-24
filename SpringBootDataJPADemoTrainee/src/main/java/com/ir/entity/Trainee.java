package com.ir.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="sbtrdata")
public class Trainee {
	@Id
	private int trId;
	private String trName;
	private String trAdd;
	public int getTrId() {
		return trId;
	}
	public void setTrId(int trId) {
		this.trId = trId;
	}
	public String getTrName() {
		return trName;
	}
	public void setTrName(String trName) {
		this.trName = trName;
	}
	public String getTrAdd() {
		return trAdd;
	}
	public void setTrAdd(String trAdd) {
		this.trAdd = trAdd;
	}
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	public Trainee(int trId, String trName, String trAdd) {
		super();
		this.trId = trId;
		this.trName = trName;
		this.trAdd = trAdd;
	}
	@Override
	public String toString() {
		return "Trainee [trId=" + trId + ", trName=" + trName + ", trAdd=" + trAdd + "]";
	}
	

}
