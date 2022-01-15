package org.example;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) {

        //连接数据库
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/how2java", "root", "123456");
            Statement statement = connection.createStatement();
            String sql = "select * FROM product";

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
            }
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
