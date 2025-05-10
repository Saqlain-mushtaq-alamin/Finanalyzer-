package com.mycompany.accounting;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;



public class StatementSheet extends javax.swing.JFrame {


    String formattedStartDate ;
    String formattedEndDate  ;

    float totalRevenue;
    float totalExpance;
    float netIncome; // Correctly calculate Net Income
    float totalOC;
    float totalDrawing;
    float ownerCapital; // Correctly calculate Owner's Equity
    float totalAssets;
    float totalLiabilities;
    float totalEquity;
    float totalOE=0;


    public StatementSheet() {

        initComponents();

    }

    private void dateInput() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Format as needed

        Date startDate = StartingDate.getDate();
        Date endDate = EndingDate.getDate();

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
                jLabel4.setText("For The Month Ended " + formattedEndDate);

                jLabel10.setText("For The Month Ended " + formattedEndDate);

                jLabel16.setText("For The Month Ended " + formattedEndDate);


            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select both dates!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }


    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        dateIntrePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GenerateButt = new javax.swing.JButton();
        printButt = new javax.swing.JButton();
        StartingDate = new com.toedter.calendar.JDateChooser();
        EndingDate = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TotalRevenue = new javax.swing.JLabel();
        TotalExpance = new javax.swing.JLabel();
        sumOfNetIncome_loss = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NetIncome_loss1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TotalOC = new javax.swing.JLabel();
        TotalDrawing = new javax.swing.JLabel();
        sumofOC = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TotalAsset = new javax.swing.JLabel();
        TotalLiabilities = new javax.swing.JLabel();
        sumofOC1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        sumOfOE = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");



        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("Inter the starting date :");

        jLabel2.setText("Inter the ending date :");

        GenerateButt.setText("Genarate");
        GenerateButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateButtActionPerformed(evt);
            }
        });

        printButt.setText("print");
        printButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dateIntrePanelLayout = new javax.swing.GroupLayout(dateIntrePanel);
        dateIntrePanel.setLayout(dateIntrePanelLayout);
        dateIntrePanel.setBackground( new Color (87, 143, 202));
        dateIntrePanelLayout.setHorizontalGroup(
                dateIntrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dateIntrePanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(dateIntrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dateIntrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(StartingDate, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                        .addComponent(EndingDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(58, 58, 58)
                                .addComponent(GenerateButt)
                                .addGap(18, 18, 18)
                                .addComponent(printButt)
                                .addContainerGap(432, Short.MAX_VALUE))
        );
        dateIntrePanelLayout.setVerticalGroup(
                dateIntrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dateIntrePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(dateIntrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(dateIntrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(GenerateButt)
                                                .addComponent(printButt))
                                        .addGroup(dateIntrePanelLayout.createSequentialGroup()
                                                .addGroup(dateIntrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(StartingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(dateIntrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(EndingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel3.setText("Income Statement ");

        jLabel4.setText("For The Month Ended ");

        jLabel5.setText("Total Revenue :");

        jLabel6.setText("Total Expanse :");

        jLabel7.setText("Net Income/loss :");

        //TotalRevenue.setText("qureyFor recenur");

        //TotalExpance.setText("qureyForExance");

        //sumOfNetIncome_loss.setText("quryForNetIncome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1.setBackground(new Color (161, 227, 249) );
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(jLabel7))
                                                .addGap(64, 64, 64)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(TotalRevenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(TotalExpance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(sumOfNetIncome_loss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(TotalRevenue))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(TotalExpance))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(sumOfNetIncome_loss))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Owner's Equity Statement ");

        jLabel10.setText("For The Month Ended ");

        jLabel11.setText("Investment :");

        jLabel12.setText("Drawings :");

        jLabel13.setText("Net Income/loss :");

        //NetIncome_loss1.setText("quryForNetIncome");

        jLabel14.setText("Owner's capital :");

        //TotalOC.setText("qureyForOC");

        //TotalDrawing.setText("qureyForDrowing");

       // sumofOC.setText("sumofOC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2.setBackground(new Color (161, 227, 249) );

        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(45, 45, 45)
                                                .addComponent(NetIncome_loss1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(73, 73, 73)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(TotalOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(TotalDrawing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(37, 37, 37)
                                                                .addComponent(sumofOC)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap(54, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(TotalOC))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(TotalDrawing))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(NetIncome_loss1))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(sumofOC))
                                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel15.setText("Banlance Sheet");

        jLabel16.setText("For The Month Ended ");

        jLabel17.setText("Total Asset :");

        jLabel18.setText("Total Liabilities :");

        jLabel19.setText("Total Owner's Equity :");

        //TotalAsset.setText("quryForTAsset");

        //TotalLiabilities.setText("quryForTLiabilli");

       // sumofOC1.setText("sumofOC");

        jLabel20.setText("Owner's capital :");

       // sumOfOE.setText("sumOfOE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3.setBackground(new Color (161, 227, 249) );

        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel18)
                                                        .addComponent(jLabel19)
                                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(TotalLiabilities, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(TotalAsset)
                                                        .addComponent(sumofOC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(sumOfOE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(9, 9, 9)))
                                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addGap(47, 47, 47)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(TotalAsset))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(TotalLiabilities))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sumofOC1)
                                        .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(sumOfOE))
                                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dateIntrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(dateIntrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 32, Short.MAX_VALUE))
                                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
        getContentPane().setBackground(new java.awt.Color(209, 248, 239));
        setSize(930, 425);
        setLocationRelativeTo(null);
    }// </editor-fold>





    private void resultFromTable() {


        String incomeStatQuery = "SELECT SUM(Revenue) AS TotalRevenue, SUM(Expense) AS TotalExpense FROM TabularAnalysis WHERE Date BETWEEN ? AND ?";
        String ownerCapitalStatQuery = "SELECT SUM(Owners_Capital) AS TotalOC, SUM(Drawing) AS TotalDrawing FROM TabularAnalysis WHERE Date BETWEEN ? AND ?";;
        String totalAssetsQuery = "SELECT SUM(Cash + Account_Receivable + Equipment) AS TotalAssets FROM TabularAnalysis WHERE Date BETWEEN ? AND ?";
        String totalLiabilitiesQuery = "SELECT SUM(Account_Payable + Note_Payable) AS TotalLiabilities FROM TabularAnalysis WHERE Date BETWEEN ? AND ?";
        String totalEquityQuery = "SELECT SUM(Owners_Capital + Revenue + Expense + Drawing) AS TotalOwnersEquity FROM TabularAnalysis WHERE Date BETWEEN ? AND ?";


        try (Connection conn = DatabaseConnection.getConnection( );
             PreparedStatement stmt = conn.prepareStatement(incomeStatQuery)) {

            stmt.setString(1, formattedStartDate);
            stmt.setString(2, formattedEndDate);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    totalRevenue = rs.getFloat("TotalRevenue");
                    totalExpance = rs.getFloat("TotalExpense");

                    netIncome = totalRevenue + totalExpance; // Correctly calculate Net Income

                    // Set values to JLabels
                    TotalRevenue.setText(String.valueOf(totalRevenue));
                    TotalExpance.setText(String.valueOf(totalExpance));
                    sumOfNetIncome_loss.setText(String.valueOf(netIncome));
                    if (netIncome>0)
                        sumOfNetIncome_loss.setForeground(Color.GREEN);
                    else
                        sumOfNetIncome_loss.setForeground(Color.RED);




                    System.out.println("✅ Total Revenue: " + totalRevenue);
                    System.out.println("✅ Total Expense: " + totalExpance);
                    System.out.println("✅ Net Income: " + netIncome);
                } else {
                    JOptionPane.showMessageDialog(null, "⚠️ No records found for the selected period.", "Warning", JOptionPane.WARNING_MESSAGE);

                }
            }

            try(PreparedStatement stmt1 = conn.prepareStatement(ownerCapitalStatQuery)) {
                stmt1.setString(1, formattedStartDate);
                stmt1.setString(2, formattedEndDate);
                try (ResultSet rs1 = stmt1.executeQuery()) {
                    if (rs1.next()) {
                        totalOC = rs1.getFloat("TotalOC");
                        totalDrawing = rs1.getFloat("TotalDrawing");

                        ownerCapital = totalOC + totalDrawing + netIncome; // Correctly calculate Owner's Equity

                        // Set values to JLabels
                        TotalOC.setText(String.valueOf(totalOC));
                        TotalDrawing.setText(String.valueOf(totalDrawing));
                        NetIncome_loss1.setText(String.valueOf(netIncome));

                        sumofOC.setText(String.valueOf(ownerCapital));

                        System.out.println("   Total Owner's Capital: " + totalOC);
                        System.out.println("   Total Drawing: " + totalDrawing);
                        System.out.println("   Owner's Equity: " + ownerCapital);
                    } else {
                        JOptionPane.showMessageDialog(null, "⚠️ No records found for the selected period.", "Warning", JOptionPane.WARNING_MESSAGE);

                    }
                }
            }

            try (PreparedStatement stmt1 = conn.prepareStatement(totalAssetsQuery);
                 PreparedStatement stmt2 = conn.prepareStatement(totalLiabilitiesQuery);
                 PreparedStatement stmt3 = conn.prepareStatement(totalEquityQuery)) {

                stmt1.setString(1, formattedStartDate);
                stmt1.setString(2, formattedEndDate);
                stmt2.setString(1, formattedStartDate);
                stmt2.setString(2, formattedEndDate);
                stmt3.setString(1, formattedStartDate);
                stmt3.setString(2, formattedEndDate);

                try (ResultSet rs1 = stmt1.executeQuery()) {
                    if (rs1.next()) {
                        totalAssets = rs1.getFloat("TotalAssets");

                        TotalAsset.setText(String.valueOf(totalAssets));
                        System.out.println("💰 Total Assets: " + totalAssets);
                    }
                }

                try (ResultSet rs2 = stmt2.executeQuery()) {
                    if (rs2.next()) {
                         totalLiabilities = rs2.getFloat("TotalLiabilities");
                        TotalLiabilities.setText(String.valueOf(totalLiabilities));
                        System.out.println("📉 Total Liabilities: " + totalLiabilities);
                    }
                }

                try (ResultSet rs3 = stmt3.executeQuery()) {
                    if (rs3.next()) {
                        totalEquity = rs3.getFloat("TotalOwnersEquity");
                        sumofOC1.setText(String.valueOf(totalEquity));
                        System.out.println("🏦 Owner's Equity: " + totalEquity);
                        totalOE =  totalLiabilities + totalEquity;
                        sumOfOE.setText(String.valueOf(totalOE));
                        System.out.println("🏦 Total Owner's Equity: " + totalOE);
                    }
                }
            }






        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "❌ Database error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);

        }

    }







    private void GenerateButtActionPerformed(java.awt.event.ActionEvent evt) {

                dateInput();
                resultFromTable();
        
    }

    private void printButtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    //this main method removable after complete the project

//    public static void main(String args[]) {
//
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException ex) {
//            java.util.logging.Logger.getLogger(StatementSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(StatementSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(StatementSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new StatementSheet().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton GenerateButt;
    private javax.swing.JLabel NetIncome_loss1;
    private javax.swing.JLabel TotalAsset;
    private javax.swing.JLabel TotalDrawing;
    private javax.swing.JLabel TotalExpance;
    private javax.swing.JLabel TotalLiabilities;
    private javax.swing.JLabel TotalOC;
    private javax.swing.JLabel TotalRevenue;
    private javax.swing.JPanel dateIntrePanel;
    private com.toedter.calendar.JDateChooser StartingDate;
    private com.toedter.calendar.JDateChooser EndingDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton printButt;
    private javax.swing.JLabel sumOfNetIncome_loss;
    private javax.swing.JLabel sumOfOE;
    private javax.swing.JLabel sumofOC;
    private javax.swing.JLabel sumofOC1;
    // End of variables declaration                   
}
