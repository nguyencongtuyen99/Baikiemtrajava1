package bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        NhanVien n0= new KyThuat("abc", "NGUYEN VAN A","1992","BAC NINH","DIENTU");
        System.out.println(n0.toString());
        NhanVien n1=new KyThuat ("abz1","NGUYEN VAN b","1996","BAC NINH","Co khi");
        System.out.println(n1.toString());

        Scanner in=new Scanner(System.in);
        System.out.println("dien ma nhan vien");
        String maNV=in.nextLine();
        System.out.println("vui long nhap ho va ten ");
        String hoTen=in.nextLine();
        System.out.println("Vui long nhap nam sinh");
        String namSinh=in.nextLine();
        System.out.println("Vui long nhap dia chi ");
        String diaChi=in.nextLine();
        System.out.println(" Vui long nhap chuyen nganh");
        String chuyenNganh=in.nextLine();
        NhanVien n2= new KyThuat(maNV,hoTen,namSinh,diaChi,chuyenNganh);
        System.out.println(n2.toString());
    }
}
