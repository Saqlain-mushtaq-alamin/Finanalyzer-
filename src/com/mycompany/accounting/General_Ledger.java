package com.mycompany.accounting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class General_Ledger extends javax.swing.JFrame {

    String formattedStartDate ;
    String formattedEndDate  ;


    public General_Ledger() {
        initComponents();
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        endingDate = new com.toedter.calendar.JDateChooser();
        statingDate = new com.toedter.calendar.JDateChooser();
        ledgerGenerateButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        raButtCash = new javax.swing.JRadioButton();
        raButtAccRece = new javax.swing.JRadioButton();
        raButtEquipment = new javax.swing.JRadioButton();
        raButtSupplies = new javax.swing.JRadioButton();
        raButtAccPay = new javax.swing.JRadioButton();
        raButtNotePay = new javax.swing.JRadioButton();
        raButtOC = new javax.swing.JRadioButton();
        raButtReve = new javax.swing.JRadioButton();
        raButtExpanses = new javax.swing.JRadioButton();
        raButtOD = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        General_LedgerTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();



        jLabel1.setText(" GENERAL LEDGER");
        jLabel1.setFont(new java.awt.Font("serif", java.awt.Font.BOLD, 30));

        jLabel1.setMaximumSize(new java.awt.Dimension(150, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1.setBackground(new Color(87, 143, 202));
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(448, 448, 448)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel2.setText("Select the starting date :");

        jLabel3.setText("Select the ending date :");

        ledgerGenerateButton.setText("Generate");
        ledgerGenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ledgerGenerateButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Select the catagory :");

        buttonGroup1.add(raButtCash);
        raButtCash.setText("Cash");

        buttonGroup1.add(raButtAccRece);
        raButtAccRece.setText("Account Receivable");

        buttonGroup1.add(raButtEquipment);
        raButtEquipment.setText("Equipment ");

        buttonGroup1.add(raButtSupplies);
        raButtSupplies.setText("Supplies");

        buttonGroup1.add(raButtAccPay);
        raButtAccPay.setText("Account Payable");

        buttonGroup1.add(raButtNotePay);
        raButtNotePay.setText("Note Payable");

        buttonGroup1.add(raButtOC);
        raButtOC.setText("Owner's Capital");

        buttonGroup1.add(raButtReve);
        raButtReve.setText("Revenues");

        buttonGroup1.add(raButtExpanses);
        raButtExpanses.setText("Expanses");


        buttonGroup1.add(raButtOD);
        raButtOD.setText("Owner's Drawing");


        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2.setBackground(new Color(161,227,249));
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(endingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(statingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(raButtAccRece)
                                                        .addComponent(raButtCash, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(raButtEquipment, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(raButtSupplies, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(raButtAccPay, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(raButtNotePay, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(raButtOC, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(raButtReve, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(raButtExpanses, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(raButtOD, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addComponent(ledgerGenerateButton)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(statingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(endingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(raButtCash)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(raButtAccRece)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(raButtEquipment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(raButtSupplies)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(raButtAccPay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(raButtNotePay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(raButtOC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(raButtReve)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(raButtExpanses)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(raButtOD)
                                .addGap(29, 29, 29)
                                .addComponent(ledgerGenerateButton)
                                .addContainerGap(185, Short.MAX_VALUE))
        );

        General_LedgerTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Date", "Account Titles & Explanation", "Raf no", "Debit ($)","Credit ($)","balance",


                }
        ));
        jScrollPane1.setViewportView(General_LedgerTable);

        jLabel5.setText("Total balance of this account is :"); //---------------------------------------------------------need to work


        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3.setBackground(new Color(209, 248, 239));
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE))
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, Short.MAX_VALUE)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1)
                                                .addContainerGap())))
        );

        pack();
        getContentPane().setBackground(new java.awt.Color(209, 248, 239));
    }// </editor-fold>

    private void dateInput() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Format as needed

        Date startDate = statingDate.getDate();
        Date endDate = endingDate.getDate();

        if (startDate != null && endDate != null) {
            if (startDate.after(endDate)) {
                // Show warning if startDate is after endDate
                JOptionPane.showMessageDialog(null, "Start date cannot be after end date!", "Warning", JOptionPane.WARNING_MESSAGE);

            } else {
                // If both dates are valid and startDate is before or equal to endDate
                formattedStartDate = sdf.format(startDate);
                formattedEndDate = sdf.format(endDate);

                System.out.println("Start Date: " + formattedStartDate);
                System.out.println("End Date: " + formattedEndDate);



            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select both dates!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void generateLadger() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            System.out.println("✅ Database connected successfully!");

            String tableName = "";

            // Set table name based on the journal
            if (Journal.isjournal) {
                tableName = "general_journal_1";  // For general_journal_1
            } else {
                tableName = "general_journal_2";  // For general_journal_2
            }

            // Debug log to check which table is being used
            System.out.println("Using table: " + tableName);

            String sql = "WITH ledger AS ( " +
                    "SELECT date, account_title, reference, debit, credit, " +
                    "ABS(SUM(debit - credit) OVER (PARTITION BY account_title ORDER BY date, id)) AS balance " +  // Convert to absolute value
                    "FROM " + tableName + ") " +
                    "SELECT date, account_title, reference, debit, credit, balance " +
                    "FROM ledger " +
                    "WHERE reference = ? AND date BETWEEN ? AND ? " +
                    "ORDER BY account_title, date";


            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Setting the correct reference based on selected radio button
            if (raButtCash.isSelected()) {
                pstmt.setInt(1, 101);
            } else if (raButtAccRece.isSelected()) {
                pstmt.setInt(1, 102);
            } else if (raButtEquipment.isSelected()) {
                pstmt.setInt(1, 103);
            } else if (raButtAccPay.isSelected()) {
                pstmt.setInt(1,471);
            } else if (raButtNotePay.isSelected()) {
                pstmt.setInt(1, 498);
            }else if (raButtOC.isSelected()) {
                pstmt.setInt(1,301);
            }else if (raButtReve.isSelected()) {
                pstmt.setInt(1, 380);
            } else if (raButtExpanses.isSelected()) {
               pstmt.setInt(1,371);
            } else if (raButtOD.isSelected()) {
                pstmt.setInt(1,306);
            } else {
                System.out.println("⚠️ No valid radio button selected!");
                return;
            }

            // Fixing the order of parameters
            pstmt.setString(2, formattedStartDate);
            pstmt.setString(3, formattedEndDate);

            ResultSet rs = pstmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) General_LedgerTable.getModel();
            model.setRowCount(0); // Clear previous data

            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getDate("date"),
                        rs.getString("account_title"),
                        rs.getInt("reference"),
                        rs.getBigDecimal("debit"),
                        rs.getBigDecimal("credit"),
                        rs.getBigDecimal("balance")
                });
            }

            System.out.println("✅ Data successfully fetched from general_journal_1!");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("❌ Database Error: " + e.getMessage());
        }
    }



    private void ledgerGenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {

        dateInput();

        generateLadger();
    }


//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(General_Ledger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(General_Ledger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(General_Ledger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(General_Ledger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new General_Ledger().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify
    private javax.swing.JTable General_LedgerTable;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser endingDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ledgerGenerateButton;
    private javax.swing.JRadioButton raButtAccPay;
    private javax.swing.JRadioButton raButtAccRece;
    private javax.swing.JRadioButton raButtCash;
    private javax.swing.JRadioButton raButtEquipment;
    private javax.swing.JRadioButton raButtExpanses;
    private javax.swing.JRadioButton raButtNotePay;
    private javax.swing.JRadioButton raButtOC;
    private javax.swing.JRadioButton raButtOD;
    private javax.swing.JRadioButton raButtReve;
    private javax.swing.JRadioButton raButtSupplies;
    private com.toedter.calendar.JDateChooser statingDate;
    // End of variables declaration                   
}
