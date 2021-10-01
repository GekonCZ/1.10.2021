package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // musí být vždy určený datový typ

      /*  var names = new ArrayList<>();
        names.add("Ondra");
        names.add("Honza");
        names.add("Petr");
        names.add("Pavel");
        names.add("Vojta");
        System.out.println(names);*/

        //nebo

       /* var names2 = "asd";*/

        //switch (Buď case a pak break, nebo tahle šipka) Nekombinovat!!

        var code = "504";

        switch (code){
            case "404", "403", "402", "401" -> System.out.println("Client/user's error");
            case "504", "503", "502", "501" -> System.out.println("Server's error");
            default -> System.out.println("Code not recognized");
        }
    }
}
