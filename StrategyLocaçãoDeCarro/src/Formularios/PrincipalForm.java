
package Formularios;

import padroes.CalculaValorAluguel;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;
import padroes.Orcamento;


public class PrincipalForm extends javax.swing.JPanel {

    
    public PrincipalForm() {
        initComponents();
        othersSets();// inicia com os campos invisivel
       

    }
    
    public void othersSets() {
      labelResultado.setVisible(false);
    //  labelImposto.setVisible(false);
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboBoxVeiculo = new javax.swing.JComboBox<>();
        buttonCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        textHoras = new javax.swing.JFormattedTextField();
        labelResultado = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setText("Horas:");
        add(jLabel1);
        jLabel1.setBounds(160, 60, 50, 14);

        comboBoxVeiculo.setModel(new javax.swing.DefaultComboBoxModel(Formularios.OpcaoVeiculo.values()));
        add(comboBoxVeiculo);
        comboBoxVeiculo.setBounds(40, 80, 100, 20);

        buttonCalcular.setText("Calcular");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });
        add(buttonCalcular);
        buttonCalcular.setBounds(150, 120, 90, 30);

        jLabel2.setText("Veiculo:");
        add(jLabel2);
        jLabel2.setBounds(40, 60, 70, 16);

        label1.setBackground(new java.awt.Color(0, 153, 0));
        label1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        label1.setText("     Calculo De Horas");
        add(label1);
        label1.setBounds(50, 10, 160, 27);

        jLabel3.setText("Valor Total Aluguel:");
        add(jLabel3);
        jLabel3.setBounds(30, 180, 120, 16);

        textHoras.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
        textHoras.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHorasActionPerformed(evt);
            }
        });
        textHoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textHorasKeyPressed(evt);
            }
        });
        add(textHoras);
        textHoras.setBounds(160, 80, 80, 23);

        labelResultado.setText("jLabel4");
        add(labelResultado);
        labelResultado.setBounds(160, 180, 34, 14);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed

        Double valor = Double.parseDouble(textHoras.getText().replaceAll(",", ""));

        OpcaoVeiculo opcao = (OpcaoVeiculo) comboBoxVeiculo.getSelectedItem();

        CalculaValorAluguel calculador = new CalculaValorAluguel(valor, opcao.getImposto());
        Double resultado = calculador.execute();

        
        labelResultado.setText(String.valueOf("R$" + resultado ));
      //  labelImposto.setText(calculador.realizarImposto(orcamento, opcao.getImposto()));
        
        labelResultado.setVisible(true); //deixa visivel
        
    }//GEN-LAST:event_buttonCalcularActionPerformed

    private void textHorasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textHorasKeyPressed

    }//GEN-LAST:event_textHorasKeyPressed

    private void textHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textHorasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JComboBox<String> comboBoxVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JFormattedTextField textHoras;
    // End of variables declaration//GEN-END:variables

    
}
