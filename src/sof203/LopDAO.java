package sof203;

import java.util.ArrayList;

// B1:
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LopDAO {
    private ArrayList<Lop> dsLop = new ArrayList<>();

    public ArrayList<Lop> findAll()
    {
        Connection conn = JdbcUtil.getConnection();
        // B2: Viết truy vấn.
        String query = "SELECT * FROM lop WHERE ma LIKE ? AND nien_khoa = ?";
        
        // B3:
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "IT%");
            ps.setInt(2, 2022);
            ps.execute();
            
            // B4:
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ma = rs.getString("ma");
                int nienKhoa = rs.getInt("nien_khoa");
                
                Lop lop = new Lop(id, ma, nienKhoa);
                this.dsLop.add(lop);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return this.dsLop;
    }
    
//    public void insert(SinhVien sv)
//    {
//        this.danhSachSV.add(sv);
//    }
//    
//    public void update(SinhVien sv)
//    {
//        for (int i = 0; i < this.danhSachSV.size(); i++) {
//            SinhVien std = this.danhSachSV.get(i);
//            if(std.getId() == sv.getId()) {
//                this.danhSachSV.set(i, sv);
//            }
//        }
//    }
//    
//    public void delete(SinhVien sv)
//    {
//        for (int i = 0; i < this.danhSachSV.size(); i++) {
//            SinhVien std = this.danhSachSV.get(i);
//            if(std.getId() == sv.getId()) {
//                this.danhSachSV.remove(i);
//            }
//        }
//    }
//
//    public void setDanhSachSV(ArrayList<SinhVien> danhSachSV) {
//        this.danhSachSV = danhSachSV;
//    }
//    
//    public SinhVien findById(int id)
//    {
//        for (int i = 0; i < this.danhSachSV.size(); i++) {
//            SinhVien std = this.danhSachSV.get(i);
//            if(std.getId() == id) {
//                return std;
//            }
//        }
//        
//        return null;
//    }
}
