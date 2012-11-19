/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ls.jtsk.ui;
import java.awt.event.WindowEvent;
import ls.jtsk.helper.CasesHelper;
import ls.jtsk.ui.controller.CentralController;
/**
 *
 * @author liushuai
 */
public class CreateNewCase extends javax.swing.JFrame {
    CaseHistory caseHistoryForUpdate = null;
    // TODO createNewCaseʱ����Ҫ�ж��Ƿ����ظ��Ĳ����š�
    public void setChForUpdate(CaseHistory caseHistory) {
        caseHistoryForUpdate = caseHistory;
    }
    
    /**
     * Creates new form CaseHistoryModifyFrame
     */
    public CreateNewCase() {
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

        doctorNameLabel = new javax.swing.JLabel();
        medicalNoLabel = new javax.swing.JLabel();
        gravidaAgeLabel = new javax.swing.JLabel();
        apgarButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        gravidaNameLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        medicalNoInput = new javax.swing.JTextField();
        doctorInput = new javax.swing.JTextField();
        gravidaInput = new javax.swing.JTextField();
        ageInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("�½�����");
        setResizable(false);

        doctorNameLabel.setText("������������");

        medicalNoLabel.setText("������סԺ��");

        gravidaAgeLabel.setText("�������������");

        apgarButton.setText("���沢APGAR");
        apgarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apgarButtonActionPerformed(evt);
            }
        });

        saveButton.setText("���沢�˳�");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        gravidaNameLabel.setText("�������������");

        cancelButton.setText("ȡ�����˳�");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        medicalNoInput.setText("2012");
        medicalNoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalNoInputActionPerformed(evt);
            }
        });

        doctorInput.setText("�����");

        gravidaInput.setText("����");

        ageInput.setText("30");

        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("(����������)");

        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("(����������)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medicalNoLabel)
                            .addComponent(gravidaNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(medicalNoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(gravidaInput)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addGap(142, 142, 142)
                        .addComponent(apgarButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gravidaAgeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(doctorNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doctorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicalNoLabel)
                    .addComponent(doctorNameLabel)
                    .addComponent(medicalNoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gravidaNameLabel)
                    .addComponent(gravidaAgeLabel)
                    .addComponent(gravidaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(apgarButton)
                    .addComponent(cancelButton))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean validInput() {
        String medicalNoValue = medicalNoInput.getText();
        String ageValue = ageInput.getText();
        
        if (medicalNoValue != null && medicalNoValue.trim().length() > 0 && ageValue != null && ageValue.trim().length() > 0 
                && doctorInput.getText() != null && doctorInput.getText().trim().length() > 0
                && gravidaInput.getText() != null && gravidaInput.getText().trim().length() > 0 ) {
            try {
                Integer.parseInt(medicalNoValue);
                Integer.parseInt(ageValue);
                return true;
            }
            catch (Exception e) {
                return false;
            }
        
        }
        return false;
    }
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (! validInput()) {
            CentralController.showCommonMessageBox();    
            return;
        }
        this.dispose();
        CentralController.saveCaseAndExit(medicalNoInput.getText(), doctorInput.getText(), gravidaInput.getText(), ageInput.getText());
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        if (CentralController.shouldContinueMessageBox("�Ƿ�Ҫ�ر�", "��ȷ����ȡ������������¼�������Ϣ�����رձ����ڣ�")){
            this.dispose();
        }
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    private void apgarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apgarButtonActionPerformed
        if (! validInput()) {
            CentralController.showCommonMessageBox();    
            return;
        }
        this.dispose();
        CentralController.saveCaseAndShowBabyInputWindow(medicalNoInput.getText(), doctorInput.getText(), gravidaInput.getText(), ageInput.getText());
        
    }//GEN-LAST:event_apgarButtonActionPerformed

    private void medicalNoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalNoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicalNoInputActionPerformed

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
            java.util.logging.Logger.getLogger(CreateNewCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNewCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNewCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNewCase().setVisible(true);
            }
        });
    }
    
    @Override  
    protected void processWindowEvent(WindowEvent e) {  
        if (e.getID() == WindowEvent.WINDOW_CLOSING)  {
            if (CentralController.shouldContinueMessageBox("�Ƿ�Ҫ�ر�", "��ȷ����ȡ������������¼�������Ϣ�����رձ����ڣ�")){
                this.dispose(); //ֱ�ӷ��أ���ֹĬ�϶�������ֹ���ڹر�  
            }
         }  else {
            super.processWindowEvent(e); //������ִ�д����¼���Ĭ�϶���(�磺����)  
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageInput;
    private javax.swing.JButton apgarButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField doctorInput;
    private javax.swing.JLabel doctorNameLabel;
    private javax.swing.JLabel gravidaAgeLabel;
    private javax.swing.JTextField gravidaInput;
    private javax.swing.JLabel gravidaNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField medicalNoInput;
    private javax.swing.JLabel medicalNoLabel;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}