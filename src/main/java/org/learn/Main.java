package org.learn;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void maxAliveElephants(List<Elephent> elephants) {
        Map<Integer, Integer> yearsCount = new TreeMap<>();

        for (Elephent elephant : elephants) {
            int birthYear = elephant.getBirthYear();
            int deathYear = elephant.getDeathYear();
            if(deathYear == 0){
                if(yearsCount.containsKey(birthYear)) {
                    yearsCount.put(birthYear, yearsCount.get(birthYear) + 1);
                }
                else{
                    yearsCount.put(birthYear,1);
                }
            }
        }
        yearsCount.forEach((k,v) -> System.out.println(k+" "+v));

        int maxAliveYear = 0;
        int maxAliveCount = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : yearsCount.entrySet()) {
            if (entry.getValue() > maxAliveCount) {
                maxAliveYear = entry.getKey();;
                maxAliveCount = entry.getValue();
            }
        }
        System.out.println("maximum alive elephent is: "+maxAliveCount+" and year is: "+maxAliveYear);
    }

    public static void main(String[] args) {

        List<Elephent> elephentList = Elephent.add();

        maxAliveElephants(elephentList);
    }
}