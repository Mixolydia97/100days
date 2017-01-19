import java.io.*;
import java.util.*;

public class algorithm2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = s.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += array[i];
        }
        System.out.println(sum);
    }
}