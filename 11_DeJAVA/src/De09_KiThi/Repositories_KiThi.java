
package De09_KiThi;
import java.sql.*;
import java.util.ArrayList;
public class Repositories_KiThi {
    private Connection con = null; 
    private PreparedStatement ps = null; 
    private ResultSet rs = null; 
    private String sql = null; 
    
    public ArrayList<Model_KiThi> getAll(){
        ArrayList<Model_KiThi> list = new ArrayList<>(); 
        sql = "select id, MonThi,Diem, NgayBatDau,NgayKetThuc from KyThi";
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); 
            while(rs.next()){
                long id; 
                String mon; 
                int diem; 
                String ngayBD, ngayKT; 
                
                id = rs.getLong(1);
                mon = rs.getString(2);
                diem = rs.getInt(3);
                ngayBD = rs.getString(4);
                ngayKT = rs.getString(5);
                Model_KiThi m = new Model_KiThi(id, mon, diem, ngayBD, ngayKT);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int them(Model_KiThi m ){
        sql = "insert into KyThi(MonThi,Diem, NgayBatDau,NgayKetThuc)values(?,?,?,?)";
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getMon());
            ps.setObject(2, m.getDiem());
            ps.setObject(3, m.getNgayBD());
            ps.setObject(4, m.getNgayKT());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int sua(long id ,Model_KiThi m ){
        sql = "update KyThi set MonThi=?,Diem =?, NgayBatDau =?,NgayKetThuc =? where id = ?";
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getMon());
            ps.setObject(2, m.getDiem());
            ps.setObject(3, m.getNgayBD());
            ps.setObject(4, m.getNgayKT());
            ps.setObject(5, id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int xoa(long idCanXoa ){
        sql = "delete from KyThi where id = ?";
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, idCanXoa);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public ArrayList<Model_KiThi> tim(long idCanTim){
        ArrayList<Model_KiThi> list = new ArrayList<>(); 
        sql = "select id, MonThi,Diem, NgayBatDau,NgayKetThuc from KyThi where id like ?";
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, "%"+ idCanTim +"%");
            rs = ps.executeQuery(); 
            while(rs.next()){
                long id; 
                String mon; 
                int diem; 
                String ngayBD, ngayKT; 
                
                id = rs.getLong(1);
                mon = rs.getString(2);
                diem = rs.getInt(3);
                ngayBD = rs.getString(4);
                ngayKT = rs.getString(5);
                Model_KiThi m = new Model_KiThi(id, mon, diem, ngayBD, ngayKT);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Model_KiThi> sapXep(){
        ArrayList<Model_KiThi> list = new ArrayList<>(); 
        sql = "select id, MonThi,Diem, NgayBatDau,NgayKetThuc from KyThi order by Diem desc";
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); 
            while(rs.next()){
                long id; 
                String mon; 
                int diem; 
                String ngayBD, ngayKT; 
                
                id = rs.getLong(1);
                mon = rs.getString(2);
                diem = rs.getInt(3);
                ngayBD = rs.getString(4);
                ngayKT = rs.getString(5);
                Model_KiThi m = new Model_KiThi(id, mon, diem, ngayBD, ngayKT);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
