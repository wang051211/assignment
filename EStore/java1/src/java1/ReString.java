package java1;

public class ReString {
   public static void main(String[] args){
	Integer x=10;
	Double y=x.doubleValue();
	String z="xxxyz";
	System.out.println(z.toUpperCase());
	String part1=z.substring(0,z.indexOf('y'));
	String part2="y".toUpperCase();
	String part3=z.substring(0,z.indexOf('y')+1);
	String out=part1+part2+part3;
	System.out.println(out);
	   
   }
	
	
}
