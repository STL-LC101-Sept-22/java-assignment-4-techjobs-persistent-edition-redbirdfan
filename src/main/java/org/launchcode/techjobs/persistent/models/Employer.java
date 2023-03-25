package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message = "Field is required")
    @Size(min=1,max=100)
    public String location;

    @OneToMany
    @JoinColumn(name="employer_id")
    public List<Job> jobs = new ArrayList<>();

    public String setLocation(String location) {
        this.location = location;
        return location;
    }

    public String getLocation() {
        return location;
    }

   public Employer(){

    }

    public List<Job> getJob() {
        return jobs;
    }
}
