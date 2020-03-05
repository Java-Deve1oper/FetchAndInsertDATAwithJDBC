import java.sql.SQLException;
import java.util.Scanner;

class AppSet {

    static Boolean b = true;

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        // Boolean b = true;

        while (b) {

            Integer id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();

            String email = sc.nextLine();

            dataInsert in = new dataInsert();

            in.setId(id);
            in.setName(name);
            in.setEmail(email);

            in.SetData();

            System.out.println("Would you want to Insert More Data");

            b = false;

        }

        Link ln = new Link();
        ln.conn.close();

        System.out.println("Goodbye!");

    }
}