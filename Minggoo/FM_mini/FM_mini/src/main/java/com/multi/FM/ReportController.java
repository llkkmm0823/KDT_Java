package com.multi.FM;

public class ReportController {

    private ReportDAO reportDAO;

    public ReportController() {
        this.reportDAO = new ReportDAO();
    }

    public void addReport(int reportNo, int boothNumber, String userId, String comment) {
        ReportVO report = new ReportVO();
        report.setReport_no(reportNo);
        report.setBooth_number(boothNumber);
        report.setUser_id(userId);
        report.setComment(comment);

        reportDAO.insertReport(report);
    }
}
