package com.multi.FM;

public class ReportVO {
	private int report_no;
	private int booth_number;
	private String user_id;
	private String comment;
	
	public int getReport_no() {
		return report_no;
		
	}
	public void setReport_no(int report_no) {
		this.report_no = report_no;
	}
	public int getBooth_number() {
		return booth_number;
	}
	public void setBooth_number(int booth_number) {
		this.booth_number = booth_number;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "ReportVO [report_no=" + report_no + ", booth_number=" + booth_number + ", user_id=" + user_id
				+ ", comment=" + comment + "]";
	}
	
}