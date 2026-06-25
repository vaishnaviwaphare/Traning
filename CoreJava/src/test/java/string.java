package test.java;

public class string {
	public static void main(String[] args) {
		String s1="hello";
		String s2=new String("hello");
		String s3="hello";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		s1=s1 +"World";
		System.out.println(s1);
		
		String name="Zubair";
		String nameRegex="[A-Z]{1}[a-z]{3,}";
		System.out.println(name.matches(nameRegex));
		
		String cell ="9876543210";
		String cellRegex="[6=9][0-9]{9}";
		System.out.println(cell.matches(cellRegex));

		String email = "vaishnavi@gmail.com";
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		System.out.println(email.matches(emailRegex)); 
	}
}
