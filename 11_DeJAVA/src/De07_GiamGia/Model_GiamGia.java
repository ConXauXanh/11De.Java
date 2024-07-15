
package De07_GiamGia;
public class Model_GiamGia {
    private long id; 
    private String ma, ten; 
    private double tiengiam; 
    private int soluong; 

    public Model_GiamGia() {
    }

    
    public Model_GiamGia(long id, String ma, String ten, double tiengiam, int soluong) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tiengiam = tiengiam;
        this.soluong = soluong;
    }

    public Model_GiamGia(String ma, String ten, double tiengiam, int soluong) {
        this.ma = ma;
        this.ten = ten;
        this.tiengiam = tiengiam;
        this.soluong = soluong;
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

    public double getTiengiam() {
        return tiengiam;
    }

    public void setTiengiam(double tiengiam) {
        this.tiengiam = tiengiam;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public Object[] toDataRow(){
        return new Object[]{this.getId(), this.getMa(),this.getTen(),this.getSoluong(),this.getTiengiam()};
    }
            
}
