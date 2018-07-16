import java.util.ArrayList;
import java.util.Collections;

public class Person {
    private ArrayList<String> names;
    ;

    public Person(){
        this.names = new ArrayList<String >();
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public void addNames(String name){
        this.names.add(name);
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

    public int nameCount() {
       return this.names.size();
    }
}
