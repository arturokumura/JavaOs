import java.util.ArrayList;
import java.util.Scanner;

public class Shell {
    Scanner sc = new Scanner(System.in);
    public String currentDirectory = "root>";
    public String comand;
    public ArrayList<String> directories = new ArrayList<>();



    public void start() {
        System.out.println("JavaOs iniciando...");
        comand = "";
        while (!comand.toLowerCase().equals("exit")) {
           System.out.print(currentDirectory );
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
                   break;
               case "cd":
                   cdCommand();
                   break;
               case "pwd":
                   pwdCommand();
                   break;
               case "rmdir":
                   rmdirCommand();
                   break;
               case "exit":
                   System.out.println("Encerrando JavaOs...");
                   break;
               default:
                   System.out.println("Comando inválido!");
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
        System.out.println("rmdir");
        System.out.println("exit");
    }

    public void mkdirCommand() {
        String directoryName = sc.next();

        System.out.println("DEBUG -> " + directoryName);

        if (directories.contains(directoryName)) {
            System.out.println("Pasta já criada!");
        } else {
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

    public void cdCommand() {
        String directoryNameCd = sc.next();

        if (directories.contains(directoryNameCd)) {
                currentDirectory += directoryNameCd + "/";
        } else {
                System.out.println("Diretório não encontrado!");
        }
    }

    public void pwdCommand() {
        System.out.println(currentDirectory);
    }

    public void rmdirCommand() {
        String command_rmdir = sc.next();
        if (directories.isEmpty()) {
            System.out.println("Diretório vazio!");
            return;
        }
        if (directories.contains(command_rmdir)) {
            directories.remove(command_rmdir);
            System.out.println("Pasta removida!");
        } else {
            System.out.println("Diretório não encontrado!");
        }
    }
}



