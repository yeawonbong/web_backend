package kr.or.connect.jdbcexam.dao;

import kr.or.connect.jdbcexam.dto.Role;

import java.sql.*;

public class RoleDao {
    private static String dbUrl = "jdbc:mysql://localhost:3306/connectdb";
    private static String dbUser = "connectuser";
    private static String dbpasswd = "connect123!@#";

    public int  addRole(Role role) { //CREATE
        int insertCount = 0; //몇건 입력했는지 세는 변수

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.jdbc.Driver"); //mysql 연결
            conn = DriverManager.getConnection(dbUrl, dbUser, dbpasswd);

            String sql = "INSERT INTO role (role_id, description) VALUES (?, ?)"; //물음표 값을 채워주는 코드가 반드시 있어야 한다 (아래 set)

            ps = conn.prepareStatement(sql);

            ps.setInt(1, role.getRolId()); //첫번째 물음표
            ps.setString(2, role.getDescription()); //두번째 물음표

            insertCount = ps.executeUpdate(); //insert는 executeUpdate를 사용한
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return insertCount;
    }

    public Role getRole(Integer roleId) { // READ

        Role role = null;
        Connection conn = null; //연결하는 객체
        PreparedStatement ps = null; //명령할 객체
        ResultSet rs = null; //결과값 담을 객체

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbUrl, dbUser, dbpasswd);
            String sql = "SELECT description, role_id FROM role WHERE role_id + ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, roleId); // 첫번째 물음표에 넣는다는 의미
            rs = ps.executeQuery();

            if (rs.next()) {
                String description = rs.getString(1); //index 넣어도 되고
                int id = rs.getInt("role_id"); //column이름 넣어도 된다
                role = new Role(id, description);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return role;
    }
    public int updateRole(int roleId, Role role) { // DELETE

        int updateCount = 0; //몇건 삭제했는지 세는 변수

        Connection conn = null; //연결하는 객체
        PreparedStatement ps = null; //명령할 객체

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbUrl, dbUser, dbpasswd);
            String sql = "UPDATE role SET role_id = ?, description = ? WHERE role_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, role.getRolId());
            ps.setString(2, role.getDescription());
            ps.setInt(3, roleId);

            updateCount = ps.executeUpdate(); //update는 executeUpdate를 사용한다

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return updateCount;
    }

    public int deleteRole(Integer roleId) { // DELETE

        int deleteCount = 0; //몇건 삭제했는지 세는 변수

        Connection conn = null; //연결하는 객체
        PreparedStatement ps = null; //명령할 객체

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbUrl, dbUser, dbpasswd);
            String sql = "DELETE FROM role WHERE role_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, roleId); // 첫번째 물음표에 넣는다는 의미

            deleteCount = ps.executeUpdate(); //delete는 executeUpdate를 사용한

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return deleteCount;
    }
}
