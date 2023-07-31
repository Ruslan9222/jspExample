package by.radevich.jspexample.web.servlet;

import java.io.*;

import by.radevich.jspexample.model.Person;
import by.radevich.jspexample.web.service.PersonService;
import by.radevich.jspexample.web.service.PersonServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "persons", value = "/persons")
public class PersonServlet extends HttpServlet {
    private PersonService personService;

    public void init() {
        personService = new PersonServiceImpl();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("people", personService.findAll());
        request.getRequestDispatcher("people.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        var newPerson = new Person(name,age);
        personService.save(newPerson);
        req.setAttribute("people", personService.findAll());
        req.getRequestDispatcher("people.jsp").forward(req,resp);
    }
}