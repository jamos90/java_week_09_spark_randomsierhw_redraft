import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;


import static spark.Spark.get;

public class Intro {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        ArrayList<Person> people = new ArrayList<>();
        Person person1 = new Person("James", 28,"Coder");
        Person person2 = new Person("Jess", 28,"Graphic desinger");
        Person person3 = new Person("Dan", 29,"Account manager");
        Person person4 = new Person("Sofia", 30,"Engineer");



        get("/helloWorld", (req, res) ->{
            return "Hello World!";
        });

        get("/one", (req,res) ->{
            HashMap<String, Object> model = new HashMap<>();
            model.put("people", people);
            model.put("template", "people.vtl");
            return new ModelAndView(model,"layout.vtl");
        }, velocityTemplateEngine);

        get("/one",(req,res) ->{
            Collections.shuffle(people);
            return people.get(0);
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

        get("/one",(req,res) ->{
            Collections.shuffle(people);
            return people.get(0).getName();
        });
    }
}
