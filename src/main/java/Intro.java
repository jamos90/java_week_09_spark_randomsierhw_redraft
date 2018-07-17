import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import com.sun.org.apache.xpath.internal.operations.Mod;
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
            String randomName = person.randomName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("randomName", randomName);
            return new ModelAndView(model, "one.vtl");
        }, velocityTemplateEngine);



        get("/two", (req, res) ->{
            String randomNames = " ";
         for( String people : person.twoRandomNames()){
             randomNames += people + " ";
         }
         HashMap<String, Object> model = new HashMap<>();
         model.put("randomNames", randomNames);
         return new ModelAndView(model, "two.vtl");
        },velocityTemplateEngine);










    }
}
