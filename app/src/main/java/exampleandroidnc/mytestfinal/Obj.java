package exampleandroidnc.mytestfinal;

/**
 * Created by trong on 23-10-2015 by Congnt.
 */
public class Obj {
    private String ten;
    private String diachi;
    private String ngaysinh;
    private String gioitinh;
    private String sodienthoai;

    public Obj() {
    }

    public Obj(String ten, String diachi, String ngaysinh, String gioitinh, String sodienthoai) {
        this.ten = ten;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.sodienthoai = sodienthoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
}
