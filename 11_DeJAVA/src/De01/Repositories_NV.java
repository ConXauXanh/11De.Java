package De01;

import java.sql.*;
import java.util.ArrayList;

public class Repositories_NV {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model_NV> getAll() {
        ArrayList<Model_NV> list = new ArrayList<>();
        sql = "select ID,Ma,Ten,DiaChi,GioiTinh from NhanVien";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                long id;
                String ma;
                String ten;
                String dchi;
                String gtinh;
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                dchi = rs.getString(4);
                gtinh = rs.getString(5);
                Model_NV m = new Model_NV(id, ma, ten, dchi, gtinh);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int them(Model_NV m) {
        sql = "insert into NhanVien(Ma,Ten,DiaChi,GioiTinh) values(?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getMa());
            ps.setObject(2, m.getTen());
            ps.setObject(3, m.getDchi());
            ps.setObject(4, m.getGtinh());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public Model_NV checkTrung(String maMoi) {
        sql = "select ID,Ma,Ten,DiaChi,GioiTinh from NhanVien where ma = ?";
        Model_NV m = null;
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maMoi);
            rs = ps.executeQuery();
            while (rs.next()) {
                long id;
                String ma;
                String ten;
                String dchi;
                String gtinh;
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                dchi = rs.getString(4);
                gtinh = rs.getString(5);
                m = new Model_NV(id, ma, ten, dchi, gtinh);
            }
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int sua(String ma, Model_NV m){
        sql = "update NhanVien set Ten = ?,DiaChi = ?,GioiTinh = ? where Ma = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTen());
            ps.setObject(2, m.getDchi());
            ps.setObject(3, m.getGtinh());
            ps.setObject(4, m.getMa());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int xoa(String maCanXoa){
        sql = "delete from NhanVien where Ma = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maCanXoa);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public ArrayList<Model_NV> timKiem(String maCanTim) {
        ArrayList<Model_NV> list = new ArrayList<>();
        sql = "select ID,Ma,Ten,DiaChi,GioiTinh from NhanVien where Ma like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, "%"+maCanTim+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                long id;
                String ma;
                String ten;
                String dchi;
                String gtinh;
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                dchi = rs.getString(4);
                gtinh = rs.getString(5);
                Model_NV m = new Model_NV(id, ma, ten, dchi, gtinh);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Model_NV> sapXep() {
        ArrayList<Model_NV> list = new ArrayList<>();
        sql = "select ID,Ma,Ten,DiaChi,GioiTinh from NhanVien order by Ten desc";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                long id;
                String ma;
                String ten;
                String dchi;
                String gtinh;
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                dchi = rs.getString(4);
                gtinh = rs.getString(5);
                Model_NV m = new Model_NV(id, ma, ten, dchi, gtinh);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
