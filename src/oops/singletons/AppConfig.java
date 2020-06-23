package oops.singletons;

public class AppConfig {
    private AppConfig(){}
    //when default constructor is made private, then object of class cannot be created


    //since object cannot be created outside,
    //due to private default constructor,
    //we now make a single PUBLIC function that returns AppConfig's Instance
    //This instance is made static because it has to be used in static scope of function.

    //function is made static because object cannot be made outside
    //so static function will be accessed using class name
    private static AppConfig obj = null;

    public static AppConfig getInstance(){
        if(obj == null)
            obj =  new AppConfig();
        return obj;
    }
}
