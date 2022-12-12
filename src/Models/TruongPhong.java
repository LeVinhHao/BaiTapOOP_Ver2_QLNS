package Models;

import java.util.Objects;

public class TruongPhong extends NhanVien{
   private int soLuongNV;


    public TruongPhong() {

    }
    public TruongPhong(String maSo, String hoTen, String soDt, int soNgayLam, int soLuongNV, double luong1Ngay) {
        super(maSo, hoTen, soDt, soNgayLam,luong1Ngay);
        this.soLuongNV = soLuongNV;
    }




    public int getSoLuongNV() {
        return soLuongNV;
    }

    public void setSoLuongNV(int soLuongNV) {
        this.soLuongNV = soLuongNV;
    }

    public double tinhLuongTP() {
        double tong;
        return tong=getLuong1Ngay()*getSoNgayLam()+(100*soLuongNV);
    }

    @Override
    public String toString() {
        return
                                "Mã trưởng phòng: "+getMaSo()+"\n"+
                                "Họ tên: "+ getHoTen()+"\n"+
                                "Số lượng nhân viên quản lý: "+getSoLuongNV()+"\n"+
                                "lương 1 ngày: "+ getLuong1Ngay()+"\n"+
                                "Số ngày làm: "+getSoNgayLam()+"\n"+
                                        "Lương: "+tinhLuongTP()+"\n"+
                                "SDT: "+getSoDt()+"\n";
    }
}
