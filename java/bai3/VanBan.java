package bai3;

public class VanBan {
    private String constructor ;

    public VanBan() {
    }

    public VanBan(String constructor) {
        this.constructor = constructor;
    }

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }
    public String vietHoa(){
        String vh=constructor.toUpperCase();
        return vh;
    }
    public String vietThuong(){
        String vt=constructor.toLowerCase();
        return vt;
    }
    public long demSoTu(){
        StringBuffer buffer = new StringBuffer(constructor);
        long size = 0;
        for(int i = 0; i < buffer.length() - 1; i++){
            if(buffer.charAt(i) == ' ' && buffer.charAt(i+1) != ' '){
                size ++;
            }
        }
        return size;
    }

    public String vietHoaMoiTuDauTien(){
        constructor = vietThuong();
        StringBuffer buffer = new StringBuffer(constructor);
        buffer.setCharAt(0, Character.toUpperCase(buffer.charAt(0)));
        for (int i = 1; i < buffer.length() - 1; i++){
            if(buffer.charAt(i) == ' ' && buffer.charAt(i+1) != ' '){
                buffer.setCharAt(i+1, Character.toUpperCase(buffer.charAt(i+1)));
            }
        }
        return buffer.toString();
    }

    @Override
    public String toString() {
        return constructor;
    }



}
