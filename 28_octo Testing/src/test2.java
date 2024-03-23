
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hiii everyone");
		
		int num=371;
		int sum=0;
		int rem,p;
		p=num;
          System.out.println("hiiii");
		
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
