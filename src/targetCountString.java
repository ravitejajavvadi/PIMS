
public class targetCountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String inp="testcase,,,,passed";
		int cnt=0;
		for(int i=0;i<inp.length();i++)
		{
			char c=inp.charAt(i);
			if(c==',')
			{
				cnt++;
			}
		}
		System.out.println("count of target is:"+cnt);
	}
	        
}
