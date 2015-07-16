package java1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class NewFile {
	//�����ļ�
	public static void createFile() throws IOException {
		File file = new File("wang.txt");
		boolean is_succ = file.createNewFile();
		if (is_succ) {
			System.out.println("wang.txt has been created!");
		} else {
			System.out.println("wang.txt already exists!");
		}
	}
    //ɾ���ļ�
	public static void deleteFile() {
		File file = new File("wang.txt");
		boolean is_succ = file.delete();
		if (is_succ) {
			System.out.println("wang.txtɾ���ɹ�!");

		} else {
			System.out.println("wang.txtɾ��ʧ��!");
		}

	}
    //���ļ�
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
		System.out.print("���ļ�Ϊ��");
		for (int i = 0; i < len; i++) {
			System.out.print(chars[i]);
		}
		System.out.println();
		is.close();
	}
    //д�ļ�
	public static void writeFile() throws IOException {
		File file = new File("wang.txt");
		OutputStream os = new FileOutputStream(file);
		String cont = "I am here!";
		for (int i = 0; i < cont.length(); i++) {
			char x = cont.charAt(i);
			os.write(x);
		}
		os.close();
		System.out.println("�ļ�д��ɹ���");
	}
    //�����ļ�
	public static void readFileX(String inputFile, String outputFile) {
		try {
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream(new File(inputFile)));
			BufferedReader in = new BufferedReader(new InputStreamReader(bis,
					"utf-8"), 10 * 1024 * 1024);// 10M����
			FileWriter fw = new FileWriter(outputFile);
			while (in.ready()) {
				String line = in.readLine();
				System.out.println(line); //���
				fw.append(line + " ");
			}
			in.close();
			fw.flush();
			fw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("���ļ�x.txt�Ѿ�����a.txt!");

	}

	public static void main(String[] args) throws IOException {
		createFile();
		writeFile();
		readFile();
		deleteFile();
		readFileX("x.txt", "a.txt");    
	}

}
