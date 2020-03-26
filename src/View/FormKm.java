package View;

import Control.Conexao;
import Control.ControlQuilometragem;
import Model.ModelQuilometragem;
import Model.ModeloTabela;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import java.util.Date;
import javax.swing.JOptionPane;

public class FormKm extends javax.swing.JFrame {
    Conexao conecta = new Conexao();
    
    public FormKm() {
        initComponents();
        
        txtDataKm.requestFocus();
        conecta.conectabanco();
        
            //SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");  
            //Date data = new Date();                        
            //txtDataKm.setDate(data);
            //System.out.println(formater.format(date));                
        
        preencherTabela("select * from quilometragem");
        
         // aqui carrega os dados do banco para os campos de texto
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableKm = new javax.swing.JTable();
        comboPlaca = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLocalMotivo = new javax.swing.JTextPane();
        txtKmRodados = new javax.swing.JFormattedTextField();
        txtDataKm = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSoma = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtQtdDias = new javax.swing.JTextField();
        txtValorDia = new javax.swing.JTextField();
        txtSomaDia = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtComb = new javax.swing.JTextField();
        txtMedKm = new javax.swing.JTextField();
        txtSomaCombustivel = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtOleoKm = new javax.swing.JTextField();
        txtSomaOleo = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPneuKm = new javax.swing.JTextField();
        txtSomaPneu = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtRevisaoKm = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        comboPlacaSoma = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Km Rodados:");

        btNovo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setEnabled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setEnabled(false);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Data:");

        tableKm.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tableKm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableKm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKmMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableKm);

        comboPlaca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboPlaca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        comboPlaca.setToolTipText("");
        comboPlaca.setEnabled(false);
        comboPlaca.setFocusable(false);
        comboPlaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboPlacaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboPlacaMousePressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Editar");
        jButton2.setEnabled(false);

        jButton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton3.setText("Excluir");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Placa:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Local / Motivo:");

        txtLocalMotivo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtLocalMotivo.setEnabled(false);
        jScrollPane1.setViewportView(txtLocalMotivo);

        txtKmRodados.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtKmRodados.setEnabled(false);

        txtDataKm.setEnabled(false);
        txtDataKm.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDataKm.setMaxSelectableDate(new java.util.Date(253370779274000L));
        txtDataKm.setMinSelectableDate(new java.util.Date(-62135755126000L));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 190, Short.MAX_VALUE)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar)
                        .addGap(164, 164, 164))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtKmRodados, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataKm, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(comboPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(txtDataKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKmRodados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quilometragem", jPanel1);

        tableSoma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableSoma);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Valor do dia");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Qtd de dias");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Soma dos dias");

        txtQtdDias.setEditable(false);
        txtQtdDias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtValorDia.setEditable(false);
        txtValorDia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtSomaDia.setEditable(false);
        txtSomaDia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtQtdDias, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtValorDia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                    .addComponent(txtSomaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(txtValorDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQtdDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSomaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Média Km");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Valor Combustivel");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Soma do Combustível");

        txtComb.setEditable(false);
        txtComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCombActionPerformed(evt);
            }
        });

        txtMedKm.setEditable(false);

        txtSomaCombustivel.setEditable(false);
        txtSomaCombustivel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtMedKm, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtComb, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSomaCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMedKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSomaCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Óleo por KM");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Soma do Óleo");

        txtOleoKm.setEditable(false);

        txtSomaOleo.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSomaOleo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtOleoKm, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel12))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOleoKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSomaOleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Pneu por KM");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Soma do Pneu");

        txtPneuKm.setEditable(false);

        txtSomaPneu.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSomaPneu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtPneuKm, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPneuKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSomaPneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Revisão por KM");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Soma da Revisão");

        txtRevisaoKm.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(txtRevisaoKm, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRevisaoKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel16)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("Total dos Itens");

        comboPlacaSoma.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboPlacaSoma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        comboPlacaSoma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboPlacaSomaMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Selecione o veículo:");

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboPlacaSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPlacaSoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Soma", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        btNovo.setEnabled(false); // desabilita o botão
        
        txtDataKm.setEnabled(true); // habilita o campo
        txtKmRodados.setEnabled(true); // habilita o campo
        txtLocalMotivo.setEnabled(true); // habilita o campo
        comboPlaca.setEnabled(true);
        
        btCancelar.setEnabled(true); // habilita o botão
        btSalvar.setEnabled(true); // habilita o botão
        
        comboPlaca.setSelectedItem(null); // limpa o combobox
        txtKmRodados.setText(""); // limpa o campo
        txtLocalMotivo.setText(""); // limpa o campo
        txtDataKm.setDate(null);
        
        comboPlaca.removeAllItems();
        preencherCombo("select placa from dados_veiculo order by placa");
        
        tableKm.setEnabled(false);
        tableKm.setColumnSelectionAllowed(false);
        tableKm.setRowSelectionAllowed(false);        
                
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        ///txtDataKm.setDate(null); // limpa a data no Jcalendar
        
        comboPlaca.setSelectedItem(null); // limpa o combobox
        txtKmRodados.setText(""); // limpa o campo
        txtLocalMotivo.setText(""); // limpa o campo
        
        txtDataKm.setEnabled(false); // desabilita o campo
        txtKmRodados.setEnabled(false); // desabilita o campo
        txtLocalMotivo.setEnabled(false); // desabilita o campo
        
        btNovo.setEnabled(true); // habilita o botão
        btCancelar.setEnabled(false); // desabilita o botão
        btSalvar.setEnabled(false); // desabilita o botão
        comboPlaca.setEnabled(false); //desabilita o botão o combobox
        
        comboPlaca.removeAllItems();
        
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
            
        Calendar c = Calendar.getInstance();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // definindo formato dia, mes e ano
        
        try {
          Date strDate = txtDataKm.getDate();
          String n = sdf.format(strDate);
          c.setTime(sdf.parse(n));
        } catch (ParseException ex) {
            //JOptionPane.showMessageDialog(null, "Erro: \n"+ex);
        }
        //aqui está o "pulo do gato"
        DateFormat formataData = DateFormat.getDateInstance();
                
        ModelQuilometragem model = new ModelQuilometragem(); // chamada da classe ModelQuilometragem
        model.setPlaca(comboPlaca.getSelectedItem().toString()); // setando os valores da comboBox
        model.setData(new java.sql.Date(c.getTimeInMillis())); // setando a data para o banco já formatada
        model.setLocalmotivo(txtLocalMotivo.getText()); // setando os valores do campo
        model.setKmrodado(Double.parseDouble(txtKmRodados.getText().replace(",", "."))); // setando os valores do campo e substituindo virgula por ponto
        ControlQuilometragem control = new ControlQuilometragem(); // chamada da classe ControlQuilometragem
        control.inserirQuilometragem(model); // chamando o metodo inserir da classe quilometragem
              
        preencherTabela("select * from quilometragem");
            
            btSalvar.setEnabled(false);
            btCancelar.setEnabled(false);
            btNovo.setEnabled(true);
            
            txtDataKm.setEnabled(false);
            txtKmRodados.setEnabled(false);
            txtLocalMotivo.setEnabled(false);
            
            comboPlaca.setEnabled(false);
            
            txtKmRodados.setText("");
            comboPlaca.setSelectedItem(null);
            txtLocalMotivo.setText("");
            txtDataKm.setDate(null);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void comboPlacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboPlacaMouseClicked
        
    }//GEN-LAST:event_comboPlacaMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        comboPlaca.removeAllItems();
        FormPrincipal obj = new FormPrincipal();
        obj.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void tableKmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKmMouseClicked
            String id =""+tableKm.getValueAt(tableKm.getSelectedRow(), 0);
            comboPlaca.removeAllItems();
            preencherCombo("select placa from quilometragem where id ='" +id+"'");
            conecta.executaSQL("select * from quilometragem where id ='" +id+"'");
        try {
            conecta.rs.first();
            txtDataKm.setDate(conecta.rs.getDate("data"));
            txtLocalMotivo.setText(conecta.rs.getString("localmotivo"));
            txtKmRodados.setText(String.valueOf(conecta.rs.getDouble("kmrodado")));
        } catch (SQLException ex) {
            Logger.getLogger(FormKm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tableKmMouseClicked

    private void txtCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCombActionPerformed
        
    }//GEN-LAST:event_txtCombActionPerformed

    private void comboPlacaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboPlacaMousePressed
        
    }//GEN-LAST:event_comboPlacaMousePressed

    private void comboPlacaSomaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboPlacaSomaMouseClicked
        comboPlacaSoma.removeAllItems();
        preencherComboSoma("select distinct placa from quilometragem");
    }//GEN-LAST:event_comboPlacaSomaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try { // aqui carrega os dados do banco para os campos de texto
            conecta.executaSQL("select combustivel from dados_veiculo");
            conecta.rs.first();
            txtComb.setText(String.valueOf(conecta.rs.getDouble("combustivel"))); 
            
            conecta.executaSQL("select count(id) as qtd from quilometragem where placa ='"+comboPlacaSoma.getSelectedItem()+"'");
            conecta.rs.first();
            txtQtdDias.setText(String.valueOf(conecta.rs.getInt("qtd")));
            
            conecta.executaSQL("select (seguro+ipva+licenciamento+dpvat)/360 as dia from dados_veiculo "
                    + "where placa ='"+comboPlacaSoma.getSelectedItem()+"'");
            conecta.rs.first();
            txtValorDia.setText(String.valueOf(conecta.rs.getDouble("dia")));
            
            conecta.executaSQL("select medkml from dados_veiculo where placa ='"+comboPlacaSoma.getSelectedItem()+"'");
            conecta.rs.first();
            txtMedKm.setText(String.valueOf(conecta.rs.getDouble("medkml")));
            
            conecta.executaSQL("select oleo/2000 from dados_veiculo where placa ='"+comboPlacaSoma.getSelectedItem()+"'");
            conecta.rs.first();
            txtOleoKm.setText(String.valueOf(conecta.rs.getDouble("divide")));
            
            conecta.executaSQL("select pneu/10000 from dados_veiculo where placa ='"+comboPlacaSoma.getSelectedItem()+"'");
            conecta.rs.first();
            txtPneuKm.setText(String.valueOf(conecta.rs.getDouble("divide")));
            
            conecta.executaSQL("select revisao/30000 from dados_veiculo where placa ='"+comboPlacaSoma.getSelectedItem()+"'");
            conecta.rs.first();
            txtRevisaoKm.setText(String.valueOf(conecta.rs.getDouble("divide")));
            
            
            // aqui faz a soma
            conecta.executaSQL("select * from soma_dia('"+comboPlacaSoma.getSelectedItem()+"')");
            conecta.rs.first();
            txtSomaDia.setText(String.valueOf(conecta.rs.getDouble("valor")));
            
            conecta.executaSQL("select * from soma_combustivel('"+comboPlacaSoma.getSelectedItem()+"')");
            conecta.rs.first();
            txtSomaCombustivel.setText(String.valueOf(conecta.rs.getDouble("valor")));
            
            conecta.executaSQL("select * from soma_oleo('"+comboPlacaSoma.getSelectedItem()+"')");
            conecta.rs.first();
            txtSomaOleo.setText(String.valueOf(conecta.rs.getDouble("valor")));
            
            conecta.executaSQL("select * from soma_pneu('"+comboPlacaSoma.getSelectedItem()+"')");
            conecta.rs.first();
            txtSomaPneu.setText(String.valueOf(conecta.rs.getDouble("valor")));
            
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro: \n" +ex);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
        
   public void preencherCombo (String SQL){ // Método que preenche comboPlaca
            conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
                comboPlaca.addItem(conecta.rs.getString("placa"));
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao preecher ComboBox\n!" + ex);
        }
    }
   
   public void preencherComboSoma (String SQL){  // Método que preenche comboPlacaSoma
            conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
                comboPlacaSoma.addItem(conecta.rs.getString("placa"));
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao preecher ComboBox\n!" + ex);
        }
    }
    
    // método para carregar as informações do banco na tabela
   public void preencherTabela(String SQL) {
        ArrayList dados = new ArrayList();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); // formata a data para exibir na tabela
        
        String[] colunas = new String[]{"ID", "Placa", "Data", "Detalhes", "KM"}; // nome das colunas
        
        conecta.executaSQL(SQL);
        
        try {
            conecta.rs.first();
        do {
            
            dados.add(new Object[]{conecta.rs.getInt("id"), conecta.rs.getString("placa"), df.format(conecta.rs.getDate("data")), conecta.rs.getString("localmotivo"), conecta.rs.getDouble("kmrodado")});
            
            
        } while(conecta.rs.next());        
        } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "Erro ao preencher o Array\n Erro: " + ex);
            }       
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        tableKm.setModel(modelo);
        tableKm.getColumnModel().getColumn(0).setPreferredWidth(40); // tamanho do campo
        tableKm.getColumnModel().getColumn(0).setResizable(false); // não permite alterar o tamanho do campo com o mouse
        tableKm.getColumnModel().getColumn(1).setPreferredWidth(65); // tamanho do campo
        tableKm.getColumnModel().getColumn(1).setResizable(false); // não permite alterar o tamanho do campo com o mouse
        tableKm.getColumnModel().getColumn(2).setPreferredWidth(74); // tamanho do campo
        tableKm.getColumnModel().getColumn(2).setResizable(false); // não permite alterar o tamanho do campo com o mouse
        tableKm.getColumnModel().getColumn(3).setPreferredWidth(538); // tamanho do campo
        tableKm.getColumnModel().getColumn(3).setResizable(false); //não permite alterar o tamanho do campo com o mouse
        tableKm.getColumnModel().getColumn(4).setPreferredWidth(50); // tamanho do campo
        tableKm.getColumnModel().getColumn(4).setResizable(false); //não permite alterar o tamanho do campo com o mouse
        tableKm.getTableHeader().setReorderingAllowed(false); // não permite reordenar a tabela
        tableKm.setAutoResizeMode(tableKm.AUTO_RESIZE_OFF); // não permite redimensionar a tabela
        tableKm.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite apenas selecionar um item da tabela
        
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
            java.util.logging.Logger.getLogger(FormKm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox comboPlaca;
    private javax.swing.JComboBox comboPlacaSoma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableKm;
    private javax.swing.JTable tableSoma;
    private javax.swing.JTextField txtComb;
    private com.toedter.calendar.JDateChooser txtDataKm;
    private javax.swing.JFormattedTextField txtKmRodados;
    private javax.swing.JTextPane txtLocalMotivo;
    private javax.swing.JTextField txtMedKm;
    private javax.swing.JTextField txtOleoKm;
    private javax.swing.JTextField txtPneuKm;
    private javax.swing.JTextField txtQtdDias;
    private javax.swing.JTextField txtRevisaoKm;
    private javax.swing.JTextField txtSomaCombustivel;
    private javax.swing.JTextField txtSomaDia;
    private javax.swing.JTextField txtSomaOleo;
    private javax.swing.JTextField txtSomaPneu;
    private javax.swing.JTextField txtValorDia;
    // End of variables declaration//GEN-END:variables
}

