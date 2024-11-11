import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class NhanVienDB {
    public static void writeToFile(ArrayList<NhanVien> staffList, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (NhanVien staff : staffList) {
                writer.write(staff.getMaSo() + "," + staff.getHoTen() + "," + staff.getSDT() + staff.getDiaChi() + staff.getChucVu());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Không thể nhập vào file: " + e.getMessage());
        }
    }
    public static ArrayList<NhanVien> readFromFile(String fileName) {
        ArrayList<NhanVien> staffList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String MaSo = data[0];
                String HoTen = data[1];
                String SDT = data[2];
                String DiaChi = data[3];
                String ChucVu = data[4];
                NhanVien staff = new NhanVien(MaSo, HoTen, SDT, DiaChi, ChucVu);
                staffList.add(staff);
            }
        } catch (IOException e) {
            System.out.println("Không thể đọc từ file: " + e.getMessage());
        }
        return staffList;
    }
}