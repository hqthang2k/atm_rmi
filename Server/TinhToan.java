
import java.rmi.server.RMIClassLoader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class TinhToan implements  ITinhToan{

    @Override
    public int Tong(int a, int b) throws Exception {
       int s = a+b;
        System.out.println("Tong: " +s);
        return s;
    }

    @Override
    public int Nhan(int a, int b) throws Exception {
       int s = a*b;
        System.out.println("Tich: " +s);
        return s;
    }

    @Override
    public int Hieu(int a, int b) throws Exception {
        int s = a-b;
        System.out.println("Hieu: "+s);
        return s;
    }

    @Override
    public double Chia(int a, int b) throws Exception {
        double s = (double)a/b;
        System.out.println("Chia: "+s);
        return s;
    }
    
}
