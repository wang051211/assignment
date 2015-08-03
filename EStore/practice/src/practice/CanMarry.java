package practice;

import java.util.Scanner;

public class CanMarry {
		public static boolean canMarry(int age, String gender){
			return (gender == "Male" && age >= 22) |
					(gender == "Female" && age >= 20);
		}
		
		public static boolean isDigit(String x){
			for(Character a : x.toCharArray()){
				if (Character.isDigit(a))
					return true;
			}
			return false;
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String[] parts = input.split(" ");
			if (parts.length != 2){
				System.out.println("You need to input the age and gender");
			}
			else{
				String age = parts[0];
				String gender = parts[1];
				if (isDigit(age) && 
						canMarry(Integer.parseInt(age), gender))
					System.out.println("The person can marry!");
					else
						System.out.println("The person cannot marry!");
				}
			}



}
