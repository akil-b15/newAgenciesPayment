package payment;

import java.util.Scanner;

public class problem2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string: ");
		String s = sc.nextLine();
		if(s.length()<2 || s.length() > 50) { 
			System.out.println("Wrong input");
		}else {
		
		int value=0;
		int sum=0;
		
		for(int i=0; i<s.length(); i++) {
		char c = s.charAt(i); 
		int ascii = (int)c;
		if(ascii>96 && ascii<123) { //small letter check
			if (ascii==97 || ascii==101 || ascii==105 || ascii==111 || ascii==117) {//vowel check
				value = ascii - 96 + 10;
				sum = sum + value;
			}else {
				value = ascii - 96;
				sum = sum + value;
			}
		}else if(ascii>64 && ascii<91){ //capital letter check
			if (ascii==65 || ascii==69 || ascii==73 || ascii==79 || ascii==85) { //vowel check
				value = (ascii - 64) * (ascii-64);
				sum = sum + value;
			}else {
				value = ascii - 64 + 5;
				sum = sum + value;
			}
		}
		}
		System.out.println(sum);
	}
}
}
