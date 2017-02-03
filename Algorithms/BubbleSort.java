import java.util.*;
import java.lang.*;
import java.io.*;
public class BubbleSort{

	public static void main(String[] args) throws IOException{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			int[] list = new int[Integer.parseInt(br.readLine())];
			int n = list.length;
			
			for(int i = 0; i < n; i++)
			{
				list[i] = Integer.parseInt(br.readLine());
				System.out.println(list[i]);

			}

			boolean sorted = false;
			while(!sorted)
			{
				boolean swapHappened = false;
				for(int i = 0; i < n-1; i++)
				{
					if(list[i]>list[i+1])
					{
						int tmp = list[i];
						list[i] = list[i+1];
						list[i+1] = tmp;
						swapHappened = true;
					}
				}
				if(!swapHappened)
				{
					sorted = true;
				}
			}
			for(int i = 0; i < n; i++)
			{
			System.out.println(list[i]);
			}
		}
		catch(IOException e){}
		
	}

}
