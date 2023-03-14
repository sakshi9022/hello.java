class Amstrong{
	public static void main(String[] args) {
		int sum=0,n;
		System.out.print("The Amstrong Numbers Between 1 to 500 are: ");
		for (int i=1;i<=500 ;i++ ) {
			n=i;
			while (n>0) {
				int rem=n%10;
				sum=sum+(rem*rem*rem);
				n=n/10;
			}
			if (sum==i) {
				System.out.print(i+" ");
			}
			sum=0;
		}
	}		
}