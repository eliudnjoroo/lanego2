
package lane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static lane.accounts.con;
import static lane.accounts.state;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class notes extends javax.swing.JFrame {
ImageIcon icon=new ImageIcon("lan.jpg");
login.loginpage usr = new login.loginpage();
String loggedin = usr.choice;
    public notes() {
        this.setIconImage(icon.getImage());
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
        fetch();
        date2();
        recents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        sav = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        x1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        x2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        dt1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dt2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historytable = new javax.swing.JTable();
        del = new javax.swing.JButton();
        search1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        jMenuItem1.setText("delete");
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("lanego staff notes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ta.setBackground(new java.awt.Color(0, 0, 0));
        ta.setColumns(20);
        ta.setForeground(new java.awt.Color(153, 255, 153));
        ta.setLineWrap(true);
        ta.setRows(5);
        ta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taMouseClicked(evt);
            }
        });
        ta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(ta);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setForeground(new java.awt.Color(102, 255, 102));
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        sav.setBackground(new java.awt.Color(51, 255, 51));
        sav.setForeground(new java.awt.Color(255, 0, 0));
        sav.setText("SAVE");
        sav.setBorderPainted(false);
        sav.setEnabled(false);
        sav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("auther");

        x1.setBackground(new java.awt.Color(255, 153, 153));
        x1.setForeground(new java.awt.Color(0, 0, 0));
        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("about");

        x2.setBackground(new java.awt.Color(255, 153, 153));
        x2.setForeground(new java.awt.Color(51, 51, 51));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("RESET.");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setText("date last saved");

        jLabel5.setText("oppened on");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("recents");

        historytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "auther", "about", "message", "date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historytableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                historytableMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(historytable);
        if (historytable.getColumnModel().getColumnCount() > 0) {
            historytable.getColumnModel().getColumn(2).setPreferredWidth(100);
            historytable.getColumnModel().getColumn(3).setPreferredWidth(160);
        }

        del.setBackground(new java.awt.Color(255, 51, 51));
        del.setForeground(new java.awt.Color(0, 255, 255));
        del.setText("delete");
        del.setEnabled(false);
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        search1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                search1CaretUpdate(evt);
            }
        });
        search1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                search1MouseDragged(evt);
            }
        });
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search1KeyTyped(evt);
            }
        });

        jButton5.setText("refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sav, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(dt2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sav, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(del))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        try {
            new lane.mainwin_1().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(notes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(notes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x1ActionPerformed

    private void savActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savActionPerformed
        
        
        Date now= new Date();
        SimpleDateFormat form = new SimpleDateFormat("EE dd/MMMM /Y  h:mm a");
        String d = form.format(now);
        dt1.setText(d);
        
        String a = x1.getText();
        String b = x2.getText();
        String c = ta.getText();
                
                try {
                con.close();
                
                if(a.equals("")||b.equals("")||c.equals("")){
                    JOptionPane.showMessageDialog(null, "null auther, about or notes.");
                }
                else{
                        try {
                            Class.forName("org.sqlite.JDBC");
                            con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                            
                            state = con.createStatement();
                            state.execute("insert into nts(auther, about, notes, date)\n" +
                                                        "values(\""+a+"\", \""+b+"\", \""+c+"\", \""+d+"\");");
                            
                            con.close();
                            state.close();
                            JOptionPane.showMessageDialog(null, "notes saved succesfully.");
                            sav.setEnabled(false);

                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "something went wrong.");
                            ex.printStackTrace();
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
            } catch (SQLException ex) {
                Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            recents();
            
    }//GEN-LAST:event_savActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "all notes recently added will be lost.");
        ta.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        fetch();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void search1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_search1CaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_search1CaretUpdate

    private void historytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historytableMouseClicked
        try{
        DefaultTableModel model = (DefaultTableModel) historytable.getModel();
       
        String a = model.getValueAt(historytable.getSelectedRow(), 0).toString();
        String b = model.getValueAt(historytable.getSelectedRow(), 1).toString();
        String c = model.getValueAt(historytable.getSelectedRow(), 2).toString();
        String d = model.getValueAt(historytable.getSelectedRow(), 3).toString();
        
        x1.setText(a);
        x2.setText(b);
        ta.setText(c);
        dt1.setText(d);
        
        del.setEnabled(true);
        }catch(ArrayIndexOutOfBoundsException ex){
            fetch();
            date2();
            recents();
        }
        
    }//GEN-LAST:event_historytableMouseClicked

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
if (loggedin.contentEquals("ceo")){    
    String j6 = ta.getText(); 
    int choice;
    if(j6.length()>0){
        try{
            choice = Integer.parseInt(JOptionPane.showInputDialog(null, "once deleted cannot be recovered.\n"
                + "1 - continue delete\nany other choice - cancel delete"));
        if (choice == 1){
    try {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:lng.db");
        Statement state5 = con.createStatement();
        state5.execute("delete from nts\n" +
                "where notes = \""+j6+"\";");
        con.close();
        state5.close();
        JOptionPane.showMessageDialog(this, "note deleted succefully.");
        recents();
        fetch();
        date2();
        del.setEnabled(false);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(notes.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(notes.class.getName()).log(Level.SEVERE, null, ex);
    }
    }else{
        JOptionPane.showMessageDialog(this, "operation canceled succesfully.");
        }}catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "operation canceled succesfully.");
          }}else{
    
        JOptionPane.showMessageDialog(this, "no record selected.");
    
    }
    }else{
            JOptionPane.showMessageDialog(this, "access denied. only ceo is allowed to access this feature.");
        }
    }//GEN-LAST:event_delActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        fetch();
        date2();
        recents();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void taMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taMouseClicked
        del.setEnabled(false);
    }//GEN-LAST:event_taMouseClicked

    private void taKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taKeyTyped
        sav.setEnabled(true);
    }//GEN-LAST:event_taKeyTyped

    private void search1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyTyped
      
        DefaultTableModel m = (DefaultTableModel) historytable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(m);
        historytable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search1.getText().trim()));
        
    }//GEN-LAST:event_search1KeyTyped

    private void search1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseDragged
        // TODO add 
    }//GEN-LAST:event_search1MouseDragged

    private void search1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyPressed
       DefaultTableModel m = (DefaultTableModel) historytable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(m);
        historytable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search1.getText().trim()));
    }//GEN-LAST:event_search1KeyPressed

    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased
        DefaultTableModel m = (DefaultTableModel) historytable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(m);
        historytable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search1.getText().trim()));
    }//GEN-LAST:event_search1KeyReleased

    private void historytableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historytableMouseReleased
        if(evt.isPopupTrigger()){
           jPopupMenu1.show(historytable, evt.getY(), evt.getX());
       }
    }//GEN-LAST:event_historytableMouseReleased

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
            java.util.logging.Logger.getLogger(notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                date2();
                new notes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton del;
    private javax.swing.JLabel dt1;
    private static javax.swing.JLabel dt2;
    private javax.swing.JTable historytable;
    private static javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton2;
    private static javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JButton sav;
    private javax.swing.JTextField search1;
    public static javax.swing.JTextArea ta;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    // End of variables declaration//GEN-END:variables
private void fetch() {
    
        try {
                        Class.forName("org.sqlite.JDBC");
                        con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                        
                        state = con.createStatement();
                        ResultSet rs = state.executeQuery("select * from nts;");
                        
                        while(rs.next()){
                            String c1=rs.getString(1);
                            String c2=rs.getString(2);
                            String c3=rs.getString(3);
                            String c4=rs.getString(4);
                            
                            x1.setText(c1);
                            x2.setText(c2);
                            ta.setText(c3);
                            dt1.setText(c4);
                            
                        }
                        con.close();
                            state.close();
                            rs.close();
                       con.close();
                       state.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
    }

    private static void date2() {
    
    Date now= new Date();
    SimpleDateFormat form = new SimpleDateFormat("EE   dd / MMMM / Y      h:mm  a");
    String data = form.format(now);
    dt2.setText(data);
    
    }
    public void recents(){
                            DefaultTableModel m2 = (DefaultTableModel) historytable.getModel();
                            m2.setRowCount(0);
                            
                        try {
                        Class.forName("org.sqlite.JDBC");
                        con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                        
                        state = con.createStatement();
                        ResultSet rs1 = state.executeQuery("select * from nts where const > 0 order by const desc;");
                        
                        while(rs1.next()){
                            String c1=rs1.getString(1);
                            String c2=rs1.getString(2);
                            String c3=rs1.getString(3);
                            String c4=rs1.getString(4);
                            String c5=rs1.getString(5);
                            
                            Object[] obj = {c1, c2, c3, c4};
                            DefaultTableModel m = (DefaultTableModel) historytable.getModel();
                            m.addRow(obj);
                             
                        }   
                        con.close();
                        state.close();
                       rs1.close();
                       con.close();
                       state.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }
}
