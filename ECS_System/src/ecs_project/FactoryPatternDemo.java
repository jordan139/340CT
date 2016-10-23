package ecs_project;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        // CourseworkFactory object is being initialized.
        CourseworkFactory couFactory = new CourseworkFactory();

        // Coursework object is being initialized.
        Coursework c1 = couFactory.inputType("Individual");
        c1.setModuleTitle("Business");
        System.out.println(c1.toString());
        Coursework c2 = couFactory.inputType("Group");
        //c2.toString();
    }
}
