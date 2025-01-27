package dev.labs.s3;

public class Main {
    public static void main(String[] anything) {
        Database oracle = new Database();

        oracle.connect("url", "admin", "pdsfon", 6);
    }
}