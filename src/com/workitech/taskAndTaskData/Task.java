package com.workitech.taskAndTaskData;

public class Task {

    private String project;
    private String description;
    private String assingnee;
    private Priorty priority;
    private Status status;


    public Task(String project, String description, String assingnee, Priorty priority, Status status) {
        this.project = project;
        this.description = description;
        this.assingnee = assingnee;
        this.priority = priority;
        this.status = status;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssingnee() {
        return assingnee;
    }

    public void setAssingnee(String assingnee) {
        this.assingnee = assingnee;
    }

    public Priorty getPriority() {
        return priority;
    }

    public void setPriority(Priorty priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
