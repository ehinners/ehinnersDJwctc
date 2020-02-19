package edu.wctc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "SearchServlet2", urlPatterns = "/search2")
public class SearchServlet2 extends HttpServlet {
    private final String DRIVER_NAME = "jdbc:derby:";
    private final String DATABASE_PATH = "../../db";
    private final String SCHEMA = "eric";
    private final String PASSWORD = "eric";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        try {
            String searchTerm = request.getParameter("tier");

            // Load the driver
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            // Find the absolute path of the database folder
            String absPath = getServletContext().getRealPath("/") + DATABASE_PATH;

            // Build the query as a String
            StringBuilder sql = new StringBuilder("select SNACK_NAME, tier, t.TYPE_NAME ");
            sql.append("from SNACKS ");
            sql.append("join SNACK_DETAIL on (SNACKS.SNACK_ID = SNACK_DETAIL.SNACK_ID) ");
            sql.append("JOIN TYPE t on (SNACKS.TYPE_ID = t.TYPE_ID) ");
            sql.append("where tier = ? "); // Don't end SQL with semicolon!

            // Create a connection
            conn = DriverManager.getConnection(DRIVER_NAME + absPath, SCHEMA, PASSWORD);
            // Create a statement to execute SQL
            pstmt = conn.prepareStatement(sql.toString());
            // Fill the prepared statement params
            pstmt.setString(1, searchTerm);
            // Execute a SELECT query and get a result set
            rset = pstmt.executeQuery();

            // Create a StringBuilder for ease of appending strings
            StringBuilder output = new StringBuilder();

            // HTML to create a simple web page
            output.append("<html><head><link href='../css/style.css' rel='stylesheet'></head>");
            output.append("<body>");

            // Start the table
            output.append("<table>");
            // Start a row
            output.append("<tr>");
            // Add the headers
            output.append("<th>Name</th><th>Tier</th><th>Type</th>");
            // End the row
            output.append("</tr>");

            // Loop while the result set has more rows
            while (rset.next()) {
                // Start a row
                output.append("<tr>");
                // Get the first string (the snack name) from each record
                String snackName = rset.getString(1);
                // Add a cell with the info
                output.append("<td>" + snackName + "</td>");

                // Get the rest of the pet data and append likewise
                int tier = rset.getInt(2);
                output.append("<td>" + tier + "</td>");
                String snackType = rset.getString(3);
                output.append("<td>" + snackType + "</td>");
                // End the row
                output.append("</tr>");
            }

            // Close all those opening tags
            output.append("</table></body></html>");

            // Send the HTML as the response
            response.setContentType("text/html");
            response.getWriter().print(output.toString());

        } catch (SQLException | ClassNotFoundException e) {
            // If there's an exception locating the driver, send IT as the response
            response.getWriter().print(e.getMessage());
            e.printStackTrace();
        } finally {
            if (rset != null) {
                try {
                    rset.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
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
    }
}
