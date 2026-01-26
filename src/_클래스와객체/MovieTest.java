package _클래스와객체;

public class MovieTest {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		movie.id = 205;
		movie.title = "꽃보다 할머니";
		movie.director = "손성준";
		movie.genre = "로맨스";
		movie.runningTime = 100;
		
		System.out.println("번호: "+movie.id+
				", 제목: "+movie.title+
				", 감독: "+movie.director+
				", 장르 : "+movie.genre+
				", 상영시간: "+movie.runningTime);
	}
}

