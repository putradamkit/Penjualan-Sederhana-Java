import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jhon_grsng
 */
public class form_data_pegawai extends javax.swing.JFrame {

    private DefaultTableModel tabmode;
    private void tampil_pegawai(){
        Object[]baris = {"ID Pegawai", "Nama Pegawai", "No HP", "Alamat"};
        tabmode= new DefaultTableModel(null, baris);
        table_pegawai.setModel(tabmode);
        String sql = "select * from tabel_pegawai order by id_pegawai asc";
        try {
            Connection konek = new koneksi_mysql().getConnection();
            Statement stat = konek.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id_pegawai = hasil.getString("id_pegawai");
                String nama = hasil.getString("nama");
                String no_hp = hasil.getString("no_hp");
                String alamat = hasil.getString("alamat");
                String[]data = {id_pegawai, nama, no_hp, alamat};
                tabmode.addRow(data);
            }
            reset();
            konek.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan Data!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    
    /**
     * Creates new form form_data_pegawai
     */
    public form_data_pegawai() {
        initComponents();
        tampil_pegawai();
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
        table_pegawai = new javax.swing.JTable();
        t_no_hp = new javax.swing.JTextField();
        t_alamat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        b_Simpan = new javax.swing.JButton();
        b_Reset = new javax.swing.JButton();
        b_Update = new javax.swing.JButton();
        b_Delete = new javax.swing.JButton();
        t_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_id_pegawai = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_pegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_pegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_pegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_pegawai);

        jLabel5.setText("No HP");

        jLabel6.setText("Alamat");

        b_Simpan.setText("Create");
        b_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_SimpanActionPerformed(evt);
            }
        });

        b_Reset.setText("Reset");
        b_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ResetActionPerformed(evt);
            }
        });

        b_Update.setText("Update");
        b_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_UpdateActionPerformed(evt);
            }
        });

        b_Delete.setText("Delete");
        b_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_DeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("ID Pegawai");

        jLabel4.setText("Nama");

        jButton3.setText("DATA BUKU");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 48)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("DATA BUKU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(t_id_pegawai)
                                .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(t_no_hp, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(b_Update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_Simpan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b_Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(t_id_pegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(t_no_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(t_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_Simpan)
                            .addComponent(b_Reset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_Update)
                            .addComponent(b_Delete))
                        .addGap(130, 130, 130)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_pegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pegawaiMouseClicked
        // TODO add your handling code here:
        int tabelPegawai = table_pegawai.getSelectedRow();
        t_id_pegawai.setText(table_pegawai.getValueAt(tabelPegawai, 0).toString());
        t_nama.setText(table_pegawai.getValueAt(tabelPegawai, 1).toString());
        t_no_hp.setText(table_pegawai.getValueAt(tabelPegawai, 2).toString());
        t_alamat.setText(table_pegawai.getValueAt(tabelPegawai, 3).toString().substring(1, 15));

    }//GEN-LAST:event_table_pegawaiMouseClicked

    private void b_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_SimpanActionPerformed
        String id_pegawai="", nama = "", no_hp="", alamat="";

        id_pegawai = t_id_pegawai.getText();
        nama = t_nama.getText();
        no_hp = t_no_hp.getText();
        alamat = t_alamat.getText();
        try {
            Connection konek = new koneksi_mysql().getConnection();
            String sql = "insert into tabel_pegawai values('"+id_pegawai+"', '"+nama+"', '"+no_hp+"', '"+alamat+"')";
            PreparedStatement stat = (PreparedStatement) konek.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil Menyinpan Data!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_pegawai();
            reset();
            konek.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan Data!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_b_SimpanActionPerformed
private void reset(){
        t_id_pegawai.setText("");
        t_nama.setText("");
        t_no_hp.setText("");
        t_alamat.setText("");
        
    }
    private void b_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ResetActionPerformed
        reset();
    }//GEN-LAST:event_b_ResetActionPerformed

    private void b_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_UpdateActionPerformed
        String id_pegawai="", nama = "", no_hp="", alamat="";

        id_pegawai = t_id_pegawai.getText();
        nama = t_nama.getText();
        no_hp = t_no_hp.getText();
        alamat = t_alamat.getText();
        try {
            Connection konek = new koneksi_mysql().getConnection();
            String sql = "update tabel_pegawai set "
            + "nama='"+nama+"', "
            + "no_hp='"+no_hp+"', "
            + "alamat='"+alamat+"'"
            + "where id_pegawai='"+id_pegawai+"'";
            PreparedStatement stat = (PreparedStatement) konek.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Data Berhasil!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_pegawai();
            reset();
            konek.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update Data Gagal!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_b_UpdateActionPerformed

    private void b_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_DeleteActionPerformed
        // TODO add your handling code here:
        String id_pegawai="";
        id_pegawai = t_id_pegawai.getText();
        try {
            Connection konek = new koneksi_mysql().getConnection();
            String sql = "delete from tabel_pegawai where id_pegawai='"+id_pegawai+"'";
            PreparedStatement stat = (PreparedStatement) konek.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil Menghapus Data!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_pegawai();
            reset();
            konek.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menghapus Data!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_b_DeleteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new form_data_buku().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(form_data_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_data_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_data_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_data_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_data_pegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Delete;
    private javax.swing.JButton b_Reset;
    private javax.swing.JButton b_Simpan;
    private javax.swing.JButton b_Update;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_alamat;
    private javax.swing.JTextField t_id_pegawai;
    private javax.swing.JTextField t_nama;
    private javax.swing.JTextField t_no_hp;
    private javax.swing.JTable table_pegawai;
    // End of variables declaration//GEN-END:variables
}
