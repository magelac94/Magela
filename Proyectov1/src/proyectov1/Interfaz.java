/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import interfaces.INodo;
import interfaces.IAEDMovieAdapter;
import java.util.Calendar;
import java.util.Date;
import proyectov1.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import javax.swing.plaf.basic.BasicListUI;

/**
 *
 * @author Magela
 */
public class Interfaz extends javax.swing.JFrame {

    IAEDMovieAdapter aedMovieAdapter;

    /**
     * Creates new form AEDIMovieFrame
     */
    public Interfaz() {
        aedMovieAdapter = new AEDMovieAdapterDummy();
        this.setTitle("PopOut");
        // DefaultListModel model = new DefaultListModel();
        //    cargarEstrenos();
        initComponents();
          aedMovieAdapter.cargarDatos();
          cargarEstrenos();
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
        jButtonDeCargar = new javax.swing.JButton();
        jTextBuscarNombre = new javax.swing.JTextField();
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
        jTextFieldActor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDerecha = new javax.swing.JTextArea();
        jTextFieldNombre = new javax.swing.JTextField();
        jComboBoxGenero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListPeliculas.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jListPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPeliculasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListPeliculas);

        jButtonDeCargar.setText("Actualizar Base de Datos");
        jButtonDeCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeCargarActionPerformed(evt);
            }
        });

        jTextBuscarNombre.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jTextBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarNombreActionPerformed(evt);
            }
        });

        jTextBuscarFecha.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jTextBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarFechaActionPerformed(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel1.setText("BUSCAR:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel3.setText("Año");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel4.setText("Ranking");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel5.setText("Genero");

        jComboBuscarRanking.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
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

        jTextFieldActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActorActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel7.setText("Actor");

        jTextAreaDerecha.setEditable(false);
        jTextAreaDerecha.setColumns(20);
        jTextAreaDerecha.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jTextAreaDerecha.setLineWrap(true);
        jTextAreaDerecha.setRows(5);
        jTextAreaDerecha.setName(""); // NOI18N
        jScrollPane2.setViewportView(jTextAreaDerecha);

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombre))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonDeCargar)
                                .addGap(10, 10, 10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextBuscarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addGap(23, 23, 23)
                                .addComponent(jTextBuscarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldActor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBuscarRanking, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBuscarRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jTextFieldActor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7)
                        .addComponent(jButtonDeCargar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(11, 11, 11))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void cargarEstrenos() {
        Calendar fecha = Calendar.getInstance();
        int fechita = fecha.get(Calendar.YEAR);
        System.out.println("     AñOOOOO:" + fechita);

        short myshort = (short) fechita;
        short myshortMenosUno = (short) (fechita - 1);
        System.out.println("     MyShort:" + myshort);
        Lista<Pelicula> estrenos = aedMovieAdapter.buscarPorFechaLista(myshort,aedMovieAdapter.getPeliculas());
        if (estrenos == null){
            estrenos = aedMovieAdapter.buscarPorFechaLista(myshortMenosUno,aedMovieAdapter.getPeliculas());
            }
        
        DefaultListModel model = new DefaultListModel();
        jListPeliculas.setModel(model);
 
        CargarPanelIzquiero(model, estrenos);
        
        
        // DefaultListModel model = new DefaultListModel();
        //   jListPeliculas.setModel(model);
        //  Lista<Pelicula> lista = aedMovieAdapter.getPeliculas(); // todas las peliculas
        // CargarPanelIzquiero(model, lista);
        //   DefaultListModel model = new DefaultListModel();
        // jListPeliculas.setModel(model);
    /*    Lista<Pelicula> lista;

        try {
            lista = aedMovieAdapter.buscarPorFechaLista(myshort); // estrenos 2016
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡No hay estrenos en este aÑo!");
            myshort++;
         //   lista = aedMovieAdapter.buscarPorFechaLista(myshortMenosUno);
        }*/
        //   jListPeliculas.setModel(model);
        //  CargarPanelIzquiero(model, lista);

        //       DefaultListModel model = new DefaultListModel();
//        jListPeliculas.setModel(model);
        // CargarPanelIzquiero(null,aedMovieAdapter.buscarPorFechaLista(myshort));
    }
    private void jButtonDeCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeCargarActionPerformed
        try {
            aedMovieAdapter.cargarDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Error al Cargar datos!");

        }

        DefaultListModel model = new DefaultListModel();
        jListPeliculas.setModel(model);
        Lista<Pelicula> lista = aedMovieAdapter.getPeliculas(); // todas las peliculas
        CargarPanelIzquiero(model, lista);
    }//GEN-LAST:event_jButtonDeCargarActionPerformed

    private void CargarPanelIzquiero(DefaultListModel panel, Lista lista) {
        INodo<Pelicula> aux = lista.getPrimero();
        while (aux != null) {
            //jListPeliculas.setModel(model);
            panel.addElement(aux.getDato().getNombre());
            aux = aux.getSiguiente();
        }
    }

    public void CargarPanelIzquiero(DefaultListModel panel, Pelicula peli) {
        panel.addElement(peli.getNombre());
    }

    private void jListPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPeliculasMouseClicked
        Pelicula selected = aedMovieAdapter.getPelicula(jListPeliculas.getSelectedValue().toString());
        CargarPanelDerecho(selected);

    }//GEN-LAST:event_jListPeliculasMouseClicked

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
        String  generoBuscar = jComboBoxGenero.getText();
        String personaBuscar = jTextFieldActor.getText();
        Lista<Pelicula> buscar;
        DefaultListModel model = new DefaultListModel();
        
        jListPeliculas.setModel(model);
        try {   // PRIMERO busco por nombre, si esta vacio devuelvo todo
            buscar = aedMovieAdapter.buscarPorNombreLista(nombreBuscar); // tendria que buscar en todas las peliculas y devolver una lista de peliculas encontradas;
                // SEGUNDO busco por fecha, debe ser un numero de 4 digitos
            if (!fechaBuscar.equals("")) {
                short fechaShort = Short.parseShort(fechaBuscar); // validar esto que no vaya a explotar, debe tener 4 digitos con un catch se soluciona
                buscar = aedMovieAdapter.buscarPorFechaLista(fechaShort, buscar);
            }
                // TERCERO busco por ranking, todas las peliculas de 1 a 9 estrellas segun sea seleccionado
            if (!rankingBuscar.equals("Todos")) {
                String ran = String.valueOf(rankingBuscar.charAt(0));
                float rankingB = Float.parseFloat(ran); // validas conversion sino esta mal ingresado, falta 10 estrellas
                buscar = aedMovieAdapter.buscarPorRankingLista(rankingB, buscar);
            }
            if (!generoBuscar.equals("Todos")){
                buscar = aedMovieAdapter.buscarPorGeneroLista(generoBuscar, buscar); 
            }
            if (!personaBuscar.equals("")){
                buscar = aedMovieAdapter.buscarPorActorLista(personaBuscar, buscar); // tendria que buscar en todas las peliculas y devolver una lista de peliculas encontradas;
            //    buscar = aedMovieAdapter.buscarPorProductorLista(personaBuscar, buscar);
            //    buscar = aedMovieAdapter.buscarPorDirectorLista(personaBuscar, buscar);

            }
            
            CargarPanelIzquiero(model, buscar);

        } catch (Exception ex) {
            System.out.println("Pelicula No existe en el sistema o hay otro problema 2 ");
            JOptionPane.showMessageDialog(null, "Pelicula No existe en el sistema");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed
    private void jTextFieldActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldActorActionPerformed

    private void CargarPanelDerecho(Pelicula p) {
        if (p != null) {
            jTextFieldNombre.setText(p.getNombre());
            String actoresMostrar = aedMovieAdapter.actoresToText(p);
            String productoresMostrar = aedMovieAdapter.productoresToText(p);
            String directoresMostrar = aedMovieAdapter.directoresToText(p);
            jTextAreaDerecha.setText(p.toText()
                    + "\n\n Actors:   " + actoresMostrar
                    + "\n\n Producers:    " + productoresMostrar
                    + "\n\n Directors:    " + directoresMostrar);

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
    private javax.swing.JTextField jComboBoxGenero;
    private javax.swing.JComboBox<String> jComboBuscarRanking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jListPeliculas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextAreaDerecha;
    private javax.swing.JTextField jTextBuscarFecha;
    private javax.swing.JTextField jTextBuscarNombre;
    private javax.swing.JTextField jTextFieldActor;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
