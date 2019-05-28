 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
           BigInteger output =new BigInteger("1");
                       
            for (int i = 2; i <= value; i++){
              BigInteger x = BigInteger.valueOf(i);
              output = output.multiply(x);
              
                System.out.println(output);
        }
        
        return output;
    }
        
    }

