package com.mycompany.rei_do_gado;

import com.mycompany.rei_do_gadoBD.ClienteDao;
import com.mycompany.rei_do_gadoBD.ItensVendaDAO;
import com.mycompany.rei_do_gadoBD.ProdutoDao;
import com.mycompany.reidogadoclasses.Cliente;
import com.mycompany.reidogadoclasses.Produto;
import com.mycompany.reidogadoclasses.Vendas;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class menuPrincipal extends javax.swing.JFrame {

    public menuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        ftxCPF.setDocument(new ValidadorNumeros());

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
        jTextField2 = new javax.swing.JTextField();
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
                "Id do Produto", "Nome", "Quantidade", "Valor", "Faturação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
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

        lblQuant.setText("Quantidade");

        spnQuant.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        spnQuant.setToolTipText("max: 999");

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

        jTextField2.setEditable(false);

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
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(txtProdutoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPF)
                            .addComponent(ftxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeCli)
                            .addComponent(jTextField2))))
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
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
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
    
    
     public void atualizaSubtotal(){
        Float subtotal =0f;
       
        //faz cálculo de subtotal da compra
        for(int i = 1; i <=tableModel.getRowCount(); i++){
            subtotal += (float) tabVenda.getValueAt(i-1, 5);   
        }
        
        //insere valor subtotal da compra na label
        lblSubNumero.setText(subtotal.toString());
    }
    
     public void alteraQuantidade(){
        //Coloca dados da tela numa instancia de produto
        Produto produtoTela = new Produto();
        produtoTela.setNomeProd(txtProdID.getText());
        produtoTela.setQuantidade((Integer) spnQuant.getValue());
        double valorTotal = 0;
   
        //faz calculo de valor total
        valorTotal = produtoTela.getValorVenda() * produtoTela.getQuantidade();
        txtProdutoValorTotal.setText(Double.toString(valorTotal));    
    }
    
    //VERIFICA A QUANTIDADE EM ESTOQUE
    public boolean verificaEstoque(){
        //Coloca dados da tela numa instancia de produto
        Produto produtoTela = new Produto();
        produtoTela.setNomeProd(txtProdID.getText());
        produtoTela.setQuantidade((Integer) spnQuant.getValue());
        
        Integer quantidadeNaLista = 0;
        
        //pega toda a quantidade do produto ja inserida na lista
        for(int i = 0; i+1 <=tabVenda.getModel().getRowCount(); i++){
            //obtem o id dessa linha
            
            if(produto != null){
                if(produto.getId() == (Integer) tabVenda.getValueAt(i, 1)){
                    quantidadeNaLista += (Integer) tabVenda.getValueAt(i, 3);
                }
            }
        }
            //se a quantidade em estoque for menos que a quantidade solicitada
            if(produto.getQuantidade()<(produtoTela.getQuantidade()+quantidadeNaLista)){
                return false;
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        //Obtém a tabela para trabalhar nela
         tableModel = (DefaultTableModel) tabVenda.getModel();
        //se a quantidade solicitada for maior que valor em estoque
        if (verificaEstoque()){
            
            if (!txtProdID.getText().equalsIgnoreCase("Clique aqui para pesquisar o produto...")) 
            {
                Integer idItem;

                //pega numero do ultimo item adicionado
                Integer ultimaLinha = tabVenda.getModel().getRowCount();
                if(ultimaLinha < 1){
                    idItem = 1;
                }
                else{
                    idItem = (Integer) tabVenda.getValueAt(ultimaLinha-1, 0);
                    idItem +=1;
                }

                //Cria array com valores do produto
                Object[] dadosTabela = new Object[6];
                //Cada dado na coluna correspondente
                dadosTabela[0] = idItem;
                dadosTabela[1] = produto.getId();
                dadosTabela[2] = produto.getNomeProd();
                dadosTabela[3] = (Integer) spnQuant.getValue();
                dadosTabela[4] = produto.getValorVenda();
                dadosTabela[5] = Float.valueOf(txtProdutoValorTotal.getText());

                //Adiciona a linha de dados na tabela
                tableModel.addRow(dadosTabela);

                atualizaSubtotal();
            }
        }else{
            //informa usuario que nao tem quantidade suficiente em estoque 
            //para inserir na venda
            JOptionPane.showMessageDialog(rootPane, 
                """
                Usu\u00e1rio, a quantidade de produtos solicitadas n\u00e3o existem em estoque! 
                A quantidade deste produto em estoque \u00e9 """+produto.getQuantidade()+".",
                "Atenção", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
            try{
            //Resgato o índice da linha selecionada
            int row = tabVenda.getSelectedRow();

            //Passo o indice da linha a ser removida
            tableModel.removeRow(row);
            
            atualizaSubtotal();
        }
        catch(Exception e){}
        
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

        DefaultTableModel modelo = (DefaultTableModel) tabCli.getModel();
        int idExcluir = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());
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

        DefaultTableModel modelo = (DefaultTableModel) tabProd.getModel();
        int idExcluir = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());
        boolean retorno = ProdutoDao.excluir(idExcluir);
        if (retorno) {
            JOptionPane.showMessageDialog(rootPane, "Sucesso!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Falha!");
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
        produtoConsulta prodConsulta = new produtoConsulta();
        prodConsulta.setVisible(true);
        prodConsulta.setLocationRelativeTo(this);
    }//GEN-LAST:event_txtProdIDMouseClicked

    private void pnlVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnlVendaFocusGained
       
        
        
        produto = new Produto();
        
        try{
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
            
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_pnlVendaFocusGained

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblDataInicio;
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
    // End of variables declaration//GEN-END:variables

}
