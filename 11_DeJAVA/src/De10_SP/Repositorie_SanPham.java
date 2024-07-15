
package De10_SP;
import java.sql.*;
import java.util.ArrayList;
public class Repositorie_SanPham {
    private Connection con = null; 
    private PreparedStatement ps = null; 
    private ResultSet rs = null; 
    private String sql = null; 
    
    public ArrayList<Model_SanPham> getAll(){
        ArrayList<Model_SanPham> list = new ArrayList<>();
        sql = "select id,Ma,Ten,GiaBan,TrangThai from SanPham";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                long id; 
                String ma; 
                String ten; 
                int gia; 
                int trangThai; 
                
                id = rs.getLong(1);
                ma = rs.getString(2);
                ten = rs.getString(3);
                gia = rs.getInt(4);
                trangThai = rs.getInt(5);
                list.add(new Model_SanPham(id, ma, ten, gia, trangThai));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
