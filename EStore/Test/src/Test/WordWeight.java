package Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


/*1. ������Ȩ��=���ִ���*����Ȩ��
  2. ���µĵ���Ȩ��Ϊ0.2,[am,is,are,was,been,has,have,had,a,an,the,in,at,on,to,or]
  3. 2����ĵ���Ȩ��Ϊ1 */

public class WordWeight {
	public static void readFile(String inputFile, String outputFile) {
		ArrayList list = new ArrayList();
		try {
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream(new File(inputFile)));
			BufferedReader in = new BufferedReader(new InputStreamReader(bis,
					"utf-8"), 10 * 1024 * 1024);// 10M����
			FileWriter fw = new FileWriter(outputFile);
			while (in.ready()) {
				String line = in.readLine();
				fw.append(line + " ");
				System.out.println(line); //���
				
				for(int i=0;i<line.length();i++){
					list.add(line.charAt(i));
				}
				//System.out.println(list);
				getWeight(list);
				
			}
			in.close();
			fw.flush();
			fw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	private static void getWeight(ArrayList list) {
		for(int i=0;i<list.size();i++){
			if(" ".endsWith((String) list.get(i))){
					char[] chars=(char[]) list.get(i);
				
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		String[] str={"am","is","are","was","been","has","have","had","a","an","the","in","at","on","to","or"};
		readFile("words.txt","a.txt");
	
		
		
	}

}
