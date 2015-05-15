package UI.Interfaz;

import Dominio.Muro.Entrada;
import Dominio.Usuario.Usuario;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ListModel;

/**
 *
 * @author jose
 */
public class Muro extends javax.swing.JFrame {

    
    Dominio.Muro.Muro muro;
    Usuario usuario;
    List<Usuario> usuarios;
    
    /**
     * Creates new form Muro
     */
    public Muro(final Usuario u, List<Usuario> usuariosNoAmigosNoPeticiones) {
        this.muro = u.getMuro();
        this.usuario = u;
        this.usuarios = usuariosNoAmigosNoPeticiones;
        initComponents();
        actualizar();
        
    }
    
    public List<Usuario> getUsuariosRestantes(){
        List<Usuario> usuariosRestantes = new ArrayList<>(usuarios);
        usuariosRestantes.removeAll(usuario.amigosYPeticiones());
        usuariosRestantes.remove(usuario);
        return usuariosRestantes;
    }
    
    public final void actualizar(){
        
        nombreUsuario.setText(usuario.getNombre());
        listaUsuarios.setModel(new AbstractListModel() {

            List<Usuario> usuariosRestantes = getUsuariosRestantes();
            @Override
            public int getSize() {
                return usuariosRestantes.size();
            }

            @Override
            public Object getElementAt(int index) {
                return usuariosRestantes.get(index).getNombre() + " " + usuariosRestantes.get(index).getPrimerApellido();
            }
        });
        jList1.setModel(new AbstractListModel() {

            List<Entrada> entradas = muro.getEntradas();
            @Override
            public int getSize() {
                return entradas.size();
            }

            @Override
            public Object getElementAt(int index) {
                return entradas.get(index).getFormattedContent();
            }
        });
        peticionesAmistad.setModel(new AbstractListModel() {
            List<Usuario> usuarios = usuario.getPeticionesRecibidas();
            
            @Override
            public int getSize() {
               return usuarios.size();
            }

            @Override
            public Object getElementAt(int index) {
                return usuarios.get(index).getNombre() + " " + usuarios.get(index).getPrimerApellido();
            }
        
        });
        listaAmigos.setModel(new AbstractListModel(){
            List<Usuario> usuarios = usuario.getAmigos();
            
            @Override
            public int getSize() {
               return usuarios.size();
            }

            @Override
            public Object getElementAt(int index) {
                return usuarios.get(index).getNombre() + " " + usuarios.get(index).getPrimerApellido();
            }
        });
        
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
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        peticionesAmistad = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaAmigos = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList();
        botonAceptarAmistad = new javax.swing.JButton();
        botonVerPerfil = new javax.swing.JButton();
        botonRechazarAmistad = new javax.swing.JButton();
        botonEnviarPeticion = new javax.swing.JButton();
        botonVerUsuario = new javax.swing.JButton();
        nombreUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Muro");

        jScrollPane2.setViewportView(jTextPane1);

        jLabel2.setText("Nueva entrada");

        jLabel3.setText("Amigos");

        jLabel4.setText("Usuarios");

        jButton1.setText("Publicar");

        jLabel5.setText("Peticiones de amistad");

        peticionesAmistad.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(peticionesAmistad);

        jScrollPane6.setViewportView(listaAmigos);

        jScrollPane3.setViewportView(listaUsuarios);

        botonAceptarAmistad.setText("Aceptar petición");

        botonVerPerfil.setText("Ver Perfil");

        botonRechazarAmistad.setText("Rechazar amistad");

        botonEnviarPeticion.setText("Enviar petición");

        botonVerUsuario.setText("Ver Perfil");

        nombreUsuario.setText("Nombre Usuario");

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Cerrar sesión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Amigos");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonVerPerfil))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonVerUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonEnviarPeticion))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonRechazarAmistad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAceptarAmistad))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(nombreUsuario))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAceptarAmistad)
                            .addComponent(botonRechazarAmistad))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(jScrollPane6)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVerPerfil)
                    .addComponent(botonEnviarPeticion)
                    .addComponent(botonVerUsuario)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void setPublicarListener(ActionListener al){
        jButton1.addActionListener(al);
    }    

    public String getContenido(){
        return jTextPane1.getText();
    }

    public void setAceptarAmistadListener(ActionListener al){
        botonAceptarAmistad.addActionListener(al);
    }

    public Usuario getSelectedUserPeticiones(){
        return usuario.getPeticionesRecibidas().get(peticionesAmistad.getSelectedIndex());
    }
    
    public int getSelectedUser(){
        return listaUsuarios.getSelectedIndex();
    }

    public void setVerPerfilListener(ActionListener al){
        botonVerPerfil.addActionListener(al);
    }
    
    public void setRechazarPeticion(ActionListener al){
        botonRechazarAmistad.addActionListener(al);
    }

    public void setEnviarPeticion(ActionListener al){
        botonEnviarPeticion.addActionListener(al);
    }
    public Usuario getSelectedUserAmigos(){
        return usuario.getAmigos().get(listaAmigos.getSelectedIndex());
    }
    
    public void setVerUsuarioListener(ActionListener al){
        botonVerUsuario.addActionListener(al);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarAmistad;
    private javax.swing.JButton botonEnviarPeticion;
    private javax.swing.JButton botonRechazarAmistad;
    private javax.swing.JButton botonVerPerfil;
    private javax.swing.JButton botonVerUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JList listaAmigos;
    private javax.swing.JList listaUsuarios;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JList peticionesAmistad;
    // End of variables declaration//GEN-END:variables
}
