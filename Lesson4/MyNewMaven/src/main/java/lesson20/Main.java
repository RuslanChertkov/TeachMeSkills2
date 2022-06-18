package lesson20;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        String createTable = "create table students (id int primary key auto_increment, name varchar(20), age int)";
        String insert = "insert into students(name, age) values('Misha', 45),('Ruslan', 64),('Alina', 53)";
        String update = "update students set age=33 where id=2";
        String delete = "delete from students where name='Anton'";
        MyConnection myConnection = new MyConnection();

        try (Connection connection = myConnection.getConnection();
             Statement statement = connection.createStatement()) {
            //statement.executeUpdate(createTable);
            statement.executeUpdate(insert);
            //statement.executeUpdate(update);
            //int rows = statement.executeUpdate(insert);
            //System.out.println(rows);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}

