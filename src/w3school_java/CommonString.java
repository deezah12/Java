package w3school_java;

import java.util.HashSet;

public class CommonString {

    public static void main(String[] args) {
        String[] subjects = {"java", "css", "engineer", "software", "name"};
        String[] courses = {"java", "here", "good", "name", "css"};

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < subjects.length; i++) {
            for (int j = 0; j < courses.length; j++) {
                if (subjects[i].equals(courses[j])){
                    set.add(subjects[i]);
                }
            }
        }
        System.out.println(set);
    }
}
