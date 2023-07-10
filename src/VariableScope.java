
public class VariableScope {

	public static void main(String[] args) {
		int num = 100;	// Block Scope
		
		{
			int num2 = 200;
			
			System.out.println(num);
			System.out.println(num2);
		}

		System.out.println(num);
//		System.out.println(num2); // (X)
		
	}

}
