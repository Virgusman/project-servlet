package com.tags;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "LogicServletTag", value = "/logicTag")
public class LogicServletTag extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Получаем текущую сессию
        HttpSession currentSession = req.getSession();

        // Получаем объект игрового поля из сессии
        FieldTags field = extractField(currentSession);

        // получаем индекс ячейки, по которой произошел клик
        int index = getSelectedIndex(req);

        // Проверяем, что ячейка, по которой был клик рядом с 0.
        // Иначе ничего не делаем и отправляем пользователя на ту же страницу без изменений
        // параметров в сессии
        int indexZero = getIndexZero(index, field);
        if (indexZero == -1) {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/tags.jsp");
            dispatcher.forward(req, resp);
            return;
        }

        // меняем пятнашки местами
        field.getField().set(indexZero, field.getField().get(index));
        field.getField().set(index, (byte) 0);

        // Проверяем на победу
        //if (checkWin(resp, currentSession, field)) {
        //    return;
        //}

        // Обновляем объект поля и список значков в сессии
        List<Byte> data = field.getField();
        currentSession.setAttribute("data", data);
        currentSession.setAttribute("field", field);

        resp.sendRedirect("/tags.jsp");
    }

    private int getIndexZero(int index, FieldTags field) {
        if ((index != 4) && (index != 9) && (index != 14) && (index != 19) && (index != 24)) {
            if (field.getField().get(index + 1) == 0) return index + 1;
        }
        if ((index != 20) && (index != 15) && (index != 10) && (index != 5) && (index != 0)) {
            if (field.getField().get(index - 1) == 0) return index - 1;
        }
        if (index > 4) {
            if (field.getField().get(index - 5) == 0) return index - 5;
        }
        if (index < 20) {
            if (field.getField().get(index + 5) == 0) return index + 5;
        }
        return -1;
    }

    private FieldTags extractField(HttpSession currentSession) {
        Object fieldAttribute = currentSession.getAttribute("field");
        if (FieldTags.class != fieldAttribute.getClass()) {
            currentSession.invalidate();
            throw new RuntimeException("Session is broken, try one more time");
        }
        return (FieldTags) fieldAttribute;
    }

    private int getSelectedIndex(HttpServletRequest request) {
        String click = request.getParameter("click");
        boolean isNumeric = click.chars().allMatch(Character::isDigit);
        return isNumeric ? Integer.parseInt(click) : 0;
    }
}
