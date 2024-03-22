package Logicalseries;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=371;
		int sum=0;
		int rem,p;
		p=num;
		
		for(sum=0;num>0;num=num/10) {
			
			rem=num%10;
			sum=sum+rem*rem*rem;
			
		}
		if(sum==p)
			System.out.println("armstrong number");
		else
			System.out.println("not armstrong number");

	}

}
