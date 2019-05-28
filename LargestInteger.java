 

import java.util.Scanner;
public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Scanner sc = new Scanner(System.in);
        
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();
        Integer max;
        Integer largestNum;
            max = (a > b) ? a : b;
            largestNum = (c > max) ? c : max ;
        return largestNum;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        Scanner sc = new Scanner(System.in);
        
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();
        Integer max;
        Integer largestNum;
            max = Math.max(a, b);
            largestNum = Math.max(c, max);
                return largestNum;
    }
}
