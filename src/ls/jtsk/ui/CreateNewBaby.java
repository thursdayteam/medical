/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ls.jtsk.ui;

import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import ls.jtsk.ui.controller.CentralController;

/**
 *
 * @author liushuai
 */
public class CreateNewBaby extends javax.swing.JFrame {
    private long momId;   
    /**
     * Creates new form CreateNewBaby
     */
    public CreateNewBaby(long momId) {
        initComponents();
        geneareteBirthDateInput();
        this.momId = momId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        boySelectButton = new javax.swing.JRadioButton();
        girlSelectButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        startApgarButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        birthMinComBox = new javax.swing.JComboBox();
        birthDateComBox = new javax.swing.JComboBox();
        birthHourComBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("请输入婴儿的出生信息");

        buttonGroup1.add(boySelectButton);
        boySelectButton.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        boySelectButton.setText("男");

        buttonGroup1.add(girlSelectButton);
        girlSelectButton.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        girlSelectButton.setText("女");
        girlSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girlSelectButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel2.setText("性别");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel3.setText("出生日期");

        startApgarButton.setFont(new java.awt.Font("宋体", 0, 20)); // NOI18N
        startApgarButton.setText("添加婴儿信息并Apgar");
        startApgarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startApgarButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("宋体", 0, 20)); // NOI18N
        exitButton.setText("结束并退出");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        birthMinComBox.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        birthMinComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthMinComBoxActionPerformed(evt);
            }
        });

        birthDateComBox.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N

        birthHourComBox.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel4.setText("点");

        jLabel5.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel5.setText("分");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(boySelectButton)
                                .addGap(53, 53, 53)
                                .addComponent(girlSelectButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startApgarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitButton)))
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)
                        .addComponent(birthDateComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(birthHourComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(birthMinComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boySelectButton)
                    .addComponent(girlSelectButton)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(birthMinComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthDateComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthHourComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(startApgarButton))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void girlSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girlSelectButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_girlSelectButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
       if (CentralController.shouldContinueMessageBox("是否要关闭录入婴儿信息窗口", "请确认您准备放弃录入婴儿信息，并关闭本窗口？")){
           this.dispose();
       }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void startApgarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startApgarButtonActionPerformed
    // TODO 怎么获得radio button的值
        if((boySelectButton.isSelected() || girlSelectButton.isSelected())) {
            int babyGender = boySelectButton.isSelected() ? ls.jtsk.model.Gender.BOY : ls.jtsk.model.Gender.GIRL;
            String babyBirthTime = ((String)(birthDateComBox.getSelectedItem())).replace("年","-").replace("月","-").replace("日", " ");
            babyBirthTime = babyBirthTime + birthHourComBox.getSelectedItem() + ":" + birthMinComBox.getSelectedItem();
            this.dispose();
            CentralController.saveBabyAndShowApgarScoreWindow(momId, babyGender, babyBirthTime, this.getTitle());
        }   else {
            CentralController.showCommonMessageBox();
        }
    }//GEN-LAST:event_startApgarButtonActionPerformed

    private void birthMinComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthMinComBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthMinComBoxActionPerformed

    // 组织窗口被所有的子窗口关闭
    @Override  
    protected void processWindowEvent(WindowEvent e) {  
        if (e.getID() == WindowEvent.WINDOW_CLOSING)  {
            if (CentralController.shouldContinueMessageBox("是否要关闭录入婴儿信息窗口", "请确认您准备放弃录入婴儿信心，并关闭本窗口？")){
                this.dispose(); //直接返回，阻止默认动作，阻止窗口关闭  
            }
        } else {
            super.processWindowEvent(e); //该语句会执行窗口事件的默认动作(如：隐藏)  
        }
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
            java.util.logging.Logger.getLogger(CreateNewBaby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNewBaby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNewBaby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewBaby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNewBaby(0).setVisible(true);
//                  new CreateNewBaby(0).geneareteBirthDateInput();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox birthDateComBox;
    private javax.swing.JComboBox birthHourComBox;
    private javax.swing.JComboBox birthMinComBox;
    private javax.swing.JRadioButton boySelectButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton girlSelectButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton startApgarButton;
    // End of variables declaration//GEN-END:variables

    
    // need a function return two bits when input as 0, or 18
    private void geneareteBirthDateInput() {
        Date todayForTime =  new Date();
        String todayString = new SimpleDateFormat("yyyy年MM月dd日").format(new Date());
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date yesterday = cal.getTime();
        String yesterdayString = new SimpleDateFormat("yyyy年MM月dd日").format(yesterday);
        cal.add(Calendar.DATE, 2);
        Date tomorrow = cal.getTime();
        String tomorrowString = new SimpleDateFormat("yyyy年MM月dd日").format(tomorrow);
        
        birthDateComBox.addItem(yesterdayString);
        birthDateComBox.addItem(todayString);
        birthDateComBox.addItem(tomorrowString);
        birthDateComBox.setSelectedIndex(1);

        cal.setTime(todayForTime);
        for (int i=0; i<24; i++) {
            birthHourComBox.addItem(giveMeTwoBytes(i));
        }
        
        birthHourComBox.setSelectedIndex(cal.get(Calendar.HOUR_OF_DAY));
        
        for (int i=0; i<60; i++) {
            birthMinComBox.addItem(giveMeTwoBytes(i));
        }
        birthMinComBox.setSelectedIndex(cal.get(Calendar.MINUTE));
    }
    
    
    private String giveMeTwoBytes(int num) {
        String a = "0" + num;
        return a.substring(a.length()-2, a.length());
    }
}
