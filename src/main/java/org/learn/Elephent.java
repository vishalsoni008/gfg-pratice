package org.learn;

import java.util.ArrayList;
import java.util.List;

public class Elephent {
    Integer birthYear;
    Integer deathYear;

    public Elephent(Integer birthYear, Integer deathYear) {
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    @Override
    public String toString() {
        return "Elephent{" +
                "birthYear=" + birthYear +
                ", deathYear=" + deathYear +
                '}';
    }

    static List<Elephent> elephentList = new ArrayList<>();

    static List<Elephent> add(){
        elephentList.add(new Elephent(1999,2000));
        elephentList.add(new Elephent(1998,2000));
        elephentList.add(new Elephent(1998,2000));
        elephentList.add(new Elephent(1999,0));
        elephentList.add(new Elephent(1997,2000));
        elephentList.add(new Elephent(1994,0));
        elephentList.add(new Elephent(1999,0));
        elephentList.add(new Elephent(1998,0));
        elephentList.add(new Elephent(1998,0));
        elephentList.add(new Elephent(1998,0));
        return elephentList;
    }
}