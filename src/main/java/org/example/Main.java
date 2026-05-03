package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List <Employee> link = new LinkedList<>();

       System.out.println(WordCounter.calculatedWord());
    }

    public static List<Employee> findDuplicates(List <Employee> ata) {
        Set<Employee> data1 = new HashSet<>();
        List<Employee> duplicates = new ArrayList<>();

        for(Employee item : ata) {
            if (item == null) continue;
            if (!(data1.add(item))) {
                duplicates.add(item);
            }
        }

        return duplicates;
    }

    public static List<Employee> removeDuplicates(List <Employee> ata) {
        List<Employee> data1 = new LinkedList<>();

        for(Employee item : ata) {
            if (item == null) continue;
            if(Collections.frequency(ata , item) == 1) {
                data1.add(item);
            }
        }

        return data1;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> ata){
        Map<Integer, Employee> unique = new HashMap<>();
        for(Employee item : ata ) {
            if (item == null) continue;
            unique.put(item.getId(), item);
        }
        return unique;
    }
}