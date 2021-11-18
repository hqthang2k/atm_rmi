/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltptnhom1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author ADMIN
 */
public class GuiNhanUDP {
    DatagramSocket Ssverser;
    public void MoCong(int cong) throws Exception{
        Ssverser  = new DatagramSocket(cong);
        System.out.println("Đã mở công "+cong);
     }
    
    public void Gui(String data, String ipserver, int cong) throws Exception{
        byte bodem[] = new byte[256];
        bodem = data.getBytes();
        InetAddress ip = InetAddress.getByName(ipserver);
        DatagramPacket dr = new DatagramPacket(bodem,bodem.length,ip,cong);
        DatagramSocket client = new DatagramSocket();
        client.send(dr);
        client.close();
        System.out.println("Đã gửi");
    }
    
    public String Nhan() throws Exception{
        
        byte bodem[] = new byte[256];
        String st;
        DatagramPacket dr = new DatagramPacket(bodem, bodem.length);
        Ssverser.receive(dr);
        st = new String(dr.getData()).trim();
        return st;
    }
}
