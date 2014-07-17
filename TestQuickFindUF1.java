import uf.QuickFindUF1;
import uf.QuickFindUF1;
import java.util.Date;

public class TestQuickFindUF1 {
	public static void main(String[] args) {
		TestAttempt1Question1(10);
		TestAttempt1Question2(10);
	}



	public static void TestAttempt1Question1(int N)
	{
		QuickFindUF1 arr = new QuickFindUF1(N);
		arr.union(0,4);
		arr.union(5,6);
		arr.union(2,9);
		arr.union(7,8);
		arr.union(5,3);
		arr.union(0,5);
		arr.printid();

		System.out.print("\r\n");

		Date date = new Date();
		System.out.println(date);
	

	}

	public static void TestAttempt1Question2(int N)
	{
		QuickFindUF1 arr = new QuickFindUF1(N);
		arr.union(3,6);
		arr.union(0,9);
		arr.union(9,6);
		arr.union(8,3);
		arr.union(9,5);
		arr.union(2,3);
		arr.printid();

		System.out.print("\r\n");

		Date date = new Date();
		System.out.println(date);

	}
}