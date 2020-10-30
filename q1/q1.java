import java.util.Scanner ;
public class q1 {

	public static void main(String[] args) throws NumberFormatException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int st,ed,l;
		String[] sst=str.split(", ");
		l=sst.length;
		
		st=Integer.parseInt(sst[l-2]);
		ed=Integer.parseInt(sst[l-1]);
		System.out.println(str.substring(st,ed+1));
		
		
		
	}
//Pooja, what is this behaviour?, 3, 9
}
