import java.util.*;

public class Course {
    private String nameC;
    private int max;
    private ArrayList<String> regS;

    public Course(String nameC, int max) {
        this.nameC = nameC;
        this.max = max;
        this.regS = new ArrayList<>();
    }

    public String getCourseName() {
        return nameC;
    }

    public boolean registerStudent(String nameS) {
        if (regS.size() < max && !regS.contains(nameS)) {
        	regS.add(nameS);
            System.out.println(nameS + " enrolled in " + nameC);
            return true;
        } else {
            System.out.println("Error");
            return false;
        }
    }

    public boolean dropStudent(String nameS) {
        if (regS.contains(nameS)) {
        	regS.remove(nameS);
            System.out.println(nameS + " dropped " + nameC);
            return true;
        } else {
            System.out.println("Not in course.");
            return false;
        }
    }

    public void displayCourseDetails() {
        System.out.println("Name " + nameC);
        System.out.println("Seats " + max);
        System.out.println("Seats Taken " + regS.size());
        System.out.println("Registered " + regS);
        System.out.println();
    }
}
