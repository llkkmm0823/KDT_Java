package com.multi.FM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ReportDAO {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/fm";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";

    private static final String INSERT_REPORT = "INSERT INTO report_table (report_no, booth_number, user_id, comment) VALUES (?, ?, ?, ?)";

    public void insertReport(ReportVO report) {
        try (
        	Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             PreparedStatement pp = conn.prepareStatement(INSERT_REPORT)) {

        	pp.setInt(1, report.getReport_no());
        	pp.setInt(2, report.getBooth_number());
            pp.setString(3, report.getUser_id());
            pp.setString(4, report.getComment());

            int rowsInserted = pp.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("데이터 insert 완료");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
