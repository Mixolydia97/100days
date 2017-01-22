import java.io.*;
import java.util.*;

public class algorithm4{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        long[] array = new long[size];
        for(int i = 0; i < size; i++){
            array[i] = s.nextLong();
        }
        long sum = 0L;
        for(int i = 0; i < size; i++){
            sum += array[i];
        }
        System.out.println(sum);
    }
}