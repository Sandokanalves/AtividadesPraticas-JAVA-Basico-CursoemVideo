/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author sando
 */
public class TelaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalculadora
     */
    public TelaCalculadora() {
        initComponents();  
        
    }
    double valor1, valor2;
    String sinal;
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        btnSoma = new javax.swing.JToggleButton();
        btn9 = new javax.swing.JToggleButton();
        btn8 = new javax.swing.JToggleButton();
        btn4 = new javax.swing.JToggleButton();
        btn6 = new javax.swing.JToggleButton();
        btn5 = new javax.swing.JToggleButton();
        btn3 = new javax.swing.JToggleButton();
        btn2 = new javax.swing.JToggleButton();
        btn1 = new javax.swing.JToggleButton();
        btn0 = new javax.swing.JToggleButton();
        btnNegativo = new javax.swing.JToggleButton();
        btnVirgula = new javax.swing.JToggleButton();
        btnResultado = new javax.swing.JButton();
        btn10 = new javax.swing.JToggleButton();
        btnDiv = new javax.swing.JToggleButton();
        btnVezes = new javax.swing.JToggleButton();
        btnSub = new javax.swing.JToggleButton();
        btnExp = new javax.swing.JToggleButton();
        btnRaizQ = new javax.swing.JToggleButton();
        btnPorcento = new javax.swing.JToggleButton();
        btnFatorial = new javax.swing.JToggleButton();
        btnCubica = new javax.swing.JToggleButton();
        btnLimpaV = new javax.swing.JToggleButton();
        btnLimpa = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        btnSoma.setBackground(new java.awt.Color(204, 204, 204));
        btnSoma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSoma.setForeground(new java.awt.Color(0, 102, 153));
        btnSoma.setText("+");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(204, 204, 204));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9.setForeground(new java.awt.Color(0, 102, 153));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(204, 204, 204));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8.setForeground(new java.awt.Color(0, 102, 153));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(204, 204, 204));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4.setForeground(new java.awt.Color(0, 102, 153));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(204, 204, 204));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6.setForeground(new java.awt.Color(0, 102, 153));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(204, 204, 204));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5.setForeground(new java.awt.Color(0, 102, 153));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(204, 204, 204));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(0, 102, 153));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(204, 204, 204));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(0, 102, 153));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(0, 102, 153));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(204, 204, 204));
        btn0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn0.setForeground(new java.awt.Color(0, 102, 153));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnNegativo.setBackground(new java.awt.Color(204, 204, 204));
        btnNegativo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNegativo.setForeground(new java.awt.Color(0, 102, 153));
        btnNegativo.setText("+-");
        btnNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativoActionPerformed(evt);
            }
        });

        btnVirgula.setBackground(new java.awt.Color(204, 204, 204));
        btnVirgula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVirgula.setForeground(new java.awt.Color(0, 102, 153));
        btnVirgula.setText(",");

        btnResultado.setBackground(new java.awt.Color(204, 204, 204));
        btnResultado.setForeground(new java.awt.Color(0, 102, 153));
        btnResultado.setText("=");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });

        btn10.setBackground(new java.awt.Color(204, 204, 204));
        btn10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn10.setForeground(new java.awt.Color(0, 102, 153));
        btn10.setText("7");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btnDiv.setBackground(new java.awt.Color(204, 204, 204));
        btnDiv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDiv.setForeground(new java.awt.Color(0, 102, 153));
        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnVezes.setBackground(new java.awt.Color(204, 204, 204));
        btnVezes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVezes.setForeground(new java.awt.Color(0, 102, 153));
        btnVezes.setText("*");
        btnVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVezesActionPerformed(evt);
            }
        });

        btnSub.setBackground(new java.awt.Color(204, 204, 204));
        btnSub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSub.setForeground(new java.awt.Color(0, 102, 153));
        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnExp.setBackground(new java.awt.Color(204, 204, 204));
        btnExp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExp.setForeground(new java.awt.Color(0, 102, 153));
        btnExp.setText("<html>X<sup>2<sup></html>");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnRaizQ.setBackground(new java.awt.Color(204, 204, 204));
        btnRaizQ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRaizQ.setForeground(new java.awt.Color(0, 102, 153));
        btnRaizQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Raiz-quadrada.png"))); // NOI18N
        btnRaizQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizQActionPerformed(evt);
            }
        });

        btnPorcento.setBackground(new java.awt.Color(204, 204, 204));
        btnPorcento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPorcento.setForeground(new java.awt.Color(0, 102, 153));
        btnPorcento.setText("%");
        btnPorcento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentoActionPerformed(evt);
            }
        });

        btnFatorial.setBackground(new java.awt.Color(204, 204, 204));
        btnFatorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFatorial.setForeground(new java.awt.Color(0, 102, 153));
        btnFatorial.setText("!");
        btnFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFatorialActionPerformed(evt);
            }
        });

        btnCubica.setBackground(new java.awt.Color(204, 204, 204));
        btnCubica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCubica.setForeground(new java.awt.Color(0, 102, 153));
        btnCubica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/raiz-cubica.png"))); // NOI18N
        btnCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCubicaActionPerformed(evt);
            }
        });

        btnLimpaV.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpaV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpaV.setForeground(new java.awt.Color(0, 102, 153));
        btnLimpaV.setText("C");
        btnLimpaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaVActionPerformed(evt);
            }
        });

        btnLimpa.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpa.setForeground(new java.awt.Color(0, 102, 153));
        btnLimpa.setText("CE");
        btnLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculadoraTmpequeno.png"))); // NOI18N
        jLabel1.setText("Calculadora San e Laine");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSoma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpa, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(btnLimpaV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRaizQ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCubica, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPorcento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtResultado))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnVirgula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnNegativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPorcento, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLimpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCubica, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRaizQ, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLimpaV, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void btnNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed
        // TODO add your handling code here:
        txtResultado.setText("-" + valor1);
        txtResultado.setText("-" + valor2 );
    }//GEN-LAST:event_btnNegativoActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
         txtResultado.setText(txtResultado.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        // TODO add your handling code here:
        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "soma";
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        // TODO add your handling code here:
         valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "div";
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        // TODO add your handling code here:
         valor1 = Double.parseDouble(txtResultado.getText());
         double n = Math.pow(valor1,2);
        txtResultado.setText(Double.valueOf(n).toString());
        
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        // TODO add your handling code here:
        valor2 = Double.parseDouble(txtResultado.getText());
        if (sinal == "soma"){
            txtResultado.setText(String.valueOf(valor1 + valor2));
        } if (sinal == "subtrair"){
            txtResultado.setText(String.valueOf(valor1-valor2));
        } if (sinal == "multiplicar"){
            txtResultado.setText(String.valueOf(valor1*valor2));
        }if (sinal == "div"){
            txtResultado.setText(String.valueOf(valor1 / valor2));
        } if (sinal == "por") {
            valor2 = Double.parseDouble(txtResultado.getText());
            double pocentagem = valor1 * valor2 / 100;
            txtResultado.setText(Double.valueOf(pocentagem).toString());
        }   
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnRaizQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizQActionPerformed
        // TODO add your handling code here:
         valor1 = Double.parseDouble(txtResultado.getText());
        double r = Math.sqrt(valor1);
        txtResultado.setText(Double.valueOf(r).toString());
    }//GEN-LAST:event_btnRaizQActionPerformed

    private void btnPorcentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentoActionPerformed
        // TODO add your handling code here:
        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
       sinal = "por";
        
    }//GEN-LAST:event_btnPorcentoActionPerformed

    private void btnLimpaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaVActionPerformed
        // TODO add your handling code here:
        valor1 = 0;
        valor2 = 0;
        txtResultado.setText("");
    }//GEN-LAST:event_btnLimpaVActionPerformed

    private void btnLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaActionPerformed
        // TODO add your handling code here:
        txtResultado.setText("");
    }//GEN-LAST:event_btnLimpaActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
         txtResultado.setText(txtResultado.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
         txtResultado.setText(txtResultado.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
         txtResultado.setText(txtResultado.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
         txtResultado.setText(txtResultado.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
         txtResultado.setText(txtResultado.getText() + "6");
        
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
         txtResultado.setText(txtResultado.getText() + "7");
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
         txtResultado.setText(txtResultado.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        // TODO add your handling code here:
        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "subtrair";
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVezesActionPerformed
        // TODO add your handling code here:
         valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "multiplicar";
    }//GEN-LAST:event_btnVezesActionPerformed

    private void btnCubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCubicaActionPerformed
        // TODO add your handling code here:
         valor1 = Double.parseDouble(txtResultado.getText());
        double c = Math.cbrt(valor1);
        txtResultado.setText(Double.valueOf(c).toString());
    }//GEN-LAST:event_btnCubicaActionPerformed

    private void btnFatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFatorialActionPerformed
        // TODO add your handling code here:
         valor1 = Double.parseDouble(txtResultado.getText());
         int f = 1;
         while (valor1>=1){
            f *= valor1;
            valor1--;
            txtResultado.setText(Integer.toString(f));
         }
        
      
    }//GEN-LAST:event_btnFatorialActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn0;
    private javax.swing.JToggleButton btn1;
    private javax.swing.JToggleButton btn10;
    private javax.swing.JToggleButton btn2;
    private javax.swing.JToggleButton btn3;
    private javax.swing.JToggleButton btn4;
    private javax.swing.JToggleButton btn5;
    private javax.swing.JToggleButton btn6;
    private javax.swing.JToggleButton btn8;
    private javax.swing.JToggleButton btn9;
    private javax.swing.JToggleButton btnCubica;
    private javax.swing.JToggleButton btnDiv;
    private javax.swing.JToggleButton btnExp;
    private javax.swing.JToggleButton btnFatorial;
    private javax.swing.JToggleButton btnLimpa;
    private javax.swing.JToggleButton btnLimpaV;
    private javax.swing.JToggleButton btnNegativo;
    private javax.swing.JToggleButton btnPorcento;
    private javax.swing.JToggleButton btnRaizQ;
    private javax.swing.JButton btnResultado;
    private javax.swing.JToggleButton btnSoma;
    private javax.swing.JToggleButton btnSub;
    private javax.swing.JToggleButton btnVezes;
    private javax.swing.JToggleButton btnVirgula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
