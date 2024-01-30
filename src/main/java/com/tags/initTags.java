package com.tags;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "InitTags", value = "/tags")
public class initTags extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();

        // Создание новой сессии
        HttpSession currentSession = req.getSession(true);

        // Создание игрового поля
        FieldTags field = new FieldTags ();

        // Получение списка значений поля
        List<Byte> data = field.getField();

        // Добавление в сессию параметров поля (нужно будет для хранения состояния между запросами)
        currentSession.setAttribute("field", field);
        // и значений поля, отсортированных по индексу (нужно для отрисовки крестиков и ноликов)
        currentSession.setAttribute("data", data);

        // Перенаправление запроса на страницу index.jsp через сервер
        getServletContext().getRequestDispatcher("/tags.jsp").forward(req, resp);
    }
}
