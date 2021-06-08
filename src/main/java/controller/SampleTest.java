package controller;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/test")
public class SampleTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Content-Type ヘッダの設定
        // html を返す。文字コードは、UTF-8。
        response.setContentType("text/html; charset=UTF-8");
        // なんか処理してるっぽいようにしたいので、文字列を用意する。
        String name = "Okita Ryoya<br>\n";
        String university = "Tokyo Gakugei University<br>\n";
        String classes = "Joho<br>\n";
        // 返す html を生成する。
        PrintWriter out = response.getWriter();
        out.println("<html>\n" + name + university + classes +   "</html>");

    }
}