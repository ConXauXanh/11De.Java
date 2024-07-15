
package De10_SP;
public class Model_SanPham {
    private long id; 
    private String ma; 
    private String ten; 
    private int gia;
    private int trangThai; 

    public Model_SanPham() {
    }

    public Model_SanPham(long id, String ma, String ten, int gia, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public Model_SanPham(String ma, String ten, int gia, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    public Object[] toDataRow(){
        return new Object[]{this.getId(),this.getMa(),this.getTen(),this.getGia(),this.getTrangThai()==1?"Tốt":"Không tốt"};
    }
    
}
