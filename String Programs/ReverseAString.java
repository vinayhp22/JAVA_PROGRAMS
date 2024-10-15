import java.util.Scanner;

class ReverseAString{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1= sc.nextLine();
		System.out.println("String is: "+s1);
		String s2 = "";
		
		for(char c:s1.toCharArray()){
			s2=c+s2;
		}
		System.out.println("Reverse of a String is: "+s2);

		
	}
}