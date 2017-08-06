/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator_package;

/**
 *
 * @author caseygraig
 */
public class Calculator extends javax.swing.JFrame {

    double numb, answer;
    int calculation;
    
    public Calculator() {
        initComponents();
    }

    public void arithmetic_Operations() {
        
        switch(calculation){
            //in each case, the variable 'numb' is added to the 
            //string held within the output
            //having done a calculator in JS, this is very similar
           //except the switch statement, which I find very neat
            //addition
            
            case 1: 
                answer = numb + Double.parseDouble(output.getText());
                output.setText(Double.toString(answer));
                    break;
            //subtration        
            case 2: 
                answer = numb - Double.parseDouble(output.getText());
                output.setText(Double.toString(answer));
                    break; 
            //multiply       
            case 3: 
                answer = numb * Double.parseDouble(output.getText());
                output.setText(Double.toString(answer));
                    break; 
            //division        
            case 4: 
                answer = numb / Double.parseDouble(output.getText());
                output.setText(Double.toString(answer));
                    break; 
        }   
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        output = new javax.swing.JTextField();
        bk_space = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_subtract = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_multiplay = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_equals = new javax.swing.JButton();
        btn_decimal = new javax.swing.JButton();
        label = new javax.swing.JLabel();

        jButton9.setText("jButton1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton24.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        output.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        output.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        output.setToolTipText("");
        output.setName("txt_field"); // NOI18N

        bk_space.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        bk_space.setText("Backspace");
        bk_space.setName("bk_space"); // NOI18N
        bk_space.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bk_spaceActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        clear.setText("C");
        clear.setName("clear"); // NOI18N
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_add.setText("+");
        btn_add.setName("btn_add"); // NOI18N
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_7.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_7.setText("7");
        btn_7.setName("btn_7"); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_9.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_9.setText("9");
        btn_9.setName("btn_9"); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_subtract.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_subtract.setText("-");
        btn_subtract.setName("btn_subtract"); // NOI18N
        btn_subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subtractActionPerformed(evt);
            }
        });

        btn_8.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_8.setText("8");
        btn_8.setName("btn_8"); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_4.setText("4");
        btn_4.setName("btn_4"); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_6.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_6.setText("6");
        btn_6.setName("btn_6"); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_multiplay.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_multiplay.setText("*");
        btn_multiplay.setName("btn_multiplay"); // NOI18N
        btn_multiplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplayActionPerformed(evt);
            }
        });

        btn_5.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_5.setText("5");
        btn_5.setName("btn_5"); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_1.setText("1");
        btn_1.setName("btn_1"); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_3.setText("3");
        btn_3.setName("btn_3"); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        divide.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        divide.setText("/");
        divide.setName("divide"); // NOI18N
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        btn_2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_2.setText("2");
        btn_2.setName("btn_2"); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_0.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_0.setText("0");
        btn_0.setName("btn_0"); // NOI18N

        btn_equals.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_equals.setText("=");
        btn_equals.setName("equate"); // NOI18N
        btn_equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalsActionPerformed(evt);
            }
        });

        btn_decimal.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_decimal.setText(".");
        btn_decimal.setName("decimal"); // NOI18N
        btn_decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_decimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(output)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_multiplay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bk_space, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bk_space, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multiplay, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       output.setText("");
    }//GEN-LAST:event_clearActionPerformed
    //I really don't why this listener is here for jButton9...
    //I don't even have a jButton 9!
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        output.setText(output.getText() + "9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        output.setText(output.getText() + "8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        output.setText(output.getText() + "6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        output.setText(output.getText() + "5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        output.setText(output.getText() + "3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        output.setText(output.getText() + "2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalsActionPerformed
        arithmetic_Operations();
        label.setText("");        
    }//GEN-LAST:event_btn_equalsActionPerformed

    private void btn_decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_decimalActionPerformed
        output.setText(output.getText() + ".");
    }//GEN-LAST:event_btn_decimalActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        output.setText(output.getText() + "7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void bk_spaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bk_spaceActionPerformed
        int length = output.getText().length();
        int number = output.getText().length()-1;
        String store;
        
        
        if(length>0){
            StringBuilder back = new StringBuilder(output.getText());
            back.deleteCharAt(number);
            store=back.toString();
            output.setText(store);
        }
    }//GEN-LAST:event_bk_spaceActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
     output.setText(output.getText() + "1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
       output.setText(output.getText() + "4");
    }//GEN-LAST:event_btn_4ActionPerformed
//Below are the operator listeners
//notice the similar logic to constructing in JS    
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       numb = Double.parseDouble(output.getText());
       calculation=1;
       output.setText("");
       label.setText(numb + "+");
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subtractActionPerformed
        numb = Double.parseDouble(output.getText());
        calculation=2;
        output.setText("");
        label.setText(numb + "-");
    }//GEN-LAST:event_btn_subtractActionPerformed

    private void btn_multiplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplayActionPerformed
        numb = Double.parseDouble(output.getText());
        calculation=3;
        output.setText("");
        label.setText(numb + "*");
    }//GEN-LAST:event_btn_multiplayActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        numb = Double.parseDouble(output.getText());
        calculation=4;
        output.setText("");
        label.setText(numb + "/");
    }//GEN-LAST:event_divideActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bk_space;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_decimal;
    private javax.swing.JButton btn_equals;
    private javax.swing.JButton btn_multiplay;
    private javax.swing.JButton btn_subtract;
    private javax.swing.JButton clear;
    private javax.swing.JButton divide;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel label;
    private javax.swing.JTextField output;
    // End of variables declaration//GEN-END:variables
}
