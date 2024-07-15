package De09_KiThi;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class View_KiThi extends javax.swing.JFrame {

    private Repositories_KiThi rp = new Repositories_KiThi();
    private DefaultTableModel mol = new DefaultTableModel();
    private int i = -1;

    void fillTable(ArrayList<Model_KiThi> list) {
        mol = (DefaultTableModel) tbl_KiThi.getModel();
        mol.setRowCount(0);
        for (Model_KiThi x : list) {
            mol.addRow(x.toDataRow());
        }
    }

    public View_KiThi() {
        initComponents();
        this.setLocationRelativeTo(null);
        cboDiem.removeAllItems();
        for (int i = 0; i <= 10; i++) {
            cboDiem.addItem(String.valueOf(i));
        }
        this.fillTable(rp.getAll());
        i = rp.getAll().size();
        showData(0);
        tbl_KiThi.setRowSelectionInterval(0, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_KiThi = new javax.swing.JTable();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        btn_Tim = new javax.swing.JButton();
        btn_SapXep = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        txtMon = new javax.swing.JTextField();
        txtNgayBD = new javax.swing.JTextField();
        cboDiem = new javax.swing.JComboBox<>();
        txtNgayKT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("QUẢN LÍ KÌ THI");

        jLabel2.setText("môn thi");

        jLabel3.setText("điểm");

        jLabel4.setText("ngày BD");

        jLabel5.setText("ngày KT");

        tbl_KiThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "môn", "diểm ", "ngày bđ", "ngày kt"
            }
        ));
        tbl_KiThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_KiThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_KiThi);

        btn_Them.setText("THÊM");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Sua.setText("SỬA");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Xoa.setText("XÓA ");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Exit.setText("EXIT");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        btn_Tim.setText("TÌM");
        btn_Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimActionPerformed(evt);
            }
        });

        btn_SapXep.setText("SẮP XẾP ");
        btn_SapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SapXepActionPerformed(evt);
            }
        });

        btn_Reset.setText("RESET ");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        cboDiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtMon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_Them))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cboDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_Sua))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Xoa, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_Exit, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btn_Tim))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_SapXep))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_Reset)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_Them)
                                .addComponent(btn_Tim)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(btn_Sua)
                                .addComponent(btn_SapXep))
                            .addComponent(cboDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(btn_Xoa)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Reset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btn_Exit)
                    .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        i = tbl_KiThi.getSelectedRow();
        int chon = JOptionPane.showConfirmDialog(this, "Ban co muon sua k?");
        if(chon == 0){
            if(i == -1){
                JOptionPane.showMessageDialog(this, "Chua chon dong de sua");
            }else{
                if(this.readForm()!= null){
                    long id = Integer.parseInt(tbl_KiThi.getValueAt(i, 0).toString());
                    if(rp.sua(id, readForm())>0){
                        JOptionPane.showMessageDialog(this, "Sua thanh cong");
                        this.fillTable(rp.getAll());
                    }else{
                        JOptionPane.showMessageDialog(this, "Sua that bai");
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void tbl_KiThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_KiThiMouseClicked
        i = tbl_KiThi.getSelectedRow();
        showData(i);
    }//GEN-LAST:event_tbl_KiThiMouseClicked

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        txtMon.setText("");
        txtNgayBD.setText("");
        txtNgayKT.setText("");
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_SapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SapXepActionPerformed
        this.fillTable(rp.sapXep());
    }//GEN-LAST:event_btn_SapXepActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        int chon = JOptionPane.showConfirmDialog(this, "Ban co muon them k?");
        if(chon == 0){
            if(this.readForm()!= null){
                if(rp.them(readForm())>0){
                    JOptionPane.showMessageDialog(this, "Them tanh cong");
                    this.fillTable(rp.getAll());
                }else{
                    JOptionPane.showMessageDialog(this, "Them that bai");
                }                 
            }  
      }
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        i = tbl_KiThi.getSelectedRow();
        int chon = JOptionPane.showConfirmDialog(this, "Ban co muon xoa?");
        if(chon ==0){
            if(i == -1){
                JOptionPane.showMessageDialog(this, "Chua chon dong de xoa");
            }else{
                if(this.readForm()!= null){
                    long idCanXoa = Integer.parseInt(tbl_KiThi.getValueAt(i, 0).toString());
                    if(rp.xoa(idCanXoa)>0){
                        JOptionPane.showMessageDialog(this, "Xoa thanh cong");
                        this.fillTable(rp.getAll());
                    }else{
                        JOptionPane.showMessageDialog(this, "Xoa that bai");
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimActionPerformed
        long idCanTim = Integer.parseInt(JOptionPane.showInputDialog(this, "Moi nhap id can tim"));
        int chon = JOptionPane.showConfirmDialog(this, "Ban co muon tim K?");
        if(chon == 0){
            if(rp.tim(idCanTim).isEmpty()){
                JOptionPane.showMessageDialog(this, "khong tim thay");
            }else{
                JOptionPane.showMessageDialog(this, "Da tim thay");
                this.fillTable(rp.tim(idCanTim));
            }
        }
    }//GEN-LAST:event_btn_TimActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_KiThi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_SapXep;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Tim;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JComboBox<String> cboDiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_KiThi;
    private javax.swing.JTextField txtMon;
    private javax.swing.JTextField txtNgayBD;
    private javax.swing.JTextField txtNgayKT;
    // End of variables declaration//GEN-END:variables
void showData(int i) {
        txtMon.setText(tbl_KiThi.getValueAt(i, 1).toString());
        cboDiem.setSelectedItem(tbl_KiThi.getValueAt(i, 2).toString());
        txtNgayBD.setText(tbl_KiThi.getValueAt(i, 3).toString());
        txtNgayKT.setText(tbl_KiThi.getValueAt(i, 4).toString());
    }

    Model_KiThi readForm() {
        String mon;
        int diem;
        String ngayBD, ngayKT;
        
        mon = txtMon.getText();
        if(mon.isEmpty()){
            JOptionPane.showMessageDialog(this, "Dang de trong mon");
            txtMon.requestFocus();
            return null;
        }
        diem = Integer.parseInt(cboDiem.getSelectedItem().toString());
        ngayBD = txtNgayBD.getText();
        if(ngayBD.isEmpty()){
            JOptionPane.showMessageDialog(this, "Dang de trong");
            txtNgayBD.requestFocus();
            return null; 
        }
        ngayKT = txtNgayKT.getText();
        if(ngayKT.isEmpty()){
            JOptionPane.showMessageDialog(this, "Dang de trong");
            txtNgayKT.requestFocus();
            return null;
        }
        return new Model_KiThi(mon, diem, ngayBD, ngayKT);
    }
}
