package ecs_project;

public class CourseworkController {

    // Two lists are initialised, one that stores 'Individual' class objects.
    // and the other that stores 'Group' class objects.
    private final IndividualList list_i = new IndividualList();
    private final GroupList list_g = new GroupList();

    // Adds a new Individual object.
    public void addIndividual(int modulecode, String moduletitle, String moduletutor, int courseno, String coursetitle, String courseissue, String coursedue, double coursemark) {
        list_i.add(modulecode, moduletitle, moduletutor, courseno, coursetitle, courseissue, coursedue, coursemark);
    }

    // Adds a new Group object.
    public void addGroup(int modulecode, String moduletitle, String moduletutor, int courseno, String coursetitle, String courseissue, String coursedue, double coursemark) {
        list_g.add(modulecode, moduletitle, moduletutor, courseno, coursetitle, courseissue, coursedue, coursemark);
    }

    // Displays details of a 'Individual' object.
    public void viewIndividual(int ref) {
        list_i.view(ref);
    }

    // Displays details of a 'Group' object.
    public void viewGroup(int ref) {
        list_g.view(ref);
    }

    // Removes a 'Individual' object from the list.
    public void deleteIndividual(int ref) {
        list_i.delete(ref);
    }

    // Removes a 'Group' object from the list.
    public void deleteGroup(int ref) {
        list_g.delete(ref);
    }

    // Displays details of all the 'Individual' objects within the list.
    public void viewAllIndividuals() {
        list_i.viewAll();
    }

    // Displays details of all the 'Group' objects within the list.
    public void viewAllGroups() {
        list_g.viewAll();
    }
}
