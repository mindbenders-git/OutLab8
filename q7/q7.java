import java.io.*;
import java.nio.file.*;
import java.util.*;

public class q7 {

	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
		// Create a list from elements of HashMap
		LinkedList<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				if ((o1.getValue()).compareTo(o2.getValue()) == 0)
					return (o1.getKey()).compareTo(o2.getKey());
				else
					return (o2.getValue()).compareTo(o1.getValue());

			}
		});

		// put data from sorted list to hashmap
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		F:\IITB\Sem1\CS699\OutLab8\team_name\q7\sample.txt

		String data = readFileAsString(args[0]);

		String words[] = data.split(" ");

		ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, words);
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < list.size(); i++) {
			String w = list.get(i);
			int freq = Collections.frequency(list, w);
			if (!map.containsKey(w))
				map.put(w, freq);
		}

		map = sortByValue(map);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "," + entry.getValue());
		}

	}

	public static String readFileAsString(String fileName) throws IOException {
//		and, the is, in, at, of, his, her, him
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)));
		data = data.replaceAll("'", "");
		data = data.replaceAll("[^a-zA-Z \n]", " ");
		data = data.replaceAll(" and ", " ");
		data = data.replaceAll(" the ", " ");
		data = data.replaceAll(" is ", " ");
		data = data.replaceAll(" in ", " ");
		data = data.replaceAll(" at ", " ");
		data = data.replaceAll(" of ", " ");
		data = data.replaceAll(" his ", " ");
		data = data.replaceAll(" her ", " ");
		data = data.replaceAll(" him ", " ");
		data = data.replaceAll("\n", " ");
		data = data.replaceAll("\\s+", " ");
		data = data.replaceAll("\t+", " ");
		return data;
	}

}

