import java.util.ArrayList;
import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn = new Scanner(System.in);
		
		ArrayList<String[]> list = new ArrayList<>();
		
		int n = scn.nextInt();
		scn.nextLine();
		for(int i = 0;i<n;i++) {
			String[] str = scn.nextLine().split(" ");
			list.add(str);
		}
		int q = scn.nextInt();
		scn.nextLine();
		for(int i = 0;i<q;i++) {
			String[] str = scn.nextLine().split(" ");
			int num = Integer.parseInt(str[0]);
			int index = Integer.parseInt(str[1]);
			
			if(num>list.size() || num<=0) {
				System.out.println("ERROR!");
				continue;
			}
			
			String[] arr = list.get(num-1);
			if(num>list.size() || index>=arr.length || index<1) {
				System.out.println("ERROR!");
			}else {
				System.out.println(arr[index]);
			}
			
		}
	}

}
