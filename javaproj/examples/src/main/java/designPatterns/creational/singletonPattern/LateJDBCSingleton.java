package designPatterns.creational.singletonPattern;

import java.io.Serializable;
import java.sql.*;
import java.util.Properties;

public class LateJDBCSingleton implements Serializable {
    private static LateJDBCSingleton JDBCSingleton;
    private LateJDBCSingleton(){

    }

    public static LateJDBCSingleton getInstance(){
        if(JDBCSingleton == null){
           /**
            * //threadsafe:
            synchronized (LateJDBCSingleton.class){
                if(JDBCSingleton == null){
                    JDBCSingleton = new LateJDBCSingleton();
                }
            }*/
           JDBCSingleton = new LateJDBCSingleton();
        }
        return JDBCSingleton;
    }

    private static Connection getConnection() throws ClassNotFoundException{
        Connection con;
        Class.forName("org.postgresql.Driver");
        try {
            Properties props = new Properties();
            String url = "jdbc:postgres://localhost/training";
            String user = "username";
            String password = "password";
            Class.forName("org.postgresql.Driver");
            props.setProperty("user",user);
            props.setProperty("password",password);
            con = DriverManager.getConnection(url,props);
            return con;
        }catch (Exception exc){
            System.out.println("EXCEPTION :\n" + exc.getMessage());
        }

        return null;
    }

    public int insert(String name, String password, String email, Timestamp creationDate) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        int recordCounter = 0;

        try{
            conn = this.getConnection();
            ps = conn.prepareStatement("INSERT INTO user_account(username,password,email,created_on) values(?,?,?,?)");
            ps.setString(1,name);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setTimestamp(4, creationDate);

            recordCounter = ps.executeUpdate();
        }catch (Exception exc){
            System.out.println("EXCEPTION :\n" + exc);
        }finally {
            if(ps != null){
                ps.close();
            }
            if(conn != null){
                conn.close();
            }
            return recordCounter;
        }
    }

    public void view(String name) throws SQLException{
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            conn= this.getConnection();
            ps = conn.prepareCall("SELECT * FROM USER_ACCOUNT where username=?");
            ps.setString(1,name);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Name= "+rs.getString(2)+"\t"+"Password= "+rs.getString(3));
            }

        } catch (Exception e) {
            System.out.println("EXCEPTION :\n" + e);
        }finally{
            if(rs!=null){
                rs.close();
            }if (ps!=null){
                ps.close();
            }if(conn!=null){
                conn.close();
            }
        }
    }
    public int updateUserPassword(String name, String password) throws SQLException  {
        Connection c=null;
        PreparedStatement ps=null;

        int recordCounter=0;
        try {
            c=this.getConnection();
            ps=c.prepareStatement(" update user_account set password=? where username='"+name+"' ");
            ps.setString(1, password);
            recordCounter=ps.executeUpdate();
        } catch (Exception e) {  e.printStackTrace(); } finally{

            if (ps!=null){
                ps.close();
            }if(c!=null){
                c.close();
            }
        }
        return recordCounter;
    }

    public int deleteUser(int userId) throws SQLException{
        Connection c=null;
        PreparedStatement ps=null;
        int recordCounter=0;
        try {
            c=this.getConnection();
            ps=c.prepareStatement(" delete from user_account where user_id='"+userId+"' ");
            recordCounter=ps.executeUpdate();
        } catch (Exception e) { e.printStackTrace(); }
        finally{
            if (ps!=null){
                ps.close();
            }if(c!=null){
                c.close();
            }
        }
        return recordCounter;
    }

    protected Object readResolve(){
        return getInstance();
    }

    public void action(){
        System.out.println("LATE SINGLETON SET.");
    }
}
