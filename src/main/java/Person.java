import java.util.ArrayList;
import java.util.Collections;

public class Person {
    private ArrayList<String> names;
    ;

    public Person(ArrayList<String> names){
        this.names = new ArrayList<String >();
        names.add("James");
        names.add("Jess");
        names.add("Alan");
        names.add("Stephen");
        names.add("Joe");
        names.add("Kate");
        names.add("Alice");
        names.add("April");
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public String getAllNames(){
        String allNames = null;
        for (String name : names){
            return allNames += name + " ";
        }
        return allNames;
    }

    public String randomName(){
        Collections.shuffle(names);
        return names.get(0);
    }

    public ArrayList<String> twoRandomNames() {
        ArrayList<String> newNames = new ArrayList<>();
            Collections.shuffle(names);
               newNames.add(names.get(0));
               newNames.add(names.get(1));
        return newNames;
    }

}
