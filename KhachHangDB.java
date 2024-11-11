import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class KhachHangDB {
    public static void writeToFile(ArrayList<KhachHang> customerList, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (KhachHang custom : customerList) {
                writer.write(custom.getMaSo() + "," + custom.getHoTen() + "," + custom.getSDT() + custom.getDiaChi() + custom.getEmail());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Không thể nhập vào file: " + e.getMessage());
        }
    }
    public static ArrayList<KhachHang> readFromFile(String fileName) {
        ArrayList<KhachHang> customerList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String MaSo = data[0];
                String HoTen = data[1];
                String SDT = data[2];
                String DiaChi = data[3];
                String Email = data[4];
                KhachHang custom = new KhachHang(MaSo, HoTen, SDT, DiaChi, Email);
                customerList.add(custom);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return customerList;
    }
}