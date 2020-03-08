
public class reverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inp=".....suvarna.....technosoft";
		int len= inp.length();
		String s= inp.substring(0, 4);
		String s1= inp.substring(5, 12);
		String s2= inp.substring(17, 27);
		System.out.println("inp string lenth is :"+len+"  "+"string s1:"+s1+ "   "+ "string s1 :"+s2);
	    StringBuffer r= new StringBuffer(s1);
	    StringBuffer r1= new StringBuffer(s2);
		System.out.println("string reverse is:"+s+r.reverse()+s+r1.reverse());
		System.out.println("code changes");
		
	}

}
