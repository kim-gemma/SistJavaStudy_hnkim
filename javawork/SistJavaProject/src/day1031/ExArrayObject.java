package day1031;

class Food{
	private String menu;
	private int price;
	
	static int menu_no;
	
	//set메서드
	public void setFood(String menu, int price) {
		this.menu=menu;
		this.price=price;
	
	}
	
	//출력용
	public void getWirteMenu() {
		menu_no++;
		System.out.println("[메뉴:"+menu_no+"]");
		System.out.println("메뉴명: "+this.menu);
		System.out.println("가격: "+price);
		System.out.println("--------------------");
		
		
	}
	
}

public class ExArrayObject {

	public static void main(String[] args) {
		/*[메뉴]
		 메뉴명: 피자
		 가격: 25000
		 --------------------
		 [메뉴2]
		 메뉴명: 알리오올리오
		 가격: 15000
		 --------------------
		 [메뉴3]
		 메뉴명: 쉬림프
		 가격: 35000
		 --------------------
		 
		 */
		//디폴트 food클래스 생성
		Food food1=new Food();
		food1.setFood("피자", 25000);
		food1.getWirteMenu();
		
		Food food2=new Food();
		food2.setFood("알리오올리오", 15000);
		food2.getWirteMenu();
		
		Food food3=new Food();
		food3.setFood("쉬림프", 35000);
		food3.getWirteMenu();
		

		//배열로 생성
		Food[] foods =new Food[3];
	
		for(int i =0; i<foods.length; i++) {
			foods[i] = new Food(); 
			foods[i].getWirteMenu();
		}
	}

}
