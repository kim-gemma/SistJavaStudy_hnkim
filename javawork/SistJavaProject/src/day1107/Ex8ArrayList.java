package day1107;

import java.util.ArrayList;
import java.util.List;

public class Ex8ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String [] stuName= {"조성진","허현","김성주","나지예","김현능"};
       
       //ArrayList: 객체들을 삽입,삭제,검색할수있는 컨테이너
       //List<String> nameList=new ArrayList<String>();
       ArrayList<String> nameList=new ArrayList<String>();
       
       //데이타 담기
       //stuName을 list에 삽입해본다
       for(String s:stuName)
    	  nameList.add(s);
       
       System.out.println(nameList.size()+"개");
       
       //list를 출력해 본다(출력방법은 2개이상 해보세요~~)
       System.out.println("출력#1");
       for(int i=0;i<nameList.size();i++)
       {
    	   String s=nameList.get(i);
    	   System.out.println(i+1 +":"+s);
       }
       System.out.println();
       System.out.println("출력#2");
       for(String n:nameList)
    	   System.out.println(n);
       
	}

}
