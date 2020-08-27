package uk.me.anantchohan.todolist.datamodel;

import java.time.LocalDate;

public class TodoItem {
    private String shortDescriprion;
    private String details;
    private LocalDate deadline;

    public TodoItem(String shortDescriprion, String details, LocalDate deadline) {
        this.shortDescriprion = shortDescriprion;
        this.details = details;
        this.deadline = deadline;
    }

    public void setShortDescriprion(String shortDescriprion) {
        this.shortDescriprion = shortDescriprion;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getShortDescriprion() {
        return shortDescriprion;
    }

    public String getDetails() {
        return details;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

//    @Override
//    public String toString() {
//        return shortDescriprion;
//    }
}
