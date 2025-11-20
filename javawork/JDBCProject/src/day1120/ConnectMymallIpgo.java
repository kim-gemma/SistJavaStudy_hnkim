package day1120;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import day1119.DbConnect;

public class ConnectMymallIpgo {

	Scanner sc=new Scanner(System.in);
	//Connect,dbClose 메서드가 있는 클래스 생성
	DbConnect db=new DbConnect();
	
	//insert
	public void insertMymallIpgo()
	{
		System.out.println("입고된 상품의 카테고리는?(음료,과자류)");
		String cate=sc.nextLine();
		System.out.println("입고된 상품명?");
		String sangName=sc.nextLine();
		System.out.println("입고된 상품의 갯수는?");
		int su=Integer.parseInt(sc.nextLine());
		System.out.println("입고된 상품의 가격은?");
		int price=Integer.parseInt(sc.nextLine());
		
		//완성된sql
		//String sql="insert into mymallipgo values(seq4.nextval,'"+cate+"','"+sangName+"',"+su+","+price+",sysdate)";
		
		//PrepareStatement객체는 미완성된 sql문을 작성할수 있다
		//변수를 ?로 표시후 나중에 바인딩 시켜준다
		String sql="insert into mymallipgo values(seq4.nextval,?,?,?,?,sysdate)";
		
		//db연결
		Connection conn=db.getDbConnect();
		
		//sql전달
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			//?순서대로 바인딩
			pstmt.setString(1, cate);
			pstmt.setString(2, sangName);
			pstmt.setInt(3, su);
			pstmt.setInt(4, price);
						
			//업데이트
			int a=pstmt.executeUpdate();
			
			if(a==1)
				System.out.println("인서트 성공!!!");
			else
				System.out.println("인서트 실패!!!");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	//select
	public void selectMymallIpgo()
	{
		String sql="select * from mymallIpgo order by num";
		//db연결
		Connection conn=db.getDbConnect();
		
		//sql전달
		PreparedStatement pstmt=null;
		ResultSet rs= null;
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			System.out.println("상품번호\t카테고리\t상품명\t수량\t단가\t입고날짜");
			System.out.println("-------------------------------------------------");
			
			while(rs.next())
			{
				System.out.println(rs.getInt("num")+"\t"
			               +rs.getString("category")+"\t"
			               +rs.getString("sangpum")+"\t"
			               +rs.getInt("su")+"\t"
			               +rs.getInt("price")+"\t"
			               +rs.getDate("ipgo"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
	}
	
	//delete
	public void deleteMymallIpgo()
	{
		
	}
	
	//update
	public void updateMymallIpgo()
	{
		
	}
	
	//write_process(출력문도 메서드로 작성)
	public void processMymallIpgo()
	{
		ConnectMymallIpgo mymall=new ConnectMymallIpgo();
		
		
		while(true) 
		{
			System.out.println("\t***MyMall 입고상품 현황***");
			System.out.println("1.상품입고    2.상품재고현황    3.상품삭제     4.상품정보수정     9.종료");
			int selNum=Integer.parseInt(sc.nextLine());
			
			if(selNum==1)
				mymall.insertMymallIpgo();
			else if (selNum==2)
				mymall.selectMymallIpgo();
			else if(selNum==9)
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ConnectMymallIpgo ipgo=new ConnectMymallIpgo();
         ipgo.processMymallIpgo();
	}

}