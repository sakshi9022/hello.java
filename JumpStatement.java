class JumpStatement{
	public static void main(String[] args) {
		int n=8;
		for (int i=1;i<=4 ;++i ) {
			if (i==6) {
				continue;
			}
			System.out.println(i+" "+(n-i));
		}
	}
}