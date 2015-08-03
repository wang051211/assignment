package java1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatch {
	private String str;

	public StringMatch(String str) {
		this.str = str;
	}

	public int numberOfOccurence(char x) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == x) {
				count++;
			}
		}
		return count;
	}

	public String getMaxSubStr(int len) {
		ArrayList<String> c = new ArrayList<String>();
		ArrayList<String> ch = new ArrayList<String>();
		int cnt = 0, max = 0;
		String s = new String();

		// �ҵ�ÿ��Ԫ����ͬ���������ַ���
		Pattern p = Pattern.compile("(.)\\1+");
		Matcher m = p.matcher(str);
		while (m.find()) {
			c.add(m.group());
		}

		// �ҵ�����Ϊlen�����ַ���������
		if (c.size() != 0) {
			for (int index = 0; index < c.size(); index++) {
				if (c.get(index).length() == len) {
					ch.add(c.get(index));
				}
			}
			Collections.sort(ch);
		}
		// �����������
		if (ch.isEmpty())
			s = null;
		else if (ch.size() == 1)
			s = ch.get(0);
		else {
			for (int j = 0; j < ch.size(); j++) {
				for (int k = j + 1; k < ch.size(); k++) {
					if (ch.get(j) == ch.get(k))
						cnt++;
				}
				if (cnt > max)
					max = cnt;

			}
			s = ch.get(max);
		}
		return s;
	}

}
