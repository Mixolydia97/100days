import java.io.*;
import java.util.*;

public class algorithm5{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int primeDiag = 0;
		int secDiag = 0;
		for(int i = 0; i < size; i++){
			primeDiag+=arr[i][i];
			secDiag+=arr[i][size-1-i];
		}
		System.out.println(Math.abs((primeDiag - secDiag)));
	}
}	
