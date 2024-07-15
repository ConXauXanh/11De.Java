 package De07_GiamGia;

import java.awt.JobAttributes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class View extends javax.swing.JFrame {

    private Repositpries_GiamGia rp = new Repositpries_GiamGia();
    private DefaultTableModel mol = new DefaultTableModel();
    private int i = -1;

    void fillTable(ArrayList<Model_GiamGia> list) {
        mol = (DefaultTableModel) tbl_GiamGia.getModel();
        mol.setRowCount(0);
        for (Model_GiamGia x : list) {
            mol.addRow(x.toDataRow());
        }
    }

    public View() {
        initComponents();
        this.setLocationRelativeTo(null);
        cboSoLuong.removeAllItems();
        for (int i = 0; i <= 1000; i++) {
            cboSoLuong.addItem(String.valueOf(i));
        }
        this.fillTable(rp.getAll());
        i = rp.getAll().size();
        showData(i - 1);
        tbl_GiamGia.setRowSelectionInterval(i - 1, i - 1);
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
        tbl_GiamGia = new javax.swing.JTable();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        btn_Tim = new javax.swing.JButton();
        btn_SapXep = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        cboSoLuong = new javax.swing.JComboBox<>();
        txtTienGiam = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PHIẾU GIẢM GIÁ");

        jLabel2.setText("mã");

        jLabel3.setText("tên");

        jLabel4.setText("số lượng");

        jLabel5.setText("tiền giảm ");

        tbl_GiamGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "mã", "tên", "số lượng", "tiền giảm"
            }
        ));
        tbl_GiamGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_GiamGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_GiamGia);

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

        cboSoLuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_Them))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_Sua))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(27, 27, 27)
                                                .addComponent(txtTienGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(34, 34, 34)
                                                .addComponent(cboSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
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
                                        .addComponent(btn_Reset)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_Them)
                                .addComponent(btn_Tim)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btn_Sua)
                            .addComponent(btn_SapXep)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btn_Xoa)
                            .addComponent(cboSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Reset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btn_Exit)
                    .addComponent(txtTienGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        i = tbl_GiamGia.getSelectedRow();
        int chon = JOptionPane.showConfirmDialog(this, "Ban co muon sua?");
        if (chon == 0) {
            if (i == -1) {
                JOptionPane.showMessageDialog(this, "Chua chon dong de sua");
            } else {
                if (this.readForm() != null) {
                    long id = Integer.parseInt(tbl_GiamGia.getValueAt(i, 0).toString());
                    if (rp.sua(id, readForm()) > 0) {
                        JOptionPane.showMessageDialog(this, "Sua thanh cong");
                        this.fillTable(rp.getAll());
                    } else {
                        JOptionPane.showMessageDialog(this, "Sua that bai");
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void tbl_GiamGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_GiamGiaMouseClicked
        i = tbl_GiamGia.getSelectedRow();
        showData(i);
    }//GEN-LAST:event_tbl_GiamGiaMouseClicked

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        int chon = JOptionPane.showConfirmDialog(this, "Ban co muon them k?");
        if (chon == 0) {
            if (rp.checkTrung(txtMa.getText()) != null) {
                JOptionPane.showMessageDialog(this, "Ma nay da ton tai");
            } else {
                if (this.readForm() != null) {
                    if (rp.them(readForm()) > 0) {
                        JOptionPane.showMessageDialog(this, "Them thanh cong");
                        this.fillTable(rp.getAll());
                    } else {
                        JOptionPane.showMessageDialog(this, "Them that bai");
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        i = tbl_GiamGia.getSelectedRow();
        int chon = JOptionPane.showConfirmDialog(this, "Ban muon xoa khong?");
        if (chon == 0) {
            if (i == -1) {
                JOptionPane.showMessageDialog(this, "Chua chon dong de xoa");
            } else {
                if (this.readForm() != null) {
                    String maCanXoa = tbl_GiamGia.getValueAt(i, 1).toString();
                    if (rp.xoa(maCanXoa) > 0) {
                        JOptionPane.showMessageDialog(this, "Xoa thanh cong");
                        this.fillTable(rp.getAll());
                    } else {
                        JOptionPane.showMessageDialog(this, "Xoa that bai");
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimActionPerformed
        String maCanTim = JOptionPane.showInputDialog(this, "Moi nhap ma can tim");
        int chon = JOptionPane.showConfirmDialog(this, "Ban co muon tim?");
        if (chon == 0) {
            if (rp.tim(maCanTim).isEmpty()) {
                JOptionPane.showMessageDialog(this, "Khong tim thay");
            } else {
                JOptionPane.showMessageDialog(this, "Da tim thay");
                this.fillTable(rp.tim(maCanTim));
            }
        }

    }//GEN-LAST:event_btn_TimActionPerformed

    private void btn_SapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SapXepActionPerformed
        this.fillTable(rp.sapXep());
    }//GEN-LAST:event_btn_SapXepActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        txtMa.setText("");
        txtTen.setText("");
        txtTienGiam.setText("");
    }//GEN-LAST:event_btn_ResetActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
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
    private javax.swing.JComboBox<String> cboSoLuong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_GiamGia;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTienGiam;
    // End of variables declaration//GEN-END:variables
void showData(int i) {
        txtMa.setText(tbl_GiamGia.getValueAt(i, 1).toString());
        txtTen.setText(tbl_GiamGia.getValueAt(i, 2).toString());
        cboSoLuong.setSelectedItem(tbl_GiamGia.getValueAt(i, 3).toString());
        txtTienGiam.setText(tbl_GiamGia.getValueAt(i, 4).toString());
    }

    Model_GiamGia readForm() {
        String ma, ten;
        int soluong;
        double tiengiam;

        ma = txtMa.getText();
        if (ma.isEmpty()) {
            JOptionPane.showMessageDialog(this, "ma dang de trong");
            txtMa.requestFocus();
            return null;
        }
        ten = txtTen.getText();
        if (ten.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chua nhap ten");
            txtTen.requestFocus();
            return null;
        }
        soluong = Integer.parseInt(cboSoLuong.getSelectedItem().toString());
        try {
            tiengiam = Double.parseDouble(txtTienGiam.getText().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Dang de trong tien");
            txtTienGiam.requestFocus();
            return null;
        }
        return new Model_GiamGia(ma, ten, tiengiam, soluong);
    }
}
