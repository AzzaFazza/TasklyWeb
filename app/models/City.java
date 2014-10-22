package models;

import play.db.ebean.Model;

import javax.persistence.Entity;

/**
 * Created by adamf on 22/10/14.
 */

public class City extends Model {
    private static String name;
    private static int id;

    public City(String name, int id) {
           this.name = name;
           this.id = id;
    }


    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getID(){return  id;}
    public void setId(int id){this.id = id;}
}
