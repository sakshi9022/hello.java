import java.util.Scanner;
class SumOf7{
	public static void main(String[] args) {
		int sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 7 Numbers: ");
		for (int i=1;i<=7 ;i++ ) {
			n=sc.nextInt();
			sum=sum+n;
		}
		double avg=sum/7.0;
		System.out.println("The Sum Of 7 Numbers is: "+sum);
		System.out.println("The Average is: "+avg);
	}
}