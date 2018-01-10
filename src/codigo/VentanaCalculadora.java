/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Carlos Abia 
 */
public class VentanaCalculadora extends javax.swing.JFrame {
    
    String numero1;
    String operacion;
    /**
     * Creates new form VentanaCalculadora
     */
    public VentanaCalculadora() {
        initComponents();
    }
    
    /*
    método que pinta el número en la pantalla cuando lo pulsamos
    */
    private void pintaNumero(String numero){
        String cadena1 = jLabel1.getText();
        if(cadena1.equals("0")){//estoy en el caso inicial de la calculadora con un cero en el display
            jLabel1.setText(numero);
        }else {
        jLabel1.setText(cadena1 + numero);
        }
    }
    
    /*
    
    */
    private void realizaOperacion(){
        numero1 = jLabel1.getText();
        jLabel2.setText(numero1 + operacion);
        jLabel1.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boton0 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonMenos = new javax.swing.JButton();
        botonPor = new javax.swing.JButton();
        botonDiv = new javax.swing.JButton();
        botonMas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonC = new javax.swing.JButton();
        botonCE = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("0");
        jLabel1.setOpaque(true);

        boton0.setBackground(new java.awt.Color(255, 102, 0));
        boton0.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        boton0.setForeground(new java.awt.Color(255, 255, 255));
        boton0.setText("0");
        boton0.setToolTipText("");

        boton1.setBackground(new java.awt.Color(255, 102, 0));
        boton1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setText("1");
        boton1.setToolTipText("");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(255, 102, 0));
        boton2.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        boton2.setForeground(new java.awt.Color(255, 255, 255));
        boton2.setText("2");
        boton2.setToolTipText("");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.setBackground(new java.awt.Color(255, 102, 0));
        boton3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        boton3.setForeground(new java.awt.Color(255, 255, 255));
        boton3.setText("3");
        boton3.setToolTipText("");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton4.setBackground(new java.awt.Color(255, 102, 0));
        boton4.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        boton4.setForeground(new java.awt.Color(255, 255, 255));
        boton4.setText("4");
        boton4.setToolTipText("");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.setBackground(new java.awt.Color(255, 102, 0));
        boton5.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        boton5.setForeground(new java.awt.Color(255, 255, 255));
        boton5.setText("5");
        boton5.setToolTipText("");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton6.setBackground(new java.awt.Color(255, 102, 0));
        boton6.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        boton6.setForeground(new java.awt.Color(255, 255, 255));
        boton6.setText("6");
        boton6.setToolTipText("");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton7.setBackground(new java.awt.Color(255, 102, 0));
        boton7.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        boton7.setForeground(new java.awt.Color(255, 255, 255));
        boton7.setText("7");
        boton7.setToolTipText("");
        boton7.setMaximumSize(new java.awt.Dimension(53, 59));
        boton7.setMinimumSize(new java.awt.Dimension(53, 59));
        boton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton7MousePressed(evt);
            }
        });

        boton8.setBackground(new java.awt.Color(255, 102, 0));
        boton8.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        boton8.setForeground(new java.awt.Color(255, 255, 255));
        boton8.setText("8");
        boton8.setToolTipText("");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        botonIgual.setBackground(new java.awt.Color(255, 255, 255));
        botonIgual.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        botonIgual.setForeground(new java.awt.Color(255, 102, 0));
        botonIgual.setText("=");
        botonIgual.setToolTipText("");
        botonIgual.setMaximumSize(new java.awt.Dimension(59, 59));
        botonIgual.setMinimumSize(new java.awt.Dimension(59, 59));
        botonIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonIgualMousePressed(evt);
            }
        });

        boton9.setBackground(new java.awt.Color(255, 102, 0));
        boton9.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        boton9.setForeground(new java.awt.Color(255, 255, 255));
        boton9.setText("9");
        boton9.setToolTipText("");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        botonMenos.setBackground(new java.awt.Color(255, 102, 0));
        botonMenos.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        botonMenos.setForeground(new java.awt.Color(255, 255, 255));
        botonMenos.setText("-");
        botonMenos.setToolTipText("");
        botonMenos.setMaximumSize(new java.awt.Dimension(51, 59));
        botonMenos.setMinimumSize(new java.awt.Dimension(51, 59));
        botonMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMenosMousePressed(evt);
            }
        });

        botonPor.setBackground(new java.awt.Color(255, 102, 0));
        botonPor.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        botonPor.setForeground(new java.awt.Color(255, 255, 255));
        botonPor.setText("*");
        botonPor.setToolTipText("");
        botonPor.setMaximumSize(new java.awt.Dimension(47, 59));
        botonPor.setMinimumSize(new java.awt.Dimension(47, 59));
        botonPor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPorMousePressed(evt);
            }
        });

        botonDiv.setBackground(new java.awt.Color(255, 102, 0));
        botonDiv.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        botonDiv.setForeground(new java.awt.Color(255, 255, 255));
        botonDiv.setText("/");
        botonDiv.setToolTipText("");
        botonDiv.setMaximumSize(new java.awt.Dimension(49, 59));
        botonDiv.setMinimumSize(new java.awt.Dimension(49, 59));
        botonDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonDivMousePressed(evt);
            }
        });

        botonMas.setBackground(new java.awt.Color(255, 102, 0));
        botonMas.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        botonMas.setForeground(new java.awt.Color(255, 255, 255));
        botonMas.setText("+");
        botonMas.setToolTipText("");
        botonMas.setMaximumSize(new java.awt.Dimension(59, 59));
        botonMas.setMinimumSize(new java.awt.Dimension(59, 59));
        botonMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMasMousePressed(evt);
            }
        });
        botonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("0");

        botonC.setBackground(new java.awt.Color(255, 255, 255));
        botonC.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        botonC.setForeground(new java.awt.Color(255, 102, 0));
        botonC.setText("C");
        botonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCMousePressed(evt);
            }
        });

        botonCE.setBackground(new java.awt.Color(255, 255, 255));
        botonCE.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        botonCE.setForeground(new java.awt.Color(255, 102, 0));
        botonCE.setText("CE");
        botonCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCEMousePressed(evt);
            }
        });

        botonPunto.setBackground(new java.awt.Color(255, 102, 0));
        botonPunto.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        botonPunto.setForeground(new java.awt.Color(255, 255, 255));
        botonPunto.setText(".");
        botonPunto.setToolTipText("");
        botonPunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPuntoMousePressed(evt);
            }
        });

        botonDelete.setBackground(new java.awt.Color(255, 255, 255));
        botonDelete.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        botonDelete.setForeground(new java.awt.Color(255, 102, 0));
        botonDelete.setText("⇐");
        botonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonDeleteMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton0, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(boton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boton2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(botonPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonPor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCE, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botonCE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton9)
                            .addComponent(boton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton4)
                            .addComponent(boton6)
                            .addComponent(boton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton1)
                            .addComponent(boton3)
                            .addComponent(boton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton0))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonPunto))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        pintaNumero("8");
    }//GEN-LAST:event_boton8ActionPerformed

    private void botonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasActionPerformed
        //esta es la suma
    }//GEN-LAST:event_botonMasActionPerformed

    private void boton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton7MousePressed
        pintaNumero("7");
    }//GEN-LAST:event_boton7MousePressed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        pintaNumero("9");
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        pintaNumero("4");
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        pintaNumero("5");
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        pintaNumero("6");
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        pintaNumero("1");
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        pintaNumero("2");
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        pintaNumero("3");
    }//GEN-LAST:event_boton3ActionPerformed

    private void botonMasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMasMousePressed
        operacion = "+";
        realizaOperacion();
    }//GEN-LAST:event_botonMasMousePressed

    private void botonMenosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenosMousePressed
        operacion = "-";
        realizaOperacion();
    }//GEN-LAST:event_botonMenosMousePressed

    private void botonPorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPorMousePressed
        operacion = "*";
        realizaOperacion();
    }//GEN-LAST:event_botonPorMousePressed

    private void botonDivMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDivMousePressed
        operacion = "/";
        realizaOperacion();
    }//GEN-LAST:event_botonDivMousePressed

    private void botonIgualMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIgualMousePressed
        String numero2 = jLabel1.getText();
        
        double operando2 = Double.valueOf(numero2);
        double operando1 = Double.valueOf(numero1);
        
        
        if(operacion.equals("+")){
            operando1 += operando2;
        }
        
        if(operacion.equals("-")){
            operando1 -= operando2;
        }
        
        if(operacion.equals("*")){
            operando1 *= operando2;
        }
        
        if(operacion.equals("/")){
            operando1 /= operando2;
        }
        
        jLabel2.setText(String.valueOf(operando1));
        jLabel1.setText("0");
    }//GEN-LAST:event_botonIgualMousePressed

    private void botonCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCMousePressed
        jLabel1.setText("0");
    }//GEN-LAST:event_botonCMousePressed

    private void botonPuntoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPuntoMousePressed
        String opExistente = jLabel1.getText();
        if(opExistente.contains(".")){
        jLabel1.setText(opExistente);
        }else{
            jLabel1.setText(opExistente + ".");
        }
    }//GEN-LAST:event_botonPuntoMousePressed

    private void botonCEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCEMousePressed
        jLabel1.setText("0");
        jLabel2.setText("0");
    }//GEN-LAST:event_botonCEMousePressed

    private void botonDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDeleteMousePressed
        String str = jLabel1.getText();
        
        jLabel1.setText(str.substring(0, str.length() - 1));
    }//GEN-LAST:event_botonDeleteMousePressed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonCE;
    private javax.swing.JButton botonDelete;
    private javax.swing.JButton botonDiv;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMas;
    private javax.swing.JButton botonMenos;
    private javax.swing.JButton botonPor;
    private javax.swing.JButton botonPunto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
