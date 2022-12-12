package Controllers;

import Models.CongTy;
import Models.GiamDoc;
import Models.NhanVienThuong;

import java.util.ArrayList;

public class DsCongty {
    private ArrayList<CongTy> dscty;

    public DsCongty(ArrayList<CongTy> dscty) {
        this.dscty = dscty;
    }
    public DsCongty() {
        this.dscty = new ArrayList<CongTy>();
    }
    public void ThemCty(CongTy cty){
        this.dscty.add(cty);
    }
    public void showCty(){
        for(CongTy cty:dscty ){
            System.out.println(cty+"\n");
        }
    }
    public double DoanhThuThang(){
        double dtt=0;
        for (int i=0;i<dscty.size();i++)
        {
           dtt= dscty.get(0).getDoanhThuThang();
        }
        return dtt;
    }
}
