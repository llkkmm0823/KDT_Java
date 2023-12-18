package com.multi.FM;

public class ReportVO {
	private int report_no;
	private int booth_no;
	private String user_id;
	private String comment;
	private String role;
	private String booth_name;
	
	public int getReport_no() {
		return report_no;
	}
	public void setReport_no(int report_no) {
		this.report_no = report_no;
	}
	public int getBooth_no() {
		return booth_no;
	}
	public void setBooth_number(int booth_no) {
		this.booth_no = booth_no;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getBooth_name() {
		return booth_name;
	}
	public void setBooth_name(String booth_name) {
		this.booth_name = booth_name;
	}
	
	@Override
	public String toString() {
		return "ReportVO [report_no=" + report_no + ", booth_no=" + booth_no + ", user_id=" + user_id
				+ ", comment=" + comment + ", role=" + role + ", booth_name=" + booth_name + "]";
	}
	
}
