package class01;

public class Person {
	String name;
	int age;
	double height;
	String hobby;
	
	//기본 생성자
	Person() {
		
	}
	
	//매개변수가 있는 생성자
	Person(String name, int age, double height, String hobby) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.hobby= hobby;
	}
	
	public void showInformation() {
		System.out.println("저의 이름은" + name + "입니다.");
		System.out.println("저의 나이는" + age + "입니다.");
		System.out.println("저의 키는" + height + "입니다.");
		System.out.println("저의 취미는" + hobby + "입니다.");
	}
	
}
