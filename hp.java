import java.io.*;

public class hp
{
	public static void main(String []args)
	{
		//StringBuffer msg = new StringBuffer("Yolo buddy!");
		String msg= "Yolo buddy!";
		int len = msg.length();
		System.out.println(len);
		int space=0;
		String secret="";

		String[] splitted = msg.split("\\s+");
		StringBuffer temp; 
		System.out.println(splitted.length);
		int ptr=0;


		for(int i=0;i<splitted.length;i++)
		{
			temp = new StringBuffer(splitted[i]);
			System.out.println(temp);
			secret+=temp.reverse().toString();
			ptr+=temp.length();
			while(msg.charAt[ptr]==" ")
			{
			secret+=" ";
			ptr++;
			}
		}

		System.out.println(secret);

	}//main
}//end of class