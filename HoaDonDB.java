import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
                String MaDT = data[0];
                String MaKH = data[1];
                String MaNV = data[2];
                HoaDon bill = new HoaDon(MaDT, MaKH, MaNV);
                billList.add(bill);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return billList;
    }
}