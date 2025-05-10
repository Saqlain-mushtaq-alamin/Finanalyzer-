package com.mycompany.accounting;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.awt.Font.CENTER_BASELINE;

public class forntClass extends javax.swing.JFrame {


    public forntClass() {
        initComponents();
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleName = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        tubularAnalysis = new javax.swing.JButton();
        Journal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        UserGuide = new javax.swing.JButton();
        LearnAccounting = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        titleName.setText("Transactions Analysis  &   Recording");
        titleName.setFont(new java.awt.Font("serif", java.awt.Font.BOLD, 45)); // BOLD 24pt font
        titleName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleName.setVerticalAlignment(javax.swing.SwingConstants.CENTER);



        title2.setText("<html>Perfect for Employees, Students,<br> Accountants, and Small Businesses");
        title2.setFont(new java.awt.Font("serif", java.awt.Font.PLAIN, 24));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);


        tubularAnalysis.setBackground(new java.awt.Color(204, 204, 204));
        tubularAnalysis.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 16));
        tubularAnalysis.setText("Tabular Analysis");
        tubularAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tubularAnalysisActionPerformed(evt);
            }
        });

        Journal.setBackground(new java.awt.Color(204, 204, 204));
        Journal.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 16));
        Journal.setText("Journal");
        Journal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JournalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tubularAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                                                .addComponent(Journal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(178, 178, 178))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(titleName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tubularAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Journal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(105, 105, 105))
        );

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        UserGuide.setBackground(new java.awt.Color(204, 204, 204));
        UserGuide.setFont(new java.awt.Font("Open Sans", java.awt.Font.PLAIN,12));
        UserGuide.setText("User Guide");
        UserGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserGuideActionPerformed(evt);
            }
        });

        LearnAccounting.setBackground(new java.awt.Color(204, 204, 204));
        LearnAccounting.setFont(new java.awt.Font("Open sans",java.awt.Font.PLAIN,12));
        LearnAccounting.setText("<html> Learn<br>Accounting");
        LearnAccounting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LearnAccountingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(UserGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(LearnAccounting, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(34, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(UserGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LearnAccounting, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    TabularAnalysis TA;
    RecordingProcess RP;


    private void tubularAnalysisActionPerformed(java.awt.event.ActionEvent evt) {
        TA = new TabularAnalysis();
        TA.setVisible(true);
        dispose();

    }

    private void JournalActionPerformed(java.awt.event.ActionEvent evt) {
        RP = new RecordingProcess();
        RP.setVisible(true);
        dispose();
    }

    private void UserGuideActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void LearnAccountingActionPerformed(ActionEvent evt) {
        try {
            File htmlFile = new File("C:\\Users\\Admin\\Desktop\\untitled\\src\\com\\accounting wabpage\\index.html");

            // Open in default browser
            if (htmlFile.exists()) {
                Desktop.getDesktop().browse(htmlFile.toURI());
            } else {
                System.out.println("Bruh, file not found! 😭");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(forntClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(forntClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(forntClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(forntClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forntClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JButton Journal;
    private JButton LearnAccounting;
    private JButton UserGuide;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JLabel title2;
    private JLabel titleName;
    private JButton tubularAnalysis;
    // End of variables declaration
}

