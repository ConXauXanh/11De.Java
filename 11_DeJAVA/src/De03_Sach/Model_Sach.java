
package De03_Sach;
public class Model_Sach {
    private long id;
    private String ma,ten; 
    private int sotrang; 
    private int trangthai;

    public Model_Sach() {
    }

    public Model_Sach(long id, String ma, String ten, int sotrang, int trangthai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.sotrang = sotrang;
        this.trangthai = trangthai;
    }

    public Model_Sach(String ma, String ten, int sotrang, int trangthai) {
        this.ma = ma;
        this.ten = ten;
        this.sotrang = sotrang;
        this.trangthai = trangthai;
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

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    
    public Object[] toDataRow(){
        return new Object[]{this.getMa(),this.getTen(),this.getSotrang(),this.getTrangthai()==1?"Mới":"Cũ"};
    }
}
