import java.util.HashMap;
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		HashMap<String, Integer> map = new HashMap<>();

		int n = scn.nextInt();
		scn.nextLine();
		String[] arr = new String[n];
		String s = scn.nextLine();
		arr = s.split(" ");

		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				map.replace(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		int max = Integer.MIN_VALUE;
		String ans = "";
		for (int i = 0; i < n; i++) {
			if (map.get(arr[i]) > max) {
				max = map.get(arr[i]);
				ans = arr[i];
			}
		}
		System.out.println(max);

	}

}
