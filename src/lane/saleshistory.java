/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;

/**
 *
 * @author user
 */
public class saleshistory extends javax.swing.JFrame {
ImageIcon icon=new ImageIcon("lan.jpg");
login.loginpage usr = new login.loginpage();
JFrame frame = new JFrame("stockout graph");
public static JDialog d = null;
        String loggedin = usr.choice;
    /**
     * Creates new form saleshistory
     */
    public saleshistory() throws ClassNotFoundException, SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(icon.getImage());
        filltable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        salhist3 = new javax.swing.JTable();
        from = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        search1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("sales history.");

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        salhist3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "index", "purchase mode.", "date", "time", "day", "worth of goods sold", "sold by", "cust. phone no."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salhist3);

        from.setText("-----------------null------------------");

        jLabel2.setText("to");

        jLabel3.setText("sales history from");

        to.setText("--------------------null--------------------");

        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
        });

        jLabel5.setText("searchbox.");

        jButton2.setText("graphical data.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            this.dispose();
            frame.dispose();
            if(d!=null){
                d.dispose();
            }
            new lane.mainwin_1().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(saleshistory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(saleshistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased
        DefaultTableModel m = (DefaultTableModel) salhist3.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(m);
        salhist3.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search1.getText().trim()));
    }//GEN-LAST:event_search1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{
        frame.dispose();
    if (d != null){
        d.dispose();
    }
        int rowc1 =  salhist3.getRowCount();
        double[] xDa = new double[rowc1];
        double[] yDa = new double[rowc1];
        for(int i = 0; i<rowc1 ; i++ ){
            xDa[i] = Integer.parseInt(salhist3.getValueAt(i,0).toString());
            yDa[i] = Integer.parseInt(salhist3.getValueAt(i,5).toString());
        }
        XYChart chart = QuickChart.getChart("sales history graph","transaction id","worth of goods sold",null,xDa,yDa);
        frame.setUndecorated(true);
        frame.setLayout(null);
        frame.setSize(190,110);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.green);
        JButton click = new JButton("sales history in graph");
        click.setBounds(10, 20, 170, 20);
        JButton back = new JButton("back");
        back.setBounds(10, 80, 170, 20);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayChart(frame,chart);
            }
        });
        frame.add(click);
        frame.add(back);
        frame.setVisible(true);
    }catch(IllegalArgumentException e){
        JOptionPane.showMessageDialog(this, "no records pressent!");
    }
    }//GEN-LAST:event_jButton2ActionPerformed
public static void displayChart(JFrame frame, XYChart chart) {
        XChartPanel<XYChart> panel = new XChartPanel<XYChart>(chart);
        d = new JDialog(frame, "stock graph.");
        d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        d.setContentPane(panel);
        d.pack();
        d.setLocationRelativeTo(frame);
        d.setVisible(true);
            }
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
            java.util.logging.Logger.getLogger(saleshistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(saleshistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(saleshistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(saleshistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new saleshistory().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(saleshistory.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(saleshistory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel from;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable salhist3;
    private javax.swing.JTextField search1;
    private javax.swing.JLabel to;
    // End of variables declaration//GEN-END:variables

    private void filltable() throws ClassNotFoundException, SQLException {
        
        Class.forName("org.sqlite.JDBC");
        DefaultTableModel model = (DefaultTableModel) salhist3.getModel();
        model.setRowCount(0);
        
        Connection con = DriverManager.getConnection("jdbc:sqlite:lng.db");
        Statement state11 = con.createStatement();
        ResultSet rs = state11.executeQuery("select * from saleshist where ind > 0 order by ind desc;");
        
        while(rs.next()){
            
            String s0=rs.getString(1);
            String s1=rs.getString(2);
            String s2=rs.getString(3);
            String s3=rs.getString(4);
            String s4=rs.getString(5);
            String s5=rs.getString(6);
            String s6=rs.getString(7);
            String s7=rs.getString(8);
            
            Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7};
            DefaultTableModel model1 = (DefaultTableModel) salhist3.getModel();
            model1.addRow(obj);
            
        int rowc1 =  salhist3.getRowCount();
        String date = null;
        String date1 = null;
        for(int i = 0; i<rowc1 ; i++ ){
            if (i == 0){
                date1 = salhist3.getValueAt(i,2).toString();
            }
            date = salhist3.getValueAt(i,2).toString();
        }
        String time = null;
        String time1 = null;
        for(int i = 0; i<rowc1 ; i++ ){
            if (i == 0){
                time1 = salhist3.getValueAt(i,3).toString();
            }
            time = salhist3.getValueAt(i,3).toString();
        }
        String day = null;
        String day1 = null;
        for(int i = 0; i<rowc1 ; i++ ){
            if (i == 0){
                day1 = salhist3.getValueAt(i,4).toString();
            }
            day = salhist3.getValueAt(i,4).toString();
        }
        from.setText(date + time + day);
        to.setText(date1 + time1 + day1);
        }
        con.close();
        rs.close();
        state11.close();
    
    }
}