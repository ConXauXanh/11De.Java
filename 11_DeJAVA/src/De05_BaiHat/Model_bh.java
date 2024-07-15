
package De05_BaiHat;
public class Model_bh {
    private long id; 
    private String tenbai,tentg; 
    private int thoiluong; 
    private double gia; 

    public Model_bh() {
    }

    public Model_bh(long id, String tenbai, String tentg, int thoiluong, double gia) {
        this.id = id;
        this.tenbai = tenbai;
        this.tentg = tentg;
        this.thoiluong = thoiluong;
        this.gia = gia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenbai() {
        return tenbai;
    }

    public void setTenbai(String tenbai) {
        this.tenbai = tenbai;
    }

    public String getTentg() {
        return tentg;
    }

    public void setTentg(String tentg) {
        this.tentg = tentg;
    }

    public int getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(int thoiluong) {
        this.thoiluong = thoiluong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public Object [] toDataRow(){
        return new Object[] {this.getTenbai(),this.getTentg(),this.getThoiluong(),this.getGia()}; 
    }
}
