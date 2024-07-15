
package De02_XeMay;
import java.sql.*;
import java.util.ArrayList;
public class Repositories_XM {
    private Connection con = null; 
    private PreparedStatement ps = null; 
    private ResultSet rs = null;
    private String sql = null; 
    
    public ArrayList<Model_XeMay> getAll(){
        ArrayList<Model_XeMay> list = new ArrayList<>();
        sql = "select id,Ma,Ten,SoLuong,TrangThai from XeMay";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                long id;
                String ma,ten;
                int soLuong,trangThai;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                soLuong = rs.getInt(4);
                trangThai = rs.getInt(5);
                Model_XeMay m = new Model_XeMay(id, ma, ten, soLuong, trangThai);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int them(Model_XeMay m){
        sql = "insert into XeMay(Ma,Ten,SoLuong,TrangThai) values(?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getMa());
            ps.setObject(2, m.getTen());
            ps.setObject(3, m.getSoLuong());
            ps.setObject(4, m.getTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public Model_XeMay checkTrung( String maMoi){
        sql = "select id,Ma,Ten,SoLuong,TrangThai from XeMay where Ma = ?";
        Model_XeMay m = null;
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maMoi);
            rs = ps.executeQuery();
            while(rs.next()){
                long id;
                String ma,ten;
                int soLuong,trangThai;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                soLuong = rs.getInt(4);
                trangThai = rs.getInt(5);
                m = new Model_XeMay(id, ma, ten, soLuong, trangThai);   
            }
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int sua(String ma, Model_XeMay m){
        sql = "update XeMay set Ten = ?,SoLuong = ?,TrangThai = ? where Ma = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTen());
            ps.setObject(2, m.getSoLuong());
            ps.setObject(3, m.getTrangThai());
            ps.setObject(4, m.getMa());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int xoa(String maCanXoa){
        sql = "delete from XeMay where Ma = ?";
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
    public ArrayList<Model_XeMay> timKiem(String maCanTim){
        ArrayList<Model_XeMay> list = new ArrayList<>();
        sql = "select id,Ma,Ten,SoLuong,TrangThai from XeMay where Ma like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, "%"+maCanTim+"%");
            rs = ps.executeQuery();
            while(rs.next()){
                long id;
                String ma,ten;
                int soLuong,trangThai;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                soLuong = rs.getInt(4);
                trangThai = rs.getInt(5);
                Model_XeMay m = new Model_XeMay(id, ma, ten, soLuong, trangThai);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Model_XeMay> sapXep(){
        ArrayList<Model_XeMay> list = new ArrayList<>();
        sql = "select id,Ma,Ten,SoLuong,TrangThai from XeMay order by soLuong desc";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                long id;
                String ma,ten;
                int soLuong,trangThai;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                soLuong = rs.getInt(4);
                trangThai = rs.getInt(5);
                Model_XeMay m = new Model_XeMay(id, ma, ten, soLuong, trangThai);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
