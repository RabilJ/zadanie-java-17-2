import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/book")
public class WordCounterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String text = request.getParameter("text");
        int charNumber = WordCounter.countChars(text);
        request.setAttribute("charN", charNumber);
        int charNoBlanksNumber = WordCounter.countCharsWIthoutBlanks(text);
        request.setAttribute("charNoBlanksNumber", charNoBlanksNumber);
        int wordNumber = WordCounter.countWords(text);
        request.setAttribute("wordNumber", wordNumber);
        boolean isPalindrom = WordCounter.isPalindrom(text);
        request.setAttribute("isPalindrom", isPalindrom);
        request.getRequestDispatcher("outcome.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
