package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by adamf on 22/10/14.
 */
@Entity
public class Task extends Model{
    @Id
    public int taskId;

    @Constraints.Required
    public String taskName;

    public static Finder<Integer,Task> find = new Finder<Integer,Task>(
            Integer.class, Task.class
    );

    public static void utils() {
        List<Task> tasks = Task.find.all();
    }

    public int getTaskId() {
        return taskId;
    }
}
