/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltptnhom1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

/**
 *
 * @author ADMIN
 */
public class GuiNhan {
    ServerSocket sserver;
    public void MoCong(int cong) throws Exception{
        sserver= new ServerSocket(cong);
        System.out.println("Da mo cong: "+ cong);
    }
   public String nhan() throws Exception{
        Socket c= sserver.accept();
        //Tạo luồng để nhận thông tin client gửi lên
      //  InputStreamReader is= new InputStreamReader(c.getInputStream());
        DataInputStream input = new DataInputStream(c.getInputStream());
         //Tạo bộ đệm để lưu dữ liệu nhận về
      //  BufferedReader r= new BufferedReader(is);
        return input.readUTF();
    }
    public void Gui(String data, String ipserver, int cong) throws Exception{
        Socket client= new Socket(ipserver, cong);
        DataOutputStream out =new DataOutputStream(client.getOutputStream());
        out.writeUTF(data); //Gửi thông báo
       // out.write(13);
       // out.write(10);
        out.flush();
        out.close();
   }
}
