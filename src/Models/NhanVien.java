package Models;

public class NhanVien {
    private String maSo;
    private String hoTen;
    private String soDt;
    private  int soNgayLam;
    private double luong1Ngay;

    public NhanVien() {
    }

    public NhanVien(String maSo, String hoTen, String soDt, int soNgayLam,double luong1Ngay) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.soDt = soDt;
        this.soNgayLam = soNgayLam;
        this.luong1Ngay=luong1Ngay;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDt() {
        return soDt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public double getLuong1Ngay() {
        return luong1Ngay;
    }

    public void setLuong1Ngay(double luong1Ngay) {
        this.luong1Ngay = luong1Ngay;
    }


}
