package Views;

import Controllers.DsCongty;
import Controllers.DsGiamDoc;
import Controllers.DsNhanVien;
import Controllers.DsTruongPhong;
import Models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DsNhanVien dsnv = new DsNhanVien();
        DsTruongPhong dstp = new DsTruongPhong();
        DsGiamDoc dsgd= new DsGiamDoc();
        DsCongty dsCongty= new DsCongty();
        int luachon;

        do {

            System.out.println("" +
                    "1. Nhập thông tin công ty\n" +
                    "2. Phân bổ Nhân viên vào Trưởng phòng\n" +
                    "3. Thêm, xóa thông tin một nhân sự (có thể là Nhân viên, trưởng phòng hoặc giám đốc). Lưu ý khi xóa trưởng phòng, phải ngắt liên kết với các nhân viên\n" +
                    "đang tham chiếu tới.\n" +
                    "4. Xuất ra thông tin toàn bộ người trong công ty\n" +
                    "5. Tính và xuất tổng lương cho toàn công ty\n" +
                    "6. Tìm Nhân viên thường có lương cao nhất\n" +
                    "7. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất\n" +
                    "8. Sắp xếp nhân viên toàn công ty theo thứ tự abc\n" +
                    "9. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần\n" +
                    "10. Tìm Giám Đốc có số lượng cổ phần nhiều nhất\n" +
                    "11. Tính và Xuất tổng THU NHẬP của từng Giám Đốc\n" +
                    "Thu nhập = Lương tháng + số cổ phần * Lợi nhuận công ty\n" +
                    "@Lợi nhuận công ty = Doanh thu tháng của công ty - tổng lương toàn công ty trong tháng.\n"+
                    "0. Thoát chương trình."
                   );
            System.out.println("Nhập lựa chọn: ");
            luachon= sc.nextInt();
            if (luachon == 1) {
                System.out.println("Nhập thông tin công ty: ");
                sc.nextLine();
                System.out.println("Nhập tên công ty: ");
                String tenCty= sc.nextLine();
                System.out.println("Nhập mã số thuế: ");
                String maSoThue=sc.nextLine();
                System.out.println("Nhập doanh thu tháng: ");
                double doanhThuThang=sc.nextDouble();
                CongTy congTy= new CongTy(tenCty, maSoThue,doanhThuThang);
                dsCongty.ThemCty(congTy);
            } else if(luachon==2) {
                System.out.println("Nhập thông tin trưởng phòng");
                System.out.print("Nhập mã nhân viên: ");
                String maNv = sc.next();
                sc.nextLine();
                System.out.print("Nhập họ tên: ");
                String hoTen = sc.nextLine();
                System.out.print("Nhập số điện thoại: ");
                String soDt = sc.next();
                System.out.print("Nhập số ngày làm: ");
                int soNgLam = sc.nextInt();
                System.out.print("Nhập số lượng nhân viên quản lý: ");
                int soLuongNv = sc.nextInt();
                System.out.print("Nhập lương 1 ngày: ");
                int luong1Ngay = sc.nextInt();
                int count=0;
                TruongPhong tp = new TruongPhong(maNv, hoTen, soDt, soNgLam,soLuongNv,luong1Ngay);
                dstp.themTP(tp);
            } else if (luachon==3) {
                int luachon2;
                int luachon3;
                System.out.println(
                        "1.Thêm nhân viên" +"\n"+
                        "2.Xóa nhân viên"+"\n"+
                        "Nhập lựa chọn: ");
                luachon2=sc.nextInt();
                if(luachon2==1){
                    System.out.println(
                                    "1.Thêm nhân viên" +"\n"+
                                    "2.Thêm trưởng phòng"+"\n"+
                                    "3.Thêm giám đốc"+"\n"+
                                            "Nhập lựa chọn: ");
                    luachon3=sc.nextInt();
                    if(luachon3==1){
                        System.out.println("Nhập thông tin nhân viên");
                        System.out.print("Nhập mã nhân viên: ");
                        String maNv = sc.next();
                        sc.nextLine();
                        System.out.print("Nhập họ tên: ");
                        String hoTen = sc.nextLine();
                        System.out.print("Nhập số điện thoại: ");
                        String soDt = sc.nextLine();
                        System.out.print("Nhập trưởng phòng quản lý: ");
                        String truongPhong = sc.nextLine();
                        System.out.print("Nhập số ngày làm: ");
                        int soNgLam = sc.nextInt();
                        System.out.print("Nhập lương 1 ngày: ");
                        int luong1Ngay = sc.nextInt();
                        NhanVienThuong nv = new NhanVienThuong(maNv, hoTen, soDt, soNgLam,luong1Ngay,truongPhong);
                        dsnv.themNV(nv);
                    } else if (luachon3==2) {
                        System.out.println("Nhập thông tin trưởng phòng");
                        System.out.print("Nhập mã nhân viên: ");
                        String maNv = sc.next();
                        sc.nextLine();
                        System.out.print("Nhập họ tên: ");
                        String hoTen = sc.nextLine();
                        System.out.print("Nhập số điện thoại: ");
                        String soDt = sc.next();
                        System.out.print("Nhập số ngày làm: ");
                        int soNgLam = sc.nextInt();
                        System.out.print("Nhập số lượng nhân viên quản lý: ");
                        int soLuongNv = sc.nextInt();
                        System.out.print("Nhập lương 1 ngày: ");
                        int luong1Ngay = sc.nextInt();
                        int count=0;
                        TruongPhong tp = new TruongPhong(maNv, hoTen, soDt, soNgLam,soLuongNv,luong1Ngay);
                        dstp.themTP(tp);
                    } else if (luachon3==3) {
                        System.out.println("Nhập thông tin giám đốc");
                        System.out.print("Nhập mã nhân viên: ");
                        String maNv = sc.next();
                        sc.nextLine();
                        System.out.print("Nhập họ tên: ");
                        String hoTen = sc.nextLine();
                        System.out.print("Nhập số điện thoại: ");
                        String soDt = sc.next();
                        System.out.print("Nhập số ngày làm: ");
                        int soNgLam = sc.nextInt();
                        System.out.print("Nhập số cổ phần: ");
                        int soCoPhan = sc.nextInt();
                        System.out.print("Nhập lương 1 ngày: ");
                        int luong1Ngay = sc.nextInt();
                        int count=0;
                        GiamDoc gd = new GiamDoc(maNv, hoTen, soDt,soNgLam,luong1Ngay,soCoPhan);
                        dsgd.themGD(gd);
                    }
                } else if (luachon2==2) {
                    int luachon4;
                    System.out.println(
                            "1.Xóa nhân viên" +"\n"+
                                    "2.Xóa trưởng phòng"+"\n"+
                                    "3.Xóa giám đốc"+"\n"+
                                    "Nhập lựa chọn: ");
                    luachon4=sc.nextInt();
                    if(luachon4==1){
                        System.out.println("Nhập phần tử cần xóa nhân viên");
                        sc.nextLine();
                        int index=sc.nextInt();
                        dsnv.xoaNhanVien(index);
                        System.out.println("Danh sách NV sau khi xóa nhân viên thứ "+index);
                        dsnv.showNV();

                    } else if (luachon4==2) {
                        System.out.println("Nhập phần tử cần xóa nhân viên trưởng phòng");
                        sc.nextLine();
                        int index=sc.nextInt();
                        dstp.xoaTruongPhong(index);
                        System.out.println("Danh sách TP sau khi xóa trưởng phòng thứ "+index);
                        dstp.showTP();
                    }else if(luachon4==3) {
                        System.out.println("Nhập phần tử cần xóa nhân viên giám đốc");
                        sc.nextLine();
                        int index=sc.nextInt();
                        dsgd.xoaGD(index);
                        System.out.println("Danh sách GD sau khi xóa giám đốc thứ "+index);
                        dsgd.showGD();
                    }
                }
            } else if (luachon==4) {
                dstp.showTP();
                dsnv.showNV();
                dsgd.showGD();
            } else if (luachon==5) {
                double tongLuongCty;
               System.out.print("Tổng lương của toàn công ty là: ");
               tongLuongCty=dsnv.tongLuongNV()+dstp.tongLuongTP()+dsgd.tongLuongGD();
               System.out.println(tongLuongCty);
            } else if (luachon==6) {
                System.out.println("Nhân viên thường có lương cao nhất: ");
                dsnv.MaxDiem();
            } else if (luachon==7) {
                System.out.println("Trưởng phòng có nhiều nhân viên dưới quyền nhất: ");
                dstp.MaxNV();
            } else if (luachon==8) {
                dsgd.TenTheoThuTu();
                dsgd.showGD();
                dstp.TenTheoThuTu();
                dstp.showTP();
                dsnv.TenTheoThuTu();
                dsnv.showNV();
            } else if (luachon==9) {
                dsgd.LuongGiamDan();
                dsgd.showGD();
                dstp.LuongGiamDan();
                dstp.showTP();
                dsnv.LuongGiamDan();
                dsnv.showNV();
            } else if (luachon==10) {
                System.out.println("Giám đốc có nhiều cổ phần nhất: ");
                dsgd.MaxCP();
            } else if (luachon==11) {
                System.out.println("Thu nhập của từng giám đốc: ");
                double tongLuong=dsnv.tongLuongNV()+dstp.tongLuongTP()+dsgd.tongLuongGD();;
                dsgd.setTongLuongCty(tongLuong);
                double dtt= dsCongty.DoanhThuThang();
                dsgd.setDoanhThuThang(dtt);
                dsgd.ThuNhapGD();

            }
        }while (luachon!=0);
    }

}