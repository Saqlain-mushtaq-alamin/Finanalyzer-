
 package com.mycompany.accounting;


 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.sql.Connection;
 import java.sql.SQLException;

 import java.sql.*;
 import java.time.LocalDate;
 import javax.swing.*;
 import javax.swing.table.DefaultTableModel;


 public class TabularAnalysis extends JFrame {

     int value;
     int day ;
     int  month ;
     int  year ;
     int assetIndex;
     String reMark;

     double totalAssets=0.0;
     double totalLiabilitiesAndEquity=  0.0;

     //db query
     String InsertQuery;





     public TabularAnalysis() {
         initComponents();

         addActionListenerToButton();

     }




     private void initComponents() {

         buttonGroup1 = new ButtonGroup();
         buttonGroup2 = new ButtonGroup();
         jPanel1 = new JPanel();
         jLabel1 = new JLabel();
         jPanel2 = new JPanel();
         jLabel2 = new JLabel();
         jLabel3 = new JLabel();
         TextDay = new JTextField();
         jLabel4 = new JLabel();
         ComboMonth = new JComboBox<>();
         jLabel5 = new JLabel();
         TextYear = new JTextField();
         jLabel6 = new JLabel();
         TextAmount = new JTextField();
         jLabel7 = new JLabel();
         ComboAsset = new JComboBox<>();
         JButton buttonAddNewAsset = new JButton();
         jLabel8 = new JLabel();
         RaButtAccPay = new JRadioButton();
         RaButtNotePay = new JRadioButton();
         jLabel9 = new JLabel();
         RaButtOwnercapital = new JRadioButton();
         RabuttRevenues = new JRadioButton();
         RaButtOwnerDrawing = new JRadioButton();
         RaButtExpance = new JRadioButton();
         ButtonAdd = new JButton();
         jPanel3 = new JPanel();
         TabularAnalysisButt = new JButton();
         Statementsbutt = new JButton();
         TableAnalysis = new JLayeredPane();
         jScrollPane1 = new JScrollPane();
         TabularAnalysisTable = new JTable();


         //Add_new_asset ana = new Add_new_asset();





         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

         jLabel1.setText("Tabular Analysis");

         GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
         jPanel1.setLayout(jPanel1Layout);
         jPanel1Layout.setHorizontalGroup(
                 jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                         .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                 .addContainerGap()
                                 .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 .addContainerGap())
         );
         jPanel1Layout.setVerticalGroup(
                 jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                                 .addContainerGap()
                                 .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                 .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         );

         jLabel2.setText("Inter the date:");

         jLabel3.setText("day : ");

         jLabel4.setText("month : ");

         ComboMonth.setModel(new DefaultComboBoxModel<>(new String[] { "January ", "February ", "March ", "April ", " May ","June ","July ", "August ", "September ","October ", "November ","December " }));

         jLabel5.setText("year :");



         jLabel6.setText("Inter the Amount :");

         jLabel7.setText("Select the assets : ");

         ComboAsset.setModel(new DefaultComboBoxModel<>(new String[] { "Cash ", "Accounts Receivable ", "Supplies ", "Equipment " ,"no asset"}));

         buttonAddNewAsset.setText("add new asset");

         jLabel8.setText("Select the liability: ");

         RaButtAccPay.setText("Accounts Payable ");

         RaButtNotePay.setText("Note Payable ");

         jLabel9.setText("Select the owner's equity : ");

         RaButtOwnercapital.setText("Owner's Capital");

         RabuttRevenues.setText("Revenues");

         RaButtOwnerDrawing.setText("Owner's Drawing");

         RaButtExpance.setText("Expense");

         ButtonAdd.setText("ADD");



         GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
         jPanel2.setLayout(jPanel2Layout);
         jPanel2Layout.setHorizontalGroup(
                 jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel2Layout.createSequentialGroup()
                                 .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                         .addGroup(jPanel2Layout.createSequentialGroup()
                                                 .addContainerGap()
                                                 .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                         .addGroup(jPanel2Layout.createSequentialGroup()
                                                                 .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                         .addComponent(jLabel2)
                                                                         .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                 .addComponent(jLabel3)
                                                                                 .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                 .addComponent(TextDay, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                                                 .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                 .addComponent(jLabel4)
                                                                 .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                 .addComponent(ComboMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                 .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                 .addComponent(jLabel5)
                                                                 .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                 .addComponent(TextYear, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                                         .addComponent(jLabel9)
                                                         .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                 .addGroup(jPanel2Layout.createSequentialGroup()
                                                                         .addComponent(RaButtOwnerDrawing)
                                                                         .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                         .addComponent(RaButtExpance)
                                                                         .addGap(6, 6, 6))
                                                                 .addGroup(jPanel2Layout.createSequentialGroup()
                                                                         .addComponent(RaButtOwnercapital)
                                                                         .addGap(18, 18, 18)
                                                                         .addComponent(RabuttRevenues))
                                                                 .addGroup(jPanel2Layout.createSequentialGroup()
                                                                         .addComponent(jLabel7)
                                                                         .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                         .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                 .addComponent(buttonAddNewAsset, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                                                                 .addComponent(ComboAsset, GroupLayout.Alignment.TRAILING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                 .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                         .addComponent(jLabel8)
                                                                         .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                         .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                 .addComponent(RaButtNotePay, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                 .addComponent(RaButtAccPay, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                                                         .addGroup(jPanel2Layout.createSequentialGroup()
                                                                 .addComponent(jLabel6)
                                                                 .addGap(18, 18, 18)
                                                                 .addComponent(TextAmount, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))))
                                         .addGroup(jPanel2Layout.createSequentialGroup()
                                                 .addGap(69, 69, 69)
                                                 .addComponent(ButtonAdd, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
                                 .addContainerGap(15, Short.MAX_VALUE))
         );
         jPanel2Layout.setVerticalGroup(
                 jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel2Layout.createSequentialGroup()
                                 .addContainerGap()
                                 .addComponent(jLabel2)
                                 .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                 .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                         .addComponent(jLabel3)
                                         .addComponent(TextDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                         .addComponent(jLabel4)
                                         .addComponent(ComboMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                         .addComponent(jLabel5)
                                         .addComponent(TextYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                 .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                 .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                         .addComponent(jLabel6)
                                         .addComponent(TextAmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                 .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                 .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                         .addComponent(jLabel7)
                                         .addComponent(ComboAsset, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                 .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                 .addComponent(buttonAddNewAsset)
                                 .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                 .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                         .addComponent(jLabel8)
                                         .addComponent(RaButtAccPay))
                                 .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                 .addComponent(RaButtNotePay)
                                 .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                 .addComponent(jLabel9)
                                 .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                 .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                         .addComponent(RaButtOwnercapital)
                                         .addComponent(RabuttRevenues))
                                 .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                 .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                         .addComponent(RaButtOwnerDrawing)
                                         .addComponent(RaButtExpance))
                                 .addGap(18, 18, 18)
                                 .addComponent(ButtonAdd)
                                 .addContainerGap(262, Short.MAX_VALUE))
         );

         TabularAnalysisButt.setText("Tabular Analysis");
         TabularAnalysisButt.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
                 TabularAnalysisButtActionPerformed(evt);
             }
         });

         Statementsbutt.setText(" Financial Statements");
         Statementsbutt.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
                 StatementsbuttActionPerformed(evt);
             }
         });
         buttonAddNewAsset.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
                 ButtonAddNewAssetActionPerformed(evt);
             }


         });


         TabularAnalysisTable.setModel(new DefaultTableModel(
                 new Object [][] {


                 },
                 new String [] {
                         "Tran ID", "Date", "Cash", "Accounts Receivable", "Equipment",
                         "Accounts Payable", "Notes Payable", "Owner's Capital",
                         "Revenue", "Expense", "Drawing", "Remarks"
                 }
         ));
         jScrollPane1.setViewportView(TabularAnalysisTable);

         TableAnalysis.setLayer(jScrollPane1, JLayeredPane.DEFAULT_LAYER);

         GroupLayout TableAnalysisLayout = new GroupLayout(TableAnalysis);
         TableAnalysis.setLayout(TableAnalysisLayout);





         TableAnalysisLayout.setHorizontalGroup(
                 TableAnalysisLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                         .addGroup(TableAnalysisLayout.createSequentialGroup()
                                 .addContainerGap()
                                 .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
                                 .addContainerGap())
         );
         TableAnalysisLayout.setVerticalGroup(
                 TableAnalysisLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                         .addGroup(TableAnalysisLayout.createSequentialGroup()
                                 .addContainerGap()
                                 .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 538, GroupLayout.PREFERRED_SIZE)
                                 .addContainerGap(14, Short.MAX_VALUE))
         );

         GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
         jPanel3.setLayout(jPanel3Layout);
         jPanel3Layout.setHorizontalGroup(
                 jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel3Layout.createSequentialGroup()
                                 .addGap(16, 16, 16)
                                 .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                         .addComponent(TableAnalysis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                         .addGroup(jPanel3Layout.createSequentialGroup()
                                                 .addComponent(TabularAnalysisButt, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                                 .addGap(29, 29, 29)
                                                 .addComponent(Statementsbutt, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
                                 .addContainerGap(29, Short.MAX_VALUE))
         );
         jPanel3Layout.setVerticalGroup(
                 jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel3Layout.createSequentialGroup()
                                 .addContainerGap()
                                 .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                         .addComponent(TabularAnalysisButt, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                         .addComponent(Statementsbutt, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                 .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                 .addComponent(TableAnalysis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                 .addContainerGap(23, Short.MAX_VALUE))
         );

         GroupLayout layout = new GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
                 layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                         .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addGroup(layout.createSequentialGroup()
                                 .addContainerGap()
                                 .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                 .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                 .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 .addContainerGap())
         );
         layout.setVerticalGroup(
                 layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                                 .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                 .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                         .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                         .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                 .addGap(0, 9, Short.MAX_VALUE))
         );

         pack();



     }

     void TakeInput() {


        // value = Integer.parseInt(TextAmount.getText());

         String input = TextAmount.getText().trim(); // Get text and trim spaces
          value = 0; // Default value in case of empty input

         if (!input.isEmpty()) {
             try {
                 value = Integer.parseInt(input);
             } catch (NumberFormatException e) {
                 System.out.println("Invalid number format: " + input);
             }
         } else {
             System.out.println("Input is empty, setting value to 0.");
         }





         try {
             // Ensure day is within 1-31
             String dayText = TextDay.getText().trim();
             if (dayText.isEmpty()) {
                 throw new NumberFormatException("Day is empty!");
             }

             day = Integer.parseInt(dayText);
             if (day < 1 || day > 31) {
                 throw new NumberFormatException("Invalid day: " + day);
             }

             year = Integer.parseInt(TextYear.getText());
             month = ComboMonth.getSelectedIndex()+1 ;// Ensure this starts from 0
         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, "⚠️ Invalid day: " + day, "Warning", JOptionPane.WARNING_MESSAGE);

             day = 1; // Default to 1 to avoid crashes
         }
     }

     void displayTable() {
         DefaultTableModel model1 = (DefaultTableModel) TabularAnalysisTable.getModel();
         model1.setColumnIdentifiers(new String[]{
                 "Tran ID", "Date", "Cash", "Accounts Receivable", "Equipment",
                 "Accounts Payable", "Notes Payable", "Owner's Capital",
                 "Revenue", "Expense", "Drawing", "Remarks"
         });

         model1.setRowCount(0);
         try (Connection conn = DatabaseConnection.getConnection();
              Statement stmt = conn.createStatement();
              ResultSet rs = stmt.executeQuery("SELECT * FROM TabularAnalysis")) {

             System.out.println("✅ Successfully fetched data from TabularAnalysis!");

             // Iterate through the result set and print data (or populate a table)
             while (rs.next()) {
                 int tranId = rs.getInt("Tran_id");
                 String date = rs.getString("Date");
                 double cash = rs.getDouble("Cash");
                 double accReceivable = rs.getDouble("Account_Receivable");
                 double equipment = rs.getDouble("Equipment");
                 double accPayable = rs.getDouble("Account_Payable");
                 double notePayable = rs.getDouble("Note_Payable");
                 double ownersCapital = rs.getDouble("Owners_Capital");
                 double revenue = rs.getDouble("Revenue");
                 double expense = rs.getDouble("Expense");
                 double drawing = rs.getDouble("Drawing");
                 String remarks = rs.getString("Remarks");

                 model1.addRow(new Object[]{
                         tranId, date, cash, accReceivable, equipment,
                         accPayable, notePayable, ownersCapital, revenue,
                         expense, drawing, remarks
                 });

                 // Print fetched data (For debugging purposes)
//                 System.out.println(tranId + " | " + date + " | " + cash + " | " +
//                         accReceivable + " | " + equipment + " | " + accPayable + " | " +
//                         notePayable + " | " + ownersCapital + " | " + revenue + " | " +
//                         expense + " | " + drawing + " | " + remarks);
             }

         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "❌ SQL Error: " + e.getMessage(),
                     "Database Error", JOptionPane.ERROR_MESSAGE);
             e.printStackTrace(); // Log error details for debugging
         }
     }

     private void TabularAnalysisButtActionPerformed(ActionEvent evt) {
         displayTable();
     }


     private void StatementsbuttActionPerformed(ActionEvent evt) {
                 StatementSheet fs = new StatementSheet();
                 fs.setVisible(true);
     }


     Add_new_asset ana  ;
     private void ButtonAddNewAssetActionPerformed(ActionEvent evt) {
         if (ana == null) {
             ana = new Add_new_asset();
         }
         ana.setVisible(true);
     }





     private void addActionListenerToButton() {
         // Add action listener to the ButtonAdd
         ButtonAdd.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 // Call the TakeInput method when the button is clicked
                 TakeInput();

                 // Reload the data into the table to reflect changes
                 loadTableData();

                 loadDataIntoJournal();

                 ana.asset2ndIndex=0;

                 System.out.println("✅ Data inserted successfully on Button click!");

             }
         });
     }





     // connection with database and values insertion into the table

     private void loadTableData() {
         if (ana == null) {
             System.out.println("❌ ERROR: 'ana' is NULL! Initializing now...");
             ana = new Add_new_asset(); // Create it if it doesn’t exist
         }

         DefaultTableModel model = (DefaultTableModel) TabularAnalysisTable.getModel();
         model.setColumnIdentifiers(new String[]{
                 "Tran ID", "Date", "Cash", "Accounts Receivable", "Equipment",
                 "Accounts Payable", "Notes Payable", "Owner's Capital",
                 "Revenue", "Expense", "Drawing", "Remarks"
         });

         model.setRowCount(0); // Clear the existing data

         try (Connection conn = DatabaseConnection.getConnection()) {
             System.out.println("✅ Database connected successfully!");

             // Prepare the INSERT query
             String insertQuery = "INSERT INTO TabularAnalysis (Date, Cash, Account_Receivable, Equipment, Account_Payable, Note_Payable, Owners_Capital, Revenue, Expense, Drawing, Remarks) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
             PreparedStatement pstmt = conn.prepareStatement(insertQuery);

             if (day >= 1 && day <= 31) {
                 LocalDate localDate = LocalDate.of(year, month, day);
                 pstmt.setDate(1, Date.valueOf(localDate)); // Insert Date

                 assetIndex = ComboAsset.getSelectedIndex() + 2;

                 // Default values
                 double cash = 0;
                 double accReceivable = 0;
                 double equipment = 0;
                 double accPayable = 0;
                 double notePayable = 0;
                 double ownersCapital = 0;
                 double revenue = 0;
                 double expense = 0;
                 double drawing = 0;
                 reMark= " " ;

                 // 🔹 Debugging print
                 System.out.println("🔹 Asset Index: " + assetIndex);
                 System.out.println("🔹 Asset 2nd Index: " + ana.asset2ndIndex);
                 System.out.println("🔹 Value: " + value);
                 System.out.println("   isMultipleButtClick: " + ana.isMultipleButtClick);

                 if (!ana.isMultipleButtClick) {
                     System.out.println("insert the  value form the main part");
                     // Ensure different assets are selected
                     if (assetIndex != ana.asset2ndIndex) {
                         if (assetIndex == 2) cash = value;
                         if (ana.asset2ndIndex == 2) cash = -value;

                         if (assetIndex == 3) accReceivable = value;
                         if (ana.asset2ndIndex == 3) accReceivable = -value;

                         if (assetIndex == 4) equipment = value;
                         if (ana.asset2ndIndex == 4) equipment = -value;
                     } else {
                         JOptionPane.showMessageDialog(null, "⚠️ You are selecting the same asset!", "Warning", JOptionPane.WARNING_MESSAGE);
                         return;

                     }

                     // Handle liabilities/equity
                     if (RaButtAccPay.isSelected()) accPayable = value;
                     if (RaButtNotePay.isSelected()) notePayable = value;

                     // Handle Owner's Equity correctly (ensure only positive values)
                     if (value > 0) {
                         if (RaButtOwnercapital.isSelected()) ownersCapital = value;
                         if (RabuttRevenues.isSelected()){
                             revenue = value;
                             reMark = JOptionPane.showInputDialog("Enter a Remark:");
                         }
                     } else {
                         System.out.println("⚠️ Owner's Capital & Revenue should be positive!");
                         if (RaButtOwnercapital.isSelected()) ownersCapital = -value;
                         if (RabuttRevenues.isSelected()){
                             revenue = -value;
                             reMark = JOptionPane.showInputDialog("Enter a Remark:");
                         }
                     }

                     // Handle Expense & Drawing correctly
                     if (value < 0) {

                         if (RaButtExpance.isSelected()){
                             expense = value;
                             reMark = JOptionPane.showInputDialog("Enter a Remark:");
                         }
                         if (RaButtOwnerDrawing.isSelected()) drawing = value;
                     } else {
                         if (RaButtExpance.isSelected()){
                             expense = -value;
                             reMark = JOptionPane.showInputDialog("Enter a Remark:");
                         }
                         if (RaButtOwnerDrawing.isSelected()) drawing = -value;
                     }
                 } else {
                     //ana.isMultipleButtClick = false;

                     System.out.println("inserting the value from the multiple part ");
                     System.out.println("index of 3rd asset " + ana.asset3ndIndex);
                     // 🔹 Multiple Entry Mode Handling
                     if (ana.asset3ndIndex == 1) cash = ana.assetValueFromME;
                     if (ana.asset3ndIndex == 2) accReceivable = ana.assetValueFromME;
                     if (ana.asset3ndIndex == 3) equipment = ana.assetValueFromME;

                     if (ana.RaButtAccPay2nd.isSelected()) accPayable = ana.liabilityValueFromME;
                     if (ana.RaButtNotePay2nd.isSelected()) notePayable = ana.liabilityValueFromME;

                     if (ana.RaButtOwnerCapital2nd.isSelected()) ownersCapital = ana.OwnerEquityValueFromME;
                     if (ana.RaButtRevenue2nd.isSelected()) {
                         revenue = ana.OwnerEquityValueFromME;
                         reMark = JOptionPane.showInputDialog("Enter a Remark:");

                     }

                     if (ana.RaButtExpance2nd.isSelected()) {
                         expense = (value < 0) ? ana.OwnerEquityValueFromME : -ana.OwnerEquityValueFromME;
                         reMark = JOptionPane.showInputDialog("Enter a Remark:");
                     }
                     if (ana.RabuttDrawing2nd.isSelected())
                         drawing = (value < 0) ? ana.OwnerEquityValueFromME : -ana.OwnerEquityValueFromME;
                 }

                 // 🔹 Calculate Totals
                 totalAssets = cash + accReceivable + equipment;
                 totalLiabilitiesAndEquity = accPayable + notePayable + ownersCapital + revenue + expense + drawing;

                 // 🔹 Debug Print
                 System.out.println("📊 Total Assets: " + totalAssets);
                 System.out.println("📊 Total Liabilities + Owner’s Equity: " + totalLiabilitiesAndEquity);

                 // 🔹 Equation Check with tolerance
                 if (Math.abs(totalAssets - totalLiabilitiesAndEquity) < 0.01) {
                     pstmt.setDouble(2, cash);
                     pstmt.setDouble(3, accReceivable);
                     pstmt.setDouble(4, equipment);
                     pstmt.setDouble(5, accPayable);
                     pstmt.setDouble(6, notePayable);
                     pstmt.setDouble(7, ownersCapital);
                     pstmt.setDouble(8, revenue);
                     pstmt.setDouble(9, expense);
                     pstmt.setDouble(10, drawing);
                     pstmt.setString(11, reMark); // Remarks

                     int rowsInserted = pstmt.executeUpdate();

                     if (rowsInserted > 0) {
                         System.out.println("✅ Data inserted successfully!");
                        // JOptionPane.showMessageDialog(null, "✅ Data inserted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                     } else {
                         JOptionPane.showMessageDialog(null, "⚠️ No data inserted!", "Warning", JOptionPane.WARNING_MESSAGE);

                     }
                 } else {
                     JOptionPane.showMessageDialog(null, "❌ ERROR: Assets ≠ Liabilities + Owner’s Equity.\nTransaction rejected.", "Accounting Error", JOptionPane.ERROR_MESSAGE);

                     return; // Stop execution if condition fails
                 }
             } else {
                 JOptionPane.showMessageDialog(null, "⚠️ Invalid day: " + day, "Warning", JOptionPane.WARNING_MESSAGE);

             }

             pstmt.close();

             // 🔹 Fetch and Display Data
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM TabularAnalysis");
             System.out.println("📌 Fetching data from database...");

             while (rs.next()) {
                 int tranId = rs.getInt("Tran_id");
                 String date = rs.getString("Date");
                 double cash = rs.getDouble("Cash");
                 double accReceivable = rs.getDouble("Account_Receivable");
                 double equipment = rs.getDouble("Equipment");
                 double accPayable = rs.getDouble("Account_Payable");
                 double notePayable = rs.getDouble("Note_Payable");
                 double ownersCapital = rs.getDouble("Owners_Capital");
                 double revenue = rs.getDouble("Revenue");
                 double expense = rs.getDouble("Expense");
                 double drawing = rs.getDouble("Drawing");
                 String remarks = rs.getString("Remarks");

                 model.addRow(new Object[]{
                         tranId, date, cash, accReceivable, equipment,
                         accPayable, notePayable, ownersCapital, revenue,
                         expense, drawing, remarks
                 });
             }

             TabularAnalysisTable.setModel(model);

         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "❌ SQL Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
         }
     }



     // loading data into journal table from the tabular analysis table
     public void loadDataIntoJournal() {
         Connection con = null;
         try {
             con = DatabaseConnection.getConnection();
             con.setAutoCommit(false);

             String insertSQL = "INSERT INTO general_journal_1 (date, account_title, reference, debit, credit, explanation) VALUES (?, ?, ?, ?, ?, ?)";
             PreparedStatement stmt = con.prepareStatement(insertSQL);
             LocalDate localDate = LocalDate.of(year, month, day);
             double amount = Math.abs(value);

             if (!ana.isMultipleButtClick) {
                 System.out.println("Inserting value from single selection");

                 // Handle Asset accounts (Cash, AR, Equipment)
                 if (assetIndex == 2 || assetIndex == 3 || assetIndex == 4) {
                     // First entry - Asset account
                     stmt.setDate(1, Date.valueOf(localDate));
                     if (assetIndex == 2) {
                         stmt.setString(2, "Cash");
                         stmt.setInt(3, 101);
                     } else if (assetIndex == 3) {
                         stmt.setString(2, "Account Receivable");
                         stmt.setInt(3, 102);
                     } else if (assetIndex == 4) {
                         stmt.setString(2, "Equipment");
                         stmt.setInt(3, 103);
                     }
                     stmt.setDouble(4, value > 0 ? amount : 0); // Debit if positive
                     stmt.setDouble(5, value < 0 ? amount : 0); // Credit if negative
                     stmt.setNull(6, Types.VARCHAR);
                     stmt.executeUpdate();

                     // Second entry - Counter account
                     stmt.setDate(1, Date.valueOf(localDate));
                     if (RaButtAccPay.isSelected()) {
                         stmt.setString(2, "Account Payable");
                         stmt.setInt(3, 471);
                         stmt.setDouble(4, value < 0 ? amount : 0); // Debit if decreasing AP
                         stmt.setDouble(5, value > 0 ? amount : 0); // Credit if increasing AP
                     }
                     else if (RaButtNotePay.isSelected()) {
                         stmt.setString(2, "Note Payable");
                         stmt.setInt(3, 498);
                         stmt.setDouble(4, value < 0 ? amount : 0);
                         stmt.setDouble(5, value > 0 ? amount : 0);
                     }
                     else if (RaButtOwnercapital.isSelected()) {
                         stmt.setString(2, "Owner's Equity");
                         stmt.setInt(3, 301);
                         stmt.setDouble(4, 0);
                         stmt.setDouble(5, amount); // Always credit
                     }
                     else if (RabuttRevenues.isSelected()) {
                         stmt.setString(2, "Revenues");
                         stmt.setInt(3, 380);
                         stmt.setDouble(4, 0);
                         stmt.setDouble(5, amount); // Always credit
                     }
                     else if (RaButtExpance.isSelected()) {
                         stmt.setString(2, "Expense");
                         stmt.setInt(3, 371);
                         stmt.setDouble(4, amount); // Always debit
                         stmt.setDouble(5, 0);
                     }
                     else if (RaButtOwnerDrawing.isSelected()) {
                         stmt.setString(2, "Drawing");
                         stmt.setInt(3, 306);
                         stmt.setDouble(4, amount); // Always debit
                         stmt.setDouble(5, 0);
                     }
                     stmt.setNull(6, Types.VARCHAR);
                     stmt.executeUpdate();
                 }
                 // Handle direct liability/equity entries (no asset selected)
                 else {
                     // First entry - Debit side
                     stmt.setDate(1, Date.valueOf(localDate));
                     if (RaButtExpance.isSelected()) {
                         stmt.setString(2, "Expense");
                         stmt.setInt(3, 371);
                         stmt.setDouble(4, amount); // Debit
                         stmt.setDouble(5, 0);
                     }
                     else if (RaButtOwnerDrawing.isSelected()) {
                         stmt.setString(2, "Drawing");
                         stmt.setInt(3, 306);
                         stmt.setDouble(4, amount); // Debit
                         stmt.setDouble(5, 0);
                     }
                     stmt.setNull(6, Types.VARCHAR);
                     stmt.executeUpdate();

                     // Second entry - Credit side
                     stmt.setDate(1, Date.valueOf(localDate));
                     if (RaButtAccPay.isSelected()) {
                         stmt.setString(2, "Account Payable");
                         stmt.setInt(3, 471);
                         stmt.setDouble(4, 0);
                         stmt.setDouble(5, amount); // Credit
                     }
                     else if (RaButtNotePay.isSelected()) {
                         stmt.setString(2, "Note Payable");
                         stmt.setInt(3, 498);
                         stmt.setDouble(4, 0);
                         stmt.setDouble(5, amount); // Credit
                     }
                     else if (RaButtOwnercapital.isSelected()) {
                         stmt.setString(2, "Owner's Equity");
                         stmt.setInt(3, 301);
                         stmt.setDouble(4, 0);
                         stmt.setDouble(5, amount); // Credit
                     }
                     else if (RabuttRevenues.isSelected()) {
                         stmt.setString(2, "Revenues");
                         stmt.setInt(3, 380);
                         stmt.setDouble(4, 0);
                         stmt.setDouble(5, amount); // Credit
                     }
                     stmt.setNull(6, Types.VARCHAR);
                     stmt.executeUpdate();
                 }
             }
             else {// ------------------------------------------------------  did not take the 3rd input to insert the table
                 // Multiple entry mode handling
                 ana.isMultipleButtClick = false;
                 System.out.println("Inserting value from multiple selection");

                 // Handle Asset accounts (Cash, AR, Equipment)
                 if (ana.asset3ndIndex == 1 || ana.asset3ndIndex == 2 || ana.asset3ndIndex == 3) {
                     // First entry - Asset account
                     stmt.setDate(1, Date.valueOf(localDate));
                     if (ana.asset3ndIndex == 1) {
                         stmt.setString(2, "Cash");
                         stmt.setInt(3, 101);
                     } else if (ana.asset3ndIndex == 2) {
                         stmt.setString(2, "Account Receivable");
                         stmt.setInt(3, 102);
                     } else if (ana.asset3ndIndex == 3) {
                         stmt.setString(2, "Equipment");
                         stmt.setInt(3, 103);
                     }
                     stmt.setDouble(4, ana.assetValueFromME > 0 ? Math.abs(ana.assetValueFromME) : 0);
                     stmt.setDouble(5, ana.assetValueFromME < 0 ? Math.abs(ana.assetValueFromME) : 0);
                     stmt.setNull(6, Types.VARCHAR);
                     stmt.executeUpdate();

                     // Second entry - Counter account
                     stmt.setDate(1, Date.valueOf(localDate));
                     if (ana.RaButtAccPay2nd.isSelected()) {
                         stmt.setString(2, "Account Payable");
                         stmt.setInt(3, 471);
                         stmt.setDouble(4, ana.liabilityValueFromME < 0 ? Math.abs(ana.liabilityValueFromME) : 0);
                         stmt.setDouble(5, ana.liabilityValueFromME > 0 ? Math.abs(ana.liabilityValueFromME) : 0);
                     }
                     else if (ana.RaButtNotePay2nd.isSelected()) {
                         stmt.setString(2, "Note Payable");
                         stmt.setInt(3, 498);
                         stmt.setDouble(4, ana.liabilityValueFromME < 0 ? Math.abs(ana.liabilityValueFromME) : 0);
                         stmt.setDouble(5, ana.liabilityValueFromME > 0 ? Math.abs(ana.liabilityValueFromME) : 0);
                     }
                     else if (ana.RaButtOwnerCapital2nd.isSelected()) {
                         stmt.setString(2, "Owner's Equity");
                         stmt.setInt(3, 301);
                         stmt.setDouble(4, 0);
                         stmt.setDouble(5, Math.abs(ana.OwnerEquityValueFromME));
                     }
                     else if (ana.RaButtRevenue2nd.isSelected()) {
                         stmt.setString(2, "Revenues");
                         stmt.setInt(3, 380);
                         stmt.setDouble(4, 0);
                         stmt.setDouble(5, Math.abs(ana.OwnerEquityValueFromME));
                     }
                     else if (ana.RaButtExpance2nd.isSelected()) {
                         stmt.setString(2, "Expense");
                         stmt.setInt(3, 371);
                         stmt.setDouble(4, Math.abs(ana.OwnerEquityValueFromME));
                         stmt.setDouble(5, 0);
                     }
                     else if (ana.RabuttDrawing2nd.isSelected()) {
                         stmt.setString(2, "Drawing");
                         stmt.setInt(3, 306);
                         stmt.setDouble(4, Math.abs(ana.OwnerEquityValueFromME));
                         stmt.setDouble(5, 0);
                     }
                     stmt.setNull(6, Types.VARCHAR);
                     stmt.executeUpdate();
                 }
                 // Handle direct liability/equity entries (no asset selected)
                 else {
                     // First entry - Debit side
                     stmt.setDate(1, Date.valueOf(localDate));
                     if (ana.RaButtExpance2nd.isSelected()) {
                         stmt.setString(2, "Expense");
                         stmt.setInt(3, 371);
                         stmt.setDouble(4, Math.abs(ana.OwnerEquityValueFromME));
                         stmt.setDouble(5, 0);
                     }
                     else if (ana.RabuttDrawing2nd.isSelected()) {
                         stmt.setString(2, "Drawing");
                         stmt.setInt(3, 306);
                         stmt.setDouble(4, Math.abs(ana.OwnerEquityValueFromME));
                         stmt.setDouble(5, 0);
                     }
                     stmt.setNull(6, Types.VARCHAR);
                     stmt.executeUpdate();

                     // Second entry - Credit side
                     stmt.setDate(1, Date.valueOf(localDate));
                     if (ana.RaButtAccPay2nd.isSelected()) {
                         stmt.setString(2, "Account Payable");
                         stmt.setInt(3, 471);
                         stmt.setDouble(4, 0);
                         stmt.setDouble(5, Math.abs(ana.liabilityValueFromME));
                     }
                     else if (ana.RaButtNotePay2nd.isSelected()) {
                         stmt.setString(2, "Note Payable");
                         stmt.setInt(3, 498);
                         stmt.setDouble(4, 0);
                         stmt.setDouble(5, Math.abs(ana.liabilityValueFromME));
                     }
                     else if (ana.RaButtOwnerCapital2nd.isSelected()) {
                         stmt.setString(2, "Owner's Equity");
                         stmt.setInt(3, 301);
                         stmt.setDouble(4, 0);
                         stmt.setDouble(5, Math.abs(ana.OwnerEquityValueFromME));
                     }
                     else if (ana.RaButtRevenue2nd.isSelected()) {
                         stmt.setString(2, "Revenues");
                         stmt.setInt(3, 380);
                         stmt.setDouble(4, 0);
                         stmt.setDouble(5, Math.abs(ana.OwnerEquityValueFromME));
                     }
                     stmt.setNull(6, Types.VARCHAR);
                     stmt.executeUpdate();
                 }
             }

             con.commit();
             JOptionPane.showMessageDialog(null, "Journal entry added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

         } catch (SQLException e) {
             try {
                 if (con != null) con.rollback();
                 JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
             } catch (SQLException ex) {
                 ex.printStackTrace();
             }
         } finally {
             try {
                 if (con != null) con.close();
             } catch (SQLException e) {
                 e.printStackTrace();
             }
         }
     }

     // Variables declaration - do not modify
     private JButton ButtonAdd;
     private JComboBox<String> ComboAsset;
     private JComboBox<String> ComboMonth;
     private JRadioButton RaButtAccPay;
     private JRadioButton RaButtNotePay;
     private JRadioButton RaButtOwnerDrawing;
     private JRadioButton RaButtOwnercapital;
     private JRadioButton RabuttRevenues;
     private JRadioButton RaButtExpance;
     private JButton Statementsbutt;
     private JLayeredPane TableAnalysis;
     private JButton TabularAnalysisButt;
     private JTable TabularAnalysisTable;
     private JTextField TextAmount;// place where the amount is taken input
     private JTextField TextDay;
     private JTextField TextYear;
     private ButtonGroup buttonGroup1;
     private ButtonGroup buttonGroup2;
     private JLabel jLabel1;
     private JLabel jLabel2;
     private JLabel jLabel3;
     private JLabel jLabel4;
     private JLabel jLabel5;
     private JLabel jLabel6;
     private JLabel jLabel7;
     private JLabel jLabel8;
     private JLabel jLabel9;
     private JPanel jPanel1;
     private JPanel jPanel2;
     private JPanel jPanel3;




     private JScrollPane jScrollPane1;
     private JScrollPane jScrollPane2;


     // End of variables declaration
 }

