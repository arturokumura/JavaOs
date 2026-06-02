import java.util.ArrayList;
import java.util.Scanner;

public class Shell {
    Scanner sc = new Scanner(System.in);
    public String comand;
    Directory root = new Directory("root", null);
    private Directory currentDirectory;
    public ArrayList<String> history = new ArrayList<>();
    public Shell() {
         root = new Directory("root> ", null);
         currentDirectory = root;
    }

    public void start() {
        System.out.println("JavaOs iniciando...");
        comand = "";
        while (!comand.toLowerCase().equals("exit")) {
           System.out.print(currentDirectory.getNome() );
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
               /*case "cd":
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
               case "history":
                   historyCommand();
                   break;*/
               default:
                   System.out.println("Comando inválido!");
           }
    }
    }

    public void helpCommand() {
        System.out.println("Comandos disponíveis:");
        System.out.println("help");
        System.out.println("mkdir");
        System.out.println("ls");
        System.out.println("cd");
        System.out.println("pwd");
        System.out.println("rmdir");
        System.out.println("cd ..");
        System.out.println("history");
        System.out.println("exit");
    }

    public void mkdirCommand() {
        String dirName = sc.next();
        Directory dir = new Directory(dirName, currentDirectory);
        currentDirectory.getChildren().add(dirName);

    }

    public void lsCommand() {
        if (currentDirectory.getChildren().isEmpty()) {
            System.out.println("Empty directory list");
        }
        else{
            for (Object directory : currentDirectory.getChildren()) {
                System.out.println(directory);
            }
        }
    }
/*
    public void cdCommand() {
        String directoryNameCd = sc.next();
        if (directoryNameCd.equals("..")) {

            int ultimaBarra = currentDirectory.lastIndexOf("/", currentDirectory.length() - 2);

            if (ultimaBarra == -1) {
                currentDirectory = "root>";
            } else {
                currentDirectory = currentDirectory.substring(0, ultimaBarra + 1);
            }
            return;
        }
        if (directories.contains(directoryNameCd)) {
                currentDirectory += directoryNameCd + "/";
        } else {
                System.out.println("Diretório não encontrado!");
        }
        history.add("cd " + directoryNameCd);
    }

    public void pwdCommand() {
        System.out.println(currentDirectory);
        history.add("pwd");
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
        history.add("rmdir " + command_rmdir);
    }

    public void historyCommand() {
        if (history.isEmpty()) {
            System.out.println("Não há histórico!");
        }
        else {
            for (String com : history) {
                System.out.println(com);
            }
        }
    }*/
}




