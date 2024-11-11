import java.util.Scanner;

public class HoaDon{
    private String MaDT, MaKH, MaNV; // Mã điện thoại ; Mã khách hàng ; Mã nhân viên

    // Constructer
    public HoaDon(){}
    public HoaDon(String MaDT, String MaKH, String MaNV){
        this.MaDT = MaDT;
        this.MaKH = MaKH;
        this.MaNV = MaNV;
    }

    //Setter đơn lẻ
    public String getMaDT(){ return MaDT; }
    public String getMaKH(){ return MaKH; }
    public String getMaNV(){ return MaNV; }

    // Getter 1 cụm
    public HoaDon getHoaDon(){
        HoaDon HD = new HoaDon(MaDT, MaKH, MaNV);
        return HD;
    }

    // Setter đơn lẻ
    public void setMaDT(String newMaDT){ MaDT = newMaDT; }
    public void setMaKH(String newMaKH){ MaKH = newMaKH; }
    public void setMaNV(String newMaNV){ MaNV = newMaNV; }

    // Setter 1 cụm
    public void setHoaDon(HoaDon newHD){
        MaDT = newHD.getMaDT();
        MaKH = newHD.getMaKH();
        MaNV = newHD.getMaNV();
    }

    // Nhập thông tin hóa đơn
    public void InputHoaDon(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập thông tin hóa đơn:");
        System.out.print("- Nhập mã điện thoại: "); MaDT = sc.nextLine();
        System.out.print("- Nhập mã khách hàng: "); MaKH = sc.nextLine();
        System.out.print("- Nhập mã nhân viên: "); MaNV = sc.nextLine();
        System.out.println();
    }

    // Xuất thông tin hóa đơn ra console
    public void ThongTinHoaDon(){
        System.out.println("Thông tin hóa đơn mua bán:");
        System.out.println("- Mã điện thoại: " + MaDT);
        System.out.println("- Mã nhân khách hàng mua: " + MaKH);
        System.out.println("- Mã điện nhân viên bán: " + MaNV);
        System.out.println();
    }
}