
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
import javax.rmi.CORBA.Stub;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class MyServer {
    public static void main(String[] args) {
         try {
        TinhToan tt= new TinhToan();
        //Quang ba doi tuong tt de may khach co the goi phuong thuc trong tt
            UnicastRemoteObject.exportObject(tt);
        //Dang ky 1 dia chi de may khach truy cap vao doi tuong tt
            Naming.bind("rmi://localhost/ITinhToan",tt);
        System.out.print("Da cho may khach goi den:");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
