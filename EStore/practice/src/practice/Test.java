package practice;

import java.io.*;
import java.util.Scanner;

public class Test {
	public static void createFile() throws IOException {
		File file = new File("E:\\wang.txt");
		boolean is_succ = file.createNewFile();
		if (is_succ) {
			System.out.println("wang.txt has been created!");
		} else {
			System.out.println("wang.txt already exists!");
		}
	}

	public static void deleteFile() {
		File file = new File("E:\\wang.txt");
		boolean is_succ = file.delete();
		if (is_succ) {
			System.out.println("wang.txt删除成功!");

		} else {
			System.out.println("wang.txt删除失败!");
		}

	}

	public static void readFile() throws IOException {
		File file = new File("wang.txt");
		InputStream is = new FileInputStream(file);
		char[] chars = new char[1024];
		int len = 0;
		for (int i = 0; i < 1024; i++) {
			int x = is.read();
			if (x == -1) {
				len = i;
				break;
			}
			chars[i] = (char) x;
		}
		System.out.print("读出的文件为：");
		for (int i = 0; i < len; i++) {
			System.out.print(chars[i]);
		}
		System.out.println();
		is.close();
	}

	public static void writeFile() throws IOException {
		File file = new File("E:\\wang.txt");
		OutputStream os = new FileOutputStream(file);
		//String cont = "I am now here,and let's write me to the file!";
		System.out.print("请输入信息：");
		Scanner s=new Scanner(System.in);
		String cont=s.next();
		String[] str=cont.split(",");
		for (int i = 0; i < cont.length(); i++) {
			char x = cont.charAt(i);
			os.write(x);
		}
		os.close();
		System.out.println("文件写入成功!");
	}

	public static void readFileX(String inputFile, String outputFile) {
		try {
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream(new File(inputFile)));
			BufferedReader in = new BufferedReader(new InputStreamReader(bis,
					"utf-8"), 10 * 1024 * 1024);// 10M缓存
			FileWriter fw = new FileWriter(outputFile);
			while (in.ready()) {
				String line = in.readLine();
				for(char c :line.toCharArray()){
					if(Character.isLetter(c))
						System.out.print(c);
					fw.append(c + " ");
				}
				System.out.println();
				//System.out.println(c);
				//fw.append(c + " ");
			}
			in.close();
			fw.flush();
			fw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("文件x.txt已经读入a.txt");
	}

	public static void main(String[] args) throws IOException{
		createFile();
		writeFile();
		readFile();
		deleteFile();
		readFileX("qqq.txt", "a.txt");

	}

}

