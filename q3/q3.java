import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class q3 {
	public boolean fun1(String myStr) {
		return (myStr.matches("[A-Za-z0-9]*") && myStr.length()<=5);		//checks whether string is alphanumeric and have length less than equal to 5
	}
	
	public boolean fun2(String myStr) {
		return myStr.matches("a*b+c"); 		//checks whether myStr belongs to given regular expression or not
	}
	
	public boolean fun3(String myStr) {
		return (myStr.matches("[a]+[b]+") && (myStr.chars().filter(ch -> ch == 'a').count() - myStr.chars().filter(cha -> cha == 'b').count() == 0)); //returns true if string follows given regular exp pattern and count of a is equal to count of b
	}
	public ArrayList<String> fun4(String myStr, String patt) {
			
		Pattern pt = Pattern.compile(patt);
		ArrayList<String> apple = new ArrayList<String>();		// declares and initializes a arraylist of name apple
		int n,jmax;
		n=myStr.length(); 		//initialized n with length of string
		for (int i = 0; i < n; i++) 		//dual loop to find all the substrings possible in a string
		{
			   jmax=i;		//initialized jmax with i to get substring of length 1 also
	           for (int j = i; j <= n; j++) 			//inner loop to get all substrings starting from ith position
	           {
	        	   Matcher matcher = pt.matcher(myStr.substring(i, j));
	        	   if (matcher.matches())               //checks whether the substring in matcher matches with the pattern pt
	        	   {   jmax=j;}             //stores maximum value of j for a given i if the substring exists
	           }
	           if(jmax-i != 0) 		//it will zero if none substring found for a given i that is value of jmax won't be updated
	          {
	           apple.add(myStr.substring(i, jmax)); 		//appends those substring in arraylist apple
	           i=jmax-1; 		// shifts i to position till where we have chosen a substring
	           }
	           
		}
		return apple;
	}
	
}  