package com.example.todofx.model;

import java.time.LocalDate;
import java.util.Objects;

public class Todo {
    private int id;
    private String task;
    private LocalDate deadline = LocalDate.now().plusDays(1);// default: Morgen
    private State state = State.OPEN;


    public Todo(int id, String task) {
        this.id = id;
        this.task = task;
    }

    public Todo(int id, String task, LocalDate deadline, State state) {
        this.id = id;
        this.task = task;
        this.deadline = deadline;
        this.state = state;
    }

    public Todo(String task, State state, LocalDate deadline) {
        this.task = task;
        this.state = state;
        this.deadline = deadline;
    }

    public Todo(String task) {
        this.task = task;
    }

    public Todo(String task, LocalDate deadline) {
        this.task = task;
        this.deadline = deadline;
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

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", deadline=" + deadline +
                ", state=" + state +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Todo todo = (Todo) o;
        return id == todo.id && Objects.equals(task, todo.task) && Objects.equals(deadline, todo.deadline) && state == todo.state;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(task);
        result = 31 * result + Objects.hashCode(deadline);
        result = 31 * result + Objects.hashCode(state);
        return result;
    }

    public static void info(){
        System.out.println("Ein Todo besteht aus Task,Deadline und State");
    }


}
