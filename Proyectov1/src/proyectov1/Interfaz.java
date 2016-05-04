/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import proyectov1.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import javax.swing.plaf.basic.BasicListUI;

/**
 *
 * @author Josse
 */
public class Interfaz extends javax.swing.JFrame {

    IAEDMovieAdapter aedMovieAdapter;

    /**
     * Creates new form AEDIMovieFrame
     */
    public Interfaz() {
        aedMovieAdapter = new AEDMovieAdapterDummy();
        this.setTitle("PopOut");
        aedMovieAdapter.cargarDatos();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListPeliculas = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDerecha = new javax.swing.JTextArea();
        jButtonDeCargar = new javax.swing.JButton();
        jTextBuscarNombre = new javax.swing.JTextField();
        jTextBuscarDescripcion = new javax.swing.JTextField();
        jTextBuscarFecha = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBuscarRanking = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPeliculasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListPeliculas);

        jTextAreaDerecha.setColumns(20);
        jTextAreaDerecha.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDerecha);

        jButtonDeCargar.setText("Cargar");
        jButtonDeCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeCargarActionPerformed(evt);
            }
        });

        jTextBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarNombreActionPerformed(evt);
            }
        });

        jTextBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarFechaActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("BUSCAR:");

        jLabel2.setText("Nombre");

        jLabel3.setText("Fecha");

        jLabel4.setText("Ranking");

        jLabel5.setText("Descripcion");

        jComboBuscarRanking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos","10 estrellas", "9  estrellas", "8  estrellas", "7  estrellas", "6  estrellas", "5  estrellas", "4  estrellas", "3  estrellas", "2  estrellas", "1  estrella" }));
        jComboBuscarRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBuscarRankingActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PopOut !");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonDeCargar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextBuscarNombre)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextBuscarFecha)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBuscarRanking, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(61, 61, 61)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextBuscarDescripcion)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(35, 35, 35)))
                        .addGap(34, 34, 34)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addGap(56, 56, 56)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBuscarRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextBuscarDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeCargar)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeCargarActionPerformed
        aedMovieAdapter.cargarDatos();
        DefaultListModel model = new DefaultListModel();
        jListPeliculas.setModel(model);
        Lista<Pelicula> lista = aedMovieAdapter.getPeliculas(); // todas las peliculas

        CargarPanelIzquiero(model, lista);
    }//GEN-LAST:event_jButtonDeCargarActionPerformed

    private void CargarPanelIzquiero(DefaultListModel panel, Lista lista) {
        //  panel.clear();
        //   jTextAreaDerecha.removeAll();
        INodo<Pelicula> aux = lista.getPrimero();
        while (aux != null) {
            panel.addElement(aux.getDato().getNombre());
            aux = aux.getSiguiente();
        }
    }

    public void CargarPanelIzquiero(DefaultListModel panel, Pelicula peli) {
        // panel.clear();
        panel.addElement(peli.getNombre());
    }

    private void jListPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPeliculasMouseClicked
        Pelicula selected = aedMovieAdapter.getPelicula(jListPeliculas.getSelectedValue().toString());
        CargarPanelDerecho(selected);

    }//GEN-LAST:event_jListPeliculasMouseClicked

    // private void CargarPanelDerecho(DefaultListModel panel,Lista lista){
    // }

    private void jTextBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarNombreActionPerformed

    private void jTextBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarFechaActionPerformed

    private void jComboBuscarRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBuscarRankingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBuscarRankingActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        jTextAreaDerecha.removeAll();
        String nombreBuscar = jTextBuscarNombre.getText();
        String fechaBuscar = jTextBuscarFecha.getText();
        String rankingBuscar = jComboBuscarRanking.getSelectedItem().toString();
       
        String descripcionBuscar = jTextBuscarDescripcion.getText();
        Lista<Pelicula> buscar;
        DefaultListModel model = new DefaultListModel();
        jListPeliculas.setModel(model);

        /*  try {
            Pelicula buscar = aedMovieAdapter.buscarPorNombre(nombreBuscar); // tendria que buscar en todas las peliculas y devolver una lista de peliculas encontradas;
            System.out.println("Pelicula entontrada: " + buscar.getNombre());
            if (buscar != null){
                CargarPanelIzquiero(model, buscar);
                //jTextAreaDerecha.removeAll();
            }

        } catch (Exception ex) {
            System.out.println("Pelicula No existe en el sistema o hay otro problema");
            JOptionPane.showMessageDialog(null, "Pelicula No existe en el sistema o hay otro problema");

        } */
        try {

            buscar = aedMovieAdapter.buscarPorNombreLista(nombreBuscar); // tendria que buscar en todas las peliculas y devolver una lista de peliculas encontradas;

            buscar = aedMovieAdapter.buscarPorFechaLista(fechaBuscar, buscar);
            
            if (! rankingBuscar.equals("Todos"))  {
            
                String ran = String.valueOf(rankingBuscar.charAt(0));
                System.out.println("Ranking a Buscar:::"+ran);
                
                buscar = aedMovieAdapter.buscarPorRankingLista(ran , buscar);
                
                
         
                
                              
            }
            //     if (buscar != null) {
                   CargarPanelIzquiero(model, buscar);

            // }
        } catch (Exception ex) {
            System.out.println("Pelicula No existe en el sistema o hay otro problema 2 ");
            JOptionPane.showMessageDialog(null, "Pelicula No existe en el sistema o hay otro problema");

        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void CargarPanelDerecho(Pelicula p) {
        if (p != null) {
            jTextAreaDerecha.setText(p.toText());
        }
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonDeCargar;
    private javax.swing.JComboBox<String> jComboBuscarRanking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jListPeliculas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextAreaDerecha;
    private javax.swing.JTextField jTextBuscarDescripcion;
    private javax.swing.JTextField jTextBuscarFecha;
    private javax.swing.JTextField jTextBuscarNombre;
    // End of variables declaration//GEN-END:variables
}
