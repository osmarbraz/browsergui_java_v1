
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FrmBrowser extends javax.swing.JFrame {

    private javax.swing.JButton BotaoAbrir;
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JTextField enderecoTxt;
    private javax.swing.JEditorPane editorPagina;
    private javax.swing.JScrollPane jScrollPaneEditorPagina;
    
    public FrmBrowser() {
        inicializar();
    }

    public void instanciar(){        
        BotaoAbrir = new javax.swing.JButton();        
        BotaoFechar = new javax.swing.JButton();
        enderecoTxt = new javax.swing.JTextField();    
        editorPagina = new javax.swing.JEditorPane();
            jScrollPaneEditorPagina = new javax.swing.JScrollPane();
    }
    private void inicializar() {
        instanciar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPaneEditorPagina.setViewportView(editorPagina);

        BotaoAbrir.setText("Abrir");
        BotaoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbrirActionPerformed(evt);
            }
        });

        enderecoTxt.setText("https://stackoverflow.com");
      
        BotaoFechar.setText("Fechar");
        BotaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneEditorPagina)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enderecoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoAbrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoFechar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAbrir)
                    .addComponent(enderecoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneEditorPagina, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
        );

        pack();
    }

    private void botaoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAbrirActionPerformed
        // TODO add your handling code here:
        try {
            editorPagina.setPage(new URL(enderecoTxt.getText()));
        } catch (MalformedURLException ex) {
            Logger.getLogger(FrmBrowser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmBrowser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFecharActionPerformed
          System.exit(0);
    }
}