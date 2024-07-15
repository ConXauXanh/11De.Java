
package De02_XeMay;
public class Model_XeMay {
    private long id;
    private String ma,ten;
    private int soLuong, trangThai;

    public Model_XeMay() {
    }

    public Model_XeMay(String ma, String ten, int soLuong, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public Model_XeMay(long id, String ma, String ten, int soLuong, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    public Object[] toDataRow(){
        return new Object[]{this.getMa(),this.getTen(),this.getSoLuong(),this.getTrangThai()==1?"Mới":"Cũ"};
    }
}
