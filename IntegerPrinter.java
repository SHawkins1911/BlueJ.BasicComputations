 
import java.util.Scanner; 

public class IntegerPrinter {
   
    IntegerPrinter integerPrinter = new IntegerPrinter();
    
    public String printIntegerAsBinary(int value){
      String binOutput = Integer.toBinaryString(value);
        System.out.println(binOutput);
        return binOutput;
    }

    public String printIntegerAsOctal(int value){
        String hexOutput = Integer.toHexString(value);
        System.out.println(hexOutput);
        return hexOutput;
    }

    public String printIntegerAsHexadecimal(int value){
        String octalOutput = Integer.toOctalString(value);
        System.out.println(octalOutput);
        return octalOutput;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
      
       
            
        
    }
        
    }

