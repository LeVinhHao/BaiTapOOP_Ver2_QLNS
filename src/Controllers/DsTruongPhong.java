package Controllers;

import Models.GiamDoc;
import Models.NhanVien;
import Models.NhanVienThuong;
import Models.TruongPhong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DsTruongPhong {
    private ArrayList<TruongPhong> dstp;

    public DsTruongPhong(ArrayList<TruongPhong> dstp) {
        this.dstp = dstp;
    }
    public DsTruongPhong() {
        this.dstp = new ArrayList<TruongPhong>();
    }
    public void themTP(TruongPhong tp){
        this.dstp.add(tp);
    }
    public void showTP(){
        for(TruongPhong tp:dstp ){
            System.out.println(tp+"\n");
        }
    }
    public void xoaTruongPhong(int index){
         dstp.remove(index);
    }
    public double tongLuongTP(){
        double tongLuong=0;
        for(int i=0;i<dstp.size();i++ ){
            tongLuong+=(dstp.get(i).getLuong1Ngay()*dstp.get(i).getSoNgayLam())+(100*dstp.get(i).getSoLuongNV());
        }
        return tongLuong;
    }
    public void MaxNV(){
        int index=0;
        double maxMark=dstp.get(0).getSoLuongNV();
        for(int i=1;i<dstp.size();i++ ){
            if(dstp.get(i).getSoLuongNV()>maxMark){
                index=i;
            }
        }
        System.out.println(dstp.get(index));
    }

    public void LuongGiamDan(){
        System.out.println("Lương trưởng phòng giảm dần: ");
        Collections.sort(this.dstp, new Comparator<TruongPhong>() {
            @Override
            public int compare(TruongPhong tp1, TruongPhong tp2) {
                if(tp1.tinhLuongTP()<tp2.tinhLuongTP()){
                    return 1;
                } else if (tp1.tinhLuongTP()>tp2.tinhLuongTP()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }


    public void TenTheoThuTu(){
        System.out.println("Tên trưởng phòng theo thứ tự abc");
        Collections.sort(this.dstp, new Comparator<TruongPhong>() {
            @Override
            public int compare(TruongPhong tp1, TruongPhong tp2) {
                return tp1.getHoTen().compareTo(tp2.getHoTen());
            }
        });

    }
}
