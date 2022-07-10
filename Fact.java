package week1.day1;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num=5,fact=1;
// for(int i=num;i>1;i-=2)
// {
//	 fact=fact*(i*(i-1));
// }
 
 for(int i=1;i<=5;i++)
 {
	 fact=fact*i;
 }
 System.out.println(fact);
	}

}
