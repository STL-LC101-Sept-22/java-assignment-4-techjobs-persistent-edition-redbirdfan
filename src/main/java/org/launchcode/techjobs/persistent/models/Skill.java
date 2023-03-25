package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @Size(max=150, message="Must be less than 150 characters")
    public String description;

    //@JoinColumn(name = "employer_id")
    @ManyToMany(mappedBy="skills")
    public List<Job>jobs = new ArrayList<>();
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Skill() {

    }
    public List<Job> getJobs() {
        return jobs;
    }

    //tried removing to get skills to list out, no luck
    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}