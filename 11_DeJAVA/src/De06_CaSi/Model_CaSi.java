
package De06_CaSi;
public class Model_CaSi {
    private  long id; 
    private String ten,cty; 
    private int tuoi; 
    private boolean gtinh; 

    public Model_CaSi() {
    }

    public Model_CaSi(long id, String ten, String cty, int tuoi, boolean gtinh) {
        this.id = id;
        this.ten = ten;
        this.cty = cty;
        this.tuoi = tuoi;
        this.gtinh = gtinh;
    }

    public Model_CaSi(String ten, String cty, int tuoi, boolean gtinh) {
        this.ten = ten;
        this.cty = cty;
        this.tuoi = tuoi;
        this.gtinh = gtinh;
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

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGtinh() {
        return gtinh;
    }

    public void setGtinh(boolean gtinh) {
        this.gtinh = gtinh;
    }
    
    public Object[] toDataRow(){
        return new Object[] {this.getId(),this.getTen(),this.getCty(), this.getTuoi(), this.isGtinh()?"Nam":"Nu"}; 
    }
}
