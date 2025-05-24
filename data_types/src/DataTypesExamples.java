public class DataTypesExamples {
	public static void main(String[] args) {
		
		boolean booleanDataTypeExample = false;
		byte byteDataTypeExample = 1;
		char charDataTypeExample = 'a';
		short shortDataTypeExample = 1;
		int intDataTypeExample = 10;
		long longDataTypeExample = 11l;
		float floatDataTypeExample = 11.5f;
		double doubleDataTypeExample = 11.5;
		
		float lessPrecision = (float) doubleDataTypeExample;
		double morePrecision = (double) floatDataTypeExample;
		
		Boolean booleanDataTypeObg = Boolean.valueOf(booleanDataTypeExample);
		Byte byteDataTypeObg = Byte.valueOf(byteDataTypeExample);
		
		String text = "this is a test";
		System.out.println("Values");
		
		// Operators
		int a = 1;
		int b = 2;
		
		boolean issame = a != b;
		
		System.out.println(issame);
		
		boolean condition = a >= b;
		
		System.out.println(condition);
		
		boolean condition2 = a > 3 || a < b;
		
		System.out.println(condition2);
		
		boolean condition3 = a > 3 && a < b;
		
		System.out.println(condition3);
		
		
	}

}
