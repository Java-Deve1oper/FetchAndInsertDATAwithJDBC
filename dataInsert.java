import java.sql.PreparedStatement;
import java.sql.SQLException;

class dataInsert {

    private int id;
    private String name;
    private String email;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void SetData() throws SQLException {

        Link ln = new Link();

        // System.out.println("Inserting records into the table...");
        ln.stmt = ln.conn.createStatement();

        String sql = "INSERT INTO Registration " + "VALUES (?, ?, ?)";

        PreparedStatement stmt = ln.conn.prepareStatement(sql);

        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.setString(3, email);

        stmt.executeUpdate();
        System.out.println("Inserted records into the table...");
    }

}