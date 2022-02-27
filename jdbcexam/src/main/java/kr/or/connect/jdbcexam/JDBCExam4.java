package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;

public class JDBCExam4 {
    public static void main(String[] args) {
        int roleId = 500;
        Role role = new Role(800, "NEW");

        RoleDao dao = new RoleDao();
        int updateCount = dao.updateRole(roleId, role);

        System.out.println(updateCount);
    }
}
