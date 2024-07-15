
package De08_SV;
public class Model_SV {
    private long id;
    private String ma, ten ; 
    private int tuoi, gtinh;

    public Model_SV() {
    }

    public Model_SV(long id, String ma, String ten, int tuoi, int gtinh) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gtinh = gtinh;
    }

    public Model_SV(String ma, String ten, int tuoi, int gtinh) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gtinh = gtinh;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getGtinh() {
        return gtinh;
    }

    public void setGtinh(int gtinh) {
        this.gtinh = gtinh;
    }
    
    public Object[] toDataRow(){
        return new Object[]{this.getId(),this.getMa(),this.getTen(),this.getTuoi(), this.getGtinh()==1?"Nam":"Nu"};
    }
            
}
