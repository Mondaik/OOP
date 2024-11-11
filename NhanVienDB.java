package database;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import construct.NhanVien;
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
                NhanVien staff = new NhanVien(data[0], data[1], data[2], data[3], data[4]);
                staffList.add(staff);
            }
        } catch (IOException e) {
            System.out.println("Không thể đọc từ file: " + e.getMessage());
        }
        return staffList;
    }
}
