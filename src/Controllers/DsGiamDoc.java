package Controllers;

import Models.CongTy;
import Models.GiamDoc;
import Models.NhanVienThuong;
import Models.TruongPhong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DsGiamDoc {
    private ArrayList<GiamDoc> dsgd;

    public DsGiamDoc(ArrayList<GiamDoc> dsgd) {
        this.dsgd = dsgd;
    }
    public DsGiamDoc() {
        this.dsgd = new ArrayList<GiamDoc>();
    }
    public void themGD(GiamDoc gd){
        this.dsgd.add(gd);
    }
    public void showGD(){
        for(GiamDoc gd:dsgd ){
            System.out.println(gd+"\n");
        }
    }
    public void xoaGD(int index){
        dsgd.remove(index);
    }
    public double tongLuongGD(){
        double tongLuong=0;
        for(int i=0;i<dsgd.size();i++ ){
            tongLuong+=dsgd.get(i).getLuong1Ngay()*dsgd.get(i).getSoNgayLam();
        }
        return tongLuong;
    }

    public void MaxCP(){
        int index=0;
        double maxMark=dsgd.get(0).getCoPhan();
        for(int i=1;i<dsgd.size();i++ ){
            if(dsgd.get(i).getCoPhan()>maxMark){
                index=i;
            }
        }
        System.out.println(dsgd.get(index));
    }
    double doanhThuThang;
    double tongLuongCty;
    public double getDoanhThuThang() {
        return doanhThuThang;
    }

    public void setDoanhThuThang(double doanhThuThang) {
        this.doanhThuThang = doanhThuThang;
    }

    public double getTongLuongCty() {
        return tongLuongCty;
    }

    public void setTongLuongCty(double tongLuongCty) {
        this.tongLuongCty = tongLuongCty;
    }

    public void ThuNhapGD(){
        double loiNhuan=doanhThuThang-tongLuongCty;
       for (int i=0;i<dsgd.size();i++){
            double luongthang=dsgd.get(i).getLuong1Ngay()*dsgd.get(i).getSoNgayLam();
            double thunhap=luongthang+(dsgd.get(i).getCoPhan()*loiNhuan)/100;
            System.out.println("Giám đốc thứ "+i);
           System.out.println("Mã GD:  "+dsgd.get(i).getMaSo());
            System.out.println("Họ Tên GD:  "+dsgd.get(i).getHoTen());
            System.out.println(thunhap);
       }
    }
    public void LuongGiamDan(){
        System.out.println("Lương giám đốc giảm dần: ");
        Collections.sort(this.dsgd, new Comparator<GiamDoc>() {
            @Override
            public int compare(GiamDoc gd1, GiamDoc gd2) {
                if(gd1.tinhLuongGD()<gd2.tinhLuongGD()){
                    return 1;
                } else if (gd1.tinhLuongGD()>gd2.tinhLuongGD()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }

    public void TenTheoThuTu(){
        System.out.println("Tên giám đốc theo thứ tự abc");
        Collections.sort(this.dsgd, new Comparator<GiamDoc>() {
            @Override
            public int compare(GiamDoc gd1, GiamDoc gd2) {
                return gd1.getHoTen().compareTo(gd2.getHoTen());
            }
        });

    }
}
