import static spark.Spark.get;

public class Intro {
    public static void main(String[] args) {
        get("/hello", (req, res) ->{
            return "Hello Wolrd!"; });
    }
}
