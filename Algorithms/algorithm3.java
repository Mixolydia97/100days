import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class algorithm3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int[] A = {a0,a1,a2};
        int[] B = {b0,b1,b2};

        int a = 0;
        int b = 0;
        
        for (int i = 0; i < 3; i++){
            if (A[i] > B[i]){
                a++;
            }
            else if (A[i] < B[i]){
                b++;
            }
        }

        System.out.println(a + " " + b);
    }
}
