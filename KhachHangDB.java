package database;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import construct.KhachHang;
public class KhachHangDB {
    public void writeToFile(ArrayList<KhachHang> customerList, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (KhachHang custom : customerList) {
                writer.write(custom.getMaSo() + "," + custom.getHoTen() + "," + custom.getSDT() + custom.getDiaChi() + custom.getEmail());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Không thể nhập vào file: " + e.getMessage());
        }
    }
    public ArrayList<KhachHang> readFromFile(String fileName) {
        ArrayList<KhachHang> customerList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                KhachHang custom = new KhachHang(data[0], data[1], data[2], data[3], data[4]);
                customerList.add(custom);
            }
        } catch (IOException e) {
            System.out.println("Không thể đọc từ file: " + e.getMessage());
        }
        return customerList;
    }
}
