
package De05_BaiHat;
import java.sql.*; 
import java.util.ArrayList;
public class Repositories_BaiHat {
    private Connection con  = null; 
    private PreparedStatement ps = null; 
    private ResultSet rs = null; 
    private String sql = null; 
    
    public ArrayList<Model_bh> getAll(){
        ArrayList<Model_bh> list = new ArrayList<>(); 
        sql = "select ID, TenBaiHat, TenTacGia,ThoiLuong,Gia from BaiHat";
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String tenbai,tentg; 
                int thoiluong; 
                double gia; 
                
                id = rs.getLong(1);
                tenbai = rs.getString(2);
                tentg = rs.getString(3);
                thoiluong = rs.getInt(4);
                gia = rs.getDouble(5);
                Model_bh m  = new Model_bh(id, tenbai, tentg, thoiluong, gia);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
    public int Them(Model_bh m ){
        sql = "insert into BaiHat(TenBaiHat, TenTacGia,ThoiLuong,Gia)\n" +
            "values(?,?,?,?)";
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTenbai());
            ps.setObject(2, m.getTentg());
            ps.setObject(3, m.getThoiluong());
            ps.setObject(4, m.getGia());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public Model_bh checkTrung(String tenBaiMoi){
        sql = "select ID, TenBaiHat, TenTacGia,ThoiLuong,Gia from BaiHat where TenBaiHat = ?";
        Model_bh m = null; 
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, tenBaiMoi);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String tenbai,tentg; 
                int thoiluong; 
                double gia; 
                
                id = rs.getLong(1);
                tenbai = rs.getString(2);
                tentg = rs.getString(3);
                thoiluong = rs.getInt(4);
                gia = rs.getDouble(5);
                m  = new Model_bh(id, tenbai, tentg, thoiluong, gia);
            }
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
    public int sua(long id, Model_bh  m){
        sql = "update BaiHat set TenBaiHat = ?, TenTacGia = ?,ThoiLuong = ?,Gia = ? where id = ?";
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTenbai());
            ps.setObject(2, m.getTentg());
            ps.setObject(3, m.getThoiluong());
            ps.setObject(4, m.getGia());
            ps.setObject(5, id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0 ; 
        }
    }
    public int xoa(String baiCanXoa){
        sql = "delete from BaiHat where TenBaiHat = ?"; 
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, baiCanXoa);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public ArrayList<Model_bh> tim(String tgCanTim){
        ArrayList<Model_bh> list = new ArrayList<>(); 
        sql = "select ID, TenBaiHat, TenTacGia,ThoiLuong,Gia from BaiHat where TenTacGia like ?";
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, "%"+ tgCanTim +"%");
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String tenbai,tentg; 
                int thoiluong; 
                double gia; 
                
                id = rs.getLong(1);
                tenbai = rs.getString(2);
                tentg = rs.getString(3);
                thoiluong = rs.getInt(4);
                gia = rs.getDouble(5);
                Model_bh m  = new Model_bh(id, tenbai, tentg, thoiluong, gia);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
    public ArrayList<Model_bh> sapXep(){
        ArrayList<Model_bh> list = new ArrayList<>(); 
        sql = "select ID, TenBaiHat, TenTacGia,ThoiLuong,Gia from BaiHat order by ThoiLuong desc";
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String tenbai,tentg; 
                int thoiluong; 
                double gia; 
                
                id = rs.getLong(1);
                tenbai = rs.getString(2);
                tentg = rs.getString(3);
                thoiluong = rs.getInt(4);
                gia = rs.getDouble(5);
                Model_bh m  = new Model_bh(id, tenbai, tentg, thoiluong, gia);
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
}
