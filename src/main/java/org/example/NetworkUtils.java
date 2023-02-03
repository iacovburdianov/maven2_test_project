package org.example;

public class NetworkUtils {
    public static void getConnection() {
        //we get connection with server
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return;
    }
}
