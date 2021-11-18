/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Interface.Service;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import javax.rmi.CORBA.Stub;


/**
 *
 * @author ADMIN
 */
public class ATMServer {
    
    public static void main(String[] args) {
        try {
            Service sv = new Service();
            Registry r = LocateRegistry.createRegistry(1099);
            Naming.bind("rmi://localhost/IService",sv);
            System.out.print("Da cho may khach goi den:");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
