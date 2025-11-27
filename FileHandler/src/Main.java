import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Todo{
    int id;
    String task;

    public Todo(int id, String task) {
        this.id = id;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}

public class Main {

    public static void writeText(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename,true);
        Todo todo = new Todo(1,"einkaufen");
        fw.write(todo.getId()+","+todo.task+"\n");
        fw.close();

    }
    public static void readText(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        ArrayList<Todo> todos = new ArrayList<>();
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] arr= line.split(",");

            Todo todo = new Todo( Integer.parseInt( arr[0])  ,arr[1]);
            todos.add(todo);

        }
        sc.close();
        System.out.println(todos);
    }

    public static void main(String[] args) {
        System.out.println("write...");
        try {
            //writeText("data.txt");
           readText("data.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}