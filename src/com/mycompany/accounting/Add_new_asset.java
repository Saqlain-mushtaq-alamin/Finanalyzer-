package com.mycompany.accounting;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Add_new_asset extends javax.swing.JFrame {



    public int asset2ndIndex;
    public int asset3ndIndex;
//    public AbstractButton RaButtAccPay;
//    public AbstractButton RaButtNotePay;


    int assetValueFromME;
    int liabilityValueFromME;
    int OwnerEquityValueFromME;

    boolean isMultipleButtClick = false;




    public  Add_new_asset() {
        initComponents();
    }



    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        assetTransaction = new javax.swing.JButton();
        multipleEntry = new javax.swing.JButton();
        asserTransactionPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comdAssetEntry2nd = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        newAssetName = new javax.swing.JTextField();
        addNewAsset = new javax.swing.JButton();
        finalDone = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        fistAmount = new javax.swing.JTextField();
        secAsset = new javax.swing.JTextField();
        thrdAsset = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comdAssetEntry3rd = new javax.swing.JComboBox<>();
        RaButtAccPay2nd = new javax.swing.JRadioButton();
        RaButtNotePay2nd = new javax.swing.JRadioButton();
        RaButtOwnerCapital2nd = new javax.swing.JRadioButton();
        RaButtRevenue2nd = new javax.swing.JRadioButton();
        RaButtExpance2nd = new javax.swing.JRadioButton();
        RabuttDrawing2nd = new javax.swing.JRadioButton();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Advance ");
        jLabel1.setFont(new java.awt.Font("serif", java.awt.Font.BOLD, 20));


        assetTransaction.setText("Asser transaction");
        assetTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetTransactionActionPerformed(evt);
            }
        });

        multipleEntry.setText("multiple entry");
        multipleEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleEntryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(assetTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(multipleEntry)))
                                .addContainerGap(353, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(assetTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                        .addComponent(multipleEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setText("Select another asset :");

        comdAssetEntry2nd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash ", "Accounts Receivable ", "Supplies ", "Equipment " }));

        asset2ndIndex = comdAssetEntry2nd.getSelectedIndex();

        jLabel3.setText("Add new asset :");

        addNewAsset.setText("inter the asset");
        addNewAsset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewAssetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout asserTransactionPanelLayout = new javax.swing.GroupLayout(asserTransactionPanel);
        asserTransactionPanel.setLayout(asserTransactionPanelLayout);
        asserTransactionPanel.setVisible(true);
        asserTransactionPanelLayout.setHorizontalGroup(
                asserTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(asserTransactionPanelLayout.createSequentialGroup()
                                .addGroup(asserTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(asserTransactionPanelLayout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(asserTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(asserTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(comdAssetEntry2nd, 0, 146, Short.MAX_VALUE)
                                                        .addComponent(newAssetName)))
                                        .addGroup(asserTransactionPanelLayout.createSequentialGroup()
                                                .addGap(175, 175, 175)
                                                .addComponent(addNewAsset)))
                                .addContainerGap(339, Short.MAX_VALUE))
        );
        asserTransactionPanelLayout.setVerticalGroup(
                asserTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(asserTransactionPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(asserTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(asserTransactionPanelLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(comdAssetEntry2nd)))
                                .addGap(18, 18, 18)
                                .addGroup(asserTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(newAssetName, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addComponent(addNewAsset)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        finalDone.setText("Done");
        finalDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalDoneActionPerformed(evt);
            }
        });

        jLabel4.setText("inter the amount :");

        jLabel5.setText("inter the source :");

        comdAssetEntry3rd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash ", "Accounts Receivable ", "Supplies ", "Equipment " ,"no asset" }));

        RaButtAccPay2nd.setText("Account Payable");

        RaButtNotePay2nd.setText("Note Payable");

        RaButtOwnerCapital2nd.setText("Owner Capital");

        RaButtRevenue2nd.setText("Revenue");

        RaButtExpance2nd.setText("Expance");

        RabuttDrawing2nd.setText("Drawing");

        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(fistAmount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(secAsset, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(thrdAsset, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(comdAssetEntry3rd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(RaButtAccPay2nd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(RaButtNotePay2nd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(RaButtOwnerCapital2nd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(RaButtRevenue2nd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(RaButtExpance2nd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(RabuttDrawing2nd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1.setVisible(false);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(comdAssetEntry3rd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(28, 28, 28)
                                                .addComponent(fistAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(101, 101, 101)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(secAsset, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RaButtAccPay2nd)
                                        .addComponent(RaButtNotePay2nd))
                                .addGap(96, 96, 96)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RabuttDrawing2nd)
                                        .addComponent(RaButtExpance2nd)
                                        .addComponent(RaButtRevenue2nd)
                                        .addComponent(RaButtOwnerCapital2nd)
                                        .addComponent(thrdAsset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(188, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(fistAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(secAsset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(thrdAsset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comdAssetEntry3rd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RaButtAccPay2nd)
                                        .addComponent(RaButtOwnerCapital2nd))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(RaButtNotePay2nd)
                                        .addComponent(RaButtRevenue2nd))
                                .addGap(18, 18, 18)
                                .addComponent(RaButtExpance2nd)
                                .addGap(18, 18, 18)
                                .addComponent(RabuttDrawing2nd)
                                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)
                                                .addComponent(asserTransactionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(534, 534, 534)
                                                .addComponent(finalDone, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(78, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(asserTransactionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLayeredPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(finalDone)
                                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>


    private void asset2ndEntry(){
        asset2ndIndex = comdAssetEntry2nd.getSelectedIndex() + 2;
    }

    private void multipleEntry() {

        isMultipleButtClick = true;

        asset3ndIndex = comdAssetEntry3rd.getSelectedIndex() + 1;

        try {
            String firstAmountText = fistAmount.getText().trim();
            String secAssetText = secAsset.getText().trim();
            String thrdAssetText = thrdAsset.getText().trim();

            // Only parse values if they are not empty
            assetValueFromME = firstAmountText.isEmpty() ? 0 : Integer.parseInt(firstAmountText);
            liabilityValueFromME = secAssetText.isEmpty() ? 0 : Integer.parseInt(secAssetText);
            OwnerEquityValueFromME = thrdAssetText.isEmpty() ? 0 : Integer.parseInt(thrdAssetText);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter only numbers.", "Format Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void assetTransactionActionPerformed(java.awt.event.ActionEvent evt) {

        asserTransactionPanel.setVisible(true);
        jLayeredPane1.setVisible(false);

    }

    private void multipleEntryActionPerformed(java.awt.event.ActionEvent evt) {
        isMultipleButtClick = true;

        asserTransactionPanel.setVisible(false);
        jLayeredPane1.setVisible(true);
    }

    private void addNewAssetActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void finalDoneActionPerformed(java.awt.event.ActionEvent evt) {

        if (isMultipleButtClick) {
            multipleEntry();

        } else {
            asset2ndEntry();
        }


        dispose(); // Closes only this frame, keeps the program running


    }


//    public static void main(String args[]) {
//
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger( Add_new_asset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger( Add_new_asset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger( Add_new_asset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger( Add_new_asset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new  Add_new_asset().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify                     
    protected javax.swing.JRadioButton RaButtAccPay2nd;
    protected javax.swing.JRadioButton RaButtExpance2nd;
    protected javax.swing.JRadioButton RaButtNotePay2nd;
    protected javax.swing.JRadioButton RaButtOwnerCapital2nd;
    protected javax.swing.JRadioButton RaButtRevenue2nd;
    protected javax.swing.JRadioButton RabuttDrawing2nd;
    private javax.swing.JButton addNewAsset;
    private javax.swing.JPanel asserTransactionPanel;
    private javax.swing.JButton assetTransaction;
    private javax.swing.JComboBox<String> comdAssetEntry2nd;
    private javax.swing.JComboBox<String> comdAssetEntry3rd;
    private javax.swing.JButton finalDone;
    private javax.swing.JTextField fistAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton multipleEntry;
    private javax.swing.JTextField newAssetName;
    private javax.swing.JTextField secAsset;
    private javax.swing.JTextField thrdAsset;
    // End of variables declaration                   
}
