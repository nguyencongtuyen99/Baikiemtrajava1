package bai2;

public class KyThuat extends NhanVien {
    private String chuyenNganh;
    @Override
    String moTaCongViec() {
        return null;
    }
    public KyThuat(){

    }
    public KyThuat(String chuyenNganh){
        this.chuyenNganh=chuyenNganh;
    }
    public KyThuat(String maNv, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNv, hoTen, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return super.toString() +
                "chuyenNganh='" + chuyenNganh + '}';
    }
}
