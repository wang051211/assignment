package practice;

import java.util.ArrayList;
import java.util.Collections;

public class StringMatch {
	private String str;
	public StringMatch(String str){
		this.str = str;
	}
	private int numberOfOccurence(char x){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==x){
				count++;
		    }
		}
		return count;
	}
	private String getMaxSubStr(int len){
		ArrayList<String> c = new ArrayList<String>();
		int length=1;
		int temp=0,cnt=0,max=0;
		String s=new String();
		//输出长度为len的所有子字符串
		for(int i =1;i<str.length();i++){
				if(str.charAt(i)==str.charAt(temp)){
					length++;
				}
				else{
					if(length==len){
						c.add(str.substring(temp,i));
					}
					temp=i;
					length=1;
				}
		}
		//输出次数最多的
		Collections.sort(c);
		if(c.isEmpty())
			s=null;
		else if(c.size()==1)
			s=c.get(0);
		else{
			for(int j=0;j<c.size();j++){
				for(int k=j+1;k<c.size();k++){
				if(c.get(j)==c.get(k))
					cnt++;
				}
				if(cnt>max)
					max=cnt;
			}
			s=c.get(max);
		}
		return s;
	}

}