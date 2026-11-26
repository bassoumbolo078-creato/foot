package com.ism.view;

public class MethodesMetiers {
    public static String lireChaine(String msg)
    {
        String chaine;
        do
        {
            System.out.println(msg);
            chaine = System.console().readLine();
        } while (chaine == null);
        return chaine;
    }
}
