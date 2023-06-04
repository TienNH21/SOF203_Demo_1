package demo;

public class SinhVien {
    private int id;
    private String maSv;
    private String hoTen;
    private String email;
    private String diaChi;
    private String gioiTinh;

    public SinhVien() {
    }

    public SinhVien(int id, String maSv, String hoTen, String email, String diaChi, String gioiTinh) {
        this.id = id;
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.email = email;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
}
