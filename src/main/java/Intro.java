import java.util.ArrayList;
import java.util.Collections;

import static spark.Spark.get;

public class Intro {

    public static void main(String[] args) {


        ArrayList<Person> people = new ArrayList<>();
        Person person1 = new Person("James", 28,"Coder");
        Person person2 = new Person("Jess", 28,"Graphic desinger");
        Person person3 = new Person("Dan", 29,"Account manager");
        Person person4 = new Person("Sofia", 30,"Engineer");


//        get("/one",(req,res) ->{
//            Collections.shuffle(people);
//            return people.get(0);
//        });
//
//
//        get("/hello", (req, res) -> {
//            return "Hello Wolrd!";
//        });



        get("/one", (req, res) ->{
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

//        get("/one",(req,res) ->{
//            Collections.shuffle(people);
//            return people.get(0).getName();
//        });
    }
}
