/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.ArrayList;

/**
 *
 * @author tiennh
 */
public class SinhVienDAO {
    private ArrayList<SinhVien> danhSachSV;

    public SinhVienDAO()
    {
        this.danhSachSV = new ArrayList<>();
    }
    
    public ArrayList<SinhVien> findAll()
    {
        return this.danhSachSV;
    }
    
    public void insert(SinhVien sv)
    {
        this.danhSachSV.add(sv);
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
