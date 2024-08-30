package HW;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num= 7;
	int temp=0;
	
	for (int i=2;i<num-1;i++)
	{
	if (num%i!=0)
	{
		
		temp=0;
		break;
	}
	else
	{
		
		temp=1;
	}
		
	}
	if (temp==0) {
	System.out.println("The given number " +num+ " is not a Prime Number");
	
	}
	else {
		System.out.println("The given number " +num+ " is  a Prime Number");
	}
	
}
}