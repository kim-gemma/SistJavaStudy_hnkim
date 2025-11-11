package day1107;

import java.util.List;
import java.util.Vector;

public class Ex4List {

	public static void write(String title,List<String> list)
	{
		System.out.println("***"+title+"***");
		
		for(int i=0;i<list.size();i++)
			System.out.println(i+":"+list.get(i));
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		String [] data= {"키위","샤인머스켓","바나나"};
		
		//배열의 데이타를 list에 넣기
		List<String> list=new Vector<String>();
		for(String d:data)
			list.add(d);
		
		write("초기배열데이타출력", list);
		
		//삭제
		list.remove(1);
		write("1번인덱스 삭제후 결과", list);
		
		//추가
		list.add("오렌지");
		write("add로 추가후 결과", list);
		
		//변경
		list.set(1, "샤인머스켓");
		write("set으로값 변경후 결과", list);
		
		//전체삭제후 사이즈출력
		list.clear();
		write("전체삭제하기", list);
		System.out.println("남은갯수: "+list.size());
		

	}

}
