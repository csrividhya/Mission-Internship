import java.io.*;
import java.lang.*;

public class bermuda
{

	public void figure(int x1, int y1, int x2, int y2, int x3, int y3, int px, int py, int bx, int by)
	{
		int area = ((x1*(y2-y3))+(x2*(y3-y1))+(x3*(y1-y2)))/2;
		int areap1 = ((px*(y2-y3))+(x2*(y3-py))+(x3*(py-y2)))/2;
			int areap2 = (x1*(py-y3)+px*(y3-y1)+x3*(y1-py))/2;
				int areap3 = (x1*(y2-py)+x2*(py-y1)+px*(y1-y2))/2;

					int areab1 = (bx*(y2-y3)+x2*(y3-by)+x3*(by-y2))/2;
						int areab2 = (x1*(by-y3)+bx*(y3-y1)+x3*(y1-by))/2;
							int areab3 = (x1*(y2-by)+x2*(by-y1)+bx*(y1-y2))/2;
int sump=0, sumb=0;
				sump = (areap1)+(areap2)+(areap3);
				sumb = (areab1)+(areab2)+(areab3);
				int value=99;
				if(area==0)
					value = 1;
				else if (sumb==area && sump!=area)
					value = 2;
				else if (sump==area && sumb!=area)
					value = 3;
				else if(sump==area && sumb == area)
					value =4;

				System.out.print("returned value is "+value);
	}//figure

	public static void main(String []args)
	{
		int x1=3, y1=1, x2=7, y2=1, x3=5, y3=5, px=5,py=2, bx=6, by=3;
		bermuda obj = new bermuda();
		obj.figure(x1,y1,x2,y2,x3,y3,px,py,bx,by);
	}//main
}//class