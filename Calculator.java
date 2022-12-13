/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mycalculator;

public class Calculator extends javax.swing.JFrame {
    
    double num1, num2, result;
    String operation, answer; 
    
    /**
     * Creates new form Calculator
     */
    
    public Calculator() {
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

        textField = new javax.swing.JTextField();
        btnPow = new javax.swing.JButton();
        btnAc = new javax.swing.JButton();
        btnCub = new javax.swing.JButton();
        btnSqu = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnPm = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnEq = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULATOR");
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(435, 150));
        setPreferredSize(new java.awt.Dimension(440, 400));
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textField.setBackground(new java.awt.Color(0, 0, 0));
        textField.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        textField.setForeground(new java.awt.Color(255, 255, 255));
        textField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textField.setCaretColor(new java.awt.Color(153, 153, 153));
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });
        getContentPane().add(textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 390, 60));

        btnPow.setBackground(new java.awt.Color(51, 51, 51));
        btnPow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPow.setForeground(new java.awt.Color(255, 255, 255));
        btnPow.setText("x^y");
        btnPow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowActionPerformed(evt);
            }
        });
        getContentPane().add(btnPow, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 71, 40));

        btnAc.setBackground(new java.awt.Color(51, 51, 51));
        btnAc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAc.setForeground(new java.awt.Color(255, 255, 255));
        btnAc.setText("AC");
        btnAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcActionPerformed(evt);
            }
        });
        getContentPane().add(btnAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 71, 40));

        btnCub.setBackground(new java.awt.Color(51, 51, 51));
        btnCub.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCub.setForeground(new java.awt.Color(255, 255, 255));
        btnCub.setText("x^3");
        btnCub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCubActionPerformed(evt);
            }
        });
        getContentPane().add(btnCub, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 71, 40));

        btnSqu.setBackground(new java.awt.Color(51, 51, 51));
        btnSqu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSqu.setForeground(new java.awt.Color(255, 255, 255));
        btnSqu.setText("x^2");
        btnSqu.setActionCommand("x2");
        btnSqu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquActionPerformed(evt);
            }
        });
        getContentPane().add(btnSqu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 71, 40));

        btnDel.setBackground(new java.awt.Color(51, 51, 51));
        btnDel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setText("DEL");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        getContentPane().add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 71, 40));

        btn9.setBackground(new java.awt.Color(51, 51, 51));
        btn9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setLabel("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 71, 40));

        btnSqrt.setBackground(new java.awt.Color(51, 51, 51));
        btnSqrt.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnSqrt.setForeground(new java.awt.Color(255, 255, 255));
        btnSqrt.setText("√");
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });
        getContentPane().add(btnSqrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 71, 40));

        btn8.setBackground(new java.awt.Color(51, 51, 51));
        btn8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 71, 40));

        btn7.setBackground(new java.awt.Color(51, 51, 51));
        btn7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 71, 40));

        btnAdd.setBackground(new java.awt.Color(51, 51, 51));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 71, 40));

        btn6.setBackground(new java.awt.Color(51, 51, 51));
        btn6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 71, 40));

        btnLog.setBackground(new java.awt.Color(51, 51, 51));
        btnLog.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLog.setForeground(new java.awt.Color(255, 255, 255));
        btnLog.setText("log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        getContentPane().add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 71, 40));

        btn5.setBackground(new java.awt.Color(51, 51, 51));
        btn5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 71, 40));

        btn4.setBackground(new java.awt.Color(51, 51, 51));
        btn4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 71, 40));

        btnSub.setBackground(new java.awt.Color(51, 51, 51));
        btnSub.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnSub.setForeground(new java.awt.Color(255, 255, 255));
        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        getContentPane().add(btnSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 71, 40));

        btn3.setBackground(new java.awt.Color(51, 51, 51));
        btn3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 71, 40));

        btnPm.setBackground(new java.awt.Color(51, 51, 51));
        btnPm.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnPm.setForeground(new java.awt.Color(255, 255, 255));
        btnPm.setText("±");
        btnPm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPmActionPerformed(evt);
            }
        });
        getContentPane().add(btnPm, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 71, 40));

        btn2.setBackground(new java.awt.Color(51, 51, 51));
        btn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 71, 40));

        btn1.setBackground(new java.awt.Color(51, 51, 51));
        btn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 71, 40));

        btnMul.setBackground(new java.awt.Color(51, 51, 51));
        btnMul.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnMul.setForeground(new java.awt.Color(255, 255, 255));
        btnMul.setText("×");
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });
        getContentPane().add(btnMul, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 71, 40));

        btnEq.setBackground(new java.awt.Color(51, 51, 51));
        btnEq.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEq.setForeground(new java.awt.Color(255, 255, 255));
        btnEq.setText("=");
        btnEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqActionPerformed(evt);
            }
        });
        getContentPane().add(btnEq, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 71, 40));

        btnMod.setBackground(new java.awt.Color(51, 51, 51));
        btnMod.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnMod.setForeground(new java.awt.Color(255, 255, 255));
        btnMod.setText("%");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });
        getContentPane().add(btnMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 71, 40));

        btn0.setBackground(new java.awt.Color(51, 51, 51));
        btn0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 71, 40));

        btnDot.setBackground(new java.awt.Color(51, 51, 51));
        btnDot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDot.setForeground(new java.awt.Color(255, 255, 255));
        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });
        getContentPane().add(btnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 71, 40));

        btnDiv.setBackground(new java.awt.Color(51, 51, 51));
        btnDiv.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnDiv.setForeground(new java.awt.Color(255, 255, 255));
        btnDiv.setText("÷");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 71, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowActionPerformed
        num1= Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "^";
    }//GEN-LAST:event_btnPowActionPerformed

    private void btnCubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCubActionPerformed
        num1= Double.parseDouble(textField.getText());
        result= num1* num1* num1;
        answer= String.valueOf(result);
        textField.setText(answer);
    }//GEN-LAST:event_btnCubActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        textField.setText(textField.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        textField.setText(textField.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        textField.setText(textField.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        textField.setText(textField.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        textField.setText(textField.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        textField.setText(textField.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        textField.setText(textField.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqActionPerformed
        String answer;
        num2= Double.parseDouble(textField.getText());
        
        if(operation == "+")
        {
            result= num1+ num2;
            answer= String.valueOf(result);
            textField.setText(answer);
        }
        else if(operation == "-")
        {
            result= num1- num2;
            answer= String.valueOf(result);
            textField.setText(answer);
        }
        else if(operation == "x")
        {
            result= num1* num2;
            answer= String.valueOf(result);
            textField.setText(answer);
        }
        else if(operation == "/")
        {
            result= num1/ num2;
            answer= String.valueOf(result);
            textField.setText(answer);
        }
        else if(operation == "%")
        {
            result= num1% num2;
            answer= String.valueOf(result);
            textField.setText(answer);
        }
        else if(operation == "^")
        {
            double n= 1;
            int i= 0;
            while(i<num2)
            {
                n=num1* n;
                i++;
            }
            answer= String.valueOf(result);
            textField.setText(answer);
        }
    }//GEN-LAST:event_btnEqActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        textField.setText(textField.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        num1= Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "-";
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        num1= Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "/";
    }//GEN-LAST:event_btnDivActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        textField.setText(textField.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        if(!textField.getText().contains("."))
        {
            textField.setText(textField.getText() + btnDot.getText());
        }
    }//GEN-LAST:event_btnDotActionPerformed

    private void btnPmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPmActionPerformed
        num1= Double.parseDouble(textField.getText());
        result= num1* (-1);
        answer= String.valueOf(result);
        textField.setText(answer);
    }//GEN-LAST:event_btnPmActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        num1= Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "%";
    }//GEN-LAST:event_btnModActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        num1= Double.parseDouble(textField.getText());
        result= Math.log10(num1);
        answer= String.valueOf(result);
        textField.setText(answer);
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
        num1= Double.parseDouble(textField.getText());
        result= Math.sqrt(num1);
        answer= String.valueOf(result);
        textField.setText(answer);
    }//GEN-LAST:event_btnSqrtActionPerformed

    private void btnAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcActionPerformed
        textField.setText("");
    }//GEN-LAST:event_btnAcActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        
        int length = textField.getText().length(); 
        String store;
        
        if(length>0)
        {
            StringBuilder back= new StringBuilder(textField.getText());
            back.deleteCharAt(length -1);
            store= back.toString();
            textField.setText(store);
        }
        
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnSquActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquActionPerformed
        num1= Double.parseDouble(textField.getText());
        result= num1* num1;
        answer= String.valueOf(result);
        textField.setText(answer);
    }//GEN-LAST:event_btnSquActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        textField.setText(textField.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        num1= Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "+";
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        num1= Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "x";
    }//GEN-LAST:event_btnMulActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

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
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAc;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCub;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEq;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnPm;
    private javax.swing.JButton btnPow;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnSqu;
    private javax.swing.JButton btnSub;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}