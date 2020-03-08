import java.io.ObjectInputStream.GetField;

public class sequece 
{
	public static String getFirstWord(String text) {

		  int index = text.indexOf(' ');

		  if (index > -1) { // Check if there is more than one word.

		    return text.substring(1, index).trim(); // Extract first word.

		  } else {

		    return text; // Text is the first word itself.
		  }
		}
	public static void main(String[] args) 
	{
		//System.out.println("  welcoe to the my world  ");
		System.out.println("\2Welocme To My World\3");
		System.out.println("Enjoy This \3 Feeling...\1\1\1");
		String input="    welcome to the my world    ";
		//String res=sequece.getFirstWord(input);
		System.out.println(input.trim());
		
		String[]words=(input.trim()).split(" ");
		int len=words.length;
		
		for(String eachword:words)
		{
			
			System.out.println("Sub string is :"+eachword);
		
			
		}
		
		//System.out.println("out put is :"+res);
    }


}
