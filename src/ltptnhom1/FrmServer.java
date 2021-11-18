/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltptnhom1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.omg.SendingContext.RunTime;

/**
 *
 * @author ADMIN
 */
public class FrmServer extends javax.swing.JFrame {
    
    /**
     *
     * @param s
     * @return
     */
//    public static long C(int n, int k){
//       int result = 1;
//        for (int i = n, j = 1; j <= k; --i, ++j)
//        result = result * i / j;
//        return result;
//    }
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
    public List<Integer> chuyendoi(String[] s){
       List<Integer> a = new ArrayList<Integer>();
        for(int i =1; i < s.length;i++)
            if(s[i].matches("[a-zA-Z]")==false){
            a.add(Integer.parseInt(s[i]));
            }
        a.sort((o1,o2)->o1-o2);
        return a;
    }
    public int Tong(List<Integer> a){
        int temp=0;
        for (int i : a) {
            temp += i;
        }
        return temp;
    }
    
    public class TuyenNhan extends Thread{
    public void run(){
        while(true){
            try {
                String st = gn.Nhan();
                String[] ds = st.split(":");
                String cp =  ds[1];
                String ip = ds[0];
                for(String s :ds){
                    System.out.println(s);
                }
                if(cp.equals("/tm"))
                    gn.Gui("Server Name: "+InetAddress.getLocalHost().getHostName(), ip, 1261);
                if(cp.equals("/note"))
                    Runtime.getRuntime().exec("notepad");
                if(cp.equals("/excel"))
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft Office\\Office14\\EXCEL.EXE");
                if(cp.equals("/word"))
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft Office\\Office14\\WINWORD.EXE");
                if(cp.equals("/c++"))
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Dev-Cpp\\devcpp.exe");
                if(cp.equals("/ht"))
                    gn.Gui("Huỳnh Quốc Thắng", ip, 1261);
                if(cp.matches("^/\\+.+") || cp.matches("^/ck.+")){
                    String[] list = cp.split(";");
                    String cp1 = list[0];
                    if(cp1.equals("/+")){
                        List<Integer> a =chuyendoi(list);
                        gn.Gui(String.format("Tổng: %d", Tong(a)), ip, 1261);
                        gn.Gui(String.format("Số lớn nhất: %d", a.get(a.size()-1)),ip,1261);
                        gn.Gui(String.format("Số nhỏ nhất: %d", a.get(0)), ip, 1261);
                        gn.Gui(String.format("Số chữ số Client gửi lên: %d",a.size()), ip, 1261);
                    }
                    if(cp1.equals("/ck")){
                        long k = Long.parseLong(list[1]);
                        long n = Long.parseLong(list[2]);
                        gn.Gui("Kết Quả: "+C(n, k), ip, 1261);
                    }
                    
                }
                if(cp.equals("/xoso")){
                        try {
                             FileReader fr = new FileReader("data.txt");
                             BufferedReader br = new BufferedReader(fr);
                             while(true){ 
                                String line = br.readLine();
                                if(line == null)
                                    break;
                                 System.out.println(line);
                                gn.Gui(line, ip, 1261);
                                }
                             fr.close();
                             br.close();
                        }catch (Exception e) {}
                    }
                if(cp.equals("/quit"))
                    System.exit(0);
                //Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
                    
                list1.add(st);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
                
         
        }
    }
            }
    
//  public class TuyenNhan extends Thread{
//      public void run(){
//          while(true){
//              try {
//                 String st = gn.Nhan();
//                  list1.add(st);
//              } catch (Exception ex) {
//                  Logger.getLogger(FrmServer.class.getName()).log(Level.SEVERE, null, ex);
//              }
//          }
//      }
//  }
    public FrmServer() {
        initComponents();
        this.setLocation(100, 200);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        txtsvinput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });

        txtsvinput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsvinputKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(txtsvinput))
                .addGap(0, 75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtsvinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//    GuiNhan gn = new GuiNhan();
    GuiNhanUDP gn = new GuiNhanUDP();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            gn.MoCong(1260);
            TuyenNhan tn = new TuyenNhan();
            tn.start();
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtsvinputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsvinputKeyPressed
        // TODO add your handling code here:
        try {
            if(evt.getKeyCode()==10){
                String data = InetAddress.getLocalHost().getHostAddress()+":";
                 data = data+txtsvinput.getText();
                 gn.Gui(data,"127.0.0.1", 1261);
                 txtsvinput.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtsvinputKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosed

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.List list1;
    private javax.swing.JTextField txtsvinput;
    // End of variables declaration//GEN-END:variables
}
