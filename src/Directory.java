import java.util.ArrayList;

public class Directory {
    private String nome;
    private Directory parent;
    private ArrayList<String> children;

    public Directory(String nome, Directory parent) {
        this.nome = nome;
        this.parent = parent;
        this.children = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<String> children) {
        this.children = children;
    }

    public Directory getParent() {
        return parent;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }
}
