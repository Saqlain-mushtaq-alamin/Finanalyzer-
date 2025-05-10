package com.mycompany.accounting;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Journal extends javax.swing.JFrame {

    String formattedStartDate;
    String formattedEndDate;


    public Journal() {
        initComponents();

    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        startDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        endDate = new com.toedter.calendar.JDateChooser();
        ButtGenerate = new javax.swing.JButton();
        buttBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        buttGeneralLedger = new javax.swing.JButton();
        ButtTrialBalance = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        genetalJouurnalTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("GENERAL JOURNAL");
        jLabel1.setFont(new java.awt.Font("serif", java.awt.Font.BOLD, 30));

        jLabel2.setText("Generate from Tabular Analysis");
        jLabel2.setFont(new Font("serif",java.awt.Font.PLAIN,16));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1.setBackground(new Color(87, 143, 202));
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel3.setText(" Enter the starting date :");

        jLabel4.setText(" Enter the ending date :");

        ButtGenerate.setText("Generate");
        ButtGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtGenerateActionPerformed(evt);
            }
        });

        buttBack.setText("< Back");
        buttBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttBackActionPerformed(evt);
            }


        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2.setBackground(new Color(161,227,249));
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addComponent(ButtGenerate))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(buttBack)))
                                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addComponent(ButtGenerate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                                .addComponent(buttBack)
                                .addGap(57, 57, 57))
        );

        buttGeneralLedger.setText("GENERAL LEDGER");
        buttGeneralLedger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttGeneralLedgerActionPerformed(evt);
            }
        });

        ButtTrialBalance.setText("Trial Balance");
        ButtTrialBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtTrialBalanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3.setBackground(new Color(209,248,239));
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(buttGeneralLedger)
                                .addGap(18, 18, 18)
                                .addComponent(ButtTrialBalance)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(8, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttGeneralLedger)
                                        .addComponent(ButtTrialBalance))
                                .addContainerGap())
        );
        genetalJouurnalTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Date", "Account Titles & Explanation", "Raf no", "Debit ($)",
                        "Credit ($)"
                }
        ));


        jScrollPane1.setViewportView(genetalJouurnalTable);

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
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1)))
                                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        getContentPane().setBackground(new java.awt.Color(209, 248, 239)); // Light grayish

    }// </editor-fold>



    private void ButtGenerateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dateInput();
        generateJournal();
    }

    static boolean isjournal =false;
    General_Ledger GL  ;

    private void buttGeneralLedgerActionPerformed(java.awt.event.ActionEvent evt) {

        if (GL == null) {
            GL = new General_Ledger();
            isjournal = true;
        }
        GL.setVisible(true);


    }
    Trial_Balance TB;

    private void ButtTrialBalanceActionPerformed(java.awt.event.ActionEvent evt) {
        if (TB == null) {
            TB = new Trial_Balance();
            isjournal = true;


        }

        TB.setVisible(true);
    }

    RecordingProcess RP;

    private void buttBackActionPerformed(ActionEvent evt) {
        RP = new RecordingProcess();
        RP.setVisible(true);
        dispose();

    }


    private void dateInput() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Format as needed

        Date startingDate = startDate.getDate();
        Date endingDate = endDate.getDate();

        if (startingDate != null && endingDate != null) {
            if (startingDate.after(endingDate)) {
                // Show warning if startDate is after endDate
                JOptionPane.showMessageDialog(null, "Start date cannot be after end date!", "Warning", JOptionPane.WARNING_MESSAGE);

            } else {
                // If both dates are valid and startDate is before or equal to endDate
                formattedStartDate = sdf.format(startingDate);
                formattedEndDate = sdf.format(endingDate);

                System.out.println("Start Date: " + formattedStartDate);
                System.out.println("End Date: " + formattedEndDate);



            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select both dates!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }


    private void generateJournal() {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT date, account_title, reference, debit, credit, explanation FROM general_journal_1 WHERE date BETWEEN ? AND ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDate(1, java.sql.Date.valueOf(formattedStartDate));
            pstmt.setDate(2, java.sql.Date.valueOf(formattedEndDate));

            ResultSet rs = pstmt.executeQuery();

            // Get the table model
            DefaultTableModel model = (DefaultTableModel) genetalJouurnalTable.getModel();
            model.setRowCount(0); // Clear previous data

            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getDate("date"),
                        rs.getString("account_title"),
                        rs.getInt("reference"),
                        rs.getBigDecimal("debit"),
                        rs.getBigDecimal("credit"),
                        rs.getString("explanation")
                });
            }

            System.out.println("✅ Data successfully fetched from general_journal_1!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("❌ Error fetching data: " + e.getMessage());
        }
    }




    // Variables declaration - do not modify
    private javax.swing.JButton ButtGenerate;
    private javax.swing.JButton ButtTrialBalance;
    private javax.swing.JButton buttGeneralLedger;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JTable genetalJouurnalTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JButton buttBack;
    // End of variables declaration
}
