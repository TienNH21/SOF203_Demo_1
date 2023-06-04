/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author tiennh
 */
public class SinhVienDAO {
    private ArrayList<SinhVien> danhSachSV;
    private Connection conn;

    public SinhVienDAO()
    {
        this.danhSachSV = new ArrayList<>();
        this.conn = JdbcUtil.getConnection();
        System.out.println("Kết nối thành công");
    }
    
    public ArrayList<SinhVien> findAll()
    {
        ArrayList<SinhVien> dssv = new ArrayList<>();
        String sql = "SELECT * FROM SinhVien";
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("Id");
                String ma = rs.getString("MaSinhVien");
                String hoTen = rs.getString("HoTen");
                String email = rs.getString("Email");
                String diaChi = rs.getString("DiaChi");
                String gt = rs.getString("GioiTinh");
                SinhVien sv = new SinhVien(id, ma, hoTen, email, diaChi, hoTen);
                dssv.add(sv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dssv;
    }
    
    public void insert(SinhVien sv)
    {
        String sql = "INSERT INTO SinhVien(MaSinhVien, HoTen, Email, DiaChi, GioiTinh) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, sv.getMaSv());
            ps.setString(2, sv.getHoTen());
            ps.setString(3, sv.getEmail());
            ps.setString(4, sv.getDiaChi());
            ps.setString(5, sv.getGioiTinh());
            
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void update(SinhVien sv)
    {
        for (int i = 0; i < this.danhSachSV.size(); i++) {
            SinhVien std = this.danhSachSV.get(i);
            if(std.getId() == sv.getId()) {
                this.danhSachSV.set(i, sv);
            }
        }
    }
    
    public void delete(SinhVien sv)
    {
        for (int i = 0; i < this.danhSachSV.size(); i++) {
            SinhVien std = this.danhSachSV.get(i);
            if(std.getId() == sv.getId()) {
                this.danhSachSV.remove(i);
            }
        }
    }

    public void setDanhSachSV(ArrayList<SinhVien> danhSachSV) {
        this.danhSachSV = danhSachSV;
    }
    
    public SinhVien findById(int id)
    {
        for (int i = 0; i < this.danhSachSV.size(); i++) {
            SinhVien std = this.danhSachSV.get(i);
            if(std.getId() == id) {
                return std;
            }
        }
        
        return null;
    }
}
