/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import java.awt.event.*;
import java.awt.*;



/**
 *
 * @author Jan
 */



public class questionsUI extends javax.swing.JFrame {

    //Method to close jframe
    public void close(){
       WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
       Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    /**
     * Creates new form questionsUI
     */
    public questionsUI() {
        initComponents();        
    }
    // declaration of variables used
    ArrayList<question> questions;
    ArrayList<qualityAttribute> qualityAttributes;
    initialize initializer = new initialize();
    Integer question;
    Integer qCount;
    Integer qaCount;
    String outcomeString;
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        answerButtonGroup = new javax.swing.ButtonGroup();
        yesRadioButton = new javax.swing.JRadioButton();
        noRadioButton = new javax.swing.JRadioButton();
        dontknowRadioButton = new javax.swing.JRadioButton();
        previousButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        resultButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        outcomeScrollPane = new javax.swing.JScrollPane();
        outcomeTextArea = new javax.swing.JTextArea();
        questionScrollPane = new javax.swing.JScrollPane();
        questionTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        answerButtonGroup.add(yesRadioButton);
        yesRadioButton.setText("Ja");
        yesRadioButton.setEnabled(false);
        yesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesRadioButtonActionPerformed(evt);
            }
        });

        answerButtonGroup.add(noRadioButton);
        noRadioButton.setText("Nee");
        noRadioButton.setEnabled(false);
        noRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noRadioButtonActionPerformed(evt);
            }
        });

        answerButtonGroup.add(dontknowRadioButton);
        dontknowRadioButton.setText("Weet niet");
        dontknowRadioButton.setEnabled(false);
        dontknowRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dontknowRadioButtonActionPerformed(evt);
            }
        });

        previousButton.setText("Vorige");
        previousButton.setEnabled(false);
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Volgende");
        nextButton.setEnabled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        resultButton.setText("Resultaat");
        resultButton.setEnabled(false);
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
            }
        });

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        outcomeTextArea.setEditable(false);
        outcomeTextArea.setColumns(20);
        outcomeTextArea.setRows(5);
        outcomeScrollPane.setViewportView(outcomeTextArea);

        questionTextArea.setEditable(false);
        questionTextArea.setColumns(20);
        questionTextArea.setLineWrap(true);
        questionTextArea.setRows(5);
        questionTextArea.setText("Deze vragenlijst helpt bij het opstellen van een teststrategie voor een (nieuw) project.\n\nKlik 'Start' om te beginnen.");
        questionTextArea.setWrapStyleWord(true);
        questionScrollPane.setViewportView(questionTextArea);

        jButton1.setText("Main");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yesRadioButton)
                    .addComponent(noRadioButton)
                    .addComponent(dontknowRadioButton)
                    .addComponent(questionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(previousButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(nextButton)
                        .addGap(18, 18, 18)
                        .addComponent(resultButton)))
                .addGap(18, 18, 18)
                .addComponent(outcomeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outcomeScrollPane)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(questionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yesRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(noRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(dontknowRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(startButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(previousButton)
                            .addComponent(nextButton)
                            .addComponent(resultButton))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(43, 43, 43))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // creating new questions and qualityattributes objects
        questions = new ArrayList<>();
        qualityAttributes = new ArrayList<>();
        // loading the questions
        try {
            initializer.initializeQuestions(questions);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(questionsUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        // loading the quality attributes
        try {
            initializer.initializequalityAttributes(qualityAttributes);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(questionsUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        // initializing or resetting all needed variables
        question = 0;
        questionTextArea.setText(questions.get(question).Question);
        switch (questions.get(question).Answer) {
            case -1: dontknowRadioButton.setSelected(true);
                     break;
            case 0:  noRadioButton.setSelected(true);
                     break;
            case 1:  yesRadioButton.setSelected(true);
                     break;
            default: dontknowRadioButton.setSelected(true);
                     break;
        }
        outcomeTextArea.setText("");
        noRadioButton.setEnabled(true);
        yesRadioButton.setEnabled(true);
        dontknowRadioButton.setEnabled(true);
        previousButton.setEnabled(true);
        nextButton.setEnabled(true);
        resultButton.setEnabled(true);
        
    }//GEN-LAST:event_startButtonActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        if (question > 0) {
            question--;
        }
        else {
            question = 0;
        }
        
        questionTextArea.setText(questions.get(question).Question);
        switch (questions.get(question).Answer) {
            case -1: dontknowRadioButton.setSelected(true);
                     break;
            case 0:  noRadioButton.setSelected(true);
                     break;
            case 1:  yesRadioButton.setSelected(true);
                     break;
            default: dontknowRadioButton.setSelected(true);
                     break;
        }
    }//GEN-LAST:event_previousButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (question >= (questions.size()-1)) {
            question = questions.size()-1;
        }
        
        else {
            question++;
        }
        
        questionTextArea.setText(questions.get(question).Question);
        switch (questions.get(question).Answer) {
            case -1: dontknowRadioButton.setSelected(true);
                     break;
            case 0:  noRadioButton.setSelected(true);
                     break;
            case 1:  yesRadioButton.setSelected(true);
                     break;
            default: dontknowRadioButton.setSelected(true);
                     break;
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void resultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButtonActionPerformed
        /*
         * many actions performed here should probably be put into methods
         * of a new class...
         * i'll look into this later
        */
        
        // calculate the results
        for (qCount = 0; qCount < questions.size(); qCount++) {
            for (qaCount = 0; qaCount < questions.get(qCount).affectedQualityAttributes.size(); qaCount++) {
                if (questions.get(qCount).Answer == -1) {
                    qualityAttributes.get(questions.get(qCount).affectedQualityAttributes.get(qaCount)).qaNoDontKnow += 1;
                } else {
                    qualityAttributes.get(questions.get(qCount).affectedQualityAttributes.get(qaCount)).qaScore += questions.get(qCount).Answer;
                }
            }
        }
        
        // show the results in the outcomeTextArea
        for (qaCount = 0; qaCount < qualityAttributes.size(); qaCount++) {
            outcomeTextArea.append(qualityAttributes.get(qaCount).qaName + "\n");
            if (qualityAttributes.get(qaCount).qaNoDontKnow > 8) {
                outcomeString = "Niet genoeg informatie, meer onderzoek nodig\n";
            }
            else {
                 if (qualityAttributes.get(qaCount).qaScore <= 4) {
                     outcomeString = "Dit kwaliteitsattribuut heeft minimale aandacht nodig\n";
                 }
                 else if (qualityAttributes.get(qaCount).qaScore > 7) {
                     outcomeString = "Dit kwaliteitsattribuut heeft maximale aandacht nodig\n";
                 }
                 else {
                     outcomeString = "Dit kwaliteitsattribuut heeft gemiddelde aandacht nodig\n";
                 }
            }
            outcomeTextArea.append(outcomeString);
        }
        
    }//GEN-LAST:event_resultButtonActionPerformed

    private void yesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesRadioButtonActionPerformed
        questions.get(question).Answer = 1;
    }//GEN-LAST:event_yesRadioButtonActionPerformed

    private void noRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRadioButtonActionPerformed
        questions.get(question).Answer = 0;
    }//GEN-LAST:event_noRadioButtonActionPerformed

    private void dontknowRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dontknowRadioButtonActionPerformed
        questions.get(question).Answer = -1;
    }//GEN-LAST:event_dontknowRadioButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Main gui = new Main();
               gui.setVisible(true);
     TestTickle gui2 = new TestTickle();
               close();
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(questionsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(questionsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(questionsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(questionsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new questionsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup answerButtonGroup;
    private javax.swing.JRadioButton dontknowRadioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton nextButton;
    private javax.swing.JRadioButton noRadioButton;
    private javax.swing.JScrollPane outcomeScrollPane;
    private javax.swing.JTextArea outcomeTextArea;
    private javax.swing.JButton previousButton;
    private javax.swing.JScrollPane questionScrollPane;
    private javax.swing.JTextArea questionTextArea;
    private javax.swing.JButton resultButton;
    private javax.swing.JButton startButton;
    private javax.swing.JRadioButton yesRadioButton;
    // End of variables declaration//GEN-END:variables
    
    
     
    


}