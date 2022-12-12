package Models;

import java.util.Objects;

public class NhanVienThuong extends NhanVien{
    private String truongPhong;

    public NhanVienThuong() {
    }

    public String getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(String truongPhong) {
        this.truongPhong = truongPhong;
    }

    public NhanVienThuong(String maSo, String hoTen, String soDt, int soNgayLam, double luong1Ngay, String truongPhong) {
        super(maSo, hoTen, soDt, soNgayLam, luong1Ngay);
        this.truongPhong = truongPhong;
    }


    public double tinhLuongNV(){
        double tong;
        return tong=getSoNgayLam()*getLuong1Ngay();
    }
    @Override
    public String toString() {
        return
                        "Mã nhân viên: "+getMaSo()+"\n"+
                        "Họ tên: "+ getHoTen()+"\n"+
                        "Trưởng phòng quản lý: "+ getTruongPhong()+"\n"+
                        "Số ngày làm: "+getSoNgayLam()+"\n"+
                                "Lương 1 ngày: "+getLuong1Ngay()+"\n"+
                        "lương: "+tinhLuongNV()+"\n"+
                        "SDT: "+getSoDt();
    }
}
