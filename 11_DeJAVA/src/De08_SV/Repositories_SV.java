
package De08_SV;
import java.sql.*; 
import java.util.ArrayList;
public class Repositories_SV {
    private Connection con = null;
    private PreparedStatement ps = null; 
    private ResultSet rs = null; 
    private String sql = null; 
    
    public ArrayList<Model_SV> getAll(){
        ArrayList<Model_SV> list = new ArrayList<>();
        sql = "select ID, Ma,Ten,Tuoi,GioiTinh from SinhVien";
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ma, ten; 
                int tuoi,gtinh;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                tuoi = rs.getInt(4);
                gtinh = rs.getInt(5);
                Model_SV m = new Model_SV(id, ma, ten, tuoi, gtinh);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
    public int them(Model_SV m){
        sql = "insert into SinhVien(Ma,Ten,Tuoi,GioiTinh)\n" +
                "values (?,?,?,?)";
        try {
            con = DBConnect1.getConnection();
            ps =  con.prepareStatement(sql);
            ps.setObject(1, m.getMa());
            ps.setObject(2, m.getTen());
            ps.setObject(3, m.getTuoi());
            ps.setObject(4, m.getGtinh());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int sua(long id, Model_SV m){
        sql = "update SinhVien set Ma=?,Ten =?,Tuoi=?,GioiTinh=? where id = ?";
        try {
            con = DBConnect1.getConnection();
            ps =  con.prepareStatement(sql);
            ps.setObject(1, m.getMa());
            ps.setObject(2, m.getTen());
            ps.setObject(3, m.getTuoi());
            ps.setObject(4, m.getGtinh());
            ps.setObject(5, id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int xoa(long idCanXoa){
        sql = "delete from SinhVien where id = ?";
        try {
            con = DBConnect1.getConnection();
            ps =  con.prepareStatement(sql);
            ps.setObject(1,idCanXoa);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public Model_SV checkTrung(String maMoi){
        sql = "select ID, Ma,Ten,Tuoi,GioiTinh from SinhVien where Ma = ?";
        Model_SV m = null;
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maMoi);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ma, ten; 
                int tuoi,gtinh;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                tuoi = rs.getInt(4);
                gtinh = rs.getInt(5);
                m = new Model_SV(id, ma, ten, tuoi, gtinh);
            }
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
    public ArrayList<Model_SV> tim(long idCanTim){
        ArrayList<Model_SV> list = new ArrayList<>();
        sql = "select ID, Ma,Ten,Tuoi,GioiTinh from SinhVien where ID like ?";
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, "%"+ idCanTim +"%");
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ma, ten; 
                int tuoi,gtinh;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                tuoi = rs.getInt(4);
                gtinh = rs.getInt(5);
                Model_SV m = new Model_SV(id, ma, ten, tuoi, gtinh);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
    public ArrayList<Model_SV> sapXep(){
        ArrayList<Model_SV> list = new ArrayList<>();
        sql = "select ID, Ma,Ten,Tuoi,GioiTinh from SinhVien order by Tuoi desc";
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ma, ten; 
                int tuoi,gtinh;
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                tuoi = rs.getInt(4);
                gtinh = rs.getInt(5);
                Model_SV m = new Model_SV(id, ma, ten, tuoi, gtinh);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
}
