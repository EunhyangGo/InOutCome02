package com.biz.come.vo;

public class IoListVO {
	
	private String strDate;
	private int inIo;
	private String strCName;
	private int intprice;
	private int intQuan;
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public int getInIo() {
		return inIo;
	}
	public void setInIo(int inIo) {
		this.inIo = inIo;
	}
	public String getStrCName() {
		return strCName;
	}
	public void setStrCName(String strCName) {
		this.strCName = strCName;
	}
	public int getIntprice() {
		return intprice;
	}
	public void setIntprice(int intprice) {
		this.intprice = intprice;
	}
	public int getIntQuan() {
		return intQuan;
	}
	public void setIntQuan(int intQuan) {
		this.intQuan = intQuan;
	}
	@Override
	public String toString() {
		return "IoListVO [strDate=" + strDate + ", inIo=" + inIo + ", strCName=" + strCName + ", intprice=" + intprice
				+ ", intQuan=" + intQuan + "]";
	}
	
	

}
