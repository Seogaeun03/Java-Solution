package SSAFY_GIT._클래스와객체.class01;

public class ProductTest {
	public static void main(String[] args) {
		
		Product product1 = new Product("R00001", "S냉장고", 1000000, 20, "삼성", "삼성에서 출시한 스마트냉장고입니다.");
		Product product2 = new Product("P00001", "우주폰S", 500000, 100, "삼성", "삼성에서 출시한 우주폰S입니다.");
		
		Review review = new Review(1, "P00001", "yang", "성능이 아주 좋습니당~!");
		
		String pd1 = product1.toString();
		String pd2 = product2.toString();
		String rv1 = review.toString();
		
		System.out.println("*******************제품목록*******************");
		System.out.println(pd1);
		System.out.println(pd2);
		System.out.println("*******************리뷰내용*******************");
		System.out.println(rv1);		
	}
}
