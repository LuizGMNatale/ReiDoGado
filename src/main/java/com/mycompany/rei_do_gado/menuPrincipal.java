package com.mycompany.rei_do_gado;

import com.mycompany.rei_do_gadoBD.ClienteDao;
import com.mycompany.rei_do_gadoBD.ItensVendaDAO;
import com.mycompany.rei_do_gadoBD.ProdutoDao;
import com.mycompany.reidogadoclasses.Cliente;
import com.mycompany.reidogadoclasses.Produto;
import com.mycompany.reidogadoclasses.Vendas;
import com.mycompany.reidogadoclasses.ItemVenda;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class menuPrincipal extends javax.swing.JFrame {

    public menuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        ftxCPF.setDocument(new ValidadorNumeros());
        tableModel = (DefaultTableModel) tabVenda.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVendas = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tabClientes = new javax.swing.JTabbedPane();
        pnlClientes = new javax.swing.JPanel();
        btnCadCli = new javax.swing.JButton();
        btnEditCli = new javax.swing.JButton();
        btnDelCli = new javax.swing.JButton();
        txtBuscarCli = new javax.swing.JTextField();
        btnBuscarCli = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCli = new javax.swing.JTable();
        pnlProdutos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabProd = new javax.swing.JTable();
        btnCadProd = new javax.swing.JButton();
        btnEditProd = new javax.swing.JButton();
        btnDelProd = new javax.swing.JButton();
        txtBuscarProd = new javax.swing.JTextField();
        btnBuscarProd = new javax.swing.JButton();
        pnlVenda = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabVenda = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblSubNumero = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        ftxCPF = new javax.swing.JFormattedTextField();
        lblQuant = new javax.swing.JLabel();
        spnQuant = new javax.swing.JSpinner();
        lblProd = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        btnVenda = new javax.swing.JButton();
        txtProdID = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        lblNomeCli = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtProdutoValorTotal = new javax.swing.JTextField();
        lblNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValorUnitario = new javax.swing.JTextField();
        pnlRelatorios = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabRelatorio2 = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNumTotal = new javax.swing.JLabel();
        lblDataInicio = new javax.swing.JLabel();
        lblDataFinal = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabRelatorio1 = new javax.swing.JTable();
        dacDataInicio = new com.toedter.calendar.JDateChooser();
        dacDataFinal = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rei do Gado");
        setResizable(false);
        setSize(new java.awt.Dimension(900, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnVendas.setBackground(new java.awt.Color(51, 255, 255));
        btnVendas.setForeground(new java.awt.Color(0, 0, 0));
        btnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dinheiro.png"))); // NOI18N
        btnVendas.setText("Vendas");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnRelatorios.setBackground(new java.awt.Color(255, 153, 153));
        btnRelatorios.setForeground(new java.awt.Color(0, 0, 0));
        btnRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lista.png"))); // NOI18N
        btnRelatorios.setText("Relatórios");
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(51, 255, 204));
        btnClientes.setForeground(new java.awt.Color(0, 0, 0));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuarios.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProdutos.setBackground(new java.awt.Color(0, 255, 153));
        btnProdutos.setForeground(new java.awt.Color(0, 0, 0));
        btnProdutos.setText("Produtos");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(btnRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(btnVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 660));

        tabClientes.setMaximumSize(new java.awt.Dimension(1100, 700));
        tabClientes.setPreferredSize(new java.awt.Dimension(1100, 700));

        btnCadCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/do-utilizador add.png"))); // NOI18N
        btnCadCli.setText("Cadastrar Cliente");
        btnCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCliActionPerformed(evt);
            }
        });

        btnEditCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lapis.png"))); // NOI18N
        btnEditCli.setText("Editar Cliente");
        btnEditCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCliActionPerformed(evt);
            }
        });

        btnDelCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo.png"))); // NOI18N
        btnDelCli.setText("Exluir Cliente");
        btnDelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelCliActionPerformed(evt);
            }
        });

        txtBuscarCli.setText("Buscar Cliente");
        txtBuscarCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarCliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarCliFocusLost(evt);
            }
        });
        txtBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCliActionPerformed(evt);
            }
        });

        btnBuscarCli.setText("Buscar");
        btnBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliActionPerformed(evt);
            }
        });

        tabCli.setAutoCreateRowSorter(true);
        tabCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CEP", "ENDEREÇO", "CPF", "EMAIL", "TELEFONE", "SEXO", "ESTADO CIVIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabCli.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabCli.setColumnSelectionAllowed(true);
        tabCli.setGridColor(new java.awt.Color(153, 153, 153));
        tabCli.setShowGrid(true);
        tabCli.getTableHeader().setResizingAllowed(false);
        tabCli.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabCli);

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addComponent(txtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditCli, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelCli, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))))
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarCli)
                    .addComponent(btnCadCli)
                    .addComponent(btnEditCli)
                    .addComponent(btnDelCli)
                    .addComponent(txtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        tabClientes.addTab("tabClientes", pnlClientes);

        pnlProdutos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnlProdutosFocusGained(evt);
            }
        });

        tabProd.setAutoCreateRowSorter(true);
        tabProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOME", "QUANTIDADE", "VALOR ENTRADA", "VALOR VENDA", "FATURAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabProd.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabProd.setColumnSelectionAllowed(true);
        tabProd.setShowGrid(true);
        tabProd.getTableHeader().setResizingAllowed(false);
        tabProd.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabProd);
        tabProd.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tabProd.getColumnModel().getColumnCount() > 0) {
            tabProd.getColumnModel().getColumn(0).setResizable(false);
            tabProd.getColumnModel().getColumn(1).setResizable(false);
            tabProd.getColumnModel().getColumn(2).setResizable(false);
            tabProd.getColumnModel().getColumn(4).setResizable(false);
        }

        btnCadProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrinho-de-compras.png"))); // NOI18N
        btnCadProd.setText("Cadastrar Produto");
        btnCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadProdActionPerformed(evt);
            }
        });

        btnEditProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lapis.png"))); // NOI18N
        btnEditProd.setText("Editar Produto");
        btnEditProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProdActionPerformed(evt);
            }
        });

        btnDelProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo.png"))); // NOI18N
        btnDelProd.setText("Exluir Produto");
        btnDelProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelProdActionPerformed(evt);
            }
        });

        txtBuscarProd.setText("Buscar Produto");
        txtBuscarProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarProdFocusLost(evt);
            }
        });
        txtBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarProdActionPerformed(evt);
            }
        });

        btnBuscarProd.setText("Buscar");
        btnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProdutosLayout = new javax.swing.GroupLayout(pnlProdutos);
        pnlProdutos.setLayout(pnlProdutosLayout);
        pnlProdutosLayout.setHorizontalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProdutosLayout.createSequentialGroup()
                        .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadProd, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnDelProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(pnlProdutosLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlProdutosLayout.setVerticalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProd)
                    .addComponent(btnCadProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );

        tabClientes.addTab("tabProdutos", pnlProdutos);

        pnlVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnlVendaFocusGained(evt);
            }
        });

        tabVenda.setAutoCreateRowSorter(true);
        tabVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "QUANTIDADE", "VALOR VENDA", "FATURAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabVenda.getTableHeader().setResizingAllowed(false);
        tabVenda.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabVenda);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        lblSubNumero.setBackground(new java.awt.Color(153, 153, 153));
        lblSubNumero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSubNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubNumero.setText("0");

        lblSubtotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtotal.setText("SUBTOTAL DA COMPRA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(lblSubNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnAdicionar.setText("Adicionar Item");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        try {
            ftxCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ftxCPFKeyReleased(evt);
            }
        });

        lblQuant.setText("Quantidade");

        spnQuant.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        spnQuant.setToolTipText("max: 999");
        spnQuant.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnQuantStateChanged(evt);
            }
        });

        lblProd.setText("Produtos");

        lblCPF.setText("CPF Cliente");

        btnVenda.setText("Registrar Venda");
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        txtProdID.setText("Clique aqui para pesquisar o produto...");
        txtProdID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProdIDMouseClicked(evt);
            }
        });
        txtProdID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdIDActionPerformed(evt);
            }
        });

        btnRemove.setText("Remover Item");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        lblNomeCli.setText("Nome do Cliente");

        jLabel3.setText("Valor Total");

        txtProdutoValorTotal.setEditable(false);

        lblNome.setEditable(false);

        jLabel4.setText("valor unitario");

        txtValorUnitario.setEditable(false);

        javax.swing.GroupLayout pnlVendaLayout = new javax.swing.GroupLayout(pnlVenda);
        pnlVenda.setLayout(pnlVendaLayout);
        pnlVendaLayout.setHorizontalGroup(
            pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(pnlVendaLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                    .addGroup(pnlVendaLayout.createSequentialGroup()
                        .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlVendaLayout.createSequentialGroup()
                                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spnQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQuant))
                                .addGap(18, 18, 18)
                                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtProdutoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlVendaLayout.createSequentialGroup()
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlVendaLayout.createSequentialGroup()
                                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCPF)
                                    .addComponent(ftxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeCli)
                                    .addComponent(lblNome)))
                            .addGroup(pnlVendaLayout.createSequentialGroup()
                                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pnlVendaLayout.setVerticalGroup(
            pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVendaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProd)
                    .addComponent(lblQuant)
                    .addComponent(lblCPF)
                    .addComponent(jLabel3)
                    .addComponent(lblNomeCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProdutoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVendaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlVendaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        tabClientes.addTab("tabVendas", pnlVenda);

        tabRelatorio2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Produto", "Nome Produto", "Valor KG", "Valor Unitário", "Valor Total"
            }
        ));
        tabRelatorio2.getTableHeader().setResizingAllowed(false);
        tabRelatorio2.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tabRelatorio2);

        lblTotal.setText("Total:");

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Relatório Vendas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblDataInicio.setText("Data Inicial");

        lblDataFinal.setText("Data Final");

        tabRelatorio1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Data da Venda", "CPF", "Nome Cliente", "Total de Itens", "Valor Total"
            }
        ));
        tabRelatorio1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabRelatorio1.getTableHeader().setResizingAllowed(false);
        tabRelatorio1.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tabRelatorio1);

        dacDataInicio.setDateFormatString("dd/MM/yyyy");

        dacDataFinal.setDateFormatString("dd/MM/yyyy");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRelatoriosLayout = new javax.swing.GroupLayout(pnlRelatorios);
        pnlRelatorios.setLayout(pnlRelatoriosLayout);
        pnlRelatoriosLayout.setHorizontalGroup(
            pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlRelatoriosLayout.createSequentialGroup()
                .addGroup(pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRelatoriosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRelatoriosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))))
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(pnlRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataInicio)
                    .addComponent(dacDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataFinal)
                    .addGroup(pnlRelatoriosLayout.createSequentialGroup()
                        .addComponent(dacDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlRelatoriosLayout.setVerticalGroup(
            pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataFinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDataInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dacDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dacDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNumTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        tabClientes.addTab("tabRelatorios", pnlRelatorios);

        getContentPane().add(tabClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -35, 830, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private produtoConsulta consultaProduto;
    private DefaultTableModel tableModel;
    private Produto produto;
    private Vendas venda;

    public void atualizaSubtotal() {
        Float subtotal = 0f;

        DefaultTableModel tableModel = (DefaultTableModel) tabVenda.getModel();

        for (int i = 0; i < tableModel.getRowCount(); i++) {
            Object valorColuna4 = tableModel.getValueAt(i, 3);

            try {
                if (valorColuna4 != null) {
                    subtotal += Float.parseFloat(valorColuna4.toString());
                } else {
                    System.out.println("A coluna de VALOR está vazia na linha " + i);
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter valor numérico na linha " + i);
            }
        }
        lblSubNumero.setText(subtotal.toString());
    }

    void preencherCamposDaTelaPrincipal(Produto produto) {
        txtProdID.setText(produto.getNomeProd());
        txtValorUnitario.setText(Double.toString(produto.getValorVenda()));
        txtProdutoValorTotal.setText(Double.toString(produto.getValorVenda()));

        alteraQuantidade();
    }

    public void alteraQuantidade() {
        try {
            Produto produtoTela = new Produto();
            produtoTela.setNomeProd(txtProdID.getText());

            String valorUnitarioText = txtValorUnitario.getText().trim();
            if (!valorUnitarioText.isEmpty()) {
                try {
                    double valorUnitario = Double.parseDouble(valorUnitarioText.replace(",", "."));
                    produtoTela.setValorVenda(valorUnitario);

                    if (spnQuant.getValue() != null) {
                        produtoTela.setQuantidade((Integer) spnQuant.getValue());

                        double valorTotal = produtoTela.getValorVenda() * (Integer) spnQuant.getValue();
                        txtProdutoValorTotal.setText(Double.toString(valorTotal));
                    } else {

                        System.out.println("O valor do Spinner é nulo.");
                    }
                } catch (NumberFormatException ex) {

                    System.out.println("Formato inválido para o valor unitário.");
                }
            } else {

                System.out.println("O campo do valor unitário está vazio.");
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public boolean verificaEstoque() {
        //Coloca dados da tela numa instancia de produto
        if (!txtProdID.getText().equalsIgnoreCase("Clique aqui para pesquisar o produto...")) {
            Produto produtoTela = new Produto();
            produtoTela.setNomeProd(txtProdID.getText());
            produtoTela.setQuantidade((Integer) spnQuant.getValue());
            produtoTela.setValorVenda(Double.parseDouble(txtValorUnitario.getText()));

            Integer quantidadeNaLista = 0;

            //pega toda a quantidade do produto ja inserida na lista
            for (int i = 0; i + 1 <= tabVenda.getModel().getRowCount(); i++) {
                //obtem o id dessa linha

                if (produto != null) {
                    if (produto.getId() == (Integer) tabVenda.getValueAt(i, 1)) {
                        quantidadeNaLista += (Integer) tabVenda.getValueAt(i, 3);
                    }
                }
            }
            //se a quantidade em estoque for menos que a quantidade solicitada
            if (produto.getQuantidade() < (produtoTela.getQuantidade() + quantidadeNaLista)) {
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Pesquise um produto");
        }
        return true;
    }


    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        tabClientes.setSelectedIndex(3);
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        tabClientes.setSelectedIndex(0);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        tabClientes.setSelectedIndex(1);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        tabClientes.setSelectedIndex(2);
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCliActionPerformed
        cadastroCliente cadcli = new cadastroCliente();
        cadcli.setVisible(true);
    }//GEN-LAST:event_btnCadCliActionPerformed

    private void btnCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadProdActionPerformed
        cadastroProduto cadProd = new cadastroProduto();
        cadProd.setVisible(true);
    }//GEN-LAST:event_btnCadProdActionPerformed

    private void btnEditProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProdActionPerformed

        int linhaSelecionada = tabProd.getSelectedRow();

        DefaultTableModel modelo = (DefaultTableModel) tabProd.getModel();

        if (linhaSelecionada >= 0) {
            int idSelecionado = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());
            String nomeSelecionado = (String) modelo.getValueAt(linhaSelecionada, 1);

            String quantidadeString = (String) modelo.getValueAt(linhaSelecionada, 2);
            int quantidadeSelecionado;
            try {
                quantidadeSelecionado = Integer.parseInt(quantidadeString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "A quantidade não é um número válido.");
                return;
            }

            String valorEntradaString = (String) modelo.getValueAt(linhaSelecionada, 3);
            Double valorEntradaSelecionado;
            try {
                valorEntradaSelecionado = Double.parseDouble(valorEntradaString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "O valor de entrada não é um número válido.");
                return;
            }

            String valorVendaString = (String) modelo.getValueAt(linhaSelecionada, 4);
            Double valorVendaSelecionado;
            try {
                valorVendaSelecionado = Double.parseDouble(valorVendaString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "O valor de venda não é um número válido.");
                return;
            }

            String faturacaoSelecionada = (String) modelo.getValueAt(linhaSelecionada, 5);

            Produto ProdAlterar = new Produto(idSelecionado, nomeSelecionado, quantidadeSelecionado,
                    valorEntradaSelecionado, valorVendaSelecionado, faturacaoSelecionada);

            cadastroProduto TelaAlterar = new cadastroProduto(ProdAlterar);
            TelaAlterar.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }


    }//GEN-LAST:event_btnEditProdActionPerformed

    private void btnEditCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCliActionPerformed

        int linhaSelecionada = tabCli.getSelectedRow();

        DefaultTableModel modelo = (DefaultTableModel) tabCli.getModel();

        if (linhaSelecionada >= 0) {

            int idSelecionado = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());

            String nomeSelecionado = (String) modelo.getValueAt(linhaSelecionada, 1);

            String cepSelecionado = (String) modelo.getValueAt(linhaSelecionada, 2);

            String enderecoSelecionado = (String) modelo.getValueAt(linhaSelecionada, 3);

            String cpfSelecionado = (String) modelo.getValueAt(linhaSelecionada, 4);

            String emailSelecionado = (String) modelo.getValueAt(linhaSelecionada, 5);

            String telefoneSelecionado = (String) modelo.getValueAt(linhaSelecionada, 6);

            String sexoSelecionado = (String) modelo.getValueAt(linhaSelecionada, 7);

            String estadoCivilSelecionado = (String) modelo.getValueAt(linhaSelecionada, 8);

            Cliente objAlterar = new Cliente(idSelecionado, nomeSelecionado, cepSelecionado,
                    enderecoSelecionado, cpfSelecionado, emailSelecionado, telefoneSelecionado,
                    sexoSelecionado, estadoCivilSelecionado);

            cadastroCliente telaAlterar = new cadastroCliente(objAlterar);
            telaAlterar.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }


    }//GEN-LAST:event_btnEditCliActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        /*
        venda = new Vendas();
        double valorTotal = 0;

        if (tabVenda.getModel().getRowCount() < 1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Você precisa adicionar itens no carrinho!",
                    "Atencão",
                    JOptionPane.ERROR_MESSAGE);
            //sai do método 
            return;
        }

        //se não houver cliente na venda
        if (lblNome == null) {

            //avisa que não existe cliente para registrar junto a venda
            int respostaConfirmacao = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Não existe cliente na venda.\n\n"
                    + "Deseja continuar?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION);

            //se resposa for não para continuar o registro da venda
            if (respostaConfirmacao == JOptionPane.NO_OPTION) {
                //sai do método 
                return;
            }
        }

        //coloca dados da venda na instancia
        java.util.Date data = new Date();
        venda.setVlrTotal(Float.parseFloat(lblSubNumero.getText()));
        venda.setDataVenda(data);

        //coloca cada item da venda na lista de itens da venda da instancia de venda
        for (int i = 0;i + 1 <= tabVenda.getModel()
                        .getRowCount(); i++) {
            //obtem o id dessa linha
            ItemVenda itemVenda = new ItemVenda();
            itemVenda.setIdVenda(venda.getIdVenda());
            itemVenda.setIdItemVenda((Integer) tabVenda.getValueAt(i, 0));
            itemVenda.setIdProduto((String) tabVenda.getValueAt(i, 1));
            itemVenda.setQtd((Integer) tabVenda.getValueAt(i, 2));
            itemVenda.setVlrUnitario((Double) tabVenda.getValueAt(i, 3));
            itemVenda.setValor((Float) tabelaVenda.getValueAt(i, 4));
            itemVenda.setValorTotal(itemVenda.getQuantidade() * itemVenda.getValor());

            venda.adicionarItem(itemVenda);
        }

        //coloca dados do cliente da venda na instancia de venda
        venda.getCliente()
                .setNome(txtClienteNomeInfo.getText());
        venda.getCliente()
                .setCpf(txtClienteCpfInfo.getText());
        venda.getCliente()
                .setCidade(txtClienteCidadeInfo.getText());
        venda.getCliente()
                .setLogradouro(txtClienteLogradouroInfo.getText());
        venda.getCliente()
                .setNumero(txtClienteNumeroInfo.getText());

        //se o valor pago for maior ou igual que o subtotal da compra
        if (venda.getPagamentoCartao()
                + venda.getPagamentoDinheiro() >= venda.getSubtotal()) {

            //envia venda para salvar para o controller
            respostaController = VendaController.salvar(venda);

            //se a resposta for positiva salva os itens da venda
            if (respostaController == null) {
                //salva todos os itens da venda - (faz loop na lista de itens)
                for (int i = 0; i < venda.getItensVenda().size(); i++) {

                    //envia item da venda para para o controller salvar
                    respostaController2 = ItensVendaController.salvar(venda.getItensVenda().get(i));

                    //atualiza quantidade de produto em estoque.
                    //para cada item da venda, pega o produto em estoque
                    //decrementa a quantidade vendida e envia ele com a quantidade 
                    //atualizada para o controller atualizar no estoque
                    Produto produtoAtualizado = ProdutoController.obter(venda.getItensVenda().get(i).getId());
                    produtoAtualizado.setQuantidade(produtoAtualizado.getQuantidade() - venda.getItensVenda().get(i).getQuantidade());
                    respostaController3 = ProdutoController.atualizar(produtoAtualizado);
                }

                //dando tudo certo envia mensagem para usuário o resumo da compra
                troco = (venda.getPagamentoCartao() + venda.getPagamentoDinheiro()) - venda.getSubtotal();
                JOptionPane.showMessageDialog(rootPane,
                        "Venda número " + vendaIndex + " registrada!\n\n"
                        + "Subtotal da compra R$" + venda.getSubtotal() + "\n"
                        + "Total pago em Dinheiro R$" + venda.getPagamentoDinheiro() + "\n"
                        + "Total pago em Cartão R$" + venda.getPagamentoCartao() + "\n"
                        + "Troco R$" + troco + "\n\n"
                        + "Agora você pode consultar sua venda em:\n"
                        + "Menu > Relatório",
                        "Informe de registro",
                        JOptionPane.INFORMATION_MESSAGE);

                //Limpa o formulário da tela de vendas
                limpaTelaVenda();

                //Atualiza número da venda na tela de vendas
                atualizaIndiceVenda();
            } else//se a resposta do controller for negativa
            {
                //Exibe mensagens de erro para o usuário
                JOptionPane.showMessageDialog(rootPane,
                        respostaController
                        + "\n Procure o administrador do sistema!",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
            //se o valor pago for menor que o valor da compra
        } else {
            valorFaltante = venda.getSubtotal() - (venda.getPagamentoCartao() + venda.getPagamentoDinheiro());
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane,
                    "Subtotal da compra R$" + venda.getSubtotal() + "\n"
                    + "Total em Dinheiro R$" + venda.getPagamentoDinheiro() + "\n"
                    + "Total em Cartão R$" + venda.getPagamentoCartao() + "\n\n"
                    + "Faltam R$" + valorFaltante + "\n\n"
                    + "Complete o e tente novamente.",
                    "Venda não registrada",
                    JOptionPane.ERROR_MESSAGE);
        }*/

    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (!txtProdID.getText().equalsIgnoreCase("Clique aqui para pesquisar o produto...")) {
            ArrayList<Produto> lista = ItensVendaDAO.buscarProduto(txtProdID);

            if (!lista.isEmpty()) {
                DefaultTableModel modelo = (DefaultTableModel) tabVenda.getModel();
                String nomeProdutoNovo = lista.get(0).getNomeProd();
                int quantidadeProdutoNovo = (int) spnQuant.getValue();

                if (quantidadeProdutoNovo > 0) {

                    boolean produtoJaAdicionado = false;
                    for (int i = 0; i < modelo.getRowCount(); i++) {
                        String nomeProdutoTabela = modelo.getValueAt(i, 1).toString();
                        if (nomeProdutoTabela.equalsIgnoreCase(nomeProdutoNovo)) {
                            produtoJaAdicionado = true;
                            break;
                        }
                    }

                    if (!produtoJaAdicionado) {
                        // Adiciona o produto à tabela
                        modelo.addRow(new String[]{
                            String.valueOf(lista.get(0).getId()),
                            String.valueOf(lista.get(0).getNomeProd()),
                            String.valueOf(quantidadeProdutoNovo), // Adiciona a quantidade do Spinner
                            String.valueOf(txtProdutoValorTotal.getText()),
                            String.valueOf(lista.get(0).getFaturacao())
                        });

                        // Chama o método para atualizar o subtotal
                        atualizaSubtotal();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Este produto já foi adicionado à venda.");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "A quantidade do produto deve ser maior que zero.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto.");
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try {
            int row = tabVenda.getSelectedRow();

            // Use diretamente o tableModel
            if (row != -1) {
                tableModel.removeRow(row);
                atualizaSubtotal();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Selecione uma linha para remover.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliActionPerformed

        ArrayList<Cliente> lista = ClienteDao.listar();

        DefaultTableModel modelo = (DefaultTableModel) tabCli.getModel();
        modelo.setRowCount(0);

        for (Cliente item : lista) {
            modelo.addRow(new String[]{
                String.valueOf(item.getId()),
                String.valueOf(item.getNome()),
                String.valueOf(item.getCep()),
                String.valueOf(item.getEndereco()),
                String.valueOf(item.getCpf()),
                String.valueOf(item.getEmail()),
                String.valueOf(item.getTelefone()),
                String.valueOf(item.getSexo()),
                String.valueOf(item.getEstadoCivil())

            });
        }

    }//GEN-LAST:event_btnBuscarCliActionPerformed

    private void btnDelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelCliActionPerformed
        int linhaSelecionada = tabCli.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente para excluir.");
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) tabCli.getModel();
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "A tabela está vazia.");
            return;
        }

        Object valorCelula = modelo.getValueAt(linhaSelecionada, 0);
        if (valorCelula == null) {
            JOptionPane.showMessageDialog(rootPane, "A célula selecionada está vazia.");
            return;
        }

        int idExcluir = Integer.parseInt(valorCelula.toString());
        boolean retorno = ClienteDao.excluir(idExcluir);
        if (retorno) {
            JOptionPane.showMessageDialog(rootPane, "Sucesso!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Falha!");
        }

    }//GEN-LAST:event_btnDelCliActionPerformed

    private void txtBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCliActionPerformed

    }//GEN-LAST:event_txtBuscarCliActionPerformed

    private void txtBuscarCliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarCliFocusGained
        txtBuscarCli.setText("");
    }//GEN-LAST:event_txtBuscarCliFocusGained

    private void txtBuscarCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarCliFocusLost
        txtBuscarCli.setText("Buscar Cliente");
    }//GEN-LAST:event_txtBuscarCliFocusLost

    private void txtBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProdActionPerformed

    private void btnDelProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelProdActionPerformed
        int linhaSelecionada = tabProd.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto para excluir.");
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) tabProd.getModel();
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "A tabela está vazia.");
            return;
        }

        if (linhaSelecionada >= 0 && linhaSelecionada < modelo.getRowCount()) {
            // Se a linha selecionada for válida, prossiga com o código atual
            int idExcluir = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());
            boolean retorno = ProdutoDao.excluir(idExcluir);
            if (retorno) {
                JOptionPane.showMessageDialog(rootPane, "Sucesso!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Falha!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Linha selecionada inválida.");
        }

            }//GEN-LAST:event_btnDelProdActionPerformed

    private void btnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdActionPerformed

        ArrayList<Produto> lista = ProdutoDao.listar();

        DefaultTableModel modelo = (DefaultTableModel) tabProd.getModel();
        modelo.setRowCount(0);

        for (Produto item : lista) {
            modelo.addRow(new String[]{
                String.valueOf(item.getId()),
                String.valueOf(item.getNomeProd()),
                String.valueOf(item.getQuantidade()),
                String.valueOf(item.getValorEntrada()),
                String.valueOf(item.getValorVenda()),
                String.valueOf(item.getFaturacao())
            });
        }    }//GEN-LAST:event_btnBuscarProdActionPerformed

    private void pnlProdutosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnlProdutosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlProdutosFocusGained

    private void txtProdIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdIDActionPerformed

    private void txtBuscarProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarProdFocusGained
        txtBuscarProd.setText("");
    }//GEN-LAST:event_txtBuscarProdFocusGained

    private void txtBuscarProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarProdFocusLost
        txtBuscarProd.setText("Buscar Produto");
    }//GEN-LAST:event_txtBuscarProdFocusLost

    private void txtProdIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProdIDMouseClicked
        produtoConsulta prodConsulta = new produtoConsulta(this);
        prodConsulta.setVisible(true);
        prodConsulta.setLocationRelativeTo(this);
    }//GEN-LAST:event_txtProdIDMouseClicked

    private void pnlVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnlVendaFocusGained

        produto = new Produto();

        try {
            //coloca dados do produto a partir do produto selecionado 
            //na tela de consulta de produto da venda
            produto.setId(consultaProduto.getProduto().getId());
            produto.setNomeProd(consultaProduto.getProduto().getNomeProd());
            produto.setQuantidade(consultaProduto.getProduto().getQuantidade());
            produto.setValorVenda(consultaProduto.getProduto().getValorVenda());
            produto.setFaturacao(consultaProduto.getProduto().getFaturacao());

            //coloca na tela de venda nome e valor do produto
            txtProdID.setText(produto.getNomeProd());
            txtProdutoValorTotal.setText(Double.toString(produto.getValorVenda()));

            spnQuant.setValue(1);
            //verifica se o produto selecionado tem mais que 1 item no estoque
            alteraQuantidade();

        } catch (Exception e) {

        }
    }//GEN-LAST:event_pnlVendaFocusGained

    private void spnQuantStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnQuantStateChanged
        alteraQuantidade();
    }//GEN-LAST:event_spnQuantStateChanged
    private void consultarCliente() {
        String cpf = formatarCPF(ftxCPF.getText());
        if (!cpf.isEmpty() && cpf.length() == 14) {
            // Chama o método do ClienteDAO para buscar as informações do cliente por CPF
            ArrayList<Cliente> clientes = ClienteDao.buscarClientePorCPF(cpf);

            if (!clientes.isEmpty()) {
                // Assume que encontrou o primeiro cliente com o CPF informado
                Cliente primeiroCliente = clientes.get(0);

                // Atualiza o JLabel com o nome do cliente
                lblNome.setText(primeiroCliente.getNome());
            } else {
                lblNome.setText("Cliente não encontrado.");
            }
        } else {
            lblNome.setText("Por favor, insira um CPF válido.");
        }
    }

    private String formatarCPF(String cpf) {
        // Remove todos os caracteres não numéricos
        return cpf.replaceAll("^[0-9].-(),", "");
    }

    private void ftxCPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftxCPFKeyReleased
        consultarCliente();
    }//GEN-LAST:event_ftxCPFKeyReleased

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarCli;
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JButton btnCadCli;
    private javax.swing.JButton btnCadProd;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnDelCli;
    private javax.swing.JButton btnDelProd;
    private javax.swing.JButton btnEditCli;
    private javax.swing.JButton btnEditProd;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnVenda;
    private javax.swing.JButton btnVendas;
    private com.toedter.calendar.JDateChooser dacDataFinal;
    private com.toedter.calendar.JDateChooser dacDataInicio;
    private javax.swing.JFormattedTextField ftxCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblDataInicio;
    private javax.swing.JTextField lblNome;
    private javax.swing.JLabel lblNomeCli;
    private javax.swing.JLabel lblNumTotal;
    private javax.swing.JLabel lblProd;
    private javax.swing.JLabel lblQuant;
    private javax.swing.JLabel lblSubNumero;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlProdutos;
    private javax.swing.JPanel pnlRelatorios;
    private javax.swing.JPanel pnlVenda;
    private javax.swing.JSpinner spnQuant;
    private javax.swing.JTable tabCli;
    private javax.swing.JTabbedPane tabClientes;
    private javax.swing.JTable tabProd;
    private javax.swing.JTable tabRelatorio1;
    private javax.swing.JTable tabRelatorio2;
    private javax.swing.JTable tabVenda;
    private javax.swing.JTextField txtBuscarCli;
    private javax.swing.JTextField txtBuscarProd;
    private javax.swing.JTextField txtProdID;
    private javax.swing.JTextField txtProdutoValorTotal;
    private javax.swing.JTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables

}
