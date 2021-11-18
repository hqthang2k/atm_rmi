/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltptnhom1;

import java.math.BigInteger;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static BigInteger C(long n, long k){
       BigInteger result = new  BigInteger("1");
      //  System.out.println(result);
        for (long i = n, j = 1; j <= k; --i, ++j){
//        result = result * i / j
        BigInteger tmpi = new BigInteger(Long.toString(i));
          //  System.out.println(tmpi);
        BigInteger tmpj = new BigInteger(Long.toString(j));
           // System.out.println(tmpj);
        result = result.multiply(tmpi);
          //  System.out.println(result);
        result = result.divide(tmpj);
         //   System.out.println(result);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println();
        BigInteger KQ = C(200,20);
        System.out.println(KQ);
    }
    
}
