package javaprograms;

public class MyClass {

	public static void main(String[] args) {
		/*String name = "Yugandhar";
		String city = "Puttur";
		System.out.println(name+city);
		int a = 10;
		int b = 20;
		int c = a+b;
		int d = a*b;
		System.out.println(c);
		System.out.println(d);
		char gender = 'M';
		char grade = 'A';
		System.out.println(gender);
		System.out.println(grade);
		float x = 88.00f;
		float y = -90.00f;
		System.out.println(x+y);
	*/
		String S1="TCS Pvt Ltd";
		String s2=" ";
		for(int i=S1.length()-1;i>=8;i--){
			s2=s2+S1.charAt(i);
		}
		for(int i=7;i>=4;i--){
			s2=s2+S1.charAt(i);
		}
		for(int i=3;i>=0;i--){
			s2=s2+S1.charAt(i);
		} 
		System.out.println(s2);
	}

}
