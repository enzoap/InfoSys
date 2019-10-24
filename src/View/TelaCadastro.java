/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Produto;
import Model.Produtos;
import Model.Tecnicos;
import Utilitario.Mascara;
import Utilitario.MascaraCelular;
import Utilitario.MascaraFone;

/**
 *
 * @author Aluno
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        tfCliNome.requestFocusInWindow();
        setMask();
    }
    
    //-Métodos
    
    private void limpaCliente(){
        tfCliNome.setText("");
        tfCliTel.setText("");
        tfCliTel.setText("");
        tfCliCel.setText("");
        tfCliEmail.setText("");
        tfCliNome.requestFocusInWindow();
}
    
    private void limpaProduto(){
        tfProDescricao.setText("");
        tfProVlCusto.setText("");
        tfProVlVenda.setText("");
        spProEstoque.setValue(0);
        cbProAtivo.setSelected(true);
        tfProDescricao.requestFocusInWindow();
}
    
    private void limpaTecnico(){
        tfTecCusto.setText("");
        tfTecNome.setText("");
        tfTecValor.setText("");
        tfTecSalario.setText("");
        tfTecNome.requestFocus();
    }
//    private void limpaProdutos(){
//        tfProDescricao.setText("");
//        spProEstoque.setValue("");
//        cbProAtivo.setSelected(true);
//        tfProVlCusto.setText("");
//        tfProVlVenda.setText("");
//        tfProDescricao.requestFocus();
//    }
    
    
    private void gravaCliente(){
        String nome = tfCliNome.getText();
        String cpf = tfCliTel.getText();
        String fone = tfCliTel.getText();
        String celular = tfCliCel.getText();
        String email = tfCliEmail.getText();
        System.out.println(new Cliente(nome,cpf,fone,celular,email));
        limpaCliente(); 
    }
    
    private void gravaProduto(){
        String descricao = tfProDescricao.getText();
        int estoque = (int) spProEstoque.getValue();
        Double custo = Double.parseDouble(tfProVlCusto.getText());
        Double valor = Double.parseDouble(tfProVlVenda.getText());
        System.out.println(new Produto(descricao, estoque, valor, custo));
    }
    
    public void gravaProdutos(){
        
    }
    
    private void gravaTecnico(){
        String nome = tfTecNome.getText();
        String valor = tfTecValor.getText();
        Double salario =  Double.parseDouble(tfTecSalario.getText());
        System.out.println(new Tecnicos(nome, valor,salario));
    }
    
    
    //Chama a mascara
    private void setMask(){
        tfCliTel.setFormatterFactory(MascaraFone.fone());
        tfCliCel.setFormatterFactory(MascaraCelular.celular());
        tfCliCpf.setFormatterFactory(Mascara.getCpfMask());
        tfProVlCusto.setFormatterFactory(Mascara.getValorMask());
        tfProVlVenda.setFormatterFactory(Mascara.getValorMask());
        tfTecSalario.setFormatterFactory(Mascara.getValorMask());
        tfTecValor.setFormatterFactory(Mascara.getValorMask());
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        PnTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnButtons = new javax.swing.JPanel();
        btGravar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        tbTela = new javax.swing.JTabbedPane();
        pnClientes = new javax.swing.JPanel();
        lbCliNome = new javax.swing.JLabel();
        tfCliNome = new javax.swing.JTextField();
        lbCliCpf = new javax.swing.JLabel();
        lbClitel = new javax.swing.JLabel();
        lbCliCel = new javax.swing.JLabel();
        tfCliEmail = new javax.swing.JTextField();
        lbCliEmail = new javax.swing.JLabel();
        tfCliTel = new javax.swing.JFormattedTextField();
        tfCliCpf = new javax.swing.JFormattedTextField();
        tfCliCel = new javax.swing.JFormattedTextField();
        pnProdutos = new javax.swing.JPanel();
        lbProDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfProDescricao = new javax.swing.JTextPane();
        lbProVlCusto = new javax.swing.JLabel();
        lbProVlVenda = new javax.swing.JLabel();
        lbProQtd = new javax.swing.JLabel();
        cbProAtivo = new javax.swing.JCheckBox();
        spProEstoque = new javax.swing.JSpinner();
        tfProVlCusto = new javax.swing.JFormattedTextField();
        tfProVlVenda = new javax.swing.JFormattedTextField();
        pnTécnicos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfTecNome = new javax.swing.JTextField();
        tfTecCusto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfTecSalario = new javax.swing.JFormattedTextField();
        tfTecValor = new javax.swing.JFormattedTextField();
        pnServiços = new javax.swing.JPanel();
        lbSerTecnico = new javax.swing.JLabel();
        tfSertec = new javax.swing.JTextField();
        lbSerHoras = new javax.swing.JLabel();
        tfSerHoras = new javax.swing.JTextField();
        lbSerDescricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfSerDescricao = new javax.swing.JTextPane();
        lbSerVlTotal = new javax.swing.JLabel();
        tfSerVlTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro");
        PnTitulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 0, 266, 108));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/InfoSysLogo-Pequeno.png"))); // NOI18N
        PnTitulo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 128, -1));

        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnButtonsLayout = new javax.swing.GroupLayout(pnButtons);
        pnButtons.setLayout(pnButtonsLayout);
        pnButtonsLayout.setHorizontalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLimpar)
                .addContainerGap())
        );
        pnButtonsLayout.setVerticalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGravar)
                    .addComponent(btLimpar))
                .addContainerGap())
        );

        lbCliNome.setText("Nome:");

        tfCliNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCliNomeActionPerformed(evt);
            }
        });

        lbCliCpf.setText("CPF:");

        lbClitel.setText("Telefone:");

        lbCliCel.setText("Celular:");

        tfCliEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCliEmailActionPerformed(evt);
            }
        });

        lbCliEmail.setText("Email:");

        javax.swing.GroupLayout pnClientesLayout = new javax.swing.GroupLayout(pnClientes);
        pnClientes.setLayout(pnClientesLayout);
        pnClientesLayout.setHorizontalGroup(
            pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCliNome)
                    .addComponent(lbCliCel)
                    .addComponent(lbClitel)
                    .addComponent(lbCliCpf)
                    .addComponent(lbCliEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCliEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(tfCliNome, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(tfCliTel)
                    .addComponent(tfCliCpf)
                    .addComponent(tfCliCel))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        pnClientesLayout.setVerticalGroup(
            pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliNome)
                    .addComponent(tfCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCliCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCliCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbClitel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfCliTel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliCel)
                    .addComponent(tfCliCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCliEmail))
                .addContainerGap())
        );

        tbTela.addTab("Clientes", pnClientes);

        lbProDescricao.setText("Descrição:");

        jScrollPane1.setViewportView(tfProDescricao);

        lbProVlCusto.setText("Valor de Custo:");

        lbProVlVenda.setText("Valor de Venda:");

        lbProQtd.setText("Estoque:");

        cbProAtivo.setText("Ativo");

        spProEstoque.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spProEstoqueStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnProdutosLayout = new javax.swing.GroupLayout(pnProdutos);
        pnProdutos.setLayout(pnProdutosLayout);
        pnProdutosLayout.setHorizontalGroup(
            pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbProVlCusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbProDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbProQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnProdutosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnProdutosLayout.createSequentialGroup()
                                .addComponent(tfProVlCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(lbProVlVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfProVlVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(34, Short.MAX_VALUE))
                            .addGroup(pnProdutosLayout.createSequentialGroup()
                                .addComponent(spProEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbProAtivo)
                                .addGap(48, 48, 48))))
                    .addGroup(pnProdutosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnProdutosLayout.setVerticalGroup(
            pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProVlCusto)
                    .addComponent(lbProVlVenda)
                    .addComponent(tfProVlCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfProVlVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(lbProDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProQtd)
                    .addComponent(cbProAtivo)
                    .addComponent(spProEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        tbTela.addTab("Produtos", pnProdutos);

        jLabel4.setText("Nome:");

        jLabel6.setText("Salário");

        jLabel7.setText("Custo Mensal:");

        tfTecNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTecNomeActionPerformed(evt);
            }
        });

        tfTecCusto.setEditable(false);

        jLabel8.setText("Valor Hora:");

        javax.swing.GroupLayout pnTécnicosLayout = new javax.swing.GroupLayout(pnTécnicos);
        pnTécnicos.setLayout(pnTécnicosLayout);
        pnTécnicosLayout.setHorizontalGroup(
            pnTécnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTécnicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTécnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnTécnicosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tfTecNome, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnTécnicosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tfTecSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTecValor))
                    .addGroup(pnTécnicosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(tfTecCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        pnTécnicosLayout.setVerticalGroup(
            pnTécnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTécnicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTécnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfTecNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnTécnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(tfTecSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTecValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnTécnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfTecCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tbTela.addTab("Técnicos", pnTécnicos);

        lbSerTecnico.setText("Técnico:");

        lbSerHoras.setText("Horas estimada:");

        lbSerDescricao.setText("Descrição:");

        jScrollPane2.setViewportView(tfSerDescricao);

        lbSerVlTotal.setText("Valor total do serviço:");

        javax.swing.GroupLayout pnServiçosLayout = new javax.swing.GroupLayout(pnServiços);
        pnServiços.setLayout(pnServiçosLayout);
        pnServiçosLayout.setHorizontalGroup(
            pnServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnServiçosLayout.createSequentialGroup()
                .addGroup(pnServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnServiçosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSerVlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSerVlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnServiçosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnServiçosLayout.createSequentialGroup()
                                .addComponent(lbSerTecnico)
                                .addGap(18, 18, 18)
                                .addComponent(tfSertec, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbSerHoras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfSerHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnServiçosLayout.createSequentialGroup()
                                .addComponent(lbSerDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnServiçosLayout.setVerticalGroup(
            pnServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnServiçosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSerTecnico)
                    .addComponent(tfSertec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSerHoras)
                    .addComponent(tfSerHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSerDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSerVlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSerVlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbTela.addTab("Serviços", pnServiços);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tbTela)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCliNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCliNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCliNomeActionPerformed

    private void tfCliEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCliEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCliEmailActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
      if (tbTela.getSelectedComponent() == pnClientes) limpaCliente();
      else if (tbTela.getSelectedComponent()== pnProdutos) limpaProduto();
      else if(tbTela.getSelectedComponent()==pnTécnicos) limpaTecnico();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        // TODO add your handling code here:
      if (tbTela.getSelectedComponent()== pnClientes) gravaCliente();
      else if (tbTela.getSelectedComponent()==pnProdutos) gravaProduto();
      else if(tbTela.getSelectedComponent()==pnTécnicos) gravaTecnico();
    }//GEN-LAST:event_btGravarActionPerformed

    private void spProEstoqueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spProEstoqueStateChanged
        // TODO add your handling code here:
        int v = (int) spProEstoque.getValue();
        if (v<0) spProEstoque.setValue(0);
    }//GEN-LAST:event_spProEstoqueStateChanged

    private void tfTecNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTecNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTecNomeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnTitulo;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JCheckBox cbProAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbCliCel;
    private javax.swing.JLabel lbCliCpf;
    private javax.swing.JLabel lbCliEmail;
    private javax.swing.JLabel lbCliNome;
    private javax.swing.JLabel lbClitel;
    private javax.swing.JLabel lbProDescricao;
    private javax.swing.JLabel lbProQtd;
    private javax.swing.JLabel lbProVlCusto;
    private javax.swing.JLabel lbProVlVenda;
    private javax.swing.JLabel lbSerDescricao;
    private javax.swing.JLabel lbSerHoras;
    private javax.swing.JLabel lbSerTecnico;
    private javax.swing.JLabel lbSerVlTotal;
    private javax.swing.JPanel pnButtons;
    private javax.swing.JPanel pnClientes;
    private javax.swing.JPanel pnProdutos;
    private javax.swing.JPanel pnServiços;
    private javax.swing.JPanel pnTécnicos;
    private javax.swing.JSpinner spProEstoque;
    private javax.swing.JTabbedPane tbTela;
    private javax.swing.JFormattedTextField tfCliCel;
    private javax.swing.JFormattedTextField tfCliCpf;
    private javax.swing.JTextField tfCliEmail;
    private javax.swing.JTextField tfCliNome;
    private javax.swing.JFormattedTextField tfCliTel;
    private javax.swing.JTextPane tfProDescricao;
    private javax.swing.JFormattedTextField tfProVlCusto;
    private javax.swing.JFormattedTextField tfProVlVenda;
    private javax.swing.JTextPane tfSerDescricao;
    private javax.swing.JTextField tfSerHoras;
    private javax.swing.JTextField tfSerVlTotal;
    private javax.swing.JTextField tfSertec;
    private javax.swing.JTextField tfTecCusto;
    private javax.swing.JTextField tfTecNome;
    private javax.swing.JFormattedTextField tfTecSalario;
    private javax.swing.JFormattedTextField tfTecValor;
    // End of variables declaration//GEN-END:variables
}
