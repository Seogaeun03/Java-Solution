import java.io.File;
import java.util.Scanner;

public class BuildingTest {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new File("res/input.txt")); 
        
        // 이제 바로 쓸 수 있어요!
        int n = sc.nextInt();
        System.out.println(n);
	}
}