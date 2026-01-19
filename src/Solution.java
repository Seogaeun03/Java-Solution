import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		System.setIn(new FileInputStream("res/input.txt"));

		Scanner sc = new Scanner(System.in);
		int T = 1;
		String s = sc.next();
		int result = 0;

		for(int test_case = 1; test_case <= T; test_case++)
		{

			for (int i = 0; i < s.length(); i++) {
				result += s.charAt(i) - '0';
			}
			
			System.out.println(result);

		}
	}
}