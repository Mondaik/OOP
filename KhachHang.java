import java.util.Scanner;

public class KhachHang extends Nguoi{
    private String Email; // Email khách hàng

    // Constructer
    public KhachHang(){}
    public KhachHang(String MaSo, String HoTen, String SDT, String DiaChi, String Email) {
        super(MaSo, HoTen, SDT, DiaChi);
        this.Email = Email;
    }

    // Getter đơn lẻ
    public String getEmail(){ return Email; }

    // Getter 1 cụm
    public KhachHang getKhachHang(){
        KhachHang KH = new KhachHang(super.getMaSo(), super.getHoTen(), super.getSDT(), super.getDiaChi(), Email);
        return KH;
    }

    // Setter đơn lẻ
    public void setEmail(String newEmail) { Email = newEmail; }
    
    // Setter 1 cụm
    public void setKhachHang(KhachHang newKH){
        super.setMaSo(newKH.getMaSo());
        super.setHoTen(newKH.getHoTen());
        super.setSDT(newKH.getSDT());
        super.setDiaChi(newKH.getDiaChi());
        Email = newKH.getEmail();
    }

    // Nhập thông tin khách hàng
    @Override
    public void InputNguoi(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin người:");
        System.out.print("- Nhập mã số: "); super.setMaSo(sc.nextLine());
        System.out.print("- Nhập họ tên: "); super.setHoTen(sc.nextLine());
        System.out.print("- Nhập số điện thoại: "); super.setHoTen(sc.nextLine());
        System.out.print("- Nhập địa chỉ: "); super.setDiaChi(sc.nextLine());
        System.out.print("- Nhập Email khách hàng: "); Email = sc.nextLine();
        System.out.println();
    }

    // Xuất thông tin khách hàng ra console
    @Override
    public void ThongTinNguoi(){
        System.out.println("Thông tin của khách hàng:");
        System.out.println("- Mã số: " + super.getMaSo());
        System.out.println("- Họ tên: " + super.getHoTen());
        System.out.println("- Số điện thoại: " + super.getSDT());
        System.out.println("- Địa chỉ: " + super.getDiaChi());
        System.out.println("- Email: " + Email);
        System.out.println();
    }
}