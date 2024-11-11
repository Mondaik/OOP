public abstract class Nguoi{
    private String MaSo, HoTen, SDT, DiaChi; // Mã nhân viên / Mã khách hàng ; Họ tên ; Số điện thoại ; Địa chỉ

    // Constructer
    public Nguoi(){}
    public Nguoi(String MaSo, String HoTen, String SDT, String DiaChi) {
        this.MaSo = MaSo;
        this.HoTen = HoTen;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
    }

    // Getter đơn lẻ
    public String getMaSo(){ return MaSo; }
    public String getHoTen() { return HoTen; }
    public String getSDT() { return SDT; }
    public String getDiaChi() { return DiaChi; }

    // Setter đơn lẻ
    public void setMaSo(String newMaSo) { MaSo = newMaSo; }
    public void setHoTen(String newHoTen) { HoTen = newHoTen; }
    public void setSDT(String newSDT) { SDT = newSDT; }
    public void setDiaChi(String newDiaChi) { DiaChi = newDiaChi; }

    // Nhập thông tin người (nhân viên / khách hàng)
    public abstract void InputNguoi();

    // Xuất thông tin người ra console (sử dụng cho class NhanVien và class KhachHang)
    public abstract void ThongTinNguoi();
}

