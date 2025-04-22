import java.util.*;

public class StudentCourseRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("English", 3));
        courses.add(new Course("Computer-Science", 2));
        courses.add(new Course("Art101", 2));

        boolean work = true;
        
        while (work) {
            System.out.println("1-Register");
            System.out.println("2-Drop");
            System.out.println("3-Course Info");
            System.out.println("4-Leave");
            System.out.print("Pick a number ");
            int input = scanner.nextInt();
            scanner.nextLine(); 

            if (input == 1) {
                System.out.print("Name and course: ");
                String[] reg = scanner.nextLine().split(" ");
                registerStudent(courses, reg[1], reg[0]);


            } else if (input == 2) {
            	System.out.print("Name and course: ");
            	String[] drop = scanner.nextLine().split(" ");
            	dropStudent(courses, drop[1], drop[0]);


            } else if (input == 3) {
                for (Course course : courses) {
                    course.displayCourseDetails();
                }

            } else if (input == 4) {
                System.out.println("Exit");
                work = false;

            } else {
                System.out.println("Error");
            }
        }
    }

    public static void registerStudent(ArrayList<Course> courses, String nameC, String nameS) {
        for (Course course : courses) {
            if (course.getCourseName().equalsIgnoreCase(nameC)) {
                course.registerStudent(nameS);
                return;
            }
        }
        System.out.println("Error");
    }

    public static void dropStudent(ArrayList<Course> courses, String nameC, String nameS) {
        for (Course course : courses) {
            if (course.getCourseName().equalsIgnoreCase(nameC)) {
                course.dropStudent(nameS);
                return;
            }
        }
        System.out.println("Error");
    }
}
