
package De06_CaSi;
import java.sql.*;
import java.util.ArrayList;
public class Repositories_CaSi {
    private Connection con = null; 
    private PreparedStatement ps = null; 
    private ResultSet rs = null; 
    private String sql = null; 
    
    public ArrayList<Model_CaSi> getAll(){
        ArrayList<Model_CaSi> list = new ArrayList<>();
        sql = "select ID,TenCaSi,CongTy,Tuoi,GioiTinh from CaSi";
        try {
            con = DBConnect11.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ten,cty; 
                int tuoi;
                boolean gtinh;
                
                id = rs.getLong(1);
                ten = rs.getString(2);
                cty = rs.getString(3);
                tuoi = rs.getInt(4);
                gtinh = rs.getBoolean(5);
                Model_CaSi m = new Model_CaSi(id, ten, cty, tuoi, gtinh);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }   
    }
    public int them(Model_CaSi m ){
        sql = "insert into CaSi(TenCaSi,CongTy,Tuoi,GioiTinh) values (?,?,?,?)";
        try {
            con = DBConnect11.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTen());
            ps.setObject(2, m.getCty());
            ps.setObject(3, m.getTuoi());
            ps.setObject(4, m.isGtinh());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }      
    }
    public  Model_CaSi checkTrung(String tenMoi){
        sql = "select ID,TenCaSi,CongTy,Tuoi,GioiTinh from CaSi where TenCaSi = ?";
        Model_CaSi m = null;
        try {
            con = DBConnect11.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, tenMoi);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ten,cty; 
                int tuoi;
                boolean gtinh;
                
                id = rs.getLong(1);
                ten = rs.getString(2);
                cty = rs.getString(3);
                tuoi = rs.getInt(4);
                gtinh = rs.getBoolean(5);
                m = new Model_CaSi(id, ten, cty, tuoi, gtinh);
            }
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }   
    }
    public int sua(long id, Model_CaSi m){
        sql = "update CaSi set TenCaSi = ?,CongTy = ?,Tuoi = ?,GioiTinh = ? where ID = ?";
        try {
            con = DBConnect11.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTen());
            ps.setObject(2, m.getCty());
            ps.setObject(3, m.getTuoi());
            ps.setObject(4, m.isGtinh());
            ps.setObject(5,id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int xoa(long idCanXoa){
        sql = "delete from CaSi where id = ?";
        try {
            con = DBConnect11.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, idCanXoa);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public ArrayList<Model_CaSi> tim(String tenCanTim){
        ArrayList<Model_CaSi> list = new ArrayList<>();
        sql = "select ID,TenCaSi,CongTy,Tuoi,GioiTinh from CaSi where TenCaSi like ?";
        try {
            con = DBConnect11.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, "%"+tenCanTim+"%");
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ten,cty; 
                int tuoi;
                boolean gtinh;
                
                id = rs.getLong(1);
                ten = rs.getString(2);
                cty = rs.getString(3);
                tuoi = rs.getInt(4);
                gtinh = rs.getBoolean(5);
                Model_CaSi m = new Model_CaSi(id, ten, cty, tuoi, gtinh);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }   
    }
    public ArrayList<Model_CaSi> sapXep(){
        ArrayList<Model_CaSi> list = new ArrayList<>();
        sql = "select ID,TenCaSi,CongTy,Tuoi,GioiTinh from CaSi order by Tuoi desc";
        try {
            con = DBConnect11.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ten,cty; 
                int tuoi;
                boolean gtinh;
                
                id = rs.getLong(1);
                ten = rs.getString(2);
                cty = rs.getString(3);
                tuoi = rs.getInt(4);
                gtinh = rs.getBoolean(5);
                Model_CaSi m = new Model_CaSi(id, ten, cty, tuoi, gtinh);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }   
    }
}
