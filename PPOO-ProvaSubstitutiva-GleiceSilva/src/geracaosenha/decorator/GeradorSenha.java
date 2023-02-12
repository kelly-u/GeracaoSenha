package geracaosenha.decorator;

/**
 * @author G. KELLY
 */
public class GeradorSenha extends javax.swing.JFrame {

    /**
     * Creates new form GeradorSenha - CONSTRUTOR
     */
    public GeradorSenha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblSenhaTamanho = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotaoGerarSenha = new javax.swing.JButton();
        lblSenhaResultado = new javax.swing.JTextField();
        CheckCaractereEsp = new javax.swing.JCheckBox();
        CheckNumero = new javax.swing.JCheckBox();
        CheckMaiuscula = new javax.swing.JCheckBox();
        CheckMinuscula = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERADOR DE SENHAS");
        setName("telaPrincipal"); // NOI18N
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setText("Informe o tamanho da sua senha:");

        lblSenhaTamanho.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSenhaTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblSenhaTamanhoActionPerformed(evt);
            }
        });

        jLabel2.setText("Caracteres Especiais:");

        jLabel3.setText("Números:");

        jLabel4.setText("Letras Maiúsculas:");

        jLabel5.setText("Letras Minúsculas:");

        BotaoGerarSenha.setText("Gerar Senha");
        BotaoGerarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGerarSenhaActionPerformed(evt);
            }
        });

        lblSenhaResultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSenhaResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblSenhaResultadoActionPerformed(evt);
            }
        });

        CheckMinuscula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckMinusculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotaoGerarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblSenhaResultado))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CheckCaractereEsp)
                                    .addComponent(lblSenhaTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckNumero)
                                    .addComponent(CheckMaiuscula)
                                    .addComponent(CheckMinuscula))))
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSenhaTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CheckCaractereEsp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(CheckNumero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(CheckMaiuscula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(CheckMinuscula))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoGerarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(lblSenhaResultado))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void BotaoGerarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGerarSenhaActionPerformed
        String senha = "";
        String retorno;
        SenhaSimples ss = new SenhaSimples();
        String tipoSenha = "";

        //Tenho que pegar o valor de lblSenhaTamanho e tranformar em inteiro
        //Usar no método que vai escrever a senha. Assim ele vai saber quantos caracteres aleatórios colocar
        int senhaTamanho = Integer.parseInt(lblSenhaTamanho.getText());

        if (CheckCaractereEsp.isSelected()) {
            //Aqui posso chamar o método que coloca carac Esp
            //Aqui posso colocar um atributo que coloca carac Esp no aleatorio
            tipoSenha += "!@#$%&*";
            SenhaCaractereEsp sce = new SenhaCaractereEsp(ss);
           // sce.decorarSenha(senhaTamanho, tipoSenha);
            retorno = sce.decorarSenhaCaracE(senhaTamanho, tipoSenha);
            senha += retorno;
        }
        if (CheckNumero.isSelected()) {
            //Aqui posso chamar o método que coloca numeros
            //Aqui posso colocar um atributo que coloca numeros no aleatorio
            tipoSenha += "0123456789";
            SenhaNumero sn = new SenhaNumero(ss);
            retorno = sn.decorarSenhaNumero(senhaTamanho, tipoSenha);
            senha += retorno;
        }
        if (CheckMaiuscula.isSelected()) {
            //Aqui posso chamar o método que coloca maiuscula
            //Aqui posso colocar um atributo que coloca maiuscula no aleatorio
            tipoSenha += "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
            SenhaMaiuscula sma = new SenhaMaiuscula(ss);
            retorno = sma.decorarSenhaMaiusculo(senhaTamanho, tipoSenha);
            senha += retorno;
        }
        if (CheckMinuscula.isSelected()) {
            //Aqui posso chamar o método que coloca minuscula
            //Aqui posso colocar um atributo que coloca minuscula no aleatorio
            tipoSenha += "abcdefghijklmnopqrstuvwxyz";
            SenhaMinuscula smi = new SenhaMinuscula(ss);
            retorno = smi.decorarSenhaMinusculo(senhaTamanho, tipoSenha);
            senha += retorno;
        }else{
            ss.decorarSenha(senhaTamanho, tipoSenha);
        }
        
        lblSenhaResultado.setText(senha);

    }//GEN-LAST:event_BotaoGerarSenhaActionPerformed

    private void lblSenhaResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblSenhaResultadoActionPerformed
        // A senha final
    }//GEN-LAST:event_lblSenhaResultadoActionPerformed

    private void lblSenhaTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblSenhaTamanhoActionPerformed
        // Onde vai estar o tamanho da senha
    }//GEN-LAST:event_lblSenhaTamanhoActionPerformed

    private void CheckMinusculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckMinusculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckMinusculaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeradorSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoGerarSenha;
    private javax.swing.JCheckBox CheckCaractereEsp;
    private javax.swing.JCheckBox CheckMaiuscula;
    private javax.swing.JCheckBox CheckMinuscula;
    private javax.swing.JCheckBox CheckNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lblSenhaResultado;
    private javax.swing.JTextField lblSenhaTamanho;
    // End of variables declaration//GEN-END:variables
}
