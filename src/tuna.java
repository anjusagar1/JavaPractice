public class tuna {


    //instance variables
    //contructors - same name as class - helps to initialise instance variable without a method
    // as soon as oject is created, variable can be initialised using contructors


     //this is a constructor
    private String girlName;

    public tuna (String name) {
        girlName=name;
    }

    public void printGirlName(){
        System.out.println(girlName);
    }

    public void message() {

        System.out.println(" This message is coming from new class called Tuna");
    }

    //Methods with parameters

    public void simplemessage (String str) {

        System.out.println("Hello  " +str);

    }

    }
