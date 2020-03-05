import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class show {

    public static void main(String[] args) throws SQLException {

        Link ln = new Link();

        Connection con = ln.conn;

        // Get a result set containing all data from test_table

        Statement statement = con.createStatement();

        ResultSet results = statement.executeQuery("SELECT * FROM Registration");

        while (results.next()) {

            // Get the data from the current row using the column index - column data are in
            // the VARCHAR format

            String data = results.getString(1);

            System.out.print(" ID : = > " + results.getRow() + " : " + data);

            // Get the data from the current row using the column name - column data are in
            // the VARCHAR format

            data = results.getString(2);

            System.out.print(" Name :=> " + results.getRow() + " : " + data);

            data = results.getString(3);

            System.out.print("  Email : =>" + results.getRow() + " : " + data);

            System.out.println();
        }

        con.close();

        System.out.println("Goodbye!");

    }
}
