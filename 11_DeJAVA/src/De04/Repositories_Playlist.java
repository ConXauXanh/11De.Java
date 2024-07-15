package De04;

import java.sql.*;
import java.util.ArrayList;

public class Repositories_Playlist {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model_PlayList> getAll() {
        ArrayList<Model_PlayList> list = new ArrayList<>();
        sql = "select id,TieuDe,TenTacGia,TheLoai, SoLuong,NgonNgu from Playlist";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                long id;
                String tieude, tentg, theloai, ngonngu;
                int soluong;
                id = rs.getLong(1);
                tieude = rs.getString(2);
                tentg = rs.getString(3);
                theloai = rs.getString(4);
                soluong = rs.getInt(5);
                ngonngu = rs.getString(6);
                Model_PlayList m = new Model_PlayList(id, tieude, tentg, theloai, soluong, ngonngu);
                list.add(m);

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int them(Model_PlayList m) {
        sql = "insert into Playlist(TieuDe,TenTacGia,TheLoai,SoLuong, NgonNgu) values (?,?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTieude());
            ps.setObject(2, m.getTentg());
            ps.setObject(3, m.getTheloai());
            ps.setObject(4, m.getSoluong());
            ps.setObject(5, m.getNgonngu());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public Model_PlayList checkTrung(String maMoi) {
        sql = "select id,TieuDe,TenTacGia,TheLoai, SoLuong,NgonNgu from Playlist where TieuDe = ?";
        Model_PlayList m = null;
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1,maMoi);
            rs = ps.executeQuery();
            while (rs.next()) {
                long id;
                String tieude, tentg, theloai, ngonngu;
                int soluong;
                id = rs.getLong(1);
                tieude = rs.getString(2);
                tentg = rs.getString(3);
                theloai = rs.getString(4);
                soluong = rs.getInt(5);
                ngonngu = rs.getString(6);
                m = new Model_PlayList(id, tieude, tentg, theloai, soluong, ngonngu);
            }
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int sua(long id, Model_PlayList m){
        sql = "update Playlist set TieuDe = ?,TenTacGia = ?,TheLoai = ?,SoLuong = ?, NgonNgu = ? where ID = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTieude());
            ps.setObject(2, m.getTentg());
            ps.setObject(3, m.getTheloai());
            ps.setObject(4, m.getSoluong());
            ps.setObject(5, m.getNgonngu());
            ps.setObject(6, m.getId());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }          
    }
    public int xoa(long idCanXoa){
        sql = "delete from Playlist where id = ?";
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
    public ArrayList<Model_PlayList> timKiem(long idCanTim) {
        ArrayList<Model_PlayList> list = new ArrayList<>();
        sql = "select id,TieuDe,TenTacGia,TheLoai, SoLuong,NgonNgu from Playlist where id like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, "%"+ idCanTim + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                long id;
                String tieude, tentg, theloai, ngonngu;
                int soluong;
                id = rs.getLong(1);
                tieude = rs.getString(2);
                tentg = rs.getString(3);
                theloai = rs.getString(4);
                soluong = rs.getInt(5);
                ngonngu = rs.getString(6);
                Model_PlayList m = new Model_PlayList(id, tieude, tentg, theloai, soluong, ngonngu);
                list.add(m);

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }    
    }
    public ArrayList<Model_PlayList> sapXep() {
        ArrayList<Model_PlayList> list = new ArrayList<>();
        sql = "select id,TieuDe,TenTacGia,TheLoai, SoLuong,NgonNgu from Playlist order by TieuDe desc";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                long id;
                String tieude, tentg, theloai, ngonngu;
                int soluong;
                id = rs.getLong(1);
                tieude = rs.getString(2);
                tentg = rs.getString(3);
                theloai = rs.getString(4);
                soluong = rs.getInt(5);
                ngonngu = rs.getString(6);
                Model_PlayList m = new Model_PlayList(id, tieude, tentg, theloai, soluong, ngonngu);
                list.add(m);

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
