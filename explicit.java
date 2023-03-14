package implicit;

public class explicit {

	public static void main(String[] args) {
		{
			double d=156.06;
			long l=(long)d;//explicit type casting
			int i=(int)l;//explicit type casting 
			System.out.println("Double Data type value"+d);
			//fractional part lost
			System.out.println(" Long Data type value"+l);
			//fractional part lost 
			System.out.println("IntData type value"+l);
		}

	}

}
