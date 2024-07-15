
package De03_Sach;
import java.sql.*;
import java.util.ArrayList;
public class Repositories_Sach {
    private Connection con = null; 
    private PreparedStatement ps = null; 
    private ResultSet rs = null;
    private String sql = null; 
    
    public ArrayList<Model_Sach> getAll(){
        ArrayList<Model_Sach> list = new ArrayList<>();
        sql = "select id,Ma,Ten,SoTrang,TrangThai from Sach";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ma,ten; 
                int sotrang, trangthai;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                sotrang = rs.getInt(4);
                trangthai = rs.getInt(5);
                Model_Sach m = new Model_Sach(id, ma, ten, sotrang, trangthai);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
    public int them(Model_Sach m){
        sql = "insert into Sach(Ma,Ten,SoTrang,TrangThai) values(?,?,?,?)";
        try {
             con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getMa());
            ps.setObject(2, m.getTen());
            ps.setObject(3, m.getSotrang());
            ps.setObject(4, m.getTrangthai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public Model_Sach checkTrung(String maMoi){
        sql = "select id,Ma,Ten,SoTrang,TrangThai from Sach where Ma = ?";
        Model_Sach m = null; 
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maMoi);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ma,ten; 
                int sotrang, trangthai;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                sotrang = rs.getInt(4);
                trangthai = rs.getInt(5);
                m = new Model_Sach(id, ma, ten, sotrang, trangthai);
            }
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
    public int sua(String ma , Model_Sach m){
        sql = "update Sach set Ten = ?,SoTrang = ?,TrangThai = ? where Ma = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTen());
            ps.setObject(2, m.getSotrang());
            ps.setObject(3, m.getTrangthai());
            ps.setObject(4, m.getMa());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int xoa(String maCanXoa){
        sql = "delete from Sach where Ma = ?";
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
    public ArrayList<Model_Sach> tim(String tenCanTim){
        ArrayList<Model_Sach> list = new ArrayList<>();
        sql = "select id,Ma,Ten,SoTrang,TrangThai from Sach where Ten like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, "%"+tenCanTim +"%");
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ma,ten; 
                int sotrang, trangthai;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                sotrang = rs.getInt(4);
                trangthai = rs.getInt(5);
                Model_Sach m = new Model_Sach(id, ma, ten, sotrang, trangthai);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
    public ArrayList<Model_Sach> sapXep(){
        ArrayList<Model_Sach> list = new ArrayList<>();
        sql = "select id,Ma,Ten,SoTrang,TrangThai from Sach order by Ten desc";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ma,ten; 
                int sotrang, trangthai;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                sotrang = rs.getInt(4);
                trangthai = rs.getInt(5);
                Model_Sach m = new Model_Sach(id, ma, ten, sotrang, trangthai);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
    
}
