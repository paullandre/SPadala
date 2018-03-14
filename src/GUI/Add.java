package GUI;

import Model.SmartTransactions;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import Utils.Utilities;
import java.awt.Component;
import java.awt.Container;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import sun.awt.SunToolkit;

/** 
 * @author Paul Andre Francisco
 * @date 03/11/2018
 */
public class Add extends javax.swing.JFrame {
    private Object PromptSupport;
    protected String tSmartNumber;
    protected String tTransNumber;
    protected String tAmount;
    protected String tBalance;
    protected String tType;
    protected String tSender;
    protected String tSenderNo;
    protected String tSenderAddress;
    protected String tReceiver;
    protected String tReceiverNo;
    protected String tReceiverAddress;
    private static final Utilities utilities = new Utilities();

    /**
     * Creates new form Add
     */
    public void setPLaceHolders()
    {   
        utilities.placeHolders("Enter Smart Number...", txtSmart);
        utilities.placeHolders("Enter Reference Number...", txtRef);
        utilities.placeHolders("Enter Amount...", txtAmount);
        utilities.placeHolders("Enter Balance...", txtBalance);        
//        utilities.placeHolders("Select Type...", txtTrans);
        utilities.placeHolders("Enter Sender Name...", txtSenderName);
        utilities.placeHolders("Enter Sender Number...", txtSenderNumber);
        utilities.placeHolders("Enter Sender Address...", txtSenderAddress);
        utilities.placeHolders("Enter Receiver Name...", txtReceiver);
        utilities.placeHolders("Enter Receiver Number...", txtReceiverNumber);
        utilities.placeHolders("Enter Receiver Address...", txtReceiverAddress);
    }
    public Add() {
        initComponents();                
        setPLaceHolders();
    }        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSenderName = new javax.swing.JTextField();
        bttnSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bttnCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtSenderNumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtSenderAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtReceiverNumber = new javax.swing.JTextField();
        txtRef = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTrans = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtReceiverAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtReceiver = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSmart = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Transaction");
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusCycleRoot(false);
        setFocusable(false);
        setLocationByPlatform(true);
        setResizable(false);

        txtSenderName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenderNameActionPerformed(evt);
            }
        });

        bttnSave.setBackground(new java.awt.Color(51, 102, 255));
        bttnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bttnSave.setText("Save");
        bttnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSaveActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Sender Address:");

        bttnCancel.setBackground(new java.awt.Color(255, 0, 51));
        bttnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bttnCancel.setText("Cancel");
        bttnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCancelActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Sender Number:");

        txtSenderNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenderNumberActionPerformed(evt);
            }
        });
        txtSenderNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenderNumberKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Add New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtSenderAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenderAddressActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Receiver Name:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Receiver Address:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Receiver Number:");

        txtReceiverNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReceiverNumberActionPerformed(evt);
            }
        });
        txtReceiverNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtReceiverNumberKeyReleased(evt);
            }
        });

        txtRef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRef.setName("txtRef"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Reference Number:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Transaction Type:");

        txtTrans.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTrans.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Transaction", "Sending", "Receiving" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Amount:");

        txtReceiverAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReceiverAddressActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Sender Name:");

        txtReceiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReceiverActionPerformed(evt);
            }
        });

        txtBalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBalanceKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Balance:");

        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAmountKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Smart Padala Number:");

        txtSmart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSmart.setName("txtRef"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSenderName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSenderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSenderAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bttnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtReceiverNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtReceiverAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTrans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSenderName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSenderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSenderAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReceiverNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReceiverAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenderNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenderNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenderNameActionPerformed

    private void txtSenderNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenderNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenderNumberActionPerformed

    private void txtSenderAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenderAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenderAddressActionPerformed

    private void txtReceiverNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceiverNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReceiverNumberActionPerformed

    private void txtReceiverAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceiverAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReceiverAddressActionPerformed

    private void txtReceiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceiverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReceiverActionPerformed

    private void bttnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSaveActionPerformed
//        JOptionPane.showMessageDialog(null, "My Goodness, this is so concise"); 
        tSmartNumber = txtSmart.getText();
        tTransNumber = txtRef.getText();
        tAmount = txtAmount.getText();
        tBalance = txtBalance.getText();
        tType = (String)txtTrans.getSelectedItem();
        tSender = txtSenderName.getText();
        tSenderNo = txtSenderNumber.getText();
        tSenderAddress = txtSenderAddress.getText();
        tReceiver = txtReceiver.getText();
        tReceiverNo = txtReceiverNumber.getText();
        tReceiverAddress = txtReceiverAddress.getText();                
                
        HashMap result = validateFields();
        int error = (int) result.get("Error");
        
        if(error > 0){
            JOptionPane.showMessageDialog(null, result.get("Field"), "Please complete the fields", 0);
        }
        else{
            SmartTransactions smtr = new SmartTransactions();
            try {
                smtr.insertRecord(tSmartNumber, tTransNumber, tAmount, tBalance, tType, tSender, tSenderNo, tSenderAddress, tReceiver, tReceiverNo, tReceiverAddress);
                String message = "Transaction successfully saved! \n"
                        + "Details: \n"
                        + "Smart Number: " + tSmartNumber + "\n"
                        + "Transaction Number: " + tTransNumber + "\n"
                        + "Amount: " + tAmount + "\n"
                        + "Balance: " + tBalance + "\n"
                        + "Transaction Type: " + tType + "\n"
                        + "Sender Name: " + tSender + "\n"
                        + "Sender Number: " + tSenderNo + "\n"
                        + "Sender Address: " + tSenderAddress + "\n"
                        + "Receiver Name: " + tReceiver + "\n"
                        + "Receiver Number: " + tReceiverNo + "\n"
                        + "Receiver Address: " + tReceiverAddress;
                JOptionPane.showMessageDialog(null, message);                
                utilities.clearFields(jPanel1, txtTrans); 
                setPLaceHolders();
            } 
            catch (ClassNotFoundException ex) {
                Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bttnSaveActionPerformed

    private void bttnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_bttnCancelActionPerformed

    private void txtSenderNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenderNumberKeyReleased
        String vSenderNumber = txtSenderNumber.getText();        
        utilities.validateInt(vSenderNumber, txtSenderNumber);
    }//GEN-LAST:event_txtSenderNumberKeyReleased

    private void txtReceiverNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReceiverNumberKeyReleased
        String vReceiverNumber = txtReceiverNumber.getText();        
        utilities.validateInt(vReceiverNumber, txtReceiverNumber);
    }//GEN-LAST:event_txtReceiverNumberKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        utilities.clearFields(jPanel1, txtTrans);
        setPLaceHolders();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtBalanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBalanceKeyReleased
        String vBalance = txtBalance.getText();        
        utilities.validateBigDecimal(vBalance, txtBalance);
    }//GEN-LAST:event_txtBalanceKeyReleased

    private void txtAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyReleased
        String vAmount = txtAmount.getText();        
        utilities.validateBigDecimal(vAmount, txtAmount);
    }//GEN-LAST:event_txtAmountKeyReleased
      
    private HashMap validateFields()
    {        
        int error = 0;
        
        List fields = new ArrayList();
        
        if(tTransNumber.contains("Enter")) { error++; fields.add("Smart Number"); }
        if(tTransNumber.contains("Enter")) { error++; fields.add("Transaction Number"); }
        if(tType.equals("Select Transaction")) { error++; fields.add("Transaction Type"); }
        if(tAmount.contains("Enter")) { error++; fields.add("Amount"); }
        if(tBalance.contains("Enter")) { error++; fields.add("Balance"); }
        if(tSender.contains("Enter")) { error++; fields.add("Sender"); }
        if(tSenderNo.contains("Enter")) { error++; fields.add("Sender Number"); }
        if(tSenderAddress.contains("Enter")) { error++; fields.add("Sender Address"); }
        if(tReceiver.contains("Enter")) { error++; fields.add("Receiver"); }
        if(tReceiverNo.contains("Enter")) { error++; fields.add("Receiver Number"); }
        if(tReceiverAddress.contains("Enter")) { error++; fields.add("Receiver Address"); }        
        
        if(error > 0){
//            JOptionPane.showMessageDialog(null, error);
        }   
        
        HashMap result = new HashMap();
        
        result.put("Error", error);
        result.put("Field", fields);
        
        return result;
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Add().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCancel;
    private javax.swing.JButton bttnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtReceiver;
    private javax.swing.JTextField txtReceiverAddress;
    private javax.swing.JTextField txtReceiverNumber;
    private javax.swing.JTextField txtRef;
    private javax.swing.JTextField txtSenderAddress;
    private javax.swing.JTextField txtSenderName;
    private javax.swing.JTextField txtSenderNumber;
    private javax.swing.JTextField txtSmart;
    private javax.swing.JComboBox txtTrans;
    // End of variables declaration//GEN-END:variables
}
