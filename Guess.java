package java1;

import java.util.Scanner;

public class Guess {
		public static int guess(int x){
		   int count=0;
		   int min=0,max=100,mid=0;
		   while(min<=max){
			   count++;
			   mid=(min+max)/2;
			   if(x<mid){
				   max=mid-1;
			   }
			   else if(x>mid){
				   min=mid+1;
				 
			   }
			   else
				   break;
				   
		   }
		  return count;
			
		}
		
		public static void main(String[] args){
			System.out.print("������һ��100������:");
			Scanner s=new Scanner(System.in);
			int x=s.nextInt();
			if(x>100||x<0){
				System.out.println("Error!");
				System.out.println("��������ȷ������");
			    x=s.nextInt();
			}
			System.out.println("�µĴ���Ϊ��"+guess(x));
			
		}
		

}
