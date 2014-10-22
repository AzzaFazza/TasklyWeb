package controllers;

import com.avaje.ebean.Ebean;
import models.City;
import models.Person;
import models.Task;
import play.data.Form;
import play.db.DB;
import play.mvc.*;


import views.html.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application extends Controller {
    public static ArrayList<String> myList;
    public static List<Task> tasks;

    public static Result index() {
        List<Task> tasks = Task.find.all();

        Task newTask = new Task();



//        Connection conn = DB.getConnection();
//
//        try {
//            Statement statement = conn.createStatement();
//            ResultSet rs = statement.executeQuery("SELECT ID, Name FROM City LIMIT 5");
//            myList = new ArrayList();
//
//            while(rs.next()) {
//                    City tempCity = new City(rs.getString("Name"), 1);
//                    myList.add(rs.getString("Name"));
//            }
//
//        } catch(SQLException e) {
//            return internalServerError();
//        }

        return ok(index.render(tasks));
    }

    public static Result submitName () {
    	Person user = Form.form(Person.class).bindFromRequest().get();
        String name = user.getFirstName();

        tasks = Task.find.all();

        Task newTask = new Task();

        if(name.equals("Adam")) {
            return ok(index.render(tasks));
        } else {
            return ok(failure.render());
        }
    }

    public static Result deleteEntry(int id) {
        Task.find.byId(id).delete();
        return index();
    }

    public static void createEntry() {

    }

    public static Result amendEntry(int id){
           Task tempTask = Task.find.byId(id);
           tempTask.save();
           return index();
    }

}
