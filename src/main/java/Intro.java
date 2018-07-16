import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;


import static spark.Spark.get;

public class Intro {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        Person person = new Person();
        person.addNames("James");
        person.addNames("Jess");
        person.addNames("Adam");
        person.addNames("Kate");
        person.addNames("Morag");
        person.addNames("David");
        person.addNames("George");


        get("/one",(req,res) ->{
            return person.randomName();
        });

        get("/two", (req, res) ->{
            String randomNames = " ";
         for( String people : person.twoRandomNames()){
             randomNames += people + " ";
         }
         return randomNames;
        });

        get("/helloWorld", (req, res) ->{
            return "Hello World!";
        });



        get("/name", (req, res) ->{
            ArrayList<String> names = new ArrayList<>();
            names.add("James");
            names.add("Stephen");
            names.add("Alan");
            names.add("Adam");
            Collections.shuffle(names);
            return names.get(0);

        });


        get("/two", (req, res) ->{
            ArrayList<String> names = new ArrayList<>();
            names.add("James");
            names.add("Stephen");
            names.add("Alan");
            names.add("Adam");
            Collections.shuffle(names);
            return names.get(0);


        });

    }
}
