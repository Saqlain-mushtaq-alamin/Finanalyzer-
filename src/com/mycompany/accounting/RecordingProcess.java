package com.mycompany.accounting;

import javax.swing.*;

public class RecordingProcess extends javax.swing.JFrame {

    public RecordingProcess() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        formedJurnal = new javax.swing.JButton();
        originateFromTA = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setText("Welcome to the recording process");
        jLabel1.setFont(new java.awt.Font("serif", java.awt.Font.BOLD, 24));




        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1)
                                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel2.setLayout(null);

        formedJurnal.setText("Formed Journal");
        formedJurnal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formedJurnalActionPerformed(evt);
            }
        });
        jPanel2.add(formedJurnal);
        formedJurnal.setBounds(91, 47, 159, 50);

        originateFromTA.setText("Originate from Tabular Analysis");
        originateFromTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originateFromTAActionPerformed(evt);
            }
        });
        jPanel2.add(originateFromTA);
        originateFromTA.setBounds(356, 47, 159, 50);

        back.setText("< back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back);
        back.setBounds(14, 302, 72, 23);

        jButton4.setText("settings");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(104, 302, 72, 23);

        // Safe image loading with null-check
        java.net.URL imageUrl = getClass().getResource("/com/resourse/panal2Background.jpg");
        if (imageUrl != null) {
            jLabel2.setIcon(new javax.swing.ImageIcon(imageUrl));
        } else {
            System.err.println("Image not found! Check the path: /com/resourse/panal2Background.jpg");
            jLabel2.setText("Image not found!");
        }

        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 630, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );


        pack();

        setSize(655, 505);
        setLocationRelativeTo(null);
    }

    Journal jr;
    Journal_1 jr_1;
    forntClass FC;

    private void originateFromTAActionPerformed(java.awt.event.ActionEvent evt) {
        jr = new Journal();
        jr.setVisible(true);
        dispose();
    }

    private void formedJurnalActionPerformed(java.awt.event.ActionEvent evt) {
        jr_1 = new Journal_1();
        jr_1.setVisible(true);
        dispose();
    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        FC = new forntClass();
        FC.setVisible(true);
        dispose();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here
    }

    private javax.swing.JButton back;
    private javax.swing.JButton formedJurnal;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton originateFromTA;

}
