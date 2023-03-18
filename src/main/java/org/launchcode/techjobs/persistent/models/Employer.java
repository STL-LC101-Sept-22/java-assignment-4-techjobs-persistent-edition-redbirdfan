package org.launchcode.techjobs.persistent.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Length(max=125)
    public String location;

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer(){

    }
}
