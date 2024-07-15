
package De01;
public class Model_NV {
    private long id;
    private String ma; 
    private String ten; 
    private String dchi;
    private String gtinh;

    public Model_NV() {
    }

    public Model_NV(long id, String ma, String ten, String dchi, String gtinh) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.dchi = dchi;
        this.gtinh = gtinh;
    }

    public Model_NV(String ma, String ten, String dchi, String gtinh) {
        this.ma = ma;
        this.ten = ten;
        this.dchi = dchi;
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

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public String getGtinh() {
        return gtinh;
    }

    public void setGtinh(String gtinh) {
        this.gtinh = gtinh;
    }

    
    
    public Object[] toDataRow(){
        return new Object[]{this.getMa(),this.getTen(),this.getDchi(),this.getGtinh()};
    }
}
