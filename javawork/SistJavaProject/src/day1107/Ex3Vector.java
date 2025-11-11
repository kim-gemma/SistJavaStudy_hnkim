package day1107;

import java.util.Iterator;
import java.util.Vector;

//List
//순차적으로 데이타가 들어간다(인덱스)
//중복데이타 허용
//처음생성시 일정한 갯수로 생성,그이상의 데이타 넣으면 공간이 자동으로 늘어난다(가변적)
//생성자(5,3)_할당크기가 5이고 혹시 넘치면 3씩증가~~~
public class Ex3Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //List<String> list=new Vector<String>();
		Vector<String> list=new Vector<String>();
		
		
		System.out.println("초기할당크기: "+list.capacity());
		System.out.println("초기데이타 갯수: "+list.size());
		
		
		list.add("사과"); 
		list.add("바나나");
		list.add("사과"); //중복허용
		list.add("키위");
		list.add("오렌지");
		list.add("사과");
		
		
		System.out.println("할당크기: "+list.capacity());//10개가 넘치면 다시 10개생김
		System.out.println("데이타 갯수: "+list.size()); //6
		
		System.out.println("출력#1_for");
		for(int i=0;i<list.size();i++)
		{
			String s=list.get(i);
			System.out.println(s);
		}
		System.out.println("출력#2_for~each");
		for(String s:list)
			System.out.println(s);
		System.out.println();
		
		System.out.println("출력#3_Iterator");
		Iterator<String> iter=list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println();
		System.out.println("출력#4_toArray()");
		Object[] ob=list.toArray();
		for(int i=0;i<ob.length;i++)
		{
			String s=(String)ob[i];
			System.out.println(s);
		}
		
		
		
	}

}
