import java.util.Scanner;

public class DienThoai{ 
    private String MaDT, TenDT, HangDT; //Mã điện thoại, Tên điện thoại, Hãng điện thoại
    private long GiaDT; //Giá điện thoại (VNĐ)
    private int SLTonKho; // Số luọng tồn kho
    
    // Constructer
    public DienThoai(){}
    public DienThoai(String MaDT, String TenDT, String HangDT, long GiaDT, int SLTonKho){
        this.MaDT = MaDT;
        this.TenDT = TenDT;
        this.HangDT = HangDT;
        this.GiaDT = GiaDT;
        this.SLTonKho = SLTonKho;
    }

    // Getter đơn lẻ
    public String getMaDT(){ return MaDT;}
    public String getTenDT(){ return TenDT;}
    public String getHangDT(){ return HangDT;}
    public long getGiaDT(){ return GiaDT;}
    public int getSLTonKho(){ return SLTonKho;}

    // Getter 1 cụm
    public DienThoai getDienThoai(){
        DienThoai DT = new DienThoai(MaDT, TenDT, HangDT, GiaDT, SLTonKho);
        return DT;
    }

    // Setter đơn lẻ
    public void setMaDT(String newMaDT){ MaDT = newMaDT; }
    public void setTenDT(String newTenDT){ TenDT = newTenDT; }
    public void setHangDT(String newHangDT){ HangDT = newHangDT; }
    public void setGiaDT(long newGiaDT){ GiaDT = newGiaDT; }
    public void setSLTonKho(int newSLTonKho){ SLTonKho = newSLTonKho; }


    // Setter 1 cụm
    public void setDienThoai(DienThoai newDT){
        MaDT = newDT.getMaDT();
        TenDT = newDT.getHangDT();
        HangDT = newDT.getHangDT();
        GiaDT = newDT.getGiaDT();
        SLTonKho = newDT.getSLTonKho();
    }


    // Nhập thông tin điện thoại
    public void InputDienThoai(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin điện thoại:");
        System.out.print("- Nhập mã điện thoại: "); MaDT = sc.nextLine();
        System.out.print("- Nhập tên điện thoại: "); TenDT = sc.nextLine();
        System.out.print("- Nhập hãng điện thoại: "); HangDT = sc.nextLine();
        System.out.print("- Nhập giá điện thoại: "); GiaDT = sc.nextLong();
        System.out.print("- Nhập SL điện thoại tồn kho: "); SLTonKho = sc.nextInt();
        System.out.println();
    }

    // Xuất thông tin điện thoại ra console
    public void ThongTinDienThoai(){
        System.out.println("Thông tin của điện thoại:");
        System.out.println("- Mã điện thoại: " + MaDT);
        System.out.println("- Tên điện thoại: " + TenDT);
        System.out.println("- Hãng điện thoại: " + HangDT);
        System.out.println("- Giá điện thoại: " + GiaDT);
        System.out.println("- SL điện thoại tồn kho: " + SLTonKho);
        System.out.println();    
    }
}