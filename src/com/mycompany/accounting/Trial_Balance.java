package com.mycompany.accounting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Trial_Balance extends javax.swing.JFrame {


    String formattedStartDate ;
    String formattedEndDate ;


    public Trial_Balance() {
        initComponents();
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stratDate = new com.toedter.calendar.JDateChooser();
        endDate = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();



        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1.setBackground(new Color(87, 143, 202));
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2.setBackground(new Color(87, 143, 202));
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3.setBackground(new Color(87, 143, 202));
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trial Balance");
        jLabel1.setFont(new java.awt.Font("serif", java.awt.Font.BOLD, 30));

        //dateLabel.setText("place for ending date");



        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4.setBackground(new Color(87, 143, 202));
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(246, 246, 246)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(304, 304, 304)
                                                .addComponent(dateLabel)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateLabel)
                                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel2.setText("Select the starting date :");

        jLabel3.setText("Select the ending date :");

        jButton1.setText("Genarete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5.setBackground(new Color(161,227,249));
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(stratDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(jButton1)))
                                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(stratDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(jButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                         "Account Titles ",  "Debit ($)","Credit ($)"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 9, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        pack();
        getContentPane().setBackground(new java.awt.Color(209, 248, 239));
    }// </editor-fold>

    private void dateInput() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Format as needed

        Date startDate = stratDate.getDate();
        Date enddDate = endDate.getDate();

        if (startDate != null && enddDate != null) {
            if (startDate.after(enddDate)) {
                // Show warning if startDate is after endDate
                JOptionPane.showMessageDialog(null, "Start date cannot be after end date!", "Warning", JOptionPane.WARNING_MESSAGE);

            } else {
                // If both dates are valid and startDate is before or equal to endDate
                formattedStartDate = sdf.format(startDate);
                formattedEndDate = sdf.format(enddDate);

                System.out.println("Start Date: " + formattedStartDate);
                System.out.println("End Date: " + formattedEndDate);

                dateLabel.setText(formattedStartDate + " To " + formattedEndDate);



            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select both dates!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    Journal journal = new Journal();
    Journal_1 journal_1 = new Journal_1();


    private void generateTrialBalance() {
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

            // Your SQL query
            String query = "WITH trial_balance AS (\n" +
                    "    SELECT \n" +
                    "        account_title,\n" +
                    "        CASE \n" +
                    "            WHEN SUM(debit - credit) >= 0 THEN SUM(debit - credit) \n" +
                    "            ELSE 0 \n" +
                    "        END AS Debit,\n" +
                    "        CASE \n" +
                    "            WHEN SUM(debit - credit) < 0 THEN ABS(SUM(debit - credit)) \n" +
                    "            ELSE 0 \n" +
                    "        END AS Credit\n" +
                    "    FROM " + tableName + " \n" + // Use the dynamically set table name here
                    "    WHERE date BETWEEN ? AND ?\n" +
                    "    GROUP BY account_title\n" +
                    ")\n" +
                    "SELECT \n" +
                    "    account_title, \n" +
                    "    Debit, \n" +
                    "    Credit\n" +
                    "FROM trial_balance\n" +
                    "\n" +
                    "UNION ALL\n" +
                    "\n" +
                    "SELECT \n" +
                    "    'Total' AS account_title,\n" +
                    "    SUM(Debit) AS Debit,\n" +
                    "    SUM(Credit) AS Credit\n" +
                    "FROM trial_balance;";

            PreparedStatement pstmt = conn.prepareStatement(query);

            // Set the date parameters
            pstmt.setDate(1, java.sql.Date.valueOf(formattedStartDate));
            pstmt.setDate(2, java.sql.Date.valueOf(formattedEndDate));

            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // Assuming jTable1 is in Trial_Balance
            model.setRowCount(0);  // Clear existing data

            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getString("account_title"),
                        rs.getBigDecimal("debit"),
                        rs.getBigDecimal("credit"),
                });
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "❌ SQL Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "❌ Invalid date format. Please enter dates in yyyy-MM-dd format.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }



    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        dateInput();

        generateTrialBalance();
    }




    // Variables declaration - do not modify
    private javax.swing.JLabel dateLabel;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser stratDate;

}
