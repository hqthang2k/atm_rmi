
import java.rmi.Remote;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public interface ITinhToan extends Remote{
    public int Tong(int a,int b) throws Exception;
    public int Nhan(int a,int b) throws Exception;
    public int Hieu(int a, int b) throws Exception;
    public double Chia(int a, int b) throws Exception;
}
