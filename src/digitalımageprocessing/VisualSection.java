
package digitalımageprocessing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VisualSection extends javax.swing.JFrame {

    public VisualSection() {
        initComponents();
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setText("Fotoğraf Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleName("MainForm");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BufferedImage image = null;
        JFrame fileChooserFrame = new JFrame();
        
        //---- Filechooser created
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooserFrame);
        File selFile = fileChooser.getSelectedFile();
        System.out.println(selFile.getAbsolutePath());
        File input = new File(selFile.getAbsolutePath().toString()); // Image uploaded
        try {
            image = ImageIO.read(input); // Assigned
        } catch (IOException ex) {
            Logger.getLogger(VisualSection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(image.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),
                image.SCALE_SMOOTH));
        
        jLabel1.setIcon(imageIcon);
        /*jLabel1.setUI(new ImageIcon(image));*/
        
        
        jLabel1.setVisible(true);
   

          
        //  frame.add(label);
           
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
