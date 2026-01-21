package SSAFY_GIT._클래스와객체.class01;

public class RestuarantTest {

	public static void main(String[] args) {
		
		Restaurant restuarantTest1 = new Restaurant(101, "을밀대", "서울", "냉면", 4);
		Restaurant restuarantTest2 = new Restaurant(401, "도마29", "대구", "연어초밥", 3);
		
		Review2 review1 = new Review2(1, 101, "김싸피", "너무 맛있네요.");
		Review2 review2 = new Review2(2, 401, "나싸피", "연어초밥은 여기가 최고!");
		
		String rt1 = restuarantTest1.toString();
		String rt2 = restuarantTest2.toString();
		
		String rv1 = review1.toString();
		String rv2 = review2.toString();
		
		System.out.println("**************************맛집목록**************************");
		System.out.println(rt1);
		System.out.println(rt2);
		System.out.println("**************************리뷰목록**************************");
		System.out.println(rv1);
		System.out.println(rv2);
	}

}
