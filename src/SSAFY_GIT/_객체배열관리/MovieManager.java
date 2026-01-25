package SSAFY_GIT._객체배열관리;

public class MovieManager {

	final int MAX_SIZE = 100;

	Movie[] movieList = new Movie[MAX_SIZE];

	int size = 0;

	private static MovieManager moviemanager = new MovieManager();

	private MovieManager() {
	}

	public static MovieManager getMoviemanager() {
		return moviemanager;
	}

	public void add(Movie movie) {
		if (size < MAX_SIZE) {
			movieList[size] = movie;
			size++;
		}
	}

	public Movie[] getList() {
		Movie[] List = new Movie[size];
		for (int i = 0; i < size; i++) {
			List[i] = movieList[i];
		}
		return List;
	}

	public Movie searchByTitle(String title) {
		for (int i = 0; i < size; i++) {
			if (movieList[i].getTitle().equals(title)) {
				return movieList[i];
			}
		}
		return null ;
	}
}
