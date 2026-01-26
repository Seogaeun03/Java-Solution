package _인터페이스와제어자;

public class MovieTest {
	public static void main(String[] args) {
		Movie movie1 = new Movie(1, "기생충", "봉준호", "드라마", 132);
		Movie movie2 = new Movie(2, "인터스텔라", "크리스토퍼 놀란", "SF", 169);
		Movie movie3 = new Movie(3, "토이 스토리", "존 라세터", "애니메이션", 81);
		SeriesMovie sm1 = new SeriesMovie(101, "어벤져스", "조스 웨던", "액션", 143, 1, "어벤져스 1");
		SeriesMovie sm2 = new SeriesMovie(102, "해리포터와 마법사의 돌", "크리스 콜럼버스", "판타지", 152, 1, "마법사의 돌");

		MovieManagerImpl mm = MovieManagerImpl.getManager();

		mm.add(movie1);
		mm.add(movie2);
		mm.add(movie3);
		mm.add(sm1);
		mm.add(sm2);
		//////////////////////////////////////////////

		System.out.println("******************getList******************");
		Movie[] result = mm.getList();
		for (Movie m : result) {
			System.out.println(m);
		}
		
		System.out.println("******************searchByTitle******************");
		Movie[] result2 = mm.searchByTitle("터");
		for (Movie m : result2) {
			System.out.println(m);
		}
		
		System.out.println("******************getMovies******************");
		Movie[] result3 = mm.getMovies();
		for (Movie m : result3) {
			System.out.println(m);
		}
		
		System.out.println("******************getSeriesMovies******************");
		Movie[] result4 = mm.getSeriesMovies();
		for (Movie m : result4) {
			System.out.println(m);
		}
		
		System.out.println("******************getRunningTimeAvg******************");
		System.out.println(mm.getRunningTimeAvg());
	}
}
