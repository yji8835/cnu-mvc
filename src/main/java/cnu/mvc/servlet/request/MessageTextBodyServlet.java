package cnu.mvc.servlet.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet("/message-text-body")
public class MessageTextBodyServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletInputStream inputStream = request.getInputStream();  //
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);     // 입력 스트림을 문자열로 변환
        System.out.println("messageBody = " + messageBody);
        response.getWriter().write("ok");
    }
}
