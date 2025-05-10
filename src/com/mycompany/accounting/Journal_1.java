package com.mycompany.accounting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Journal_1 extends javax.swing.JFrame {
    
    String formattedStartDate;
    double amount;//where the math.ads value are taken place;
    String description;
    int assetIndex;
    double value;// insert the value from the user's;
    
    public Journal_1() {
        initComponents();
         displayJournalEntries();
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttGeneralLedger = new javax.swing.JButton();
        ButtTrialBalance = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        ButtAdd = new javax.swing.JButton();
        buttBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textAssetAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ComboAsset = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        RaButtAccPay = new javax.swing.JRadioButton();
        RaButtNotePay = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        RaButtOwnercapital = new javax.swing.JRadioButton();
        RabuttRevenues = new javax.swing.JRadioButton();
        RaButtOwnerDrawing = new javax.swing.JRadioButton();
        RaButtExpance = new javax.swing.JRadioButton();
        buttMore = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        explanationText = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        general_jornal_2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("GENERAL JOURNAL");
        jLabel1.setFont(new java.awt.Font("serif", java.awt.Font.BOLD, 30));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1.setBackground(new Color(87, 143, 202));
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(297, 297, 297)
                                                .addComponent(buttGeneralLedger)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ButtTrialBalance)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttGeneralLedger)
                                        .addComponent(ButtTrialBalance))
                                .addContainerGap())
        );

        jLabel3.setText(" Enter the starting date :");

        ButtAdd.setText("Add");
        ButtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtAddActionPerformed(evt);
            }
        });

        buttBack.setText("< Back");
        buttBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Inter the asset amount :");

        jLabel7.setText("Select the assets : ");

        ComboAsset.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash ", "Accounts Receivable ", "Supplies ", "Equipment ","NO Asset  " }));

        jLabel11.setText("Select the liabilites: ");

        RaButtAccPay.setText("Accounts Payable ");

        RaButtNotePay.setText("Note Payable ");

        jLabel12.setText("Select the owner's equity : ");

        RaButtOwnercapital.setText("Owner's Capital");

        RabuttRevenues.setText("Revenues");

        RaButtOwnerDrawing.setText("Owner's Drawing");

        RaButtExpance.setText("Expense");

        buttMore.setText("more");
        buttMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttMoreActionPerformed(evt);
            }
        });

        jLabel4.setText("Explanation :");

        explanationText.setColumns(20);
        explanationText.setRows(5);
        jScrollPane2.setViewportView(explanationText);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2.setBackground(new Color(161,227,249));
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addComponent(buttBack))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(textAssetAmount))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel7)
                                                                .addGap(48, 48, 48)
                                                                .addComponent(ComboAsset, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(RaButtNotePay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(RaButtAccPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(37, 37, 37))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel12)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(buttMore)
                                                                                .addGap(30, 30, 30)
                                                                                .addComponent(ButtAdd))
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(RaButtExpance)
                                                        .addComponent(RaButtOwnerDrawing)
                                                        .addComponent(RabuttRevenues)
                                                        .addComponent(RaButtOwnercapital))
                                                .addGap(85, 85, 85))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(textAssetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(ComboAsset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(RaButtAccPay))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RaButtNotePay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RaButtOwnercapital)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RabuttRevenues)
                                .addGap(12, 12, 12)
                                .addComponent(RaButtOwnerDrawing)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RaButtExpance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ButtAdd)
                                        .addComponent(buttMore))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(buttBack)
                                .addGap(57, 57, 57))
        );

        general_jornal_2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                      
                },
                new String [] {
                        "Date", "Account Titles & Explanation", "Raf no", "Debit ($)",
                        "Credit ($)"
                }
        ));
        jScrollPane1.setViewportView(general_jornal_2);

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
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        getContentPane().setBackground(new java.awt.Color(209, 248, 239));

    }// </editor-fold>



    private void input() {
        //date entry part

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Format as needed
        Date entryDate = date.getDate();
        if (entryDate != null ) {
            formattedStartDate = sdf.format(entryDate);
            System.out.println("Entry Date: " + formattedStartDate);
        } else {
            JOptionPane.showMessageDialog(null, "Please select both dates!", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        //amount entry part
        try {
            value = Double.parseDouble(textAssetAmount.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid amount!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //description entry part
        description = explanationText.getText();

    }


    private void insertJournalEntry() {
        try {
            if (formattedStartDate == null || formattedStartDate.isEmpty()) {
                throw new IllegalArgumentException("Date cannot be null");
            }

            java.sql.Date sqlDate = java.sql.Date.valueOf(formattedStartDate);
            assetIndex = ComboAsset.getSelectedIndex() + 1;
            amount = Math.abs(value);

            Connection conn = DatabaseConnection.getConnection();

            String sql = "INSERT INTO general_journal_2 (date, account_title, reference, debit, credit, explanation) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // ✅ Insert Asset Entry (if selected)
            if (assetIndex == 1) insertJournalEntry(pstmt, sqlDate, "Cash", 101, value > 0 ? amount : 0, value < 0 ? amount : 0);
            if (assetIndex == 2) insertJournalEntry(pstmt, sqlDate, "Account Receivable", 102, value > 0 ? amount : 0, value < 0 ? amount : 0);
            if (assetIndex == 3) insertJournalEntry(pstmt, sqlDate, "Equipment", 103, value > 0 ? amount : 0, value < 0 ? amount : 0);

            // ✅ Insert Liability Entry (if selected)
            if (RaButtAccPay.isSelected()) insertJournalEntry(pstmt, sqlDate, "Account Payable", 471, value < 0 ? amount : 0, value > 0 ? amount : 0);
            if (RaButtNotePay.isSelected()) insertJournalEntry(pstmt, sqlDate, "Note Payable", 498, value < 0 ? amount : 0, value > 0 ? amount : 0);

            // ✅ Insert Equity, Revenue, Expense Entries (if selected)
            if (RaButtOwnercapital.isSelected()) insertJournalEntry(pstmt, sqlDate, "Owner's Equity", 301, 0, amount);
            if (RabuttRevenues.isSelected()) insertJournalEntry(pstmt, sqlDate, "Revenues", 380, 0, amount);
            if (RaButtExpance.isSelected()) insertJournalEntry(pstmt, sqlDate, "Expense", 371, amount, 0);
            if (RaButtOwnerDrawing.isSelected()) insertJournalEntry(pstmt, sqlDate, "Drawing", 306, amount, 0);

            // ✅ Refresh Table
            String display = "SELECT * FROM general_journal_2";
            PreparedStatement stmt = conn.prepareStatement(display);
            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) general_jornal_2.getModel();
            model.setRowCount(0);
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

            System.out.println("✅ Journal entry added successfully!");

        } catch (IllegalArgumentException e) {
            System.err.println("❌ Error: " + e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("❌ SQL Error: " + e.getMessage());
        }
    }

    private void insertJournalEntry(PreparedStatement pstmt, java.sql.Date sqlDate, String title, int ref, double debit, double credit) throws SQLException {
        pstmt.setDate(1, sqlDate);
        pstmt.setString(2, title);
        pstmt.setInt(3, ref);
        pstmt.setDouble(4, debit);
        pstmt.setDouble(5, credit);
        pstmt.setNull(6, Types.VARCHAR);
        pstmt.executeUpdate();
    }
    private void displayJournalEntries() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM general_journal_2";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // Get the table model
            DefaultTableModel model = (DefaultTableModel) general_jornal_2.getModel();
            model.setRowCount(0);  // Clear existing data

            // Loop through the result set and add data to the table
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

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "❌ Error: " + e.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
        }
    }






    private void ButtAddActionPerformed(java.awt.event.ActionEvent evt) {
         
        input();
        insertJournalEntry();

    }

    RecordingProcess RP;

    private void buttBackActionPerformed(ActionEvent evt) {
        RP = new RecordingProcess();
        RP.setVisible(true);
        dispose();

    }
    moreOptionForJournal mofj;
    private void buttMoreActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(mofj == null){
            mofj = new moreOptionForJournal();
        }
        mofj.setVisible(true);
        //displayJournalEntries();
    }
    boolean journal_1= false;

    General_Ledger GL  ;

    private void buttGeneralLedgerActionPerformed(java.awt.event.ActionEvent evt) {

        if (GL == null) {
            GL = new General_Ledger();
            journal_1 = true;
        }
        GL.setVisible(true);


    }

    Trial_Balance TB;


    private void ButtTrialBalanceActionPerformed(java.awt.event.ActionEvent evt) {
        if (TB == null) {
            TB = new Trial_Balance();
            journal_1 = true;

        }

        TB.setVisible(true);
    }


    // Variables declaration - do not modify
    private javax.swing.JButton ButtAdd;
    private javax.swing.JButton ButtTrialBalance;
    private javax.swing.JComboBox<String> ComboAsset;
    private javax.swing.JRadioButton RaButtAccPay;
    private javax.swing.JRadioButton RaButtNotePay;
    private javax.swing.JRadioButton RaButtOwnerDrawing;
    private javax.swing.JRadioButton RaButtOwnercapital;
    private javax.swing.JRadioButton RabuttRevenues;
    private javax.swing.JButton buttBack;
    private javax.swing.JButton buttGeneralLedger;
    private javax.swing.JButton buttMore;
    private com.toedter.calendar.JDateChooser date;
    javax.swing.JTable general_jornal_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton RaButtExpance;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea explanationText;
    private javax.swing.JTextField textAssetAmount;
    // End of variables declaration
}
