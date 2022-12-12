package Controllers;

import Models.NhanVien;
import Models.NhanVienThuong;
import Models.TruongPhong;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DsNhanVien {
    private ArrayList<NhanVienThuong> dsnv;

    public DsNhanVien(ArrayList<NhanVienThuong> dsnv) {
        this.dsnv = dsnv;
    }
    public DsNhanVien() {
        this.dsnv = new ArrayList<NhanVienThuong>();
    }

    public void themNV(NhanVienThuong nv){
        this.dsnv.add(nv);
    }

    public void showNV(){
        for(NhanVienThuong nv:dsnv ){
            System.out.println(nv+"\n");
        }
    }
    public void xoaNhanVien(int index){
        dsnv.remove(index);
    }
    public double tongLuongNV(){
        double tongLuong=0;
        for(int i=0;i<dsnv.size();i++ ){
            tongLuong+=dsnv.get(i).getLuong1Ngay()*dsnv.get(i).getSoNgayLam();
        }
        return tongLuong;
    }

    public void MaxDiem(){
        int index=0;
        double maxMark=dsnv.get(0).getLuong1Ngay()*dsnv.get(0).getSoNgayLam();
        for(int i=1;i<dsnv.size();i++ ){
            if(dsnv.get(i).getLuong1Ngay()*dsnv.get(i).getSoNgayLam()>maxMark){
                index=i;
            }
        }
        System.out.println(dsnv.get(index));
    }

    public void LuongGiamDan(){
        System.out.println("Lương nhân viên giảm dần: ");
        Collections.sort(this.dsnv, new Comparator<NhanVienThuong>() {
            @Override
            public int compare(NhanVienThuong nv1, NhanVienThuong nv2) {
                if(nv1.tinhLuongNV()<nv2.tinhLuongNV()){
                    return 1;
                } else if (nv1.tinhLuongNV()>nv2.tinhLuongNV()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }

    public void TenTheoThuTu(){
        System.out.println("Tên nhân viên theo thứ tự abc");
        Collections.sort(this.dsnv, new Comparator<NhanVienThuong>() {
            @Override
            public int compare(NhanVienThuong nv1, NhanVienThuong nv2) {
                return nv1.getHoTen().compareTo(nv2.getHoTen());
            }
        });

    }
}
