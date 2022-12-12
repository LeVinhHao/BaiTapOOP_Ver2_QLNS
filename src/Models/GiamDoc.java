package Models;

public class GiamDoc extends NhanVien{
    private int coPhan;

    public int getCoPhan() {
        return coPhan;
    }

    public void setCoPhan(int coPhan) {
        this.coPhan = coPhan;
    }

    public GiamDoc() {
    }

    public GiamDoc(String maSo, String hoTen, String soDt, int soNgayLam, double luong1Ngay, int coPhan) {
        super(maSo, hoTen, soDt, soNgayLam, luong1Ngay);
        this.coPhan = coPhan;
    }
    public double tinhLuongGD(){
        double tong=0;
        tong=getLuong1Ngay()*getSoNgayLam();
        return tong;
    }
    @Override
    public String toString() {
        return
                        "Mã giám đốc: "+getMaSo()+"\n"+
                        "Họ tên: "+ getHoTen()+"\n"+
                        "Số cổ phần: "+getCoPhan()+"\n"+
                        "lương 1 ngày: "+ getLuong1Ngay()+"\n"+
                        "Số ngày làm: "+getSoNgayLam()+"\n"+
                        "Lương: "+tinhLuongGD()+"\n"+
                        "SDT: "+getSoDt()+"\n";
    }
}
