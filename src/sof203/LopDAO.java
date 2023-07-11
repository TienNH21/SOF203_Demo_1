package sof203;

import java.util.ArrayList;

// B1:
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
