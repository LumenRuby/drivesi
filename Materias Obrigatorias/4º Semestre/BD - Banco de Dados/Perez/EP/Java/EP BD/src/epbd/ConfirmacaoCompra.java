/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConfirmacaoPedido.java
 *
 * Created on 17/12/2009, 00:11:34
 */

package epbd;

/**
 *
 * @author Administrador
 */
public class ConfirmacaoCompra extends javax.swing.JFrame {

    /** Creates new form ConfirmacaoPedido */
    public ConfirmacaoCompra() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoConfEntrega = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        campoEstado = new javax.swing.JTextField();
        campoCEP = new javax.swing.JTextField();
        painelValores = new javax.swing.JPanel();
        lSubtotal = new javax.swing.JLabel();
        campoSubtotal = new javax.swing.JTextField();
        lFrete = new javax.swing.JLabel();
        campoFrete = new javax.swing.JTextField();
        lTotal = new javax.swing.JLabel();
        campoTotal = new javax.swing.JTextField();
        painelCartao = new javax.swing.JPanel();
        radioCartaoAtual = new javax.swing.JRadioButton();
        campoNroCartao = new javax.swing.JTextField();
        comboBandeira = new javax.swing.JComboBox();
        radioNovoCartao = new javax.swing.JRadioButton();
        campoNovoCartao = new javax.swing.JTextField();
        painelDescricao = new javax.swing.JScrollPane();
        painelEntrega = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        botaoCancelar = new javax.swing.JButton();
        botaoPerfil = new javax.swing.JButton();
        botaoCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confirmar Pedido");

        textoConfEntrega.setFont(new java.awt.Font("Tahoma", 0, 14));
        textoConfEntrega.setText("Confirmação de Pedido");

        campoNome.setEditable(false);
        campoNome.setText("Nome do cliente");

        campoEndereco.setEditable(false);
        campoEndereco.setText("Endereco");

        campoCidade.setEditable(false);
        campoCidade.setText("Cidade");

        campoEstado.setEditable(false);
        campoEstado.setText("ES");

        campoCEP.setEditable(false);
        campoCEP.setText("CEP");

        lSubtotal.setText("Subtotal");

        campoSubtotal.setEditable(false);
        campoSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSubtotalActionPerformed(evt);
            }
        });

        lFrete.setText("Frete");

        campoFrete.setEditable(false);

        lTotal.setText("Total");

        campoTotal.setEditable(false);

        javax.swing.GroupLayout painelValoresLayout = new javax.swing.GroupLayout(painelValores);
        painelValores.setLayout(painelValoresLayout);
        painelValoresLayout.setHorizontalGroup(
            painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValoresLayout.createSequentialGroup()
                .addGroup(painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lSubtotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lFrete, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFrete, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        painelValoresLayout.setVerticalGroup(
            painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValoresLayout.createSequentialGroup()
                .addGroup(painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSubtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lFrete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTotal)))
        );

        radioCartaoAtual.setText("Usar este Cartão de Crédito");

        campoNroCartao.setEditable(false);
        campoNroCartao.setText("VISA - 123456781234");

        comboBandeira.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        radioNovoCartao.setText("Novo Cartão de Crédito");

        campoNovoCartao.setText("VISA - 123456781234");

        javax.swing.GroupLayout painelCartaoLayout = new javax.swing.GroupLayout(painelCartao);
        painelCartao.setLayout(painelCartaoLayout);
        painelCartaoLayout.setHorizontalGroup(
            painelCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(campoNroCartao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCartaoLayout.createSequentialGroup()
                    .addComponent(comboBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(campoNovoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radioNovoCartao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioCartaoAtual, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        painelCartaoLayout.setVerticalGroup(
            painelCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCartaoLayout.createSequentialGroup()
                .addComponent(radioCartaoAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(radioNovoCartao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNovoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jTextArea1.setColumns(10);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea1.setRows(3);
        jTextArea1.setText("NOTA:\tOs livros serão\n\tentregues em\n\t5 dias úteis.");
        painelEntrega.setViewportView(jTextArea1);

        botaoCancelar.setText("Cancelar");

        botaoPerfil.setText("Atualizar Perfil");

        botaoCompra.setText("COMPRAR!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(painelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(textoConfEntrega)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(painelCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(painelEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoPerfil)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(painelValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCompra))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoConfEntrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(painelCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(painelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botaoCompra)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoPerfil))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSubtotalActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmacaoCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoCompra;
    private javax.swing.JButton botaoPerfil;
    private javax.swing.JTextField campoCEP;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoEstado;
    private javax.swing.JTextField campoFrete;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNovoCartao;
    private javax.swing.JTextField campoNroCartao;
    private javax.swing.JTextField campoSubtotal;
    private javax.swing.JTextField campoTotal;
    private javax.swing.JComboBox comboBandeira;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lFrete;
    private javax.swing.JLabel lSubtotal;
    private javax.swing.JLabel lTotal;
    private javax.swing.JPanel painelCartao;
    private javax.swing.JScrollPane painelDescricao;
    private javax.swing.JScrollPane painelEntrega;
    private javax.swing.JPanel painelValores;
    private javax.swing.JRadioButton radioCartaoAtual;
    private javax.swing.JRadioButton radioNovoCartao;
    private javax.swing.JLabel textoConfEntrega;
    // End of variables declaration//GEN-END:variables

}
