package bai2;

public abstract class NhanVien {
    protected String maNv;
    protected String hoTen;
    protected String namSinh;
    protected  String diaChi;

    public NhanVien() {
    }

    public NhanVien(String maNv, String hoTen, String namSinh, String diaChi) {
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    abstract String moTaCongViec();

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNv='" + maNv + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", moTaCongViec='" + moTaCongViec() + '\'' +
                '}';
    }


}
