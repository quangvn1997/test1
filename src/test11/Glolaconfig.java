/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test11;

/**
 *
 * @author Asus
 */
public class Glolaconfig {
    private static final String CONNECTION_STRING_PREFIX = "jdbc:mysql:";
    private static final String DATABASE = "user";
    private static final String DATABASE_USER = "?user=root";
    private static final String DATABASE_PASSWORD = "";
    private static final String HOST_WITH_PORT = "//localhost:3306/"; 

    public static String getCONNECTION_STRING_PREFIX() {
        return CONNECTION_STRING_PREFIX;
    }

    public static String getDATABASE() {
        return DATABASE;
    }

    public static String getDATABASE_USER() {
        return DATABASE_USER;
    }

    public static String getDATABASE_PASSWORD() {
        return DATABASE_PASSWORD;
    }

    public static String getHOST_WITH_PORT() {
        return HOST_WITH_PORT;
    }
    
    
}
