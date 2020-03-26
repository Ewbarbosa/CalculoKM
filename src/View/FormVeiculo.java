
package View;

import Control.Conexao;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FormVeiculo extends javax.swing.JFrame {
        Conexao conecta = new Conexao();
            
    public FormVeiculo() {
        initComponents();
        conecta.conectabanco();
        panelVeiculo.setEnabledAt(1, false);
        panelVeiculo.setEnabledAt(2, false);                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVeiculo = new javax.swing.JTabbedPane();
        paneVeiculo1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btAvancar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        txtPlaca = new javax.swing.JFormattedTextField();
        txtProprietario = new javax.swing.JTextField();
        paneVeiculo2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btCancelar2 = new javax.swing.JButton();
        txtSeguro = new javax.swing.JFormattedTextField();
        txtIpva = new javax.swing.JFormattedTextField();
        txtLicenciamento = new javax.swing.JFormattedTextField();
        txtDpvat = new javax.swing.JFormattedTextField();
        txtPneu = new javax.swing.JFormattedTextField();
        txtOleo = new javax.swing.JFormattedTextField();
        txtCombustivel = new javax.swing.JFormattedTextField();
        txtRevisao = new javax.swing.JFormattedTextField();
        txtPlaca2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtMedLitro = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtProprietario1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btSalvarProprietario = new javax.swing.JButton();
        txtPlaca3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Veículo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        panelVeiculo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Placa:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Marca:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Modelo:");

        txtMarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarcaKeyPressed(evt);
            }
        });

        txtModelo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModeloKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Proprietário:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Informações sobre o Veículo");

        btAvancar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btAvancar.setText("Avançar >>>");
        btAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvancarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        try {
            txtPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("???-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPlaca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPlacaKeyPressed(evt);
            }
        });

        txtProprietario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout paneVeiculo1Layout = new javax.swing.GroupLayout(paneVeiculo1);
        paneVeiculo1.setLayout(paneVeiculo1Layout);
        paneVeiculo1Layout.setHorizontalGroup(
            paneVeiculo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneVeiculo1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(paneVeiculo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneVeiculo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneVeiculo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMarca)
                        .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneVeiculo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneVeiculo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneVeiculo1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneVeiculo1Layout.createSequentialGroup()
                        .addGroup(paneVeiculo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAvancar))
                        .addGap(194, 194, 194))))
        );
        paneVeiculo1Layout.setVerticalGroup(
            paneVeiculo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneVeiculo1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(47, 47, 47)
                .addGroup(paneVeiculo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneVeiculo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneVeiculo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneVeiculo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btAvancar)
                .addGap(27, 27, 27)
                .addComponent(btCancelar)
                .addGap(27, 27, 27))
        );

        panelVeiculo.addTab("Informações Básicas", paneVeiculo1);

        paneVeiculo2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Preencha os campos com custos do veículo");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Placa:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Seguro:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("IPVA:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Licenciamento:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("DPVAT:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Pneu:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Óleo:");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Combustível:");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Revisão:");

        btSalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btSalvar.setText("Avançar >>>");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btCancelar2.setText("Cancelar");
        btCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar2ActionPerformed(evt);
            }
        });

        txtSeguro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtSeguro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSeguro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSeguroKeyPressed(evt);
            }
        });

        txtIpva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtIpva.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtIpva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIpvaKeyPressed(evt);
            }
        });

        txtLicenciamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtLicenciamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtLicenciamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLicenciamentoKeyPressed(evt);
            }
        });

        txtDpvat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtDpvat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDpvat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDpvatKeyPressed(evt);
            }
        });

        txtPneu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPneu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPneu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPneuKeyPressed(evt);
            }
        });

        txtOleo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtOleo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtOleo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOleoKeyPressed(evt);
            }
        });

        txtCombustivel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtCombustivel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCombustivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCombustivelKeyPressed(evt);
            }
        });

        txtRevisao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtRevisao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRevisaoKeyPressed(evt);
            }
        });

        txtPlaca2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPlaca2.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Média p/ Litro:");

        txtMedLitro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMedLitro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMedLitroKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout paneVeiculo2Layout = new javax.swing.GroupLayout(paneVeiculo2);
        paneVeiculo2.setLayout(paneVeiculo2Layout);
        paneVeiculo2Layout.setHorizontalGroup(
            paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneVeiculo2Layout.createSequentialGroup()
                .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneVeiculo2Layout.createSequentialGroup()
                        .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(paneVeiculo2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDpvat, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(paneVeiculo2Layout.createSequentialGroup()
                                        .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLicenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIpva, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(paneVeiculo2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPneu)))
                        .addGap(114, 114, 114)
                        .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOleo, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(txtCombustivel)
                            .addComponent(txtRevisao)
                            .addComponent(txtMedLitro)))
                    .addGroup(paneVeiculo2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btSalvar))
                            .addComponent(txtPlaca2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneVeiculo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(140, 140, 140))
        );
        paneVeiculo2Layout.setVerticalGroup(
            paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneVeiculo2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPlaca2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneVeiculo2Layout.createSequentialGroup()
                        .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtIpva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtLicenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtDpvat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paneVeiculo2Layout.createSequentialGroup()
                        .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtOleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtMedLitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(paneVeiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btSalvar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar2)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        panelVeiculo.addTab("Informações sobre Custo", paneVeiculo2);

        txtProprietario1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtProprietario1.setEnabled(false);
        txtProprietario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProprietario1KeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Informe os dados do proprietário");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("CPF:");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Nome:");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("Placa");

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        btSalvarProprietario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btSalvarProprietario.setText("Salvar");
        btSalvarProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarProprietarioActionPerformed(evt);
            }
        });

        txtPlaca3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPlaca3.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtProprietario1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNome)
                        .addGap(169, 169, 169))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPlaca3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btSalvarProprietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGap(225, 225, 225))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel16)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtProprietario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtPlaca3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btSalvarProprietario)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(50, 50, 50))
        );

        panelVeiculo.addTab("Proprietário", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelVeiculo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtModelo.requestFocus();
        }
    }//GEN-LAST:event_txtMarcaKeyPressed

    private void txtModeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtProprietario.requestFocus();
        }
    }//GEN-LAST:event_txtModeloKeyPressed

    private void btAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarActionPerformed
            if (txtProprietario.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "O campo Proprietário deve ser preenchido!");
            } else {
                //JOptionPane.showMessageDialog(null, "Else");
            panelVeiculo.setEnabledAt(0, false); // desabilita a primeira aba da panel
            panelVeiculo.setEnabledAt(1, true); // habilita a segunda aba
            panelVeiculo.setSelectedIndex(1); // avança para a proxima aba
            
            txtProprietario1.setText(txtProprietario.getText()); // seta o que esta digitado em txtProprietario1 para txtProprietario
            txtPlaca2.setText(txtPlaca.getText());
            txtPlaca3.setText(txtPlaca.getText());
            }
            
               
    }//GEN-LAST:event_btAvancarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
            
            panelVeiculo.setEnabledAt(1, false); // desabilita a aba
            panelVeiculo.setEnabledAt(2,true); // habilita a terceira aba
            panelVeiculo.setSelectedIndex(2); // avanÃ§a para a proxima aba
                     
            txtPlaca3.setText(txtPlaca3.getText()); // seta o que esta digitado em txtPlaca para txtProprietario  
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelar2ActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        FormPrincipal obj = new FormPrincipal();
        obj.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void txtProprietario1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProprietario1KeyPressed
        
    }//GEN-LAST:event_txtProprietario1KeyPressed

    private void btSalvarProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarProprietarioActionPerformed
        
        // aqui faz todo o cadastro de um veiculo
        
         //ações da primeira aba
        try {
            PreparedStatement pst = conecta.conecta.prepareStatement("insert into veiculo (placa, marca, modelo, cpf) values(?,?,?,?)");
            pst.setString(1, txtPlaca.getText().toUpperCase());
            pst.setString(2, txtMarca.getText());
            pst.setString(3, txtModelo.getText());
            pst.setString(4, txtProprietario.getText());
            pst.executeUpdate();
            
            //JOptionPane.showMessageDialog(null,"Clique em OK para avançar", "Salvo com sucesso", JOptionPane.INFORMATION_MESSAGE);
                                                                   
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar os dados\n" +ex); // caso ocorra um erro retorna a mensagem
        } // Aqui termina as ações da primeira aba
        
        
           //açoes da segunda aba
        try {
            PreparedStatement pst = conecta.conecta.prepareStatement("insert into dados_veiculo"
                    + "(placa, seguro, ipva, licenciamento, dpvat, pneu, oleo, combustivel, revisao, medkml)"
                    + "values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, txtPlaca2.getText().toUpperCase());
            pst.setDouble(2, Double.parseDouble(txtSeguro.getText().replace(",", "."))); // replace faz a troca de virgula por ponto
            pst.setDouble(3, Double.parseDouble(txtIpva.getText().replace(",", "."))); // replace faz a troca de virgula por ponto
            pst.setDouble(4, Double.parseDouble(txtLicenciamento.getText().replace(",", "."))); // replace faz a troca de virgula por ponto
            pst.setDouble(5, Double.parseDouble(txtDpvat.getText().replace(",", "."))); // replace faz a troca de virgula por ponto
            pst.setDouble(6, Double.parseDouble(txtPneu.getText().replace(",", "."))); // replace faz a troca de virgula por ponto
            pst.setDouble(7, Double.parseDouble(txtOleo.getText().replace(",", "."))); // replace faz a troca de virgula por ponto
            pst.setDouble(8, Double.parseDouble(txtCombustivel.getText().replace(",", "."))); // replace faz a troca de virgula por ponto
            pst.setDouble(9, Double.parseDouble(txtRevisao.getText().replace(",", "."))); // replace faz a troca de virgula por ponto
            pst.setDouble(10, Double.parseDouble(txtMedLitro.getText().replace(",", "."))); // replace faz a troca de virgula por ponto
            pst.executeUpdate();
            
            //JOptionPane.showMessageDialog(null,"Salvo com sucesso!");           
                                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar\n" +ex);
        } // aqui termina as aÃ§Ãµes da segunda aba
                
        // ações da terceira aba
        try {
            PreparedStatement pst = conecta.conecta.prepareStatement("insert into proprietario(cpf, nome, placa) values(?,?,?)");
            
            pst.setString(1, txtProprietario1.getText());
            pst.setString(2, txtNome.getText());
            pst.setString(3, txtPlaca3.getText().toUpperCase());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
            this.dispose();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar\n"+ex);
        } // aqui termina a terceira aba
        
        //JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btSalvarProprietarioActionPerformed

    private void txtPlacaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtMarca.requestFocus();
        }
    }//GEN-LAST:event_txtPlacaKeyPressed

    private void txtSeguroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeguroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtIpva.requestFocus();
        }
    }//GEN-LAST:event_txtSeguroKeyPressed

    private void txtIpvaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIpvaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtLicenciamento.requestFocus();
        }
    }//GEN-LAST:event_txtIpvaKeyPressed

    private void txtLicenciamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLicenciamentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtDpvat.requestFocus();
        }
    }//GEN-LAST:event_txtLicenciamentoKeyPressed

    private void txtDpvatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDpvatKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtPneu.requestFocus();
        }
    }//GEN-LAST:event_txtDpvatKeyPressed

    private void txtPneuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPneuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtOleo.requestFocus();
        }
    }//GEN-LAST:event_txtPneuKeyPressed

    private void txtOleoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOleoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtCombustivel.requestFocus();
        }
    }//GEN-LAST:event_txtOleoKeyPressed

    private void txtRevisaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRevisaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtMedLitro.requestFocus();
        }
    }//GEN-LAST:event_txtRevisaoKeyPressed

    private void txtCombustivelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCombustivelKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtRevisao.requestFocus();
        }
    }//GEN-LAST:event_txtCombustivelKeyPressed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btSalvarProprietario.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object[] opcao = { "Sim", "Não" };
  int escolha = JOptionPane.showOptionDialog(null, 
      "Deseja realmente cancelar?", 
      "Cancelar?", 
      JOptionPane.YES_NO_OPTION, 
      JOptionPane.QUESTION_MESSAGE, 
      null, 
      opcao, 
      opcao[0]);    

  // se a opção for sim fecha a janela e retorna para a anterior
  if (escolha == JOptionPane.YES_OPTION)
  {
    this.dispose();    
  }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMedLitroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedLitroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btSalvar.requestFocus();
        }
    }//GEN-LAST:event_txtMedLitroKeyPressed
        
    
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
            java.util.logging.Logger.getLogger(FormVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAvancar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCancelar2;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSalvarProprietario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel paneVeiculo1;
    private javax.swing.JPanel paneVeiculo2;
    private javax.swing.JTabbedPane panelVeiculo;
    private javax.swing.JFormattedTextField txtCombustivel;
    private javax.swing.JFormattedTextField txtDpvat;
    private javax.swing.JFormattedTextField txtIpva;
    private javax.swing.JFormattedTextField txtLicenciamento;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMedLitro;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtOleo;
    private javax.swing.JFormattedTextField txtPlaca;
    private javax.swing.JTextField txtPlaca2;
    private javax.swing.JTextField txtPlaca3;
    private javax.swing.JFormattedTextField txtPneu;
    private javax.swing.JTextField txtProprietario;
    private javax.swing.JTextField txtProprietario1;
    private javax.swing.JFormattedTextField txtRevisao;
    private javax.swing.JFormattedTextField txtSeguro;
    // End of variables declaration//GEN-END:variables
}
