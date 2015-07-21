package java1;

public class Man {
	private String name;
	private int age;
	private double height;
	private String gender;
	
	public Man(String name,int age,double height,String gender){
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public double getHeight(){
		return height;
	}
	public String getGender(){
		if(gender.equals("M")){
			return "Male";
		}
		else if(gender.equals("F")){
			return "Female";
		}
		else
			return "Unknown";
	}
	public static boolean CanMarry(String gender,int age){
		return (gender=="Male"&&age>=22||gender=="Female"&&age>=20);
	}

}
