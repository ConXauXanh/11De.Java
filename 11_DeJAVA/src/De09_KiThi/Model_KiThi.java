
package De09_KiThi;
public class Model_KiThi {
    private long id; 
    private String mon; 
    private int diem; 
    private String ngayBD, ngayKT;

    public Model_KiThi() {
    }

    public Model_KiThi(long id, String mon, int diem, String ngayBD, String ngayKT) {
        this.id = id;
        this.mon = mon;
        this.diem = diem;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    public Model_KiThi(String mon, int diem, String ngayBD, String ngayKT) {
        this.mon = mon;
        this.diem = diem;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(String ngayBD) {
        this.ngayBD = ngayBD;
    }

    public String getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(String ngayKT) {
        this.ngayKT = ngayKT;
    }
    
    public Object[] toDataRow(){
        return new Object[] {this.getId(),this.getMon(),this.getDiem(),this.getNgayBD(),this.getNgayKT()};
    }
}
