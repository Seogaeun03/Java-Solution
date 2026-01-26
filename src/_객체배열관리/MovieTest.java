package _객체배열관리;

import java.util.Arrays;

public class MovieTest {

	public static void main(String[] args) {
		
		Movie movie1 = new Movie();
		movie1.setId(1);
		movie1.setTitle("기생충");
		movie1.setDirector("봉준호");
		movie1.setGenre("드라마");
		movie1.setRunningTime(132);
		
		Movie movie2 = new Movie();
		movie2.setId(2);
        movie2.setTitle("아바타");
        movie2.setDirector("제임스 카메론");
        movie2.setGenre("SF");
        movie2.setRunningTime(162);
		
		System.out.println(movie1.toString());
		System.out.println(movie2.toString());
		
		MovieManager mm = MovieManager.getMoviemanager();
		
		mm.add(movie1);
		mm.add(movie2);
		
		System.out.println(Arrays.toString(mm.getList()));
		
		System.out.println(mm.searchByTitle("기생충"));
	}

}

