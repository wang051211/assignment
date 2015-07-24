package Test;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OutputWordsWeight {
	public static String maxWeight(StringBuffer buffer) {
		Pattern p = Pattern.compile("[a-zA-Z]+");
		String string = buffer.toString();
		Matcher matcher = p.matcher(string);
		Map<String, Double> map = new HashMap<String, Double>();
		String word = "";
		double times = 0;
		while (matcher.find()) {
			word = matcher.group();
			if (map.containsKey(word)) {
				times = map.get(word);
				map.put(word, times + 1);
			} else {
				map.put(word, 1.0);
			}
		}
		//System.out.println("before" + map);
		String[] s = { "am", "is", "are", "has", "been", "has", "have", "had",
				"a", "an", "the", "in", "at", "on", "to", "or" };
		int weight = 0;
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			String key = (String) me.getKey();
			Double value = (Double) me.getValue();
			for (int j = 0; j < s.length; j++) {
				if (key.equals(s[j]))
					value = (Double) (0.2 * value);
				else
					value = 1 * value;
				map.put(key, value);
			}
		}
		//System.out.println("change:" + map);
		List<Map.Entry<String, Double>> list = new ArrayList<Map.Entry<String, Double>>(
				map.entrySet());
		Comparator<Map.Entry<String, Double>> comparator = new Comparator<Map.Entry<String, Double>>() {
			public int compare(Map.Entry<String, Double> left,
					Map.Entry<String, Double> right) {
				return (left.getValue()).compareTo(right.getValue());
			}
		};
		Collections.sort(list, comparator);
		int max = list.size() - 1;
		for (int i = max; i > max - 10; i--) {
			String id = list.get(i).toString();
			System.out.println(id);
		}

		return null;
	}

	public static void main(String[] args) throws IOException {
		String fileName1 = "words.txt";
		FileReader fr = new FileReader(fileName1);
		BufferedReader reader = new BufferedReader(fr);
		StringBuffer buffer = new StringBuffer();
		String line = null;
		while ((line = reader.readLine()) != null) {
			buffer.append(line);
		}
		reader.close();
		System.out.println(maxWeight(buffer));
	}
}
