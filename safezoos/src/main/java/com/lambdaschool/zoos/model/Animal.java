package com.lambdaschool.zoos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "animal")
public class Animal extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;

    private String animaltype;


    @OneToMany(mappedBy = "animal",
               cascade = CascadeType.ALL)
    @JsonIgnoreProperties("animal")
    private List<ZooAnimals> zooAnimals = new ArrayList<>();


    public long getAnimalid()
    {
        return animalid;
    }

    public void setAnimalid(long animalid)
    {
        this.animalid = animalid;
    }

    public String getAnimaltype()
    {
        return animaltype;
    }

    public void setAnimaltype(String animaltype)
    {
        this.animaltype = animaltype;
    }

    public List<ZooAnimals> getZooAnimals()
    {
        return zooAnimals;
    }

    public void setZooAnimals(List<ZooAnimals> zooAnimals)
    {
        this.zooAnimals = zooAnimals;
    }
}
