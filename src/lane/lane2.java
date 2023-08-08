package lane;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class lane2 extends javax.swing.JFrame implements ActionListener{
    
    public static Connection con;
    public static boolean hassData = false;
    public static Statement state;
    ImageIcon icon=new ImageIcon("lan.jpg");
    
    public lane2() throws ClassNotFoundException, SQLException {
                
       
        initComponents();
        this.setIconImage(icon.getImage());
        connect();
        showdata();
        this.setLocationRelativeTo(null);
        this.setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        t0 = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        add = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        s = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("LANEGO POTATO FARMERS.");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 255, 153));
        setIconImages(null);

        jLabel1.setText("code area");

        jLabel2.setText("first name");

        jLabel3.setText("second name");

        jLabel4.setText("third name");

        jLabel5.setText("identity number");

        jLabel6.setText("phone number");

        jLabel7.setText("village");

        jLabel8.setText("land acres");

        jLabel9.setText("potato variety");

        jLabel10.setText("have NHIF card");

        t1.setBackground(new java.awt.Color(255, 255, 255));
        t1.setForeground(new java.awt.Color(0, 0, 0));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        t2.setBackground(new java.awt.Color(255, 255, 255));
        t2.setForeground(new java.awt.Color(0, 0, 0));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t3.setBackground(new java.awt.Color(255, 255, 255));
        t3.setForeground(new java.awt.Color(0, 0, 0));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        t4.setBackground(new java.awt.Color(255, 255, 255));
        t4.setForeground(new java.awt.Color(0, 0, 0));
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });

        t5.setBackground(new java.awt.Color(255, 255, 255));
        t5.setForeground(new java.awt.Color(0, 0, 0));
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });

        t6.setBackground(new java.awt.Color(255, 255, 255));
        t6.setForeground(new java.awt.Color(0, 0, 0));
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });

        t7.setBackground(new java.awt.Color(255, 255, 255));
        t7.setForeground(new java.awt.Color(0, 0, 0));
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });

        t9.setBackground(new java.awt.Color(255, 255, 255));
        t9.setForeground(new java.awt.Color(0, 0, 0));
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });

        t10.setBackground(new java.awt.Color(255, 255, 255));
        t10.setForeground(new java.awt.Color(0, 0, 0));
        t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t10ActionPerformed(evt);
            }
        });

        t11.setEditable(false);
        t11.setBackground(new java.awt.Color(255, 255, 255));
        t11.setForeground(new java.awt.Color(0, 0, 0));
        t11.setFocusable(false);
        t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t11ActionPerformed(evt);
            }
        });

        t12.setEditable(false);
        t12.setBackground(new java.awt.Color(255, 255, 255));
        t12.setForeground(new java.awt.Color(0, 0, 0));
        t12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t12ActionPerformed(evt);
            }
        });

        t0.setBackground(new java.awt.Color(255, 255, 255));
        t0.setForeground(new java.awt.Color(0, 0, 0));
        t0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t0ActionPerformed(evt);
            }
        });

        search.setForeground(new java.awt.Color(51, 51, 51));
        search.setText("search ");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("lanego records table");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "index.", "code area", "1st name", "2nd name", "3rd name", "ID", "phone no.", "village", "land acres", "potato var.", "agrochem", "hve NHIF.crd.", "date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setColumnSelectionAllowed(true);
        table.setDragEnabled(true);
        table.setShowGrid(true);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        add.setForeground(new java.awt.Color(0, 0, 0));
        add.setText("add record");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        refresh.setForeground(new java.awt.Color(0, 0, 0));
        refresh.setText("refresh table");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        update.setForeground(new java.awt.Color(0, 0, 0));
        update.setText("update record");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        clear.setForeground(new java.awt.Color(0, 0, 0));
        clear.setText("clear fields");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("delete record");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel14.setText("Search");

        t8.setBackground(new java.awt.Color(255, 255, 255));
        t8.setForeground(new java.awt.Color(0, 0, 0));
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });

        jLabel15.setText("agrochem used");

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Yess");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("No");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        s.setBackground(new java.awt.Color(255, 255, 255));
        s.setForeground(new java.awt.Color(0, 0, 0));
        s.setText("index");
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });

        jButton3.setText("Choose date");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("HOME");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jMenu3.setText("options.");

        jMenu4.setText("search with?");

        jMenuItem1.setText("index");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("code area");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("first name");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("second name");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("third name");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("ID");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("phone number");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem12.setText("village");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem8.setText("potato variety");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("agrochemical");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("NHIF card");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("date");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem13.setText("land acres cultivated");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenu3.add(jMenu4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t0, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(11, 11, 11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(t7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton1)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                        .addComponent(t6, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                                .addComponent(refresh)))
                        .addGap(73, 73, 73)))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(14, 14, 14)
                                        .addComponent(jButton2)))
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clear)
                            .addComponent(add)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(search)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t0, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete)
                    .addComponent(jLabel12)
                    .addComponent(refresh)
                    .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        t2.setText("");
    }//GEN-LAST:event_t2ActionPerformed

    private void t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t10ActionPerformed
        t10.setText("");
    }//GEN-LAST:event_t10ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        String a = (String)t0.getText();
        if(a.equals("")){
            JOptionPane.showMessageDialog(this, "cannot search empty index.");
        }
        else{
            if(a.equals("")==false){
        try {
            DefaultTableModel model2 = (DefaultTableModel) table.getModel();
            model2.setRowCount(0);
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:lng.db");
            state = con.createStatement();
            ResultSet rs2;
            ResultSet rs;
            String choice = s.getText();
            switch(choice){
                case "index":
                try (Statement state1 = con.createStatement()) {
                    rs = state.executeQuery("select * from rcd where no >= "+a+";");
                    rs2 = state1.executeQuery("select * from rcd where no = "+a+";");
                    while(rs.next()){
                        
                        String s0=rs.getString(1);
                        String s1=rs.getString(2);
                        String s2=rs.getString(3);
                        String s3=rs.getString(4);
                        String s4=rs.getString(5);
                        String s5=rs.getString(6);
                        String s6=rs.getString(7);
                        String s7=rs.getString(8);
                        String s8=rs.getString(9);
                        String s9=rs.getString(10);
                        String s10=rs.getString(11);
                        String s11=rs.getString(12);
                        String s12=rs.getString(13);
                    
                        t0.setText(s0);
                        t1.setText(s1);
                        t2.setText(s2);
                        t3.setText(s3);
                        t4.setText(s4);
                        t5.setText(s5);
                        t6.setText(s6);
                        t7.setText(s7);
                        t8.setText(s8);
                        t9.setText(s9);
                        t10.setText(s10);
                        t11.setText(s11);
                        t12.setText(s12);
                    
                        Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(obj);
                        
                    }
                    
                while(rs2.next()){
                    
                    String s0=rs2.getString(1);
                    String s1=rs2.getString(2);
                    String s2=rs2.getString(3);
                    String s3=rs2.getString(4);
                    String s4=rs2.getString(5);
                    String s5=rs2.getString(6);
                    String s6=rs2.getString(7);
                    String s7=rs2.getString(8);
                    String s8=rs2.getString(9);
                    String s9=rs2.getString(10);
                    String s10=rs2.getString(11);
                    String s11=rs2.getString(12);
                    String s12=rs2.getString(13);
                    
                    t0.setText(s0);
                    t1.setText(s1);
                    t2.setText(s2);
                    t3.setText(s3);
                    t4.setText(s4);
                    t5.setText(s5);
                    t6.setText(s6);
                    t7.setText(s7);
                    t8.setText(s8);
                    t9.setText(s9);
                    t10.setText(s10);
                    t11.setText(s11);
                    t12.setText(s12);
                    
                }
                     
                    con.close();
                    state.close();
                    break;
                }
                case "code area":
                try (Statement state1 = con.createStatement()) {
                    rs = state.executeQuery("select * from rcd where ca = \""+a+"\";");
                    rs2 = state1.executeQuery("select * from rcd where ca = \""+a+"\";");
                    while(rs.next()){
                        
                        String s0=rs.getString(1);
                        String s1=rs.getString(2);
                        String s2=rs.getString(3);
                        String s3=rs.getString(4);
                        String s4=rs.getString(5);
                        String s5=rs.getString(6);
                        String s6=rs.getString(7);
                        String s7=rs.getString(8);
                        String s8=rs.getString(9);
                        String s9=rs.getString(10);
                        String s10=rs.getString(11);
                        String s11=rs.getString(12);
                        String s12=rs.getString(13);
                    
                        t0.setText(s0);
                        t1.setText(s1);
                        t2.setText(s2);
                        t3.setText(s3);
                        t4.setText(s4);
                        t5.setText(s5);
                        t6.setText(s6);
                        t7.setText(s7);
                        t8.setText(s8);
                        t9.setText(s9);
                        t10.setText(s10);
                        t11.setText(s11);
                        t12.setText(s12);
                    
                        Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(obj);
                    }
                    
                while(rs2.next()){
                    
                    String s0=rs2.getString(1);
                    String s1=rs2.getString(2);
                    String s2=rs2.getString(3);
                    String s3=rs2.getString(4);
                    String s4=rs2.getString(5);
                    String s5=rs2.getString(6);
                    String s6=rs2.getString(7);
                    String s7=rs2.getString(8);
                    String s8=rs2.getString(9);
                    String s9=rs2.getString(10);
                    String s10=rs2.getString(11);
                    String s11=rs2.getString(12);
                    String s12=rs2.getString(13);
                    
                    t0.setText(s1);
                    t1.setText(s1);
                    t2.setText(s2);
                    t3.setText(s3);
                    t4.setText(s4);
                    t5.setText(s5);
                    t6.setText(s6);
                    t7.setText(s7);
                    t8.setText(s8);
                    t9.setText(s9);
                    t10.setText(s10);
                    t11.setText(s11);
                    t12.setText(s12);
                    
                    
                }
                     
                    con.close();
                    state.close();
                    break;
                }
            case "1st name":
                try (Statement state1 = con.createStatement()) {
                    rs = state.executeQuery("select * from rcd where fn = \""+a+"\";");
                    rs2 = state1.executeQuery("select * from rcd where fn = \""+a+"\";");
                    while(rs.next()){
                        
                        String s0=rs.getString(1);
                        String s1=rs.getString(2);
                        String s2=rs.getString(3);
                        String s3=rs.getString(4);
                        String s4=rs.getString(5);
                        String s5=rs.getString(6);
                        String s6=rs.getString(7);
                        String s7=rs.getString(8);
                        String s8=rs.getString(9);
                        String s9=rs.getString(10);
                        String s10=rs.getString(11);
                        String s11=rs.getString(12);
                        String s12=rs.getString(13);
                    
                        t0.setText(s0);
                        t1.setText(s1);
                        t2.setText(s2);
                        t3.setText(s3);
                        t4.setText(s4);
                        t5.setText(s5);
                        t6.setText(s6);
                        t7.setText(s7);
                        t8.setText(s8);
                        t9.setText(s9);
                        t10.setText(s10);
                        t11.setText(s11);
                        t12.setText(s12);
                    
                        Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(obj);
                    }
                    
                while(rs2.next()){
                    
                    String s0=rs2.getString(1);
                    String s1=rs2.getString(2);
                    String s2=rs2.getString(3);
                    String s3=rs2.getString(4);
                    String s4=rs2.getString(5);
                    String s5=rs2.getString(6);
                    String s6=rs2.getString(7);
                    String s7=rs2.getString(8);
                    String s8=rs2.getString(9);
                    String s9=rs2.getString(10);
                    String s10=rs2.getString(11);
                    String s11=rs2.getString(12);
                    String s12=rs2.getString(13);
                    
                    t0.setText(s2);
                    t1.setText(s1);
                    t2.setText(s2);
                    t3.setText(s3);
                    t4.setText(s4);
                    t5.setText(s5);
                    t6.setText(s6);
                    t7.setText(s7);
                    t8.setText(s8);
                    t9.setText(s9);
                    t10.setText(s10);
                    t11.setText(s11);
                    t12.setText(s12);
                    
                    
                }
                     
                    con.close();
                    state.close();
                    break;
                }
            case "2nd name":
                try (Statement state1 = con.createStatement()) {
                    rs = state.executeQuery("select * from rcd where sn = \""+a+"\";");
                    rs2 = state1.executeQuery("select * from rcd where sn = \""+a+"\";");
                    while(rs.next()){
                        
                        String s0=rs.getString(1);
                        String s1=rs.getString(2);
                        String s2=rs.getString(3);
                        String s3=rs.getString(4);
                        String s4=rs.getString(5);
                        String s5=rs.getString(6);
                        String s6=rs.getString(7);
                        String s7=rs.getString(8);
                        String s8=rs.getString(9);
                        String s9=rs.getString(10);
                        String s10=rs.getString(11);
                        String s11=rs.getString(12);
                        String s12=rs.getString(13);
                    
                        t0.setText(s0);
                        t1.setText(s1);
                        t2.setText(s2);
                        t3.setText(s3);
                        t4.setText(s4);
                        t5.setText(s5);
                        t6.setText(s6);
                        t7.setText(s7);
                        t8.setText(s8);
                        t9.setText(s9);
                        t10.setText(s10);
                        t11.setText(s11);
                        t12.setText(s12);
                    
                        Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(obj);
                    }
                    
                while(rs2.next()){
                    
                    String s0=rs2.getString(1);
                    String s1=rs2.getString(2);
                    String s2=rs2.getString(3);
                    String s3=rs2.getString(4);
                    String s4=rs2.getString(5);
                    String s5=rs2.getString(6);
                    String s6=rs2.getString(7);
                    String s7=rs2.getString(8);
                    String s8=rs2.getString(9);
                    String s9=rs2.getString(10);
                    String s10=rs2.getString(11);
                    String s11=rs2.getString(12);
                    String s12=rs2.getString(13);
                    
                    t0.setText(s3);
                    t1.setText(s1);
                    t2.setText(s2);
                    t3.setText(s3);
                    t4.setText(s4);
                    t5.setText(s5);
                    t6.setText(s6);
                    t7.setText(s7);
                    t8.setText(s8);
                    t9.setText(s9);
                    t10.setText(s10);
                    t11.setText(s11);
                    t12.setText(s12);
                    
                    
                }
                     
                    con.close();
                    state.close();
                    break;
                }
            case "3rd name":
                try (Statement state1 = con.createStatement()) {
                    rs = state.executeQuery("select * from rcd where tn = \""+a+"\";");
                    rs2 = state1.executeQuery("select * from rcd where tn = \""+a+"\";");
                    while(rs.next()){
                        
                        String s0=rs.getString(1);
                        String s1=rs.getString(2);
                        String s2=rs.getString(3);
                        String s3=rs.getString(4);
                        String s4=rs.getString(5);
                        String s5=rs.getString(6);
                        String s6=rs.getString(7);
                        String s7=rs.getString(8);
                        String s8=rs.getString(9);
                        String s9=rs.getString(10);
                        String s10=rs.getString(11);
                        String s11=rs.getString(12);
                        String s12=rs.getString(13);
                    
                        t0.setText(s0);
                        t1.setText(s1);
                        t2.setText(s2);
                        t3.setText(s3);
                        t4.setText(s4);
                        t5.setText(s5);
                        t6.setText(s6);
                        t7.setText(s7);
                        t8.setText(s8);
                        t9.setText(s9);
                        t10.setText(s10);
                        t11.setText(s11);
                        t12.setText(s12);
                    
                        Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(obj);
                    }
                    
                while(rs2.next()){
                    
                    String s0=rs2.getString(1);
                    String s1=rs2.getString(2);
                    String s2=rs2.getString(3);
                    String s3=rs2.getString(4);
                    String s4=rs2.getString(5);
                    String s5=rs2.getString(6);
                    String s6=rs2.getString(7);
                    String s7=rs2.getString(8);
                    String s8=rs2.getString(9);
                    String s9=rs2.getString(10);
                    String s10=rs2.getString(11);
                    String s11=rs2.getString(12);
                    String s12=rs2.getString(13);
                    
                    t0.setText(s4);
                    t1.setText(s1);
                    t2.setText(s2);
                    t3.setText(s3);
                    t4.setText(s4);
                    t5.setText(s5);
                    t6.setText(s6);
                    t7.setText(s7);
                    t8.setText(s8);
                    t9.setText(s9);
                    t10.setText(s10);
                    t11.setText(s11);
                    t12.setText(s12);
                    
                    
                }
                     
                    con.close();
                    state.close();
                    break;
                }
                            case "ID":
                try (Statement state1 = con.createStatement()) {
                    rs = state.executeQuery("select * from rcd where id = \""+a+"\";");
                    rs2 = state1.executeQuery("select * from rcd where id = \""+a+"\";");
                    while(rs.next()){
                        
                        String s0=rs.getString(1);
                        String s1=rs.getString(2);
                        String s2=rs.getString(3);
                        String s3=rs.getString(4);
                        String s4=rs.getString(5);
                        String s5=rs.getString(6);
                        String s6=rs.getString(7);
                        String s7=rs.getString(8);
                        String s8=rs.getString(9);
                        String s9=rs.getString(10);
                        String s10=rs.getString(11);
                        String s11=rs.getString(12);
                        String s12=rs.getString(13);
                    
                        t0.setText(s0);
                        t1.setText(s1);
                        t2.setText(s2);
                        t3.setText(s3);
                        t4.setText(s4);
                        t5.setText(s5);
                        t6.setText(s6);
                        t7.setText(s7);
                        t8.setText(s8);
                        t9.setText(s9);
                        t10.setText(s10);
                        t11.setText(s11);
                        t12.setText(s12);
                    
                        Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(obj);
                    }
                    
                while(rs2.next()){
                    
                    String s0=rs2.getString(1);
                    String s1=rs2.getString(2);
                    String s2=rs2.getString(3);
                    String s3=rs2.getString(4);
                    String s4=rs2.getString(5);
                    String s5=rs2.getString(6);
                    String s6=rs2.getString(7);
                    String s7=rs2.getString(8);
                    String s8=rs2.getString(9);
                    String s9=rs2.getString(10);
                    String s10=rs2.getString(11);
                    String s11=rs2.getString(12);
                    String s12=rs2.getString(13);
                    
                    t0.setText(s5);
                    t1.setText(s1);
                    t2.setText(s2);
                    t3.setText(s3);
                    t4.setText(s4);
                    t5.setText(s5);
                    t6.setText(s6);
                    t7.setText(s7);
                    t8.setText(s8);
                    t9.setText(s9);
                    t10.setText(s10);
                    t11.setText(s11);
                    t12.setText(s12);
                    
                    
                }
                     
                    con.close();
                    state.close();
                    break;
                }
                            case "phone no":
                try (Statement state1 = con.createStatement()) {
                    rs = state.executeQuery("select * from rcd where pn = \""+a+"\";");
                    rs2 = state1.executeQuery("select * from rcd where pn = \""+a+"\";");
                    while(rs.next()){
                        
                        String s0=rs.getString(1);
                        String s1=rs.getString(2);
                        String s2=rs.getString(3);
                        String s3=rs.getString(4);
                        String s4=rs.getString(5);
                        String s5=rs.getString(6);
                        String s6=rs.getString(7);
                        String s7=rs.getString(8);
                        String s8=rs.getString(9);
                        String s9=rs.getString(10);
                        String s10=rs.getString(11);
                        String s11=rs.getString(12);
                        String s12=rs.getString(13);
                    
                        t0.setText(s0);
                        t1.setText(s1);
                        t2.setText(s2);
                        t3.setText(s3);
                        t4.setText(s4);
                        t5.setText(s5);
                        t6.setText(s6);
                        t7.setText(s7);
                        t8.setText(s8);
                        t9.setText(s9);
                        t10.setText(s10);
                        t11.setText(s11);
                        t12.setText(s12);
                    
                        Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(obj);
                    }
                    
                while(rs2.next()){
                    
                    String s0=rs2.getString(1);
                    String s1=rs2.getString(2);
                    String s2=rs2.getString(3);
                    String s3=rs2.getString(4);
                    String s4=rs2.getString(5);
                    String s5=rs2.getString(6);
                    String s6=rs2.getString(7);
                    String s7=rs2.getString(8);
                    String s8=rs2.getString(9);
                    String s9=rs2.getString(10);
                    String s10=rs2.getString(11);
                    String s11=rs2.getString(12);
                    String s12=rs2.getString(13);
                    
                    t0.setText(s6);
                    t1.setText(s1);
                    t2.setText(s2);
                    t3.setText(s3);
                    t4.setText(s4);
                    t5.setText(s5);
                    t6.setText(s6);
                    t7.setText(s7);
                    t8.setText(s8);
                    t9.setText(s9);
                    t10.setText(s10);
                    t11.setText(s11);
                    t12.setText(s12);
                    
                    
                }
                     
                    con.close();
                    state.close();
                    break;
                }
                            case "village":
                try (Statement state1 = con.createStatement()) {
                    rs = state.executeQuery("select * from rcd where vil = \""+a+"\";");
                    rs2 = state1.executeQuery("select * from rcd where vil = \""+a+"\";");
                    while(rs.next()){
                        
                        String s0=rs.getString(1);
                        String s1=rs.getString(2);
                        String s2=rs.getString(3);
                        String s3=rs.getString(4);
                        String s4=rs.getString(5);
                        String s5=rs.getString(6);
                        String s6=rs.getString(7);
                        String s7=rs.getString(8);
                        String s8=rs.getString(9);
                        String s9=rs.getString(10);
                        String s10=rs.getString(11);
                        String s11=rs.getString(12);
                        String s12=rs.getString(13);
                    
                        t0.setText(s0);
                        t1.setText(s1);
                        t2.setText(s2);
                        t3.setText(s3);
                        t4.setText(s4);
                        t5.setText(s5);
                        t6.setText(s6);
                        t7.setText(s7);
                        t8.setText(s8);
                        t9.setText(s9);
                        t10.setText(s10);
                        t11.setText(s11);
                        t12.setText(s12);
                    
                        Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(obj);
                    }
                    
                while(rs2.next()){
                    
                    String s0=rs2.getString(1);
                    String s1=rs2.getString(2);
                    String s2=rs2.getString(3);
                    String s3=rs2.getString(4);
                    String s4=rs2.getString(5);
                    String s5=rs2.getString(6);
                    String s6=rs2.getString(7);
                    String s7=rs2.getString(8);
                    String s8=rs2.getString(9);
                    String s9=rs2.getString(10);
                    String s10=rs2.getString(11);
                    String s11=rs2.getString(12);
                    String s12=rs2.getString(13);
                    
                    t0.setText(s7);
                    t1.setText(s1);
                    t2.setText(s2);
                    t3.setText(s3);
                    t4.setText(s4);
                    t5.setText(s5);
                    t6.setText(s6);
                    t7.setText(s7);
                    t8.setText(s8);
                    t9.setText(s9);
                    t10.setText(s10);
                    t11.setText(s11);
                    t12.setText(s12);
                    
                    
                }
                     
                    con.close();
                    state.close();
                    break;
                }
                            case "land acres":
                try (Statement state1 = con.createStatement()) {
                    rs = state.executeQuery("select * from rcd where la = \""+a+"\";");
                    rs2 = state1.executeQuery("select * from rcd where la = \""+a+"\";");
                    while(rs.next()){
                        
                        String s0=rs.getString(1);
                        String s1=rs.getString(2);
                        String s2=rs.getString(3);
                        String s3=rs.getString(4);
                        String s4=rs.getString(5);
                        String s5=rs.getString(6);
                        String s6=rs.getString(7);
                        String s7=rs.getString(8);
                        String s8=rs.getString(9);
                        String s9=rs.getString(10);
                        String s10=rs.getString(11);
                        String s11=rs.getString(12);
                        String s12=rs.getString(13);
                    
                        t0.setText(s0);
                        t1.setText(s1);
                        t2.setText(s2);
                        t3.setText(s3);
                        t4.setText(s4);
                        t5.setText(s5);
                        t6.setText(s6);
                        t7.setText(s7);
                        t8.setText(s8);
                        t9.setText(s9);
                        t10.setText(s10);
                        t11.setText(s11);
                        t12.setText(s12);
                    
                        Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(obj);
                    }
                    
                while(rs2.next()){
                    
                    String s0=rs2.getString(1);
                    String s1=rs2.getString(2);
                    String s2=rs2.getString(3);
                    String s3=rs2.getString(4);
                    String s4=rs2.getString(5);
                    String s5=rs2.getString(6);
                    String s6=rs2.getString(7);
                    String s7=rs2.getString(8);
                    String s8=rs2.getString(9);
                    String s9=rs2.getString(10);
                    String s10=rs2.getString(11);
                    String s11=rs2.getString(12);
                    String s12=rs2.getString(13);
                    
                    t0.setText(s8);
                    t1.setText(s1);
                    t2.setText(s2);
                    t3.setText(s3);
                    t4.setText(s4);
                    t5.setText(s5);
                    t6.setText(s6);
                    t7.setText(s7);
                    t8.setText(s8);
                    t9.setText(s9);
                    t10.setText(s10);
                    t11.setText(s11);
                    t12.setText(s12);
                    
                    
                }
                     
                    con.close();
                    state.close();
                    break;
                }
                            case "potato var":
                try (Statement state1 = con.createStatement()) {
                    rs = state.executeQuery("select * from rcd where pv = \""+a+"\";");
                    rs2 = state1.executeQuery("select * from rcd where pv = \""+a+"\";");
                    while(rs.next()){
                        
                        String s0=rs.getString(1);
                        String s1=rs.getString(2);
                        String s2=rs.getString(3);
                        String s3=rs.getString(4);
                        String s4=rs.getString(5);
                        String s5=rs.getString(6);
                        String s6=rs.getString(7);
                        String s7=rs.getString(8);
                        String s8=rs.getString(9);
                        String s9=rs.getString(10);
                        String s10=rs.getString(11);
                        String s11=rs.getString(12);
                        String s12=rs.getString(13);
                    
                        t0.setText(s0);
                        t1.setText(s1);
                        t2.setText(s2);
                        t3.setText(s3);
                        t4.setText(s4);
                        t5.setText(s5);
                        t6.setText(s6);
                        t7.setText(s7);
                        t8.setText(s8);
                        t9.setText(s9);
                        t10.setText(s10);
                        t11.setText(s11);
                        t12.setText(s12);
                    
                        Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(obj);
                    }
                    
                while(rs2.next()){
                    
                    String s0=rs2.getString(1);
                    String s1=rs2.getString(2);
                    String s2=rs2.getString(3);
                    String s3=rs2.getString(4);
                    String s4=rs2.getString(5);
                    String s5=rs2.getString(6);
                    String s6=rs2.getString(7);
                    String s7=rs2.getString(8);
                    String s8=rs2.getString(9);
                    String s9=rs2.getString(10);
                    String s10=rs2.getString(11);
                    String s11=rs2.getString(12);
                    String s12=rs2.getString(13);
                    
                    t0.setText(s9);
                    t1.setText(s1);
                    t2.setText(s2);
                    t3.setText(s3);
                    t4.setText(s4);
                    t5.setText(s5);
                    t6.setText(s6);
                    t7.setText(s7);
                    t8.setText(s8);
                    t9.setText(s9);
                    t10.setText(s10);
                    t11.setText(s11);
                    t12.setText(s12);
                    
                    
                }
                     
                    con.close();
                    state.close();
                    break;
                }
                            case "agrochem":
                try (Statement state1 = con.createStatement()) {
                    rs = state.executeQuery("select * from rcd where ac = \""+a+"\";");
                    rs2 = state1.executeQuery("select * from rcd where ac = \""+a+"\";");
                    while(rs.next()){
                        
                        String s0=rs.getString(1);
                        String s1=rs.getString(2);
                        String s2=rs.getString(3);
                        String s3=rs.getString(4);
                        String s4=rs.getString(5);
                        String s5=rs.getString(6);
                        String s6=rs.getString(7);
                        String s7=rs.getString(8);
                        String s8=rs.getString(9);
                        String s9=rs.getString(10);
                        String s10=rs.getString(11);
                        String s11=rs.getString(12);
                        String s12=rs.getString(13);
                    
                        t0.setText(s0);
                        t1.setText(s1);
                        t2.setText(s2);
                        t3.setText(s3);
                        t4.setText(s4);
                        t5.setText(s5);
                        t6.setText(s6);
                        t7.setText(s7);
                        t8.setText(s8);
                        t9.setText(s9);
                        t10.setText(s10);
                        t11.setText(s11);
                        t12.setText(s12);
                    
                        Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(obj);
                    }
                    
                while(rs2.next()){
                    
                    String s0=rs2.getString(1);
                    String s1=rs2.getString(2);
                    String s2=rs2.getString(3);
                    String s3=rs2.getString(4);
                    String s4=rs2.getString(5);
                    String s5=rs2.getString(6);
                    String s6=rs2.getString(7);
                    String s7=rs2.getString(8);
                    String s8=rs2.getString(9);
                    String s9=rs2.getString(10);
                    String s10=rs2.getString(11);
                    String s11=rs2.getString(12);
                    String s12=rs2.getString(13);
                    
                    t0.setText(s10);
                    t1.setText(s1);
                    t2.setText(s2);
                    t3.setText(s3);
                    t4.setText(s4);
                    t5.setText(s5);
                    t6.setText(s6);
                    t7.setText(s7);
                    t8.setText(s8);
                    t9.setText(s9);
                    t10.setText(s10);
                    t11.setText(s11);
                    t12.setText(s12);
                    
                    
                }
                     
                    con.close();
                    state.close();
                    break;
                }
                            case "NHIF":
                try (Statement state1 = con.createStatement()) {
                    rs = state.executeQuery("select * from rcd where yb = \""+a+"\";");
                    rs2 = state1.executeQuery("select * from rcd where yb = \""+a+"\";");
                    while(rs.next()){
                        
                        String s0=rs.getString(1);
                        String s1=rs.getString(2);
                        String s2=rs.getString(3);
                        String s3=rs.getString(4);
                        String s4=rs.getString(5);
                        String s5=rs.getString(6);
                        String s6=rs.getString(7);
                        String s7=rs.getString(8);
                        String s8=rs.getString(9);
                        String s9=rs.getString(10);
                        String s10=rs.getString(11);
                        String s11=rs.getString(12);
                        String s12=rs.getString(13);
                    
                        t0.setText(s0);
                        t1.setText(s1);
                        t2.setText(s2);
                        t3.setText(s3);
                        t4.setText(s4);
                        t5.setText(s5);
                        t6.setText(s6);
                        t7.setText(s7);
                        t8.setText(s8);
                        t9.setText(s9);
                        t10.setText(s10);
                        t11.setText(s11);
                        t12.setText(s12);
                    
                        Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(obj);
                    }
                    
                while(rs2.next()){
                    
                    String s0=rs2.getString(1);
                    String s1=rs2.getString(2);
                    String s2=rs2.getString(3);
                    String s3=rs2.getString(4);
                    String s4=rs2.getString(5);
                    String s5=rs2.getString(6);
                    String s6=rs2.getString(7);
                    String s7=rs2.getString(8);
                    String s8=rs2.getString(9);
                    String s9=rs2.getString(10);
                    String s10=rs2.getString(11);
                    String s11=rs2.getString(12);
                    String s12=rs2.getString(13);
                    
                    t0.setText(s11);
                    t1.setText(s1);
                    t2.setText(s2);
                    t3.setText(s3);
                    t4.setText(s4);
                    t5.setText(s5);
                    t6.setText(s6);
                    t7.setText(s7);
                    t8.setText(s8);
                    t9.setText(s9);
                    t10.setText(s10);
                    t11.setText(s11);
                    t12.setText(s12);
                    
                    
                }
                     
                    con.close();
                    state.close();
                    break;
                }
                            case "date":
                try (Statement state1 = con.createStatement()) {
                    rs = state.executeQuery("select * from rcd where nb = \""+a+"\";");
                    rs2 = state1.executeQuery("select * from rcd where nb = \""+a+"\";");
                    while(rs.next()){
                        
                        String s0=rs.getString(1);
                        String s1=rs.getString(2);
                        String s2=rs.getString(3);
                        String s3=rs.getString(4);
                        String s4=rs.getString(5);
                        String s5=rs.getString(6);
                        String s6=rs.getString(7);
                        String s7=rs.getString(8);
                        String s8=rs.getString(9);
                        String s9=rs.getString(10);
                        String s10=rs.getString(11);
                        String s11=rs.getString(12);
                        String s12=rs.getString(13);
                    
                        t0.setText(s0);
                        t1.setText(s1);
                        t2.setText(s2);
                        t3.setText(s3);
                        t4.setText(s4);
                        t5.setText(s5);
                        t6.setText(s6);
                        t7.setText(s7);
                        t8.setText(s8);
                        t9.setText(s9);
                        t10.setText(s10);
                        t11.setText(s11);
                        t12.setText(s12);
                    
                        Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(obj);
                    }
                    
                while(rs2.next()){
                    
                    String s0=rs2.getString(1);
                    String s1=rs2.getString(2);
                    String s2=rs2.getString(3);
                    String s3=rs2.getString(4);
                    String s4=rs2.getString(5);
                    String s5=rs2.getString(6);
                    String s6=rs2.getString(7);
                    String s7=rs2.getString(8);
                    String s8=rs2.getString(9);
                    String s9=rs2.getString(10);
                    String s10=rs2.getString(11);
                    String s11=rs2.getString(12);
                    String s12=rs2.getString(13);
                    
                    t0.setText(s12);
                    t1.setText(s1);
                    t2.setText(s2);
                    t3.setText(s3);
                    t4.setText(s4);
                    t5.setText(s5);
                    t6.setText(s6);
                    t7.setText(s7);
                    t8.setText(s8);
                    t9.setText(s9);
                    t10.setText(s10);
                    t11.setText(s11);
                    t12.setText(s12);
                    
                    
                }
                     
                    con.close();
                    state.close();
                    break;
                }
                            default:
                                JOptionPane.showMessageDialog(this, "category to be searched not well selected!");
                                  DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        try {
            showdata();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, "", ex);
        }
                                break;
            }
            
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, "", ex);
        }
        }
        }
    }//GEN-LAST:event_searchActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        t10.setText("");
        t11.setText("");
        t12.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        this.setVisible(false);
        try {
            addbutton();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        t3.setText("");
    }//GEN-LAST:event_t3ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        t7.setText("");
    }//GEN-LAST:event_t7ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        t9.setText("");
    }//GEN-LAST:event_t9ActionPerformed

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        t8.setText("");
    }//GEN-LAST:event_t8ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        try {
            showdata();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, "", ex);
        }
    }//GEN-LAST:event_refreshActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
      
        DefaultTableModel model = (DefaultTableModel) table.getModel();
       
        String a = model.getValueAt(table.getSelectedRow(), 0).toString();
        String b = model.getValueAt(table.getSelectedRow(), 1).toString();
        String c = model.getValueAt(table.getSelectedRow(), 2).toString();
        String d = model.getValueAt(table.getSelectedRow(), 3).toString();
        String e = model.getValueAt(table.getSelectedRow(), 4).toString();
        String f = model.getValueAt(table.getSelectedRow(), 5).toString();
        String g = model.getValueAt(table.getSelectedRow(), 6).toString();
        String h = model.getValueAt(table.getSelectedRow(), 7).toString();
        String i = model.getValueAt(table.getSelectedRow(), 8).toString();
        String j = model.getValueAt(table.getSelectedRow(), 9).toString();
        String k = model.getValueAt(table.getSelectedRow(), 10).toString();
        String l = model.getValueAt(table.getSelectedRow(), 11).toString();
        String m = model.getValueAt(table.getSelectedRow(), 12).toString();
        
        t0.setText(a);
        t1.setText(b);
        t2.setText(c);
        t3.setText(d);
        t4.setText(e);
        t5.setText(f);
        t6.setText(g);
        t7.setText(h);
        t8.setText(i);
        t9.setText(j);
        t10.setText(k);
        t11.setText(l);
        t12.setText(m);
        
    }//GEN-LAST:event_tableMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        this.setVisible(false);
        try {
            updatewindow();
        } catch (SQLException ex) {
            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            this.setVisible(false);
            deletewindow();
        } catch (SQLException ex) {
            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        t11.setEditable(true);
        t11.setText("");
        t11.setText("Yes");
        t11.setEditable(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        t11.setEditable(true);
        t11.setText("");
        t11.setText("-No");
        t11.setEditable(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        t1.setText("");
    }//GEN-LAST:event_t1ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        t4.setText("");
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        t5.setText("");
    }//GEN-LAST:event_t5ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        t6.setText("");
    }//GEN-LAST:event_t6ActionPerformed

    private void t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t11ActionPerformed
        t11.setText("");
    }//GEN-LAST:event_t11ActionPerformed

    private void t12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t12ActionPerformed
        t12.setText("");
    }//GEN-LAST:event_t12ActionPerformed

    private void t0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t0ActionPerformed
        t0.setText("");
    }//GEN-LAST:event_t0ActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        s.setText("2nd name");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        s.setText("index");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        s.setText("code area");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        s.setText("1st name");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        s.setText("3rd name");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        s.setText("ID");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        s.setText("phone no");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        s.setText("village");
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        s.setText("potato var");
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        s.setText("agrochem");
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        s.setText("NHIF");
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        s.setText("date");
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        s.setText("land acres");
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        date();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            this.dispose();
            new lane.mainwin_1().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main (String args[]) throws SQLException, ClassNotFoundException {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(lane2.class.getName()).log(java.util.logging.Level.SEVERE, "", ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lane2.class.getName()).log(java.util.logging.Level.SEVERE, "", ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lane2.class.getName()).log(java.util.logging.Level.SEVERE, "", ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lane2.class.getName()).log(java.util.logging.Level.SEVERE, "", ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new lane2().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, "", ex);
                } catch (SQLException ex) {
                    Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, "", ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    public javax.swing.JTextField s;
    private javax.swing.JButton search;
    private javax.swing.JTextField t0;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    public static javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    public static javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
    
    //for first connection connection
    private void connect() throws ClassNotFoundException, SQLException {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:lng.db");
            initialize();
         }
    
    //for creating the databases
    private void initialize() throws SQLException, ClassNotFoundException {
         if(!hassData ){
            hassData = true;
            
            state = con.createStatement();
            ResultSet res= state.executeQuery("select name from sqlite_master"
                    + " where type='table' and name='rcd'");
            if(!res.next()){
                
                Statement state2 = con.createStatement();
                state2.execute("create table rcd(no integer primary key autoincrement, "
                                                   + "ca varchar(30), "
                                                   + "fn varchar(30), "
                                                   + "sn varchar(30), "
                                                   + "tn varchar(30), "
                                                   + "id varchar(30) unique not null, "
                                                   + "pn varchar(30), "
                                                   + "vil varchar(30), "
                                                   + "la varchar(30), "
                                                   + "pv varchar(30), "
                                                   + "ac varchar(30), "
                                                   + "yb varchar(30), "
                                                   + "nb varchar(30));");
                
                Statement state3 = con.createStatement();
                state3.execute("create table adm(un varchar(30) unique not null, "
                                                   + "pw varchar(30) unique not null, "
                                                   + "cd varchar(30) unique not null);");
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                Statement state4 = con.createStatement();
                state3.execute("create table cmf(un varchar(30) unique not null, "
                                                   + "pw varchar(30) unique not null, "
                                                   + "cd varchar(30) unique not null);");
                
                state2.close();
                state3.close();
                state4.close();
                con.close();
                JOptionPane.showMessageDialog(this, "please createadmin account to continue.\nnote that two windows will apear.\n use the smaller window in the\ntop left corner to create your default admin account.");
                this.dispose();
                
             }else{
             con.close();
             state.close();
             showdata();
            }
             con.close();
             state.close();
        }
    }
    
    //for selecting data from database and setting it to the table
    public static void showdata() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:lng.db");
        Statement state11 = con.createStatement();
        ResultSet rs = state11.executeQuery("select * from rcd;");
         while(rs.next()){
             
                        String s0=rs.getString(1);
                        String s1=rs.getString(2);
                        String s2=rs.getString(3);
                        String s3=rs.getString(4);
                        String s4=rs.getString(5);
                        String s5=rs.getString(6);
                        String s6=rs.getString(7);
                        String s7=rs.getString(8);
                        String s8=rs.getString(9);
                        String s9=rs.getString(10);
                        String s10=rs.getString(11);
                        String s11=rs.getString(12);
                        String s12=rs.getString(13);
                        
                        Object[] obj = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(obj);
                        
                        
         }
         con.close();
         rs.close();
         state11.close();
                        
    }
  
    @Override
    //for all actions performed
    public void actionPerformed(ActionEvent e) {
        //for add
        if (e.getSource()==forgot){
            pas1.setText("");
            name.setText("");
        }
        if (e.getSource()==conf){
            
                String a = name.getText();
                String b = pas1.getText();
                
                if(a.equals("")||b.equals("")){
                    JOptionPane.showMessageDialog(null, "empty field/fields!.");
                }
                else{
                    if(b.length()<=2){
            JOptionPane.showMessageDialog(null, "wrong password");
         
           }else{
                        try {
                            Class.forName("org.sqlite.JDBC");
                            con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                            
                            Statement state11 = con.createStatement();
                            ResultSet rs = state11.executeQuery("select * from cmf where pw = \""+b+"\" and un=\""+a+"\";");
                            
                            if(rs.next()){
                                String c1=rs.getString(1);
                                String c2=rs.getString(2);
                                String c3=rs.getString(3);
                                a = c1;
                                b = c2;
                                a = c3;
                                
                                con.close();
                                state11.close();
                                rs.close();
                                
                                    add();
                                    this.dispose();
                                     
                                }else{
                                    JOptionPane.showMessageDialog(this, " wrong username or password..");
                                }
                            con.close();
                            state11.close();
                            rs.close();
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SQLException ex) {
                            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                        }
           }
        }
        }
        if (e.getSource()==show||e.getSource()==shw2){
            hide.setVisible(true);
            show.setVisible(false);
            hde2.setVisible(true);
            shw2.setVisible(false);
            pas1.setEchoChar((char)0);
            ps12.setEchoChar((char)0);
        }
        if (e.getSource()==hide||e.getSource()==hde2){
            hide.setVisible(false);
            hde2.setVisible(false);
            show.setVisible(true);
            shw2.setVisible(true);
            pas1.setEchoChar('*');
            ps12.setEchoChar('*');
        }
        // for confirmadmin
            if (e.getSource()==bck){
            try {
                frme.dispose();
                frme2.dispose();
                frame.dispose();
                frme3.dispose();
                frme4.dispose();
                
                this.dispose();
                new accounts().setVisible(true);
                showdata();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            if (e.getSource()==bck8){
            try {
                frme.dispose();
                frme2.dispose();
                frame.dispose();
                frme3.dispose();
                frme4.dispose();
                
                this.dispose();
                new lane2().setVisible(true);
                showdata();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        if (e.getSource()==frgt){
            ps1.setText("");
            nme.setText("");
        }
        //for delete
        if (e.getSource()==cnf){
            
                String a = nme.getText();
                String b = ps1.getText();
                
                if(a.equals("")||b.equals("")){
                    JOptionPane.showMessageDialog(null, "empty field/fields!.");
                }
                else{
                    if(b.length()>=2){
            try {
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                
                state = con.createStatement();
                ResultSet rs = state.executeQuery("select * from adm where pw = \""+b+"\" and un=\""+a+"\";");
                            
                            if(rs.next()){
                                String c1=rs.getString(1);
                                String c2=rs.getString(2);
                                String c3=rs.getString(3);
                                a = c1;
                                b = c2;
                                c2 = c3;
                                
                                con.close();
                                state.close();
                                rs.close();
                                del();
                                
                                }else{
                                    JOptionPane.showMessageDialog(this, " wrong username or password..");
                                }
                con.close();
                state.close();
                frme.dispose();
                this.dispose();
                new lane2().setVisible(true);
                
            } catch (SQLException ex) {
                Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
            }
           }else{
                    JOptionPane.showMessageDialog(null, "wrong password.");
            }
        }
        }
        //for update
         if (e.getSource()==cnf2){
            
                String a = nme2.getText();
                String b = ps12.getText();
                
                if(a.equals("")||b.equals("")){
                    JOptionPane.showMessageDialog(null, "empty field/fields!.");
                }
                else{
                    if(b.length()>=2){
            try {
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                
                state = con.createStatement();
                ResultSet rs = state.executeQuery("select * from adm where pw = \""+b+"\" and un=\""+a+"\";");
                            
                            if(rs.next()){
                                String c1=rs.getString(1);
                                String c2=rs.getString(2);
                                String c3=rs.getString(3);
                                a = c1;
                                b = c2;
                                c2 = c3;
                                
                                con.close();
                                state.close();
                                rs.close();
                                update();
                
                                }else{
                                    JOptionPane.showMessageDialog(this, " wrong username or password..");
                                }
                con.close();
                state.close();
                new lane2().setVisible(true);
                
            } catch (SQLException ex) {
                Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
            }
           }else{
                    JOptionPane.showMessageDialog(null, "wrong password.");
            }
        }
        }
        if (e.getSource()==shw){
            hde.setVisible(true);
            shw.setVisible(false);
            ps1.setEchoChar((char)0);
        }
        if (e.getSource()==hde){
            hde.setVisible(false);
            shw.setVisible(true);
            ps1.setEchoChar('*');
        }
        //for admin acount creation
       if (e.getSource()==back2){
            try {
                new lane.accounts().setVisible(true);
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                showdata();
                frame2.dispose();
                frame1.dispose();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource()==clear1){
            pas11.setText("");
            name11.setText("");
            pas21.setText("");
            code1.setText("");
        }
        //for admin crete account(caa)
        if (e.getSource()==create2){
            
            try {
                String a = name11.getText();
                String b = pas11.getText();
                String c = code1.getText();
                String d = pas21.getText();
                
                con.close();
                
                if(a.equals("")||b.equals("")||c.equals("")||d.equals("")){
                    JOptionPane.showMessageDialog(null, "please fill all the fields to proceed.");
                }
                else{
                    if(d.equals(b)&&d.length()>=6){
                        
                        try {
                            Class.forName("org.sqlite.JDBC");
                            con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                            
                            state = con.createStatement();
                            state.execute("insert into adm (un, pw, cd)\n" +
                                    "values(\""+a+"\",\""+b+"\",\""+c+"\");");
                            state.execute("insert into cmf (un, pw, cd)\n" +
                                    "values(\""+a+"\",\""+b+"\",\""+c+"\");");
                            
                            con.close();
                            state.close();
                            JOptionPane.showMessageDialog(null, "please make sure you don't forget your password");
                            JOptionPane.showMessageDialog(null, "recoverly word will be usefull in case you forget your password");
                            JOptionPane.showMessageDialog(null, "your administration account was created succecfully");
                            con.close();
                            state.close();
                            frame2.dispose();
                            this.dispose();
                            new accounts().setVisible(true);

                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "username password or recoverly word already used.");
                            ex.printStackTrace();
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "passwords do not match or is too short. \npassword must be more than 6 charactors");
                    }
                }
                initComponents();
                showdata();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "username, password or recoverly word already used.");
            }
        }
         //for create employee account(cea)
        if (e.getSource()==cnf3){
            frme3.dispose();
            String a = nme2.getText();
            String b = ps12.getText();
            if(a.equals("")||b.equals("")){
                JOptionPane.showMessageDialog(null, "empty field/fields!.");
                frme3.setVisible(true);
            }
            else{
                if(b.length()>=2){
                    try {
                        Class.forName("org.sqlite.JDBC");
                        con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                        
                        state = con.createStatement();
                        ResultSet rs = state.executeQuery("select * from adm where pw = \""+b+"\" and un=\""+a+"\";");
                        
                        if(rs.next()){
                            String c1=rs.getString(1);
                            String c2=rs.getString(2);
                            String c3=rs.getString(3);
                            a = c1;
                            b = c2;
                            c2 = c3;
                            
                            con.close();
                            state.close();
                            rs.close();
                            frme3.dispose();
                            this.dispose();
                            createemployee();
                            
                        }else{
                            JOptionPane.showMessageDialog(this, " wrong username or password..");
                            frme3.dispose();
                            this.dispose();
                            frme3.setVisible(true);
                        }
                       
                    } catch (SQLException ex) {
                        Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "wrong password.");
                    frme3.setVisible(true);
                }
            }
        }
         //for create admin account(cea)
         if (e.getSource()==cnf4){
            frme4.dispose();
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
            }
            String a = nme2.getText();
            String b = ps12.getText();
            if(a.equals("")||b.equals("")){
                JOptionPane.showMessageDialog(null, "empty field/fields!.");
                frme4.setVisible(true);
            }
            else{
                if(b.length()>=2){
                    try {
                        Class.forName("org.sqlite.JDBC");
                        con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                        
                        state = con.createStatement();
                        ResultSet rs = state.executeQuery("select * from ceo where pw = \""+b+"\" and un=\""+a+"\";");
                        
                        if(rs.next()){
                            String c1=rs.getString(1);
                            String c2=rs.getString(2);
                            String c3=rs.getString(3);
                            a = c1;
                            b = c2;
                            c2 = c3;
                            
                            con.close();
                            state.close();
                            rs.close();
                            frme4.dispose();
                            this.dispose();
                            createadmin();
                            
                        }else{
                            JOptionPane.showMessageDialog(this, " wrong username or password..");
                            frme4.dispose();
                            this.dispose();
                            frme4.setVisible(true);
                        }
                       
                    } catch (SQLException ex) {
                        Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "wrong password.");
                    frme4.setVisible(true);
                }
            }
        }
       
        if (e.getSource()==create1){
            
                String a = name11.getText();
                String b = pas11.getText();
                String c = code1.getText();
                String d = pas21.getText();
                
                if(a.equals("")||b.equals("")||c.equals("")||d.equals("")){
                    JOptionPane.showMessageDialog(null, "please fill all the fields to proceed.");
                }
                else{
                    if(d.equals(b)&&d.length()>=6){
                        
                        try {
                            Class.forName("org.sqlite.JDBC");
                            con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                            
                            state = con.createStatement();
                            state.execute("insert into cmf (un, pw, cd)\n" +
                                    "values(\""+a+"\",\""+b+"\",\""+c+"\");");
                            
                            con.close();
                            state.close();
                            JOptionPane.showMessageDialog(null, "please make sure you don't forget your password");
                            JOptionPane.showMessageDialog(null, "recoverly word will be usefull in case you forget your password");
                            JOptionPane.showMessageDialog(null, "your employee account was created succecfully");
                            
                            con.close();
                            state.close();
                            
                            new lane2().setVisible(true);
                             DefaultTableModel model = (DefaultTableModel) table.getModel();
                             model.setRowCount(0);
                             showdata();
                             frame1.dispose();

                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "username password or recoverly word already used.");
                            ex.printStackTrace();
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "passwords do not match or is too short. \npassword must be more than 6 charactors");
                    }
                }
        }
        if (e.getSource()==show1){
            hide1.setVisible(true);
            show1.setVisible(false);
            pas11.setEchoChar((char)0);
            pas21.setEchoChar((char)0);
        }
        if (e.getSource()==hide1){
            hide1.setVisible(false);
            show1.setVisible(true);
            pas11.setEchoChar('*');
            pas21.setEchoChar('*');
        }
        if (e.getSource()==frgt3||e.getSource()==frgt2||e.getSource()==frgt){
            fpadmwin();
        }
        if (e.getSource()==forgot){
            fpempwin();
        }
        if (e.getSource()==backa){
            fpadm.dispose();
        }
        if (e.getSource()==backe){
            fpemp.dispose();
        }
        if (e.getSource()==checke){
            fpemp();
        }
        if (e.getSource()==checka){
            fpadm();
        }
         if (e.getSource()==b7){
            t12.setEditable(true);
            this.setVisible(true);
            dateframe.setVisible(false);
        }
         //for day
         if (e.getSource()==b1){
            String aa = to1.getText();
            int bb = Integer.parseInt(aa);
            if(bb < 31){
                bb++;
            int cc = bb;
            String dd = Integer.toString(cc);
            to1.setText(dd);
            }
        }
         if (e.getSource()==b4){
            String aa = to1.getText();
            int bb = Integer.parseInt(aa);
            if(bb > 1){
                bb--;
            int cc = bb;
            to1.setText(Integer.toString(cc));
            }
        }
         //for month
         if (e.getSource()==b2){
            String aa = to2.getText();
            switch(aa){
                case "jan":
                    aa = "1";
                    break;
                case "feb":
                    aa = "2";
                    break;
                case "mar":
                    aa = "3";
                    break;
                case "apr":
                    aa = "4";
                    break;
                case "may":
                    aa = "5";
                    break;
                case "jun":
                    aa = "6";
                    break;
                case "jul":
                    aa = "7";
                    break;
                case "aug":
                    aa = "8";
                    break;
                case "sep":
                    aa = "9";
                    break;  
                case "oct":
                    aa = "10";
                    break;
                case "nov":
                    aa = "11";
                    break;
                case "dec":
                    aa = "12";
                    break;
            }
            int bb = Integer.parseInt(aa);
            if(bb < 12){
            int cc = bb + 1;
            String dd = Integer.toString(cc);
            switch(dd){
                case "1":
                    String aaa = "jan";
                    to2.setText(aaa);
                    break;
                case "2":
                    String bbb = "feb";
                    to2.setText(bbb);
                    break;
                case "3":
                    String ccc = "mar";
                    to2.setText(ccc);
                    break;
                case "4":
                    String ddd = "apr";
                    to2.setText(ddd);
                    break;
                case "5":
                    String eee = "may";
                    to2.setText(eee);
                    break;
                case "6":
                    String fff = "jun";
                    to2.setText(fff);
                    break;
                case "7":
                    String ggg = "jul";
                    to2.setText(ggg);
                    break;
                case "8":
                    String hhh = "aug";
                    to2.setText(hhh);
                    break;
                case "9":
                    String iii = "sep";
                    to2.setText(iii);
                    break;  
                case "10":
                    String jjj = "oct";
                    to2.setText(jjj);
                    break;
                case "11":
                    String kkk = "nov";
                    to2.setText(kkk);
                    break;
                case "12":
                    String lll = "dec";
                    to2.setText(lll);
                    break;
            }
            }
        }
         if (e.getSource()==b5){
            String aa = to2.getText();
            switch(aa){
                case "jan":
                    aa = "1";
                    break;
                case "feb":
                    aa = "2";
                    break;
                case "mar":
                    aa = "3";
                    break;
                case "apr":
                    aa = "4";
                    break;
                case "may":
                    aa = "5";
                    break;
                case "jun":
                    aa = "6";
                    break;
                case "jul":
                    aa = "7";
                    break;
                case "aug":
                    aa = "8";
                    break;
                case "sep":
                    aa = "9";
                    break;  
                case "oct":
                    aa = "10";
                    break;
                case "nov":
                    aa = "11";
                    break;
                case "dec":
                    aa = "12";
                    break;
            }
            int bb = Integer.parseInt(aa);
            if(bb > 1){
            int cc = bb - 1;
            String dd = Integer.toString(cc);
            switch(dd){
                case "1":
                    String aaa = "jan";
                    to2.setText(aaa);
                    break;
                case "2":
                    String bbb = "feb";
                    to2.setText(bbb);
                    break;
                case "3":
                    String ccc = "mar";
                    to2.setText(ccc);
                    break;
                case "4":
                    String ddd = "apr";
                    to2.setText(ddd);
                    break;
                case "5":
                    String eee = "may";
                    to2.setText(eee);
                    break;
                case "6":
                    String fff = "jun";
                    to2.setText(fff);
                    break;
                case "7":
                    String ggg = "jul";
                    to2.setText(ggg);
                    break;
                case "8":
                    String hhh = "aug";
                    to2.setText(hhh);
                    break;
                case "9":
                    String iii = "sep";
                    to2.setText(iii);
                    break;  
                case "10":
                    String jjj = "oct";
                    to2.setText(jjj);
                    break;
                case "11":
                    String kkk = "nov";
                    to2.setText(kkk);
                    break;
                case "12":
                    String lll = "dec";
                    to2.setText(lll);
                    break;
            }
            }
        }
         //for year
         if (e.getSource()==b3){
            String aa = to3.getText();
            int bb = Integer.parseInt(aa);
            if(bb < 2100){
            int cc = bb + 1;
            String dd = Integer.toString(cc);
            to3.setText(dd);
            }
        }
         if (e.getSource()==b6){
            String aa = to3.getText();
            int bb = Integer.parseInt(aa);
            if(bb > 2020){
            int cc = bb - 1;
            String dd = Integer.toString(cc);
            to3.setText(dd);
            }
        }
         if (e.getSource()==b8){
            String ba = to1.getText();
            String bb = to2.getText();
            String bc = to3.getText();
            t12.setEditable(true);
            t12.setText(ba+" / "+bb+" / "+bc);
            this.setVisible(true);
            dateframe.dispose();
        }
    }

    //for addbutton() employee window for employee adding data
    JFrame frame = new JFrame("confirm add.");
    JButton forgot = new JButton("forgot password");
    JButton bck8 = new JButton("back");
    JButton conf = new JButton("confirm");
    JButton show = new JButton("show");
    JButton hide = new JButton("hide");
    JTextField name = new JTextField();
    JPasswordField pas1 = new JPasswordField();
    JLabel namel = new JLabel("username");
    JLabel pas1l = new JLabel("pssword");
    public void addbutton() throws SQLException, ClassNotFoundException{
        
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setIconImage(icon.getImage());
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.blue);
        
        name.setBounds(150, 20, 150, 30);
        pas1.setBounds(150, 70, 150, 30);
        
        namel.setBounds(20, 20, 150, 30);
        pas1l.setBounds(20, 70, 150, 30);
        
        forgot.setBounds(180, 120, 70, 30);
        forgot.setBackground(Color.green);
        forgot.addActionListener(this);
        forgot.setForeground(Color.red);
        
        show.setBounds(260, 120, 70, 30);
        show.setBackground(Color.orange);
        show.addActionListener(this);
        show.setForeground(Color.blue);
        
        hide.setBounds(260, 120, 70, 30);
        hide.setBackground(Color.blue);
        hide.addActionListener(this);
        hide.setForeground(Color.orange);
        hide.setVisible(false);
        
        conf.setBounds(100, 120, 70, 30);
        conf.setBackground(Color.yellow);
        conf.addActionListener(this);
        conf.setForeground(Color.red);
        
        bck8.setBounds(10, 120, 70, 30);
        bck8.setBackground(Color.red);
        bck8.addActionListener(this);
        bck8.setForeground(Color.green);
        
        pas1.setText("");
        name.setText("");
        
        frame.add(namel);
        frame.add(pas1l);
        frame.add(name);
        frame.add(pas1);
        frame.add(bck8);
        frame.add(forgot);
        frame.add(conf);
        frame.add(hide);
        frame.add(show);
        frame.setVisible(true);
    }
    //for add functions.
    public void add() throws ClassNotFoundException, SQLException {
        
            try {        
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                String a = t1.getText();
                String b = t2.getText();
                String c = t3.getText();
                String d = t4.getText();
                String e = t5.getText();
                String f = t6.getText();
                String g = t7.getText();
                String h = t8.getText();
                String i = t9.getText();
                String j = t10.getText();
                String k = t11.getText();
                String l = t12.getText();
            if( a.equals("")||b.equals("")||c.equals("")||d.equals("")||e.equals("")
                    ||f.equals("")||g.equals("")||h.equals("")||i.equals("")||j.equals("")
                    ||k.equals("")||l.equals("")){
                    JOptionPane.showMessageDialog(this, "incomplete details, \n please check if all fields\nare filled before adding.");
            new lane2().setVisible(true);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showdata();
            frame.dispose();
               }
            else{
                Statement state3 = con.createStatement();
                state3.execute("insert into rcd (ca ,fn ,sn ,tn ,id ,pn ,vil ,la ,pv ,ac ,nb ,yb ) \n" +
                                "values(\""+a+"\",\""+b+"\",\""+c+"\", \""+d+"\",\n" +
                                "\""+e+"\", \""+f+"\", \""+g+"\",\""+h+"\",\n" +
                                "\""+i+"\",\""+j+"\",\""+l+"\",\""+k+"\");");
                con.close();
                state3.close();
                JOptionPane.showMessageDialog(this, "record added succefully.");
                new lane2().setVisible(true);
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                showdata();
                frame.dispose();
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, "", ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "cannot add records with existing id.");
            new lane2().setVisible(true);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showdata();
            frame.dispose();
        }
            
       }
    
    
     //for deletebutton() admin window for deleting data
    JFrame frme = new JFrame(" confirm delete. only admin allowed");
    JButton bck = new JButton("back");
    JButton frgt = new JButton("forgot password"); 
    JButton cnf = new JButton("confirm");
    JButton shw = new JButton("show");
    JButton hde = new JButton("hide");
    JTextField nme = new JTextField();
    JPasswordField ps1 = new JPasswordField();
    JLabel nmel = new JLabel("username");
    JLabel ps1l = new JLabel("pssword");
   public void deletewindow() throws SQLException, ClassNotFoundException{
        frme.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frme.setSize(350, 200);
        frme.setLocationRelativeTo(null);
        frme.setLayout(null);
        frme.setIconImage(icon.getImage());
        frme.setResizable(false);
        frme.getContentPane().setBackground(Color.blue);
        
        nme.setBounds(150, 20, 150, 30);
        ps1.setBounds(150, 70, 150, 30);
        
        nmel.setBounds(20, 20, 150, 30);
        ps1l.setBounds(20, 70, 150, 30);
        
        frgt.setBounds(180, 120, 70, 30);
        frgt.setBackground(Color.green);
        frgt.addActionListener(this);
        frgt.setForeground(Color.red);
        
        shw.setBounds(260, 120, 70, 30);
        shw.setBackground(Color.orange);
        shw.addActionListener(this);
        shw.setForeground(Color.blue);
        
        hde.setBounds(260, 120, 70, 30);
        hde.setBackground(Color.blue);
        hde.addActionListener(this);
        hde.setForeground(Color.orange);
        hde.setVisible(false);
        
        cnf.setBounds(100, 120, 70, 30);
        cnf.setBackground(Color.yellow);
        cnf.addActionListener(this);
        cnf.setForeground(Color.red);
        
        bck8.setBounds(10, 120, 70, 30);
        bck8.setBackground(Color.red);
        bck8.addActionListener(this);
        bck8.setForeground(Color.green);
        
        ps1.setText("");
        nme.setText("");
        
        frme.add(nmel);
        frme.add(ps1l);
        frme.add(nme);
        frme.add(ps1);
        frme.add(bck8);
        frme.add(frgt);
        frme.add(cnf);
        frme.add(hde);
        frme.add(shw);
        this.setVisible(false);
        frme.setVisible(true);
        
    }
    //for delete window functions
    private void del() throws ClassNotFoundException, SQLException {
       try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:lng.db");
            String x = t0.getText();
            Statement state5 = con.createStatement();
            state5.execute("delete from rcd\n" +
                            "where no = "+x+";");
            con.close();
            state5.close();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showdata();
            frme.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "no record selected.");
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                showdata();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, "", ex);
        }
    }
    
    
        //for update()admin window for updating data
    JFrame frme2 = new JFrame("confirm update. only admin allowed");
    JButton frgt2 = new JButton("forgot password");
    JButton cnf2 = new JButton("confirm");
    JButton shw2 = new JButton("show");
    JButton hde2 = new JButton("hide");
    JTextField nme2 = new JTextField();
    JPasswordField ps12 = new JPasswordField();
    JLabel nmel2 = new JLabel("username");
    JLabel ps1l2 = new JLabel("pssword");
    public void updatewindow() throws SQLException, ClassNotFoundException{
        frme2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frme2.setSize(350, 200);
        frme2.setLocationRelativeTo(null);
        frme2.setLayout(null);
        frme2.setIconImage(icon.getImage());
        frme2.setResizable(false);
        frme2.getContentPane().setBackground(Color.blue);
        
        nme2.setBounds(150, 20, 150, 30);
        ps12.setBounds(150, 70, 150, 30);
        
        nmel2.setBounds(20, 20, 150, 30);
        ps1l2.setBounds(20, 70, 150, 30);
        
        frgt2.setBounds(180, 120, 70, 30);
        frgt2.setBackground(Color.green);
        frgt2.addActionListener(this);
        frgt2.setForeground(Color.red);
        
        shw2.setBounds(260, 120, 70, 30);
        shw2.setBackground(Color.orange);
        shw2.addActionListener(this);
        shw2.setForeground(Color.blue);
        
        hde2.setBounds(260, 120, 70, 30);
        hde2.setBackground(Color.blue);
        hde2.addActionListener(this);
        hde2.setForeground(Color.orange);
        hde2.setVisible(false);
        
        cnf2.setBounds(100, 120, 70, 30);
        cnf2.setBackground(Color.yellow);
        cnf2.addActionListener(this);
        cnf2.setForeground(Color.red);
        
        bck8.setBounds(10, 120, 70, 30);
        bck8.setBackground(Color.red);
        bck8.addActionListener(this);
        bck8.setForeground(Color.green);
        
        ps12.setText("");
        nme2.setText("");
        
        frme2.add(nmel2);
        frme2.add(ps1l2);
        frme2.add(nme2);
        frme2.add(ps12);
        frme2.add(bck8);
        frme2.add(frgt2);
        frme2.add(cnf2);
        frme2.add(hde2);
        frme2.add(shw2);
        frme2.setVisible(true);
    }
    //for update functions
    public void update() throws SQLException, ClassNotFoundException{
            try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                String z = t0.getText();
                String a = t1.getText();
                String b = t2.getText();
                String c = t3.getText();
                String d = t4.getText();
                String e = t5.getText();
                String f = t6.getText();
                String g = t7.getText();
                String h = t8.getText();
                String i = t9.getText();
                String j = t10.getText();
                String k = t11.getText();
                String l = t12.getText();
            Statement state4 = con.createStatement();
            state4.executeUpdate("update rcd\n" +
                                "set ca = \""+a+"\",\n" +
                                "fn = \""+b+"\",\n" +
                                "sn = \""+c+"\",\n" +
                                "tn = \""+d+"\",\n" +
                                "id = \""+e+"\",\n" +
                                "pn = \""+f+"\",\n" +
                                "vil = \""+g+"\",\n" +
                                "la = \""+h+"\",\n" +
                                "pv = \""+i+"\",\n" +
                                "ac = \""+j+"\",\n" +
                                "yb = \""+k+"\",\n" +
                                "nb = \""+l+"\"\n" +
                                "where no = "+z+";");
            con.close();
            this.dispose();
            frme2.dispose();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showdata();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "no record selected.");
            con.close();
            this.dispose();
            frme2.dispose();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showdata();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, "", ex);
        }
       }
    
    
        //for create employee() admin window.
    JFrame frme3 = new JFrame("confirm create employee. only admin allowed");
    JButton frgt3 = new JButton("forgot password");
    JButton cnf3 = new JButton("confirm");
    public void cewindow() throws SQLException, ClassNotFoundException{
        frme3.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frme3.setSize(350, 200);
        frme3.setLocationRelativeTo(null);
        frme3.setLayout(null);
        frme3.setIconImage(icon.getImage());
        frme3.setResizable(false);
        frme3.getContentPane().setBackground(Color.blue);
        
        nme2.setBounds(150, 20, 150, 30);
        ps12.setBounds(150, 70, 150, 30);
        
        nmel2.setBounds(20, 20, 150, 30);
        ps1l2.setBounds(20, 70, 150, 30);
        
        frgt3.setBounds(180, 120, 70, 30);
        frgt3.setBackground(Color.green);
        frgt3.addActionListener(this);
        frgt3.setForeground(Color.red);
        
        shw2.setBounds(260, 120, 70, 30);
        shw2.setBackground(Color.orange);
        shw2.addActionListener(this);
        shw2.setForeground(Color.blue);
        
        hde2.setBounds(260, 120, 70, 30);
        hde2.setBackground(Color.blue);
        hde2.addActionListener(this);
        hde2.setForeground(Color.orange);
        hde2.setVisible(false);
        
        cnf3.setBounds(100, 120, 70, 30);
        cnf3.setBackground(Color.yellow);
        cnf3.addActionListener(this);
        cnf3.setForeground(Color.red);
        
        bck.setBounds(10, 120, 70, 30);
        bck.setBackground(Color.red);
        bck.addActionListener(this);
        bck.setForeground(Color.green);
        
        ps12.setText("");
        nme2.setText("");
        
        frme3.add(nmel2);
        frme3.add(ps1l2);
        frme3.add(nme2);
        frme3.add(ps12);
        frme3.add(bck);
        frme3.add(frgt3);
        frme3.add(cnf3);
        frme3.add(hde2);
        frme3.add(shw2);
        frme3.setVisible(true);
    }
    
    
        //for create employee() admin window.
    JFrame frme4 = new JFrame("confirm create new admin. only admin allowed");
    JButton cnf4 = new JButton("confirm");
    public void cawindow() throws SQLException, ClassNotFoundException{
        frme4.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frme4.setSize(350, 200);
        frme4.setLocationRelativeTo(null);
        frme4.setLayout(null);
        frme4.setIconImage(icon.getImage());
        frme4.setResizable(false);
        frme4.getContentPane().setBackground(Color.blue);
        
        nme2.setBounds(150, 20, 150, 30);
        ps12.setBounds(150, 70, 150, 30);
        
        nmel2.setBounds(20, 20, 150, 30);
        ps1l2.setBounds(20, 70, 150, 30);
        
        frgt3.setBounds(180, 120, 70, 30);
        frgt3.setBackground(Color.green);
        frgt3.addActionListener(this);
        frgt3.setForeground(Color.red);
        
        shw2.setBounds(260, 120, 70, 30);
        shw2.setBackground(Color.orange);
        shw2.addActionListener(this);
        shw2.setForeground(Color.blue);
        
        hde2.setBounds(260, 120, 70, 30);
        hde2.setBackground(Color.blue);
        hde2.addActionListener(this);
        hde2.setForeground(Color.orange);
        hde2.setVisible(false);
        
        cnf4.setBounds(100, 120, 70, 30);
        cnf4.setBackground(Color.yellow);
        cnf4.addActionListener(this);
        cnf4.setForeground(Color.red);
        
        bck.setBounds(10, 120, 70, 30);
        bck.setBackground(Color.red);
        bck.addActionListener(this);
        bck.setForeground(Color.green);
        
        ps12.setText("");
        nme2.setText("");
        
        frme4.add(nmel2);
        frme4.add(ps1l2);
        frme4.add(nme2);
        frme4.add(ps12);
        frme4.add(bck);
        frme4.add(frgt3);
        frme4.add(cnf4);
        frme4.add(hde2);
        frme4.add(shw2);
        frme4.setVisible(true);
    }
    
    
    
     //for create employee account window(cea)
    public static boolean hasData = false;
    JFrame frame1 = new JFrame("create employee account");
    JButton back2 = new JButton("back");
    JButton clear1 = new JButton("clear");
    JButton create1 = new JButton("create");
    JButton show1 = new JButton("show");
    JButton hide1 = new JButton("hide");
    JTextField name11 = new JTextField();
    JPasswordField pas11 = new JPasswordField();
    JPasswordField pas21 = new JPasswordField();
    JTextField code1 = new JTextField();
    JLabel lnamel1 = new JLabel("user name");
    JLabel pas1l1 = new JLabel("new password");
    JLabel pas2l1 = new JLabel("confirm password");
    JLabel codel1 = new JLabel("enter recovery word");
    public void createemployee() throws SQLException, ClassNotFoundException{
        frme3.dispose();
        frame1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame1.setSize(350, 300);
        frame1.setLocationRelativeTo(null);
        frame1.setIconImage(icon.getImage());
        frame1.setResizable(false);
        frame1.setLayout(null);
        frame1.getContentPane().setBackground(Color.yellow);
        
        name11.setBounds(150, 20, 150, 30);
        pas11.setBounds(150, 70, 150, 30);
        pas21.setBounds(150, 120, 150, 30);
        code1.setBounds(150, 170, 150, 30);
        
        lnamel1.setBounds(20, 20, 150, 30);
        pas1l1.setBounds(20, 70, 150, 30);
        pas2l1 .setBounds(20, 120, 150, 30);
        codel1.setBounds(20, 170, 150, 30);
        
        clear1.setBounds(180, 220, 70, 30);
        clear1.setBackground(Color.green);
        clear1.addActionListener(this);
        clear1.setForeground(Color.red);
        
        show1.setBounds(260, 220, 70, 30);
        show1.setBackground(Color.orange);
        show1.addActionListener(this);
        show1.setForeground(Color.blue);
        
        hide1.setBounds(260, 220, 70, 30);
        hide1.setBackground(Color.blue);
        hide1.addActionListener(this);
        hide1.setForeground(Color.orange);
        hide1.setVisible(false);
        
        create1.setBounds(100, 220, 70, 30);
        create1.setBackground(Color.yellow);
        create1.addActionListener(this);
        create1.setForeground(Color.red);
        
        back2.setBounds(10, 220, 70, 30);
        back2.setBackground(Color.red);
        back2.addActionListener(this);
        back2.setForeground(Color.green);
        
        pas11.setText("");
        name11.setText("");
        pas21.setText("");
        code1.setText("");
        
        frame1.add(lnamel1);
        frame1.add(pas1l1);
        frame1.add(pas2l1 );
        frame1.add(codel1);
        frame1.add(name11);
        frame1.add(pas11);
        frame1.add(pas21);
        frame1.add(code1);
        frame1.add(back2);
        frame1.add(clear1);
        frame1.add(create1);
        frame1.add(hide1);
        frame1.add(show1);
        frame1.setVisible(true);
    }
    
    
    //for create admin account window(cea)
    JButton create2 = new JButton("create");
    JFrame frame2 = new JFrame("create admin account.");
    private void createadmin() throws ClassNotFoundException, SQLException {
        frame2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame2.setSize(350, 300);
        frame2.setLocationRelativeTo(null);
        frame2.setIconImage(icon.getImage());
        frame2.setResizable(false);
        frame2.setLayout(null);
        frame2.getContentPane().setBackground(Color.yellow);
        
        name11.setBounds(150, 20, 150, 30);
        pas11.setBounds(150, 70, 150, 30);
        pas21.setBounds(150, 120, 150, 30);
        code1.setBounds(150, 170, 150, 30);
        
        lnamel1.setBounds(20, 20, 150, 30);
        pas1l1.setBounds(20, 70, 150, 30);
        pas2l1 .setBounds(20, 120, 150, 30);
        codel1.setBounds(20, 170, 150, 30);
        
        clear1.setBounds(180, 220, 70, 30);
        clear1.setBackground(Color.green);
        clear1.addActionListener(this);
        clear1.setForeground(Color.red);
        
        show1.setBounds(260, 220, 70, 30);
        show1.setBackground(Color.orange);
        show1.addActionListener(this);
        show1.setForeground(Color.blue);
        
        hide1.setBounds(260, 220, 70, 30);
        hide1.setBackground(Color.blue);
        hide1.addActionListener(this);
        hide1.setForeground(Color.orange);
        hide1.setVisible(false);
        
        create2.setBounds(100, 220, 70, 30);
        create2.setBackground(Color.yellow);
        create2.addActionListener(this);
        create2.setForeground(Color.red);
        
        back2.setBounds(10, 220, 70, 30);
        back2.setBackground(Color.red);
        back2.addActionListener(this);
        back2.setForeground(Color.green);
        
        pas11.setText("");
        name11.setText("");
        pas21.setText("");
        code1.setText("");
        
        frame2.add(lnamel1);
        frame2.add(pas1l1);
        frame2.add(pas2l1 );
        frame2.add(codel1);
        frame2.add(name11);
        frame2.add(pas11);
        frame2.add(pas21);
        frame2.add(code1);
        frame2.add(back2);
        frame2.add(clear1);
        frame2.add(create2);
        frame2.add(hide1);
        frame2.add(show1);
        frame2.setVisible(true);
    }
    
        JFrame fpemp = new JFrame("forgot password. for employee");
        JButton checke = new JButton("check details");
        JButton backe = new JButton("back");
        JLabel recovere = new JLabel("recovery word");
        JTextField codee = new JTextField();
        //window for fpemp()
        public void fpempwin(){
        fpemp.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            fpemp.setSize(350, 140);
            fpemp.setResizable(false);
            fpemp.setIconImage(icon.getImage());
            fpemp.setLayout(null);
            fpemp.setLocationRelativeTo(null);
            fpemp.getContentPane().setBackground(Color.pink);
            
            checke.setBounds(135, 50, 150, 30);
            checke.setBackground(Color.yellow);
            checke.addActionListener(this);
            checke.setForeground(Color.red);
            
            recovere.setBounds(20, 10, 130, 30);
            codee.setBounds(160, 10, 150, 30);
            
            backe.setBounds(20, 50, 90, 30);
            backe.setBackground(Color.red);
            backe.addActionListener(this);
            backe.setForeground(Color.yellow);
            
            fpemp.add(checke);
            fpemp.add(recovere);
            fpemp.add(codee);
            fpemp.add(backe);
            fpemp.setVisible(true);
        }
        //function for forgot password employee account
        public void fpemp(){
            String b = codee.getText();
                              try {
                            Class.forName("org.sqlite.JDBC");
                            con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                            
                            Statement state11 = con.createStatement();
                            ResultSet rs = state11.executeQuery("select * from cmf where cd = \""+b+"\";");
                            
                            if(rs.next()){
                                String b1=rs.getString(1);
                                String b2=rs.getString(2);
                                String c3=rs.getString(3);
                                b = c3;
                                
                                con.close();
                                state11.close();
                                rs.close();
                                
                                    JOptionPane.showMessageDialog(this, "your username is "+b1+".\n your password is "+b2+"\nkeep your details safe.");
                                    fpemp.dispose();
                                    this.dispose();
                                     
                                }else{
                                    JOptionPane.showMessageDialog(this, "provided recoverly word does not exist..");
                                }
                            con.close();
                            state11.close();
                            rs.close();
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SQLException ex) {
                            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                        }
        }
        
        
        JFrame fpadm = new JFrame("forgot password. for admin.");
        JButton checka = new JButton("check details");
        JButton backa = new JButton("back");
        JLabel recovera = new JLabel("recovery word");
        JTextField codea = new JTextField();
        //window for fpadm()
        public void fpadmwin(){
            fpadm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            fpadm.setSize(350, 140);
            fpadm.setResizable(false);
            fpadm.setLocationRelativeTo(null);
            fpadm.setIconImage(icon.getImage());
            fpadm.setLayout(null);
            fpadm.getContentPane().setBackground(Color.pink);  
            
            checka.setBounds(135, 50, 120, 30);
            checka.setBackground(Color.yellow);
            checka.addActionListener(this);
            checka.setForeground(Color.red);
            
            recovera.setBounds(20, 10, 130, 30);
            codea.setBounds(160, 10, 150, 30);
            
            backa.setBounds(20, 50, 95, 30);
            backa.setBackground(Color.red);
            backa.addActionListener(this);
            backa.setForeground(Color.yellow);
            
            fpadm.add(checka);
            fpadm.add(recovera);
            fpadm.add(codea);
            fpadm.add(backa);
            fpadm.setVisible(true);
        }
        //function for forgot password admin account
        public void fpadm(){
            String a = codea.getText();
                try {
                            Class.forName("org.sqlite.JDBC");
                            con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                            
                            Statement state11 = con.createStatement();
                            ResultSet rs = state11.executeQuery("select * from adm where cd = \""+a+"\";");
                            
                            if(rs.next()){
                                String a1=rs.getString(1);
                                String a2=rs.getString(2);
                                String b3=rs.getString(3);
                                a = b3;
                                
                                con.close();
                                state11.close();
                                rs.close();
                                
                                JOptionPane.showMessageDialog(this, "your username is "+a1+".\n your password is "+a2+"\nkeep your details safe.");
                                fpadm.dispose();
                                this.dispose();
                                     
                                }else{
                                    JOptionPane.showMessageDialog(this, "provided recoverly word does not exist..");
                                }
                            con.close();
                            state11.close();
                            rs.close();
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SQLException ex) {
                            Logger.getLogger(lane2.class.getName()).log(Level.SEVERE, null, ex);
                        }
        }
          //JFrame for date
        JFrame dateframe = new JFrame("Select Date");
        JButton b1= new JButton("+");
        JButton b2= new JButton("+");
        JButton b3= new JButton("+");
        JTextField to1=new JTextField("1");
        JTextField to2=new JTextField("jan");
        JTextField to3=new JTextField("2020");
        JButton b4= new JButton("-");
        JButton b5= new JButton("-");
        JButton b6= new JButton("-");
        JButton b7= new JButton("type");
        JButton b8= new JButton("ok");
        JLabel dty = new JLabel("    Day      Month      Year");
        
        public void date(){
        dateframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        dateframe.setLayout(null);
        dateframe.setLocationRelativeTo(null);
        dateframe.setSize(175, 170);
        dateframe.setResizable(false);
        dateframe.setIconImage(icon.getImage());
        dateframe.getContentPane().setBackground(Color.black);
        
        //3up buttons
        //b1
        b1.setBounds(10, 35, 50, 20);
        b1.addActionListener(this);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        
        //b2
        b2.setBounds(55, 35, 50, 20);
        b2.addActionListener(this);
        b2.setBackground(Color.blue);
        b2.setForeground(Color.white);
        
        //b3
        b3.setBounds(100, 35, 50, 20);
        b3.addActionListener(this);
        b3.setBackground(Color.blue);
        b3.setForeground(Color.white);
        
        //3text fields
        //to1
        to1.setBounds(10, 55, 50, 30);
        
        //to2
        to2.setBounds(55, 55, 50, 30);
                
        //to3
        to3.setBounds(100, 55, 50, 30);
        
        //3down buttons
        //b4
        b4.setBounds(10, 85, 50, 20);
        b4.addActionListener(this);
        b4.setBackground(Color.yellow);
        b4.setForeground(Color.black);
        
        //b5
        b5.setBounds(55, 85, 50, 20);
        b5.addActionListener(this);
        b5.setBackground(Color.yellow);
        b5.setForeground(Color.black);
        
        //b6
        b6.setBounds(100, 85, 50, 20);
        b6.addActionListener(this);
        b6.setBackground(Color.yellow);
        b6.setForeground(Color.black);
        
        //b7
        b7.setBounds(10, 105, 70, 20);
        b7.addActionListener(this);
        b7.setBackground(Color.red);
        b7.setForeground(Color.green);
        
        //b8
        b8.setBounds(80, 105, 70, 20);
        b8.addActionListener(this);
        b8.setBackground(Color.green);
        b8.setForeground(Color.red);
        
        dty.setBounds(10, 10, 150, 20);
        dty.setForeground(Color.white);
        
        //textfields
        dateframe.add(to1);
        dateframe.add(to2);
        dateframe.add(to3);
        //+buttons
        dateframe.add(b1);
        dateframe.add(b2);
        dateframe.add(b3);
        //-buttons
        dateframe.add(b4);
        dateframe.add(b5);
        dateframe.add(b6);
        dateframe.add(b7);
        dateframe.add(b8);
        dateframe.add(dty);
        dateframe.setVisible(true);
            
        }
    }
