package De11_BaiHat;

import java.sql.*;
import java.util.ArrayList;

public class Repositories_BaiHat {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model_BaiHat> getAll() {
        ArrayList<Model_BaiHat> list = new ArrayList<>();
        sql = "select id,TenBaiHat,Gia,ThoiLuong,NgayRaMat from BaiHat";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                long id;
                String ten;
                double gia;
                int thoiluong;
                Date ngayRM;
                
                id = rs.getLong(1);
                ten = rs.getString(2);
                gia = rs.getDouble(3);
                thoiluong = rs.getInt(4);
                ngayRM = rs.getDate(5);
                Model_BaiHat m = new Model_BaiHat(id, ten, gia, thoiluong, ngayRM);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int them(Model_BaiHat m ){
        sql = "insert into BaiHat(TenBaiHat,Gia,ThoiLuong,NgayRaMat) values(?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTen());
            ps.setObject(2, m.getGia());
            ps.setObject(3, m.getThoiluong());
            ps.setObject(4, m.getNgayRM());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int sua(long id ,Model_BaiHat m ){
        sql = "update BaiHat set TenBaiHat=?,Gia=?,ThoiLuong=?,NgayRaMat=? where id = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTen());
            ps.setObject(2, m.getGia());
            ps.setObject(3, m.getThoiluong());
            ps.setObject(4, m.getNgayRM());
            ps.setObject(5,id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int xoa( long idCanXoa ){
        sql = "delete from BaiHat where id = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, idCanXoa);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public ArrayList<Model_BaiHat> tim(long idCanTim) {
        ArrayList<Model_BaiHat> list = new ArrayList<>();
        sql = "select id,TenBaiHat,Gia,ThoiLuong,NgayRaMat from BaiHat where id like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, "%"+idCanTim+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                long id;
                String ten;
                double gia;
                int thoiluong;
                Date ngayRM;
                
                id = rs.getLong(1);
                ten = rs.getString(2);
                gia = rs.getDouble(3);
                thoiluong = rs.getInt(4);
                ngayRM = rs.getDate(5);
                Model_BaiHat m = new Model_BaiHat(id, ten, gia, thoiluong, ngayRM);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Model_BaiHat> sapXep() {
        ArrayList<Model_BaiHat> list = new ArrayList<>();
        sql = "select id,TenBaiHat,Gia,ThoiLuong,NgayRaMat from BaiHat order by Gia desc ";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                long id;
                String ten;
                double gia;
                int thoiluong;
                Date ngayRM;
                
                id = rs.getLong(1);
                ten = rs.getString(2);
                gia = rs.getDouble(3);
                thoiluong = rs.getInt(4);
                ngayRM = rs.getDate(5);
                Model_BaiHat m = new Model_BaiHat(id, ten, gia, thoiluong, ngayRM);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
