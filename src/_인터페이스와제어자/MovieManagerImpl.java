package _인터페이스와제어자;

public class MovieManagerImpl implements IMovieManager {

	int MAX_SIZE = 100;
	Movie[] movieList = new Movie[MAX_SIZE];
	int size = 0;

	private MovieManagerImpl() {
	}

	private static MovieManagerImpl manager = new MovieManagerImpl();

	public static MovieManagerImpl getManager() {
		return manager;
	}

	public void add(Movie movie) {
		if (size < 100) {
			movieList[size] = movie;
			size++;
		} else {
			System.out.println("더 이상 들어갈 공간이 없습니다!");
		}
	}

	public Movie[] getList() {
		Movie[] tmp = new Movie[size];
		for (int i = 0; i < size; i++) {
			tmp[i] = movieList[i];
		}
		return tmp;
	}

	public Movie[] searchByTitle(String title) {
		int cnt = 0;
		int idx = 0;
		for (int i = 0; i < size; i++) {
			if (movieList[i].getTitle().contains(title)) {
				cnt++;
			}
		}

		Movie[] tmp = new Movie[cnt];
		for (int i = 0; i < size; i++) {
			if (movieList[i].getTitle().contains(title)) {
				tmp[idx++] = movieList[i];
			}
		}
		return tmp;
	}

	public Movie[] getMovies() {
		int cnt = 0;
		int idx = 0;
		for (int i = 0; i < size; i++) {
			if (!(movieList[i] instanceof SeriesMovie)) {
				cnt++;
			}
		}

		Movie[] tmp = new Movie[cnt];
		for (int i = 0; i < size; i++) {
			if (!(movieList[i] instanceof SeriesMovie)) {
				tmp[idx] = movieList[i];
				idx++;
			}
		}
		return tmp;
	}

	public SeriesMovie[] getSeriesMovies() {
		int cnt = 0;
		int idx = 0;
		for (int i = 0; i < size; i++) {
			if (movieList[i] instanceof SeriesMovie) {
				cnt++;
			}
		}

		SeriesMovie[] tmp = new SeriesMovie[cnt];
		for (int i = 0; i < size; i++) {
			if (movieList[i] instanceof SeriesMovie) {
				tmp[idx] = (SeriesMovie) movieList[i];
				idx++;
			}
		}
		return tmp;
	}

	public double getRunningTimeAvg() {
		double sum = 0;
		for (int i = 0; i < size; i++) {
			sum += movieList[i].getRunningTime();
		}
		return (double) sum / size;

	}
}

