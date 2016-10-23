package ecs_project;

public class CourseworkFactory {

    // Two integer variables are being initialized
    // they both assign ID of each sub classe (StandardClass and FirstClass)
    // once assigned, they increment
    private int counter_f = 0;
    private int counter_s = 0;

    // Receives a type of an object in String
    // and initiates an object accordingly
    public Coursework inputType(String theType) {
        if (theType == null) {
            return null;
        }
        if (theType.equalsIgnoreCase("Individual")) {
            Individual Icoursework = new Individual();
            Icoursework.setModuleCode(counter_f);
            counter_f++;
            return Icoursework;
        } else if (theType.equalsIgnoreCase("StandardClass")) {
            Group Gcoursework = new Group();
            Gcoursework.setModuleCode(counter_s);
            counter_s++;
            return Gcoursework;
        }
        return null;
    }
}
