package com.mycompany.mavenproject1;

import static spark.Spark.*;

public class Mavenproject1 {

    public static void main(String[] args) {
        get("/nombre", (req, res) -> "Henry Fernando Mulato Llanten");

        get("/sumar/:a/:b", (req, res) -> {
            int parametroA = Integer.parseInt(req.params(":a"));
            int parametroB = Integer.parseInt(req.params(":b"));

            return sum(parametroA, parametroB);
        });
    }
    
    private static int sum(int a, int b){
        return a+b;
    }
}
