package programmerzamannow.spring.core;

import javax.xml.crypto.Data;
// belajar singleton
public class Database {

    private static Database database;

    public static Database getInstance(){
        if (database==null){
            database = new Database();
        }
        return database;
    }

    private Database (){

    }
}
