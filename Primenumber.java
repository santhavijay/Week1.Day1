package week1.day1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=14;
boolean res;
res=checkPrime(n);
if(res)
System.out.println(n + " is a prime number");
else
	System.out.println(n + "is Not a prime");
	}
public static boolean checkPrime(int a)
{
	for(int i=2;i<a;i++)
	{
		if(a%i==0)
			return false;
	}
	return true;
}
}
