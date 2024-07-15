
package De04;
public class Model_PlayList {
    private long id; 
    private String tieude,tentg, theloai;
    private int soluong;
    private String ngonngu;

    public Model_PlayList() {
    }

    public Model_PlayList(long id, String tieude, String tentg, String theloai, int soluong, String ngonngu) {
        this.id = id;
        this.tieude = tieude;
        this.tentg = tentg;
        this.theloai = theloai;
        this.soluong = soluong;
        this.ngonngu = ngonngu;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getTentg() {
        return tentg;
    }

    public void setTentg(String tentg) {
        this.tentg = tentg;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNgonngu() {
        return ngonngu;
    }

    public void setNgonngu(String ngonngu) {
        this.ngonngu = ngonngu;
    }

   
    public Object[] toDatRow(){
        return new Object[] {this.getId(),this.getTieude(),this.getTentg(),this.getTheloai(),this.getSoluong() ,this.getNgonngu()};
    }
}
