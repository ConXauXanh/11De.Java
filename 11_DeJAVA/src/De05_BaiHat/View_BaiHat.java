package De05_BaiHat;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class View_BaiHat extends javax.swing.JFrame {

    private Repositories_BaiHat rp = new Repositories_BaiHat();
    private DefaultTableModel mol = new DefaultTableModel();
    private int i = -1;

    void fillTable(ArrayList<Model_bh> list) {
        mol = (DefaultTableModel) tblBaiHat.getModel();
        mol.setRowCount(0);
        for (Model_bh x : list) {
            mol.addRow(x.toDataRow());
        }
    }

    public View_BaiHat() {
        initComponents();
        this.setLocationRelativeTo(null);
        cboThoiLuong.removeAllItems();
        for (int i = 0; i <= 50; i++) {
            cboThoiLuong.addItem(String.valueOf(i));
        }
        this.fillTable(rp.getAll());
        i = rp.getAll().size();
        showData(i - 1);
        tblBaiHat.setRowSelectionInterval(i - 1, i - 1);

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
        tblBaiHat = new javax.swing.JTable();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        btn_Tim = new javax.swing.JButton();
        btn_SapXep = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        txt_TenBai = new javax.swing.JTextField();
        txtTenTG = new javax.swing.JTextField();
        cboThoiLuong = new javax.swing.JComboBox<>();
        txtGia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUẢN LÍ BÀI HÁT ");

        jLabel2.setText("TÊN BÀI ");

        jLabel3.setText("TÊN TG");

        jLabel4.setText("THỜI LƯỢNG ");

        jLabel5.setText("GIÁ ");

        tblBaiHat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "tên bài", "tên tg", "thời lượng ", "giá "
            }
        ));
        tblBaiHat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBaiHatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBaiHat);

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

        cboThoiLuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                                                .addComponent(txt_TenBai, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_Them))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(txtTenTG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_Sua))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44)
                                                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                    .addComponent(txt_TenBai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_Them)
                                .addComponent(btn_Tim)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btn_Sua)
                            .addComponent(btn_SapXep)
                            .addComponent(txtTenTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btn_Xoa)
                            .addComponent(cboThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Reset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btn_Exit)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        i = tblBaiHat.getSelectedRow();
        int chon = JOptionPane.showConfirmDialog(this, "Ban co chacc muon sua?");
        if (chon == 0) {
            if (i == -1) {
                JOptionPane.showMessageDialog(this, "Chua chon dong de sua");
            } else {
                if (this.readForm() != null) {
                    if (rp.sua(i, readForm()) > 0) {
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

    private void tblBaiHatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBaiHatMouseClicked
        i = tblBaiHat.getSelectedRow();
        showData(i);
    }//GEN-LAST:event_tblBaiHatMouseClicked

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        int chon = JOptionPane.showConfirmDialog(this, "Ban co chac mon them?");
        if (chon == 0) {
            if (rp.checkTrung(txt_TenBai.getText()) != null) {
                JOptionPane.showMessageDialog(this, "Ten bai hat nay da tong tai");
            } else {
                if (this.readForm() != null) {
                    if (rp.Them(readForm()) > 0) {
                        JOptionPane.showMessageDialog(this, "Them tahnh cong");
                        this.fillTable(rp.getAll());
                    } else {
                        JOptionPane.showMessageDialog(this, "Them that bai");
                    }

                }
            }
        }

    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        i = tblBaiHat.getSelectedRow();
        int chon = JOptionPane.showConfirmDialog(this, "ban co chac muon xoa?");
        if (chon == 0) {
            if (i == -1) {
                JOptionPane.showMessageDialog(this, "chua chon dong de xoa");
            } else {
                if (this.readForm() != null) {
                    String baiCanXoa = tblBaiHat.getValueAt(i, 0).toString();
                    if (rp.xoa(baiCanXoa) > 0) {
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
        String tgCanTim = JOptionPane.showInputDialog(this, "Nhap tac gia can tim");
        int chon = JOptionPane.showConfirmDialog(this, "Ban co chac muon tim?");
        if (chon == 0) {
            if (rp.tim(tgCanTim).isEmpty()) {
                JOptionPane.showMessageDialog(this, "Khong tim thay");
            } else {
                JOptionPane.showMessageDialog(this, "Da tim thay tac gia");
                this.fillTable(rp.tim(tgCanTim));
            }
        }

    }//GEN-LAST:event_btn_TimActionPerformed

    private void btn_SapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SapXepActionPerformed
        this.fillTable(rp.sapXep());
    }//GEN-LAST:event_btn_SapXepActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        txt_TenBai.setText("");
        txtTenTG.setText("");
        txtGia.setText("");
                
    }//GEN-LAST:event_btn_ResetActionPerformed

    
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
            java.util.logging.Logger.getLogger(View_BaiHat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_BaiHat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_BaiHat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_BaiHat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_BaiHat().setVisible(true);
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
    private javax.swing.JComboBox<String> cboThoiLuong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBaiHat;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtTenTG;
    private javax.swing.JTextField txt_TenBai;
    // End of variables declaration//GEN-END:variables
void showData(int i) {
        txt_TenBai.setText(tblBaiHat.getValueAt(i, 0).toString());
        txtTenTG.setText(tblBaiHat.getValueAt(i, 1).toString());
        cboThoiLuong.setSelectedItem(tblBaiHat.getValueAt(i, 2).toString());
        txtGia.setText(tblBaiHat.getValueAt(i, 3).toString());
    }

    Model_bh readForm() {
        String tenbai, tentg;
        int thoiluong;
        double gia;

        tenbai = txt_TenBai.getText();
        if (tenbai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chua nhap ten bai");
            txt_TenBai.requestFocus();
            return null;
        }
        tentg = txtTenTG.getText();
        if (tentg.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chua nhap ten tg");
            txtTenTG.requestFocus();
            return null;
        }
        thoiluong = Integer.parseInt(cboThoiLuong.getSelectedItem().toString());
        try {
            gia = Double.parseDouble(txtGia.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gia khong co chu");
            txtGia.requestFocus();
            return null;
        }
        return new Model_bh(i, tenbai, tentg, thoiluong, gia);
    }
}
