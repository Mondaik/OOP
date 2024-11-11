import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class DienThoaiDB {
    public static void writeToFile(ArrayList<DienThoai> phoneList, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (DienThoai phone : phoneList) {
                writer.write(phone.getMaDT() + "," + phone.getTenDT() + "," + phone.getHangDT() + "," + phone.getGiaDT() + "," + phone.getSLTonKho());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Không thể nhập vào file: " + e.getMessage());
        }
    }
    public static ArrayList<DienThoai> readFromFile(String fileName) {
        ArrayList<DienThoai> phoneList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String MaDT = data[0];
                String TenDT = data[1];
                String HangDT = data[2];
                Long GiaDT = Long.parseLong(data[3]);
                int SLTonKho = Integer.parseInt(data[4]);
                DienThoai phone = new DienThoai(MaDT, TenDT, HangDT, GiaDT,SLTonKho);
                phoneList.add(phone);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return phoneList;
    }
    /*  Test dùng writetofile() và readfromfile()
    public class Main {
        public static void main(String[] args) {
            ArrayList<DienThoai> phoneList = new ArrayList<>();
            phoneList.add(new DienThoai("001", "iPhone 13", "Apple", 10000, 10));
            
            DienThoaiDB.writeToFile(phoneList, "phone.txt");
    
            ArrayList<DienThoai> loadedPhones = DienThoaiDB.readFromFile("phone.txt");
            for (DienThoai phone : loadedPhones) {
                System.out.println(phone.getMaDT() + " | " + phone.getTenDT() + " | " + phone.getHangDT() + " | " + phone.getGiaDT() + " | " + phone.getSLTonKho());
            }
        }
    }
    */
    
}

