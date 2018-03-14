package GUI;

import Entity.EntitySearch;
import Entity.Entity;
import static GUI.Index.getEntity;
import Model.SmartTransactions;
import Utils.Utilities;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Utils.Constants;
import javax.swing.table.DefaultTableModel;

/**
 * @author Paul Andre Francisco
 */
public class Search extends javax.swing.JFrame {
    
    private final String ID = Constants.ID;
    private final String SMART_NUMBER = Constants.SMART_NUMBER;
    private final String REFERENCE_NUMBER = Constants.REFERENCE_NUMBER;
    private final String AMOUNT = Constants.AMOUNT;
    private final String BALANCE = Constants.BALANCE;
    private final String TYPE = Constants.TYPE;
    private final String SENDER = Constants.SENDER;
    private final String SENDER_NUMBER = Constants.SENDER_NUMBER;
    private final String SENDER_ADDRESS = Constants.SENDER_ADDRESS;
    private final String RECEIVER = Constants.RECEIVER;    
    private final String RECEIVER_NUMBER = Constants.RECEIVER_NUMBER;
    private final String RECEIVER_ADDRESS = Constants.RECEIVER_ADDRESS;
    private final String CREATE_DATE = Constants.CREATE_DATE;
    private final String UPDATE_DATE = Constants.UPDATE_DATE;
    
    public ResultSet multipleSet;
    
    private String search;
    
    /**
     * Creates new form Search
     */
    public Search() {        
        initComponents();    
//        showResults();
    }
            
    private void showResults() throws ClassNotFoundException, SQLException{    
        DefaultTableModel model = new DefaultTableModel();        
        Object[] columnsName = new Object[10];                
        
        /* Header Fields */
        columnsName[0] = "Smart Number";
        columnsName[1] = "Reference Number";
        columnsName[2] = "Type";
        columnsName[3] = "Amount";
        columnsName[4] = "Balance";        
        columnsName[5] = "Sender Name";
        columnsName[6] = "Sender No";
        columnsName[7] = "Receiver Name";
        columnsName[8] = "Receiver No";        
        columnsName[9] = "Transaction Date";
        
        model.setColumnIdentifiers(columnsName);
        Object[] rowData = new Object[12];    
        
        List fields = getfields();
        
        String search = txtSearch.getText();
        SmartTransactions transactions = new SmartTransactions();            
        ResultSet result = transactions.multipleSearch(fields, search);                
        
        int counter = getEntity(result,fields, search).size();
        
        if(counter < 1){
            JOptionPane.showMessageDialog(null, "No record found.", "No record found", 0);
        }
        
        int i;
        
        /* Data from Table */
        for(i = 0; i < counter; i++)
        {   
            rowData[0] = getEntity(result,fields, search).get(i).getSmartNo();
            rowData[1] = getEntity(result,fields, search).get(i).getRefNo();
            rowData[2] = getEntity(result,fields, search).get(i).getType();
            rowData[3] = getEntity(result,fields, search).get(i).getAmount();
            rowData[4] = getEntity(result,fields, search).get(i).getBalance();            
            rowData[5] = getEntity(result,fields, search).get(i).getSender();
            rowData[6] = getEntity(result,fields, search).get(i).getSenderNo();            
            rowData[8] = getEntity(result,fields, search).get(i).getReceiver();
            rowData[9] = getEntity(result,fields, search).get(i).getReceiverNo();            
            rowData[11] = getEntity(result,fields, search).get(i).getCreateDate();
            
            model.addRow(rowData);                        
        }                
        
        jTable1.setModel(model);
    }        
    
    static ArrayList<EntitySearch> getEntity(ResultSet result, List fields, String key) throws ClassNotFoundException, SQLException
    {
        ArrayList<EntitySearch> entityList = new ArrayList<EntitySearch>();
//        Entity entity;
        EntitySearch entitySearch;
        
        SmartTransactions transactions = new SmartTransactions();
        ResultSet records = transactions.multipleSearch(fields, key);
                
        while (records.next())            
        {           
            
            entitySearch = new EntitySearch(
                records.getInt("smart_no"),
                records.getString("ref_no"),
                records.getString("type"),
                records.getBigDecimal("amount"),
                records.getBigDecimal("balance"),
                records.getString("sender"),
                (int) records.getLong("sender_no"),                
                records.getString("receiver"), 
                (int) records.getLong("receiver_no"),                
                records.getString("create_date")
            );
            
            entityList.add(entitySearch);
        }
        
        return entityList;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        bttnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sSmart = new javax.swing.JCheckBox();
        sTransaction = new javax.swing.JCheckBox();
        sType = new javax.swing.JCheckBox();
        sName = new javax.swing.JCheckBox();
        sNumber = new javax.swing.JCheckBox();
        sDate = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Transaction");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter Keyword:");

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bttnSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bttnSearch.setText("Search");
        bttnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Search From:");

        sSmart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sSmart.setText("Smart Number");
        sSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sSmartActionPerformed(evt);
            }
        });

        sTransaction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sTransaction.setText("Reference Number");
        sTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sTransactionActionPerformed(evt);
            }
        });

        sType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sType.setText("Transaction Type");
        sType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sTypeActionPerformed(evt);
            }
        });

        sName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sName.setText("Name");
        sName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNameActionPerformed(evt);
            }
        });

        sNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sNumber.setText("Number");
        sNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNumberActionPerformed(evt);
            }
        });

        sDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sDate.setText("Transaction Date");
        sDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sDateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Smart", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sSmart)
                                .addGap(18, 18, 18)
                                .addComponent(sTransaction)
                                .addGap(18, 18, 18)
                                .addComponent(sType)
                                .addGap(18, 18, 18)
                                .addComponent(sName)
                                .addGap(18, 18, 18)
                                .addComponent(sNumber)
                                .addGap(18, 18, 18)
                                .addComponent(sDate)))
                        .addGap(0, 122, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sSmart)
                    .addComponent(sTransaction)
                    .addComponent(sType)
                    .addComponent(sName)
                    .addComponent(sNumber)
                    .addComponent(sDate))
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    private List getfields(){
        List fields = new ArrayList();        
        if(sSmart.isSelected()) fields.add(SMART_NUMBER);
        if(sTransaction.isSelected()) fields.add(REFERENCE_NUMBER);
        if(sType.isSelected()) fields.add(TYPE);        
        if(sName.isSelected()) fields.add(SENDER);
        if(sName.isSelected()) fields.add(RECEIVER);
        if(sNumber.isSelected()) fields.add(SENDER_NUMBER);
        if(sNumber.isSelected()) fields.add(RECEIVER_NUMBER);
        if(sDate.isSelected()) fields.add(CREATE_DATE);
        
        return fields;
    }
    private void bttnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSearchActionPerformed
        int cnt = getfields().size();
        String search = txtSearch.getText();
        
        if(search.equals("")){
            JOptionPane.showMessageDialog(null, "Please supply string to search", "Nothing to search", 0);
        }
        else if(cnt == 0){
            JOptionPane.showMessageDialog(null, "Please click any category. e.g Smart Number, Transaction Number, etc...", 
                    "Nothing to search", 0);
        }
        else{
            try {                
                showResults();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bttnSearchActionPerformed

    private void sSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sSmartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sSmartActionPerformed

    private void sTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sTransactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sTransactionActionPerformed

    private void sTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sTypeActionPerformed

    private void sNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNameActionPerformed

    private void sNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNumberActionPerformed

    private void sDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sDateActionPerformed

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox sDate;
    private javax.swing.JCheckBox sName;
    private javax.swing.JCheckBox sNumber;
    private javax.swing.JCheckBox sSmart;
    private javax.swing.JCheckBox sTransaction;
    private javax.swing.JCheckBox sType;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
