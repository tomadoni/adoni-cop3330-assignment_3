package ex43;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        String siteName="";
        String author="";
        String javascript="";
        String css="";

        System.out.println("Site name:");
        siteName= kb.nextLine();

        System.out.println("Author:");
        author = kb.nextLine();

        System.out.println("Do you want a folder for Javascript?");
        javascript= kb.nextLine();

        System.out.println("Do you want a folder for CSS?");
        css= kb.nextLine();

        System.out.println("Created ./website/"+siteName);
        System.out.println("Created ./website/"+siteName+"/index.html");

        if(javascript.equals("y")|| javascript.equals("Y")){
            System.out.println("Created ./website/"+siteName+"/js/");
        }
        if(css.equals("y") || css.equals("Y")){
            System.out.println("Created ./website/"+siteName+"/css/");
        }

    }
}
