import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private int tuoi;

    private static int soLuongSV = 0;

    public SinhVien() {
        soLuongSV++;
    }


    public SinhVien(String maSV, String hoTen, int tuoi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        soLuongSV++;
    }

    
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        maSV = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
    }

    public void hienThiThongTin() {
        System.out.println("Mã SV: " + maSV + " | Họ tên: " + hoTen + " | Tuổi: " + tuoi);
    }

    
    public static void hienThiTongSoSV() {
        System.out.println("Tổng số sinh viên đã tạo: " + soLuongSV);
    }


    public static void main(String[] args) {
        
        SinhVien sv1 = new SinhVien();
        sv1.nhapThongTin();

       
        SinhVien sv2 = new SinhVien("SV002", "Nguyen Van B", 20);
        SinhVien sv3 = new SinhVien("SV003", "Tran Thi C", 21);

       
        System.out.println("\n--- Danh sách sinh viên ---");
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        sv3.hienThiThongTin();

       
        SinhVien.hienThiTongSoSV();
    }
}

