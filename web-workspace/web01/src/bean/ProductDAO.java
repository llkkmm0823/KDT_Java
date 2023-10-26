package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	Connection con = null; // 클래스 바로 아래에 만들어주면 클래스 전체영역에서 사용 가능
	DBConnectionMgr dbcp; // null

	public ProductDAO() {
		try {
			dbcp = DBConnectionMgr.getInstance();
			con = dbcp.getConnection();// 임대
		} catch (Exception e) {
			System.out.println("에러발생!!");
		}
	}
	
	public ArrayList<ProductVO> list() {
//		int result = 0;
		ArrayList<ProductVO> list = new ArrayList<>(); //{bag, bag, bag}
	//ArrayList<넣을데이터타입>, ArrayList<MemberVO> ==> MemberVO만 넣는 리스트 
		try {
			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql); //
			System.out.println("3. sql문 생성 성공!!");

			ResultSet table = ps.executeQuery(); // 테이블로 mysql로 받아온다.
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			while(table.next()) { // table안에 검색결과인 row가 있는지 체크
				//table.next()는 행에 데이터가 있는지 체크해준다.
				//반복할 때마다 행을 가르키고 있는 커서가 하나씩 밑으로 내려간다.
				//만약에 있으면 table.next()가 true가 되고 
				//1.가르키고 있는 row의 각 컬럼을 꺼내서 넣어줄 가방을 만들어준다.
				//2.각 컬럼의 값을 꺼내서 가방에 각각 변수에 넣어준다.
				//3.리스트에 데이터가 들어있을 가방을 넣는다.
				ProductVO bag = new ProductVO();
				bag.setId(table.getString(1));
				bag.setName(table.getString(2));
				bag.setContent(table.getString(3));
				bag.setPrice(table.getInt(4));
				bag.setCompany(table.getString(5));
				bag.setImg(table.getString(6));
				list.add(bag);
			} 
			dbcp.freeConnection(con, ps, table);//반납 
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
		return list;
	} // list
	
	public void insert(ProductVO bag) {
		try {
			
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into product values (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, bag.getId()); // 물음표 번호 1번에 title에 저장한 변수값을 넣어줘!
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getContent());
			ps.setInt(4, bag.getPrice());
			ps.setString(5, bag.getCompany());
			ps.setString(6, bag.getImg());
			
			System.out.println("3. sql문 생성 성공!!");

			// URL site = new URL(site);

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			int rowCount = ps.executeUpdate(); //insert문 실행한 row수,int 
			if(rowCount == 1) {
				System.out.println("상품 추가 성공!");
			}
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
	}
	public void delete() {
		
	}
	public void update() {
		
	}
	public void one() {
		
	}
}
