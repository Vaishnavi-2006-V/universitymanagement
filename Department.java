class Department {

    String departmentName;

    Department(String name) {
        departmentName = name;
    }

    void showSubjects() {
        System.out.println("Department: " + departmentName);
        System.out.println("Subjects offered:");
        System.out.println("1. English");
        System.out.println("2. History");
        System.out.println("3. Philosophy");
        System.out.println("4. Languages");
    }
}

public class UniversityManagement {

    public static void main(String[] args) {

        Department d = new Department("Arts Department");

        d.showSubjects();

        System.out.println("University Management Program Executed Successfully");
    }
}
