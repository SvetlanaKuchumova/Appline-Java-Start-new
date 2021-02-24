package ru.appline;

public class CheckSubstrings12 {
    public static void main(String[] args) {

        String str1 = "I like Java!!!";

        boolean gotJava = str1.contains("Java");
        boolean startILike = str1.startsWith("I like");
        boolean endStr  = str1.endsWith("!!!");

        if (gotJava && startILike && endStr){
            System.out.println(str1.toUpperCase()); //Вывод "I LIKE JAVA"
        }

        str1 = str1.replace("a", "o");
        System.out.println(str1.substring(7, 11));  //Вывод "Jovo"
    }
}
