package week1.day1;

public class Fibonacci {
	public static void main(String[] args) {
		int n=11;
		int firstNumber=0,secondNumber=1,nextNumber=0;
		for(int i=0;i<n;i++)
		{
			System.out.print(firstNumber + "'");
			nextNumber=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=nextNumber;			
			
		}
	}
}
