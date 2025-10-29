package day1028;

import java.util.Arrays;

public class ArrayTemp_01 {

	public static void main(String[] args) {

		//1.순서바꾸기 연습
		int a=10,b=20;
		System.out.println("a="+a+", b="+b);

		int temp=a;
		a=b;
		b=temp;

		System.out.println("a="+a+", b="+b);

		//2.배열순서
		int [] arrNums= {4,6,8};

		for(int an:arrNums)
			System.out.print(an+"   ");
		System.out.println();

		System.out.println("0번과 2번을 교환후 출력");

		int temp1=arrNums[0];
		arrNums[0]=arrNums[2];
		arrNums[2]=temp1;

		for(int an:arrNums)
			System.out.print(an+"   ");
		System.out.println();



		// 3.배열변수의 순서바꾸기

		int[] arr= {5,7,65,42,36,88,95,21,11,2};

		//출력
		System.out.println("원데이타 출력");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();


		//배열의 순서바꾸기 로직
		for(int i=0;i<arr.length/2;i++)
		{
			int temp2=arr[i];
			arr[i]= arr[arr.length-1-i];  //10개일때 0하고 9번을 바꾸는것
			arr[arr.length-1-i]=temp2;
		}

		//출력
		System.out.println("데이타 거꾸로 출력");
		for(int i=0
				;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
		
		//오름차순 정렬로직(가장작은 숫자를 앞으로 보내자_선택정렬)
		
		//기준데이타는 0번부터 끝에서 두번째까지
		/*for(int i=0;i<arr.length-1;i++)
		{
			//비교하는 데이타는 기준 다음값부터 끝까지
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) //기준값이 비교값보다 클때 순서를 변경하는게 오름차순
				{
					int temp3=arr[i];
					arr[i]=arr[j];
					arr[j]=temp3;
				}
			}
		}*/
		Arrays.sort(arr);
		
		
		//출력
		System.out.println("데이타 오름차순 출력");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();

	}

}
