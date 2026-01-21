package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class    Main {
    public static void main(String[] args) {
        String url = "Artisti.json";
    Scrittore s1 = new Scrittore(url);
    Lettore r1 = new Lettore(url);

        System.out.println("\nDati letti dal json: ");
        r1.start();
        try {
            r1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    }
