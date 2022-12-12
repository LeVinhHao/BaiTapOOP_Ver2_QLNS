package Models;

public class CongTy {
    private String tenCty;
    private  String maSoThue;
    private double doanhThuThang;

    public String getTenCty() {
        return tenCty;
    }

    public void setTenCty(String tenCty) {
        this.tenCty = tenCty;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public double getDoanhThuThang() {
        return doanhThuThang;
    }

    public void setDoanhThuThang(double doanhThuThang) {
        this.doanhThuThang = doanhThuThang;
    }

    public CongTy(String tenCty, String maSoThue, double doanhThuThang) {
        this.tenCty = tenCty;
        this.maSoThue=maSoThue;
        this.doanhThuThang= doanhThuThang;
    }

    public CongTy() {
    }
    @Override
    public String toString() {
        return
                        "Tên Công Ty: "+getTenCty()+"\n"+
                        "Mã số thuế: "+getMaSoThue()+"\n"+
                        "Doanh thu tháng: "+getDoanhThuThang()+"\n";
    }
}
