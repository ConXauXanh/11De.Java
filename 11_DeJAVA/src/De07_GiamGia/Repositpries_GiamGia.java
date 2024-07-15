
package De07_GiamGia;
import java.sql.*;
import java.util.ArrayList;
public class Repositpries_GiamGia {
    private Connection con = null; 
    private PreparedStatement ps = null; 
    private ResultSet rs =  null; 
    private String sql = null; 
    
    public ArrayList<Model_GiamGia> getAll(){
        sql = "select id,Ma,Ten,SoLuong,TienGiamToiDa from PhieuGiamGia";
        ArrayList<Model_GiamGia> list = new ArrayList<>();
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ma, ten; 
                int soluong; 
                double tiengiam;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                soluong = rs.getInt(4);
                tiengiam = rs.getDouble(5);
                Model_GiamGia m = new Model_GiamGia(id, ma, ten, tiengiam, soluong);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
    public int them(Model_GiamGia m ){
        sql = "insert into PhieuGiamGia(Ma,Ten,SoLuong,TienGiamToiDa) values(?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getMa());
            ps.setObject(2, m.getTen());
            ps.setObject(3, m.getSoluong());
            ps.setObject(4, m.getTiengiam());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int sua(long id,Model_GiamGia m ){
        sql = "update PhieuGiamGia set Ma = ?,Ten =?,SoLuong=?,TienGiamToiDa =? where id = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getMa());
            ps.setObject(2, m.getTen());
            ps.setObject(3, m.getSoluong());
            ps.setObject(4, m.getTiengiam());
            ps.setObject(5, id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int xoa( String maCanXoa ){
        sql = "delete from PhieuGiamGia where Ma = ? ";
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
    public Model_GiamGia checkTrung(String maMoi){
        sql = "select id,Ma,Ten,SoLuong,TienGiamToiDa from PhieuGiamGia where Ma = ?";
        Model_GiamGia m = null;
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maMoi);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ma, ten; 
                int soluong; 
                double tiengiam;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                soluong = rs.getInt(4);
                tiengiam = rs.getDouble(5);
                m = new Model_GiamGia(id, ma, ten, tiengiam, soluong);
            }
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
    public ArrayList<Model_GiamGia> tim(String maCanTim){
        sql = "select id,Ma,Ten,SoLuong,TienGiamToiDa from PhieuGiamGia where Ma like ?";
        ArrayList<Model_GiamGia> list = new ArrayList<>();
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, "%"+maCanTim+"%");
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ma, ten; 
                int soluong; 
                double tiengiam;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                soluong = rs.getInt(4);
                tiengiam = rs.getDouble(5);
                Model_GiamGia m = new Model_GiamGia(id, ma, ten, tiengiam, soluong);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
    public ArrayList<Model_GiamGia> sapXep(){
        sql = "select id,Ma,Ten,SoLuong,TienGiamToiDa from PhieuGiamGia order by SoLuong desc";
        ArrayList<Model_GiamGia> list = new ArrayList<>();
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ma, ten; 
                int soluong; 
                double tiengiam;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                soluong = rs.getInt(4);
                tiengiam = rs.getDouble(5);
                Model_GiamGia m = new Model_GiamGia(id, ma, ten, tiengiam, soluong);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
}
