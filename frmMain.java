/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fileorder1;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;    
import java.io.File;                 
import java.util.Arrays;            
import java.util.Comparator;         
/**
 *
 * @author Dylan Zvavanyange
 */
public class frmMain extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmMain.class.getName());


    public frmMain() {
        initComponents();
    }

    /**
     * This method is called from the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("File Order");

        textField.setText("Folder Path");
        textField.addActionListener(this::textFieldActionPerformed);

        jRadioButton1.setText("Numeric Order");
        jRadioButton1.addActionListener(this::jRadioButton1ActionPerformed);

        jRadioButton2.setText("Alphabetic Order ");
        jRadioButton2.addActionListener(this::jRadioButton2ActionPerformed);

        jButton1.setText("Order");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Clear");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Browse");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Folder Path");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(textField)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Button to Browse for the folder                                        
    JFileChooser chooser = new JFileChooser();
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    chooser.setDialogTitle("Select a folder to organize");
    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
        textField.setText(chooser.getSelectedFile().getAbsolutePath());
        jTextArea1.setText(""); // Clear previous results when new folder is selected
    }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // To display the file path
    }//GEN-LAST:event_textFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // Button to Initilaize the Order button
    
    // Get folder path from textField (NOT txtFolderPath)
    String folderPath = textField.getText().trim();
    
    // Validate folder selection
    if (folderPath.isEmpty() || folderPath.equals("Folder Path")) {
        JOptionPane.showMessageDialog(this, "Please select a folder first using Browse button.", "Error", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Create File object and validate
    File folder = new File(folderPath);
    if (!folder.exists() || !folder.isDirectory()) {
        JOptionPane.showMessageDialog(this, "Invalid folder selected.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Get all files (no search pattern since you don't have txtSearchPattern)
    File[] files = folder.listFiles();
    
    // Check if any files were found
    if (files == null || files.length == 0) {
        jTextArea1.setText("No files found in the selected directory.");
        return;
    }
    
    // Order and display files
    StringBuilder result = new StringBuilder();
    
    if (jRadioButton1.isSelected()) {
        // Numeric order by size (smallest to largest)
        Arrays.sort(files, Comparator.comparingLong(File::length));
        result.append("Files ordered by size (smallest to largest):\n");
        result.append("==========================================\n\n");
        
        for (int i = 0; i < files.length; i++) {
            long size = files[i].length();
            String sizeStr;
            if (size < 1024) {
                sizeStr = size + " bytes";
            } else if (size < 1024 * 1024) {
                sizeStr = String.format("%.2f KB", size / 1024.0);
            } else {
                sizeStr = String.format("%.2f MB", size / (1024.0 * 1024));
            }
            result.append(String.format("%d. %s (%s)\n", i + 1, files[i].getName(), sizeStr));
        }
    } else {
        // Alphabetic order by name
        Arrays.sort(files, Comparator.comparing(File::getName, String.CASE_INSENSITIVE_ORDER));
        result.append("Files ordered alphabetically:\n");
        result.append("=============================\n\n");
        
        for (int i = 0; i < files.length; i++) {
            result.append(String.format("%d. %s\n", i + 1, files[i].getName()));
        }
    }
    
    result.append("\nTotal files: ").append(files.length);
    jTextArea1.setText(result.toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // Radio button for the Numeric option
         if (jRadioButton1.isSelected()){
        jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // Radio button for the Alphabetic option
        if (jRadioButton2.isSelected()){
        jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // Clear all fields
        textField.setText("Folder Path");
        jTextArea1.setText("");
        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new frmMain().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
