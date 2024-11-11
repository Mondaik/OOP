package database;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import construct.HoaDon;
public class HoaDonDB {
    public static void writeToFile(ArrayList<HoaDon> billList, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (HoaDon bill : billList) {
                writer.write(bill.getMaDT() + "," + bill.getMaKH() + "," + bill.getMaNV());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Không thể nhập vào file: " + e.getMessage());
        }
    }
    public static ArrayList<HoaDon> readFromFile(String fileName) {
        ArrayList<HoaDon> billList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                HoaDon bill = new HoaDon(data[0], data[1], data[2]);
                billList.add(bill);
            }
        } catch (IOException e) {
            System.out.println("Không thể đọc từ file: " + e.getMessage());
        }
        return billList;
    }
}
