package _인터페이스와제어자;

public interface ICarManager {
	boolean add(Car car);

	public Car[] getList();

	public Car[] searchByModelName(String modelName);

	public ElectricCar[] getElectricCars();
	
	public int getTotalMileage();
}
