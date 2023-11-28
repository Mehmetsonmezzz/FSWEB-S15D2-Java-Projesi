package com.workitech.taskAndTaskData;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTask;
    private Set<Task> bobsTask;
    private Set<Task> carolsTask;

    public TaskData(Set<Task> annsTask, Set<Task> bobsTask, Set<Task> carolsTask) {
        this.annsTask = annsTask;
        this.bobsTask = bobsTask;
        this.carolsTask = carolsTask;
    }

    public Set<Task> getTasks(String owner){
        if(owner.equalsIgnoreCase("ann")){
            return this.annsTask;
        }
        if(owner.equalsIgnoreCase("bob")){
            return this.bobsTask;
        }
        if(owner.equalsIgnoreCase("carol")){
            return this.carolsTask;
        }
        if (owner.equalsIgnoreCase("all")){
            return getUnion(bobsTask,annsTask,carolsTask);
        }
        return new HashSet<>();

    }

    private Set<Task> getUnion(Set<Task>... sets) {
        HashSet<Task> total=new LinkedHashSet<>();
        for(Set<Task> taskSet: sets){
            total.addAll(taskSet);
        }
        return total;
    }

    public Set<Task> getIntersection(Set<Task> first,Set<Task> second){
        Set<Task> intersections =new HashSet<>(first);
        intersections.retainAll(second);
        return intersections;
    }
    public Set<Task> getDifference(Set<Task> first,Set<Task> second){
        Set<Task> difference =new HashSet<>(first);
        difference.removeAll(second);
        return difference;
    }

    public Set<Task> getAnnsTask() {
        return annsTask;
    }

    public void setAnnsTask(Set<Task> annsTask) {
        this.annsTask = annsTask;
    }

    public Set<Task> getBobsTask() {
        return bobsTask;
    }

    public void setBobsTask(Set<Task> bobsTask) {
        this.bobsTask = bobsTask;
    }

    public Set<Task> getCarolsTask() {
        return carolsTask;
    }

    public void setCarolsTask(Set<Task> carolsTask) {
        this.carolsTask = carolsTask;
    }
}
