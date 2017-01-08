/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class PlannerGUI extends javax.swing.JFrame {
   private static Driver instance = Driver.getInstance();
    /**
     * Creates new form PlannerGUI
     */
    public PlannerGUI() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        Enter = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        BudgetingButton = new javax.swing.JButton();
        StatsButton = new javax.swing.JButton();
        ExpensesButton = new javax.swing.JButton();
        IncomeButton = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Overview = new javax.swing.JInternalFrame();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Budgeting = new javax.swing.JPanel();
        itemName1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        price1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        category1 = new javax.swing.JComboBox();
        RemoveButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        BackButtonBudgeting = new javax.swing.JButton();
        CalendarDate = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        Calendar = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        ViewStatsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StatisticsTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(760, 450));
        setPreferredSize(new java.awt.Dimension(760, 450));
        setSize(new java.awt.Dimension(760, 450));
        getContentPane().setLayout(new java.awt.CardLayout());

        Enter.setBackground(new java.awt.Color(255, 255, 255));
        Enter.setFocusable(false);
        Enter.setMaximumSize(new java.awt.Dimension(500, 400));
        Enter.setMinimumSize(new java.awt.Dimension(500, 400));
        Enter.setPreferredSize(new java.awt.Dimension(500, 400));
        Enter.setLayout(null);

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Enter.add(jButton1);
        jButton1.setBounds(120, 180, 120, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/girl.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(550, 380));
        jLabel1.setPreferredSize(new java.awt.Dimension(766, 435));
        Enter.add(jLabel1);
        jLabel1.setBounds(10, 0, 730, 435);

        getContentPane().add(Enter, "card2");

        Menu.setBackground(new java.awt.Color(0, 0, 0));
        Menu.setPreferredSize(new java.awt.Dimension(454, 400));

        BudgetingButton.setBackground(new java.awt.Color(255, 255, 255));
        BudgetingButton.setText("Budgeting");
        BudgetingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BudgetingButtonActionPerformed(evt);
            }
        });

        StatsButton.setBackground(new java.awt.Color(255, 255, 255));
        StatsButton.setText("View Statistics");
        StatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatsButtonActionPerformed(evt);
            }
        });

        ExpensesButton.setBackground(new java.awt.Color(255, 255, 255));
        ExpensesButton.setText("Expenses");

        IncomeButton.setBackground(new java.awt.Color(255, 255, 255));
        IncomeButton.setText("Income");

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Exit");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Menu");

        Overview.setBackground(new java.awt.Color(255, 255, 255));
        Overview.setTitle("Overview");
        Overview.setVisible(true);

        jLabel6.setText("Monthly Budget");

        jLabel7.setText("Current Expenses");

        jTextField1.setEditable(false);

        jLabel11.setText("$");

        jLabel12.setText("$");

        javax.swing.GroupLayout OverviewLayout = new javax.swing.GroupLayout(Overview.getContentPane());
        Overview.getContentPane().setLayout(OverviewLayout);
        OverviewLayout.setHorizontalGroup(
            OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverviewLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OverviewLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(OverviewLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addContainerGap())
        );
        OverviewLayout.setVerticalGroup(
            OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverviewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BudgetingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatsButton)
                    .addComponent(ExpensesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IncomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addComponent(Overview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(BudgetingButton)
                        .addGap(18, 18, 18)
                        .addComponent(StatsButton)
                        .addGap(22, 22, 22)
                        .addComponent(ExpensesButton)
                        .addGap(18, 18, 18)
                        .addComponent(IncomeButton))
                    .addComponent(Overview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        getContentPane().add(Menu, "card3");

        Budgeting.setMinimumSize(new java.awt.Dimension(736, 466));
        Budgeting.setPreferredSize(new java.awt.Dimension(736, 466));
        Budgeting.setLayout(null);

        itemName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemName1ActionPerformed(evt);
            }
        });
        Budgeting.add(itemName1);
        itemName1.setBounds(110, 30, 80, 30);

        jLabel8.setText("Price                    $ ");
        Budgeting.add(jLabel8);
        jLabel8.setBounds(10, 70, 100, 30);
        Budgeting.add(price1);
        price1.setBounds(110, 70, 80, 30);

        jLabel9.setText("Category");
        Budgeting.add(jLabel9);
        jLabel9.setBounds(10, 120, 70, 20);

        jLabel10.setText("Item Name");
        Budgeting.add(jLabel10);
        jLabel10.setBounds(10, 30, 80, 30);

        category1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Food", "Clothing", "Internet", "Home Insurance" }));
        category1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category1ActionPerformed(evt);
            }
        });
        Budgeting.add(category1);
        category1.setBounds(80, 120, 110, 20);

        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });
        Budgeting.add(RemoveButton);
        RemoveButton.setBounds(110, 210, 80, 30);

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        Budgeting.add(UpdateButton);
        UpdateButton.setBounds(110, 260, 80, 30);

        BackButtonBudgeting.setText("Back");
        BackButtonBudgeting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonBudgetingActionPerformed(evt);
            }
        });
        Budgeting.add(BackButtonBudgeting);
        BackButtonBudgeting.setBounds(110, 310, 80, 30);

        CalendarDate.setText("jTextField3");
        Budgeting.add(CalendarDate);
        CalendarDate.setBounds(320, 290, 270, 30);

        AddButton.setText("Add");
        Budgeting.add(AddButton);
        AddButton.setBounds(110, 163, 80, 30);
        Budgeting.add(Calendar);
        Calendar.setBounds(250, 20, 410, 260);

        getContentPane().add(Budgeting, "card4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, "card6");

        ViewStatsPanel.setLayout(null);

        StatisticsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "AmountSpent"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        StatisticsTable.setName("ItemTable"); // NOI18N
        jScrollPane1.setViewportView(StatisticsTable);

        ViewStatsPanel.add(jScrollPane1);
        jScrollPane1.setBounds(60, 70, 360, 150);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        ViewStatsPanel.add(jButton2);
        jButton2.setBounds(210, 300, 55, 23);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("View Spending Statistics");
        ViewStatsPanel.add(jLabel13);
        jLabel13.setBounds(120, 10, 260, 50);

        getContentPane().add(ViewStatsPanel, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonBudgetingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonBudgetingActionPerformed
        // TODO add your handling code here:
Budgeting.setVisible(false);
Menu.setVisible(true);
    }//GEN-LAST:event_BackButtonBudgetingActionPerformed

    private void BudgetingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BudgetingButtonActionPerformed

        // TODO add your handling code here:
        Menu.setVisible(false);
        Budgeting.setVisible(true);
    }//GEN-LAST:event_BudgetingButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Enter.setVisible(false);
        Menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void itemName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemName1ActionPerformed

    private void category1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_category1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Add
        String name = itemName1.getText();
        double price = Double.parseDouble(price1.getText());
        String category = category1.getSelectedItem().toString();
        instance.addTable(name,price,category,"201704");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        String name = itemName1.getText();
        double price = Double.parseDouble(price1.getText());
        String category = category1.getSelectedItem().toString();
        instance.removeTable(name,price,category,"201704");

    }                                        

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        String name = itemName1.getText();
        double price = Double.parseDouble(price1.getText());
        String category = category1.getSelectedItem().toString();
        instance.updateTable(name,price,category,"201704");
    }                                        
                                          

    private void StatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatsButtonActionPerformed
        // TODO add your handling code here:
        Menu.setVisible(false);
        ViewStatsPanel.setVisible(true);
        DefaultTableModel model = (DefaultTableModel)StatisticsTable.getModel();
        model.setRowCount(0);
        
        double Food = instance.getTotalCategoryForMonth("Food","05","2017");
        double clothing= instance.getTotalCategoryForMonth("Clothing","05","2017");
        double internet = instance.getTotalCategoryForMonth("Internet","05","2017");
        double homeIns = instance.getTotalCategoryForMonth("Home Insurance","05","2017");
        
        double Total = Food + clothing + internet + homeIns;
        model.addRow(new Object[]{"Food",(100*Food)/Total});
        model.addRow(new Object[]{"Clothing",(100*clothing)/Total});
        model.addRow(new Object[]{"Internet",(100*internet)/Total});
        model.addRow(new Object[]{"Home Insurance",(100*homeIns)/Total});
        //
    }//GEN-LAST:event_StatsButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menu.setVisible(true);
        ViewStatsPanel.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PlannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlannerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButtonBudgeting;
    private javax.swing.JPanel Budgeting;
    private javax.swing.JButton BudgetingButton;
    private com.toedter.calendar.JCalendar Calendar;
    private javax.swing.JTextField CalendarDate;
    private javax.swing.JPanel Enter;
    private javax.swing.JButton ExpensesButton;
    private javax.swing.JButton IncomeButton;
    private javax.swing.JPanel Menu;
    private javax.swing.JInternalFrame Overview;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JTable StatisticsTable;
    private javax.swing.JButton StatsButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JPanel ViewStatsPanel;
    private javax.swing.JComboBox category1;
    private javax.swing.JTextField itemName1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField price1;
    // End of variables declaration//GEN-END:variables
}
