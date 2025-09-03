public class HinhChuNhat {
    
    private double chieuDai;
    private double chieuRong;

    
    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    
    public double getChieuDai() { return chieuDai; }
    public void setChieuDai(double chieuDai) { this.chieuDai = chieuDai; }
    public double getChieuRong() { return chieuRong; }
    public void setChieuRong(double chieuRong) { this.chieuRong = chieuRong; }

    
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    
    public void hienThiThongTin() {
        System.out.println("Hình chữ nhật:");
        System.out.println("- Chiều dài: " + chieuDai);
        System.out.println("- Chiều rộng: " + chieuRong);
        System.out.println("- Chu vi: " + tinhChuVi());
        System.out.println("- Diện tích: " + tinhDienTich());
        System.out.println("---------------------------");
    }

    
    public static void main(String[] args) {
        HinhChuNhat h1 = new HinhChuNhat(5, 3);
        HinhChuNhat h2 = new HinhChuNhat(10, 7);
        HinhChuNhat h3 = new HinhChuNhat(8.5, 4.2);

        h1.hienThiThongTin();
        h2.hienThiThongTin();
        h3.hienThiThongTin();
    }
}

