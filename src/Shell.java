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
               case "mkdir":
                   mkdirCommand();
                   break;
               case "ls":
                   lsCommand();
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


    public void mkdirCommand() {
        boolean achou = false;
        int pos  = 0;
        String directory = sc.next();
        String directoryName = "";
        for (int j = 0; j < directory.length(); j++) {
            if (directory.equals(" ")) {
                pos = j+1;
            }
        }
        directoryName = directory.substring(pos);
        if (directories.contains(directoryName)) {
            System.out.println("Pasta já criada!");
        }
        else {
            directories.add(directoryName);
            System.out.println("Pasta criada: " + directoryName);
        }
    }

    public void lsCommand() {
        if (directories.isEmpty()) {
            System.out.println("Diretório vazio!");
        }
        else {
            for (String pasta : directories) {
                System.out.println(pasta);
            }
        }
    }
}


