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
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;


public class transactionhistory extends javax.swing.JFrame {
ImageIcon icon=new ImageIcon("lan.jpg");
login.loginpage usr = new login.loginpage();
JFrame frame = new JFrame("stockout graph");
public static JDialog d = null;
        String loggedin = usr.choice;
    
    public transactionhistory() throws ClassNotFoundException, SQLException {
        initComponents();
        this.setIconImage(icon.getImage());
        this.setLocationRelativeTo(null);
        fill();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        trans = new javax.swing.JTable();
        search1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cashin = new javax.swing.JLabel();
        cashout = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        latestin = new javax.swing.JLabel();
        latestout = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        oldestin = new javax.swing.JLabel();
        oldestout = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        flot = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        trans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "transaction id.", "amount in.", "ammount out.", "day", "time", "month", "year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(trans);

        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
        });

        jLabel1.setText("search box.");

        jButton2.setText("graphical data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("statistics");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("total cash in->");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("total cash out->");

        cashin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cashin.setText("000000000000");

        cashout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cashout.setText("0000000000000");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("latest trans in>");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("latest trans out>");

        latestin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        latestin.setText("--------------null--------------");

        latestout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        latestout.setText("--------------null--------------");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("oldest trans in->");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("oldest trans out->");

        oldestin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oldestin.setText("--------------null--------------");

        oldestout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oldestout.setText("--------------null--------------");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("current float->");

        flot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flot.setText("00000000000000000");

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("NB// all the above details have being collected from all transctions taking place in the organization. in case of error then there must have being a transaction done incorrectly.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(flot, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 1344, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(247, 247, 247)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cashin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cashout, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(latestin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(oldestin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(latestout, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                    .addComponent(oldestout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cashin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(latestin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(latestout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cashout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldestin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldestout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flot, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
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
            this.dispose();
            new lane.mainwin_1().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(transactionhistory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(transactionhistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased
        DefaultTableModel m = (DefaultTableModel) trans.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(m);
        trans.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search1.getText().trim()));
    }//GEN-LAST:event_search1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{          
        frame.dispose();
    if (d != null){
        d.dispose();
    }
        int rowc1 =  trans.getRowCount();
        double[] xDa = new double[rowc1];
        double[] yDa = new double[rowc1];
        double[] yDa2 = new double[rowc1];
        for(int i = 0; i<rowc1 ; i++ ){
            xDa[i] = Integer.parseInt(trans.getValueAt(i,0).toString());
            yDa[i] = Integer.parseInt(trans.getValueAt(i,1).toString());
            yDa2[i] = Integer.parseInt(trans.getValueAt(i,2).toString());
        }
        XYChart chart = QuickChart.getChart("transaction history graph","transaction id","amount","money in",xDa,yDa);
        chart.addSeries("money out", yDa2);
        frame.setUndecorated(true);
        frame.setLayout(null);
        frame.setSize(190,110);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.green);
        JButton click = new JButton("transactions in graph");
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
            java.util.logging.Logger.getLogger(transactionhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transactionhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transactionhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transactionhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new transactionhistory().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(transactionhistory.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(transactionhistory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cashin;
    private javax.swing.JLabel cashout;
    private javax.swing.JLabel flot;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel latestin;
    private javax.swing.JLabel latestout;
    private javax.swing.JLabel oldestin;
    private javax.swing.JLabel oldestout;
    private javax.swing.JTextField search1;
    private javax.swing.JTable trans;
    // End of variables declaration//GEN-END:variables

    private void fill() throws ClassNotFoundException, SQLException {
    
        Class.forName("org.sqlite.JDBC");
        DefaultTableModel model = (DefaultTableModel) trans.getModel();
        model.setRowCount(0);
        
        Connection con = DriverManager.getConnection("jdbc:sqlite:lng.db");
        Statement state11 = con.createStatement();
        ResultSet rs = state11.executeQuery("select * from transhist where transid > 0 order by transid desc;");
        
        while(rs.next()){
            
            String s0=rs.getString(1);
            String s1=rs.getString(2);
            String s2=rs.getString(3);
            String s3=rs.getString(4);
            String s4=rs.getString(5);
            String s5=rs.getString(6);
            String s6=rs.getString(7);
            
            Object[] obj = {s0, s1, s2, s3, s4, s5, s6};
            DefaultTableModel model1 = (DefaultTableModel) trans.getModel();
            model1.addRow(obj);
            statistics();
            
        }
        con.close();
        rs.close();
        state11.close();
        
    }

    private void statistics() throws ClassNotFoundException, SQLException {
    
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:lng.db");
        
        //-----------------cash inn
        Statement state12 = con.createStatement();
        ResultSet rs2 = state12.executeQuery("select sum(ai) from transhist where ao = \"0\";");
        while(rs2.next()){
        String ammountinn = rs2.getString(1);
        cashin.setText(ammountinn);
        }
        state12.close();
        rs2.close();
        
        //-----------------cash out
        Statement state13 = con.createStatement();
        ResultSet rs3 = state13.executeQuery("select sum(ao) from transhist where ai = \"0\";");
        while(rs3.next()){
        String ammountoutt = rs3.getString(1);
        cashout.setText(ammountoutt);
        }
        state13.close();
        rs3.close();
        
        //-----------------float
        if(cashin.getText()==null){
            cashin.setText("0");
        }
        if(cashout.getText()==null){
        cashout.setText("0");
        }    
        int in = Integer.parseInt(cashin.getText());
        int out = Integer.parseInt(cashout.getText());
        flot.setText(Integer.toString((in-out)));
            
        //-----------------latest trans in
        String latesttransinid = null;
        Statement state18 = con.createStatement();
        ResultSet rs8 = state18.executeQuery("select max(transid) from transhist where ao = \"0\";");
        while(rs8.next()){
        latesttransinid  = rs8.getString(1);
        }
        state18.close();
        rs8.close();
        
        Statement state19 = con.createStatement();
        ResultSet rs9 = state19.executeQuery("select * from transhist where transid = \""+latesttransinid+"\";");
        while(rs9.next()){
        String a= rs9.getString(1);
        String b= rs9.getString(2);
        String c= rs9.getString(3);
        String e= rs9.getString(4);
        String f= rs9.getString(5);
        String g= rs9.getString(6);
        String h= rs9.getString(7);
        latestin.setText("ksh."+b+" on"+e+"at"+f+g+h);
        }
        state19.close();
        rs9.close();
        
        //-----------------latest trans out
        String latesttransoutid = null;
        Statement state20 = con.createStatement();
        ResultSet rs20 = state20.executeQuery("select max(transid) from transhist where ao != \"0\";");
        while(rs20.next()){
        latesttransoutid  = rs20.getString(1);
        }
        state20.close();
        rs20.close();
        
        Statement state21 = con.createStatement();
        ResultSet rs21 = state21.executeQuery("select * from transhist where transid = \""+latesttransoutid+"\";");
        while(rs21.next()){
        String a= rs21.getString(1);
        String b= rs21.getString(2);
        String c= rs21.getString(3);
        String e= rs21.getString(4);
        String f= rs21.getString(5);
        String g= rs21.getString(6);
        String h= rs21.getString(7);
        latestout.setText("ksh."+c+" on"+e+"at"+f+g+h);
        }
        state21.close();
        rs21.close();
        
        //-----------------oldest trans in
        String oldesttransinid = null;
        Statement state22 = con.createStatement();
        ResultSet rs22 = state22.executeQuery("select min(transid) from transhist where ao = \"0\";");
        while(rs22.next()){
        oldesttransinid  = rs22.getString(1);
        }
        state22.close();
        rs22.close();
        
        Statement state23 = con.createStatement();
        ResultSet rs23 = state23.executeQuery("select * from transhist where transid = \""+oldesttransinid+"\";");
        while(rs23.next()){
        String a= rs23.getString(1);
        String b= rs23.getString(2);
        String c= rs23.getString(3);
        String e= rs23.getString(4);
        String f= rs23.getString(5);
        String g= rs23.getString(6);
        String h= rs23.getString(7);
        oldestin.setText("ksh."+b+" on"+e+"at"+f+g+h);
        }
        state23.close();
        rs23.close();
        
        //-----------------oldest trans out
        String oldesttransoutid = null;
        Statement state24 = con.createStatement();
        ResultSet rs24 = state24.executeQuery("select min(transid) from transhist where ao != \"0\";");
        while(rs24.next()){
        oldesttransoutid  = rs24.getString(1);
        }
        state24.close();
        rs24.close();
        
        Statement state25 = con.createStatement();
        ResultSet rs25 = state25.executeQuery("select * from transhist where transid = \""+oldesttransoutid+"\";");
        while(rs25.next()){
        String a= rs25.getString(1);
        String b= rs25.getString(2);
        String c= rs25.getString(3);
        String e= rs25.getString(4);
        String f= rs25.getString(5);
        String g= rs25.getString(6);
        String h= rs25.getString(7);
        oldestout.setText("ksh."+c+" on"+e+"at"+f+g+h);
        }
        state25.close();
        rs25.close();
        
        con.close();
        
    }
}
