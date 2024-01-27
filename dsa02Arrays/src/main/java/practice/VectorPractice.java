package practice;

import java.util.Vector;

public class VectorPractice {


    public static void main(String[] args) {


        Vector<String> names = new Vector<>();
        System.out.println("names.capacity() = " + names.capacity());
        System.out.println("names.size() = " + names.size());
        names.add("John2");
        names.add("John3");
        names.add("John4");
        names.add("John5");
        names.add("John6");
        names.add(0, "John1");
        System.out.println("names.size() = " + names.size());
        System.out.println("names.get(0) = " + names.get(0));
        System.out.println("names.get(1) = " + names.get(1));
        names.add("John7");
        names.add("John8");
        names.add("John9");
        names.add("John10");
        names.add("John11");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("names.get("+i+") = " + names.get(i));
        }
        System.out.println("names.capacity() = " + names.capacity());
        System.out.println("names.elements() = " + names.elements().getClass());


    }



}
