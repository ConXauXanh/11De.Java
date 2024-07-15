
package De11_BaiHat;

import java.util.Date;

public class Model_BaiHat {
    private long id; 
    private String ten; 
    private double gia; 
    private int thoiluong; 
    private Date ngayRM; 

    public Model_BaiHat() {
    }

    public Model_BaiHat(long id, String ten, double gia, int thoiluong, Date ngayRM) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.thoiluong = thoiluong;
        this.ngayRM = ngayRM;
    }

    public Model_BaiHat(String ten, double gia, int thoiluong, Date ngayRM) {
        this.ten = ten;
        this.gia = gia;
        this.thoiluong = thoiluong;
        this.ngayRM = ngayRM;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(int thoiluong) {
        this.thoiluong = thoiluong;
    }

    public Date getNgayRM() {
        return ngayRM;
    }

    public void setNgayRM(Date ngayRM) {
        this.ngayRM = ngayRM;
    }
    
    public Object[] toDataRow(){
        return new Object[] {this.getId(),this.getTen(),this.getGia(),this.getThoiluong(),this.getNgayRM()};
    }
}
