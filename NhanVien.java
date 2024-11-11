import java.util.Scanner;

public class NhanVien extends Nguoi{
    private String ChucVu; // Chứ vụ nhân viên

    // Constructer
    public NhanVien(){}
    public NhanVien(String MaSo, String HoTen, String SDT, String DiaChi, String ChucVu) {
        super(MaSo, HoTen, SDT, DiaChi);
        this.ChucVu = ChucVu;
    }

    // Getter đơn lẻ
    public String getChucVu(){ return ChucVu; }

    // Getter 1 cụm
    public NhanVien getNhanVien(){
        NhanVien NV = new NhanVien(super.getMaSo(), super.getHoTen(), super.getSDT(), super.getDiaChi(), ChucVu);
        return NV;
    }

    // Setter đơn lẻ
    public void setChucVu(String newChucVu) { ChucVu = newChucVu; }

    // Setter 1 cụm
    public void setNhanVien(NhanVien newNV){
        super.setMaSo(newNV.getMaSo());
        super.setHoTen(newNV.getHoTen());
        super.setSDT(newNV.getSDT());
        super.setDiaChi(newNV.getDiaChi());
        ChucVu = newNV.getChucVu();
    }

    // Nhập thông tin nhân viên
    @Override
    public void InputNguoi(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin người:");
        System.out.print("- Nhập mã số: "); super.setMaSo(sc.nextLine());
        System.out.print("- Nhập họ tên: "); super.setHoTen(sc.nextLine());
        System.out.print("- Nhập số điện thoại: "); super.setHoTen(sc.nextLine());
        System.out.print("- Nhập địa chỉ: "); super.setDiaChi(sc.nextLine());
        System.out.print("- Nhập chức vụ nhân viên:"); ChucVu = sc.nextLine();
        System.out.println();
    }

    // Xuất thông tin nhân viên ra console
    @Override
    public void ThongTinNguoi(){
        System.out.println("Thông tin của nhân viên:");
        System.out.println("- Mã số: " + super.getMaSo());
        System.out.println("- Họ tên: " + super.getHoTen());
        System.out.println("- Số điện thoại: " + super.getSDT());
        System.out.println("- Địa chỉ: " + super.getDiaChi());
        System.out.println("- Chức vụ: " + ChucVu);
        System.out.println();
    }
}
