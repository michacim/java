package com.example.todofx.file;

import com.example.todofx.model.State;
import com.example.todofx.model.Todo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandler {

    private static final String FILE_NAME ="todo.csv";



    public static void writeText(Todo todo)  {
        try (FileWriter fw = new FileWriter(FILE_NAME,true)){// AutoClose
            writeLine(todo, fw);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Todo> readText() {
        try ( Scanner sc = new Scanner(new File(FILE_NAME))) {
            ArrayList<Todo> todos = new ArrayList<>();
            while(sc.hasNext()){
                String line = sc.nextLine();
                String[] arr= line.split(",");
                Todo todo = new Todo(
                        Integer.parseInt( arr[0]),//id
                        arr[1], // task
                        LocalDate.parse(arr[2]), // deadline, String to LocalDate
                        State.valueOf(arr[3])  // state, String to Enum
                );
                todos.add(todo);
            }
            return todos;
        } catch (FileNotFoundException e) {
            writeTodos(new ArrayList<>());//Datei anlegen, wenn nicht vorhanden
            //throw new RuntimeException(e);
            //Files.createFile(Path.of("todo.csv"));
        }
        return new ArrayList<>();
    }

    public static void writeTodos(List<Todo> todos) {
        try (FileWriter fw = new FileWriter(FILE_NAME)){// AutoClose
            for (Todo todo: todos){
                writeLine(todo, fw);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeLine(Todo todo, FileWriter fw) throws IOException {
        fw.write(todo.getId()+","+ todo.getTask()+","+ todo.getDeadline()+","+ todo.getState() +"\n");
    }
}
