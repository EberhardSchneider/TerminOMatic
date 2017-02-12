package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.sql.*;
import java.util.ArrayList;

public class Controller {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://hannaherfurtner.de:3306/d02119e2";

    static final String USER = "d02119e2";
    static final String PASSWORD = "castorp7";

    @FXML TermineListe list;




    @FXML
    public void button_download() {

        Connection connection = null;
        Statement statement = null;

        ArrayList<Termin> showList = new ArrayList<>();


        try { // Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connectiong to database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            statement = connection.createStatement();
            String sql;
            sql = "SELECT ID, title, komponist, ort, datum, besetzung, active FROM events";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Termin  t = new Termin();
                t.setId( rs.getInt("id"));
                t.setTitle(  rs.getString("title") );
                t.setKomponist(rs.getString("komponist"));
                t.setOrt( rs.getString("ort") );
                t.setDatum( rs.getDate("datum").toString() );
                t.setBesetzung( rs.getString("besetzung") );

                showList.add( t );
            }

            list.setList( showList );
            list.updateView();
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            }
            catch (SQLException se2) {}
            try {
                if (connection != null) {
                    connection.close();
                }
            }
             catch (SQLException se2) {}
        }

    }
}
