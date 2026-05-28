import java.util.ArrayList;
import java.util.Scanner;

public class Shell {
    Scanner sc = new Scanner(System.in);
    public String currentDirectory = "root";
    public String comand;
    public ArrayList<String> directories = new ArrayList<>();



    public void start() {
        System.out.println("JavaOs iniciando...");
        comand = "";
        while (!comand.toLowerCase().equals("exit")) {
           System.out.print(currentDirectory + ">  ");
           comand = sc.next();
           switch (comand.toLowerCase()) {
               case "help":
                   helpCommand();
                   break;
           }
    }
    }

    public void helpCommand() {
        System.out.println("Comandos disponíveis:");
        System.out.println("Help");
        System.out.println("Mkdir");
        System.out.println("ls");
        System.out.println("cd");
        System.out.println("pwd");
        System.out.println("exit");
    }


}


