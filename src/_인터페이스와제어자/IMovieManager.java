package _인터페이스와제어자;

public interface IMovieManager {
	void add(Movie movie);

	Movie[] getList();

	Movie[] searchByTitle(String title);

	Movie[] getMovies();

	SeriesMovie[] getSeriesMovies();

	double getRunningTimeAvg();
}
