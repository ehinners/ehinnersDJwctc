package edu.wctc;

import edu.wctc.Entity.Snack;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListServlet2", urlPatterns = "/list2")
public class ListServlet2 extends HttpServlet {
    private final String DRIVER_NAME = "jdbc:derby:";
    private final String DATABASE_PATH = "../../db";
    private final String USERNAME = "eric";
    private final String PASSWORD = "eric";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Declare outside the try/catch so the variables are in scope in the finally block
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

        try {
            // Load the driver
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            // Find the absolute path of the database folder
            String absPath = getServletContext().getRealPath("/") + DATABASE_PATH;

            StringBuilder sql = new StringBuilder("SELECT DESCRIPTION, FLAVOR_NAME, s.SNACK_NAME, TYPE_NAME, s.SNACK_ID, TIER, TIMES_ORDERED, SERVINGS ");
            sql.append("FROM SNACKS s ");
            sql.append("join SNACK_DETAIL sd on (s.SNACK_ID = sd.SNACK_ID) ");
            sql.append("JOIN TYPE t on (s.TYPE_ID = t.TYPE_ID) ");
            sql.append("JOIN FLAVOR_PROFILE fp on fp.SNACK_ID = s.SNACK_ID ");
            sql.append("JOIN FLAVOR f on f.FLAVOR_ID = fp.FLAVOR_ID ");
            sql.append("ORDER BY tier"); // Don't end SQL with semicolon!

            // Create a connection
            conn = DriverManager.getConnection(DRIVER_NAME + absPath, USERNAME, PASSWORD);
            // Create a statement to execute SQL
            stmt = conn.createStatement();
            // Execute a SELECT query and get a result set
            rset = stmt.executeQuery(sql.toString());

            ///////////////////////// ADDING SUPPORT FOR SNACK CLASS /////////////////////////

            // Create an array of Snacks
            List<Snack> snackList = new ArrayList<Snack>();

            // Loop while the result set has more rows
            while (rset.next()) {
                Snack snack = new Snack();
                snackList.add(snack);   // thanks stacy
                // Strings
                snack.setDescription(rset.getString("DESCRIPTION"));
                snack.setFlavorProfile(rset.getString("FLAVOR_NAME"));
                snack.setSnackName(rset.getString("SNACK_NAME"));
                snack.setSnackType(rset.getString("TYPE_NAME"));
                // int
                snack.setSnackID(rset.getInt("SNACK_ID"));
                snack.setTier(rset.getInt("TIER"));
                snack.setTimesOrdered(rset.getInt("TIMES_ORDERED"));
                snack.setServings(rset.getInt("SERVINGS"));

                // Debug
                System.out.println("/////////////////////////////////////////////////////");
                System.out.println("id: "+snack.getSnackID() + " " + snack.getSnackName());
                System.out.println(snack.getDescription());
                System.out.println("Flavor Profile: "+snack.getFlavorProfile());
                System.out.println(snack.getSnackType());
                System.out.println("Tier: "+snack.getTier());
                System.out.print("Times Ordered: "+snack.getTimesOrdered()+", Servings: ");
                System.out.println(snack.getServings());
            }


            // Forward the list as the response
            request.setAttribute("snacks",snackList);
            request.getRequestDispatcher("resources/view/list2.jsp").forward(request, response);

        } catch (SQLException | ClassNotFoundException e) {
            // If there's an exception locating the driver, send IT as the response
            response.getWriter().print(e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseUtils.closeAll(conn, stmt, rset);
        }
    }
}
