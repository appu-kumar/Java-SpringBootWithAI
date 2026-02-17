interface IDatabaseConnection {
    public final String url="https/url";
    void getConnection();
    void closeConnection();
}
// Note:- abstract and final can not use simultaneously okay
abstract interface M{   // abstract added by default okay
    int xyz = 5;  // by default---> public static final
    void raju();  // by default---> public abstract
}

class Database implements IDatabaseConnection,M {

    public void getConnection(){

    }
    public void closeConnection(){

    }

    public void raju() {

    }
}

public class Interface1 {

    public static void main(String[] args){
        IDatabaseConnection db = new Database();
        System.out.println(db.url);
    }
}
