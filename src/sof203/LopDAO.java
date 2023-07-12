package sof203;

import java.util.ArrayList;

import java.sql.Connection;

public class LopDAO {
    private Connection conn;
    private ArrayList<Lop> dsLop = new ArrayList<>();
    
    public LopDAO()
    {
        this.conn = JdbcUtil.getConnection();
    }


    public ArrayList<Lop> findAll()
    {
        return this.dsLop;
    }
}
