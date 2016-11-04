package ecs_project;

import java.util.ArrayList;
import java.util.List;

public class IndividualList {

    // A list variable that stores IndividualClass objects is defined.
    private List<Individual> IList;

    // 100 Individual objects are being initialized within the list.
    public IndividualList() {
        IList = new ArrayList<>();
    }

    // Returns the list
    public List<Individual> getList() {
        return IList;
    }

    // Adds new object into the list
    public void add(int modulecode, String moduletitle, String moduletutor, int courseno, String coursetitle, String courseissue, String coursedue, double coursemark) {
        Individual coursework = new Individual(modulecode, moduletitle, moduletutor, courseno, coursetitle, courseissue, coursedue, coursemark);
        IList.add(coursework);
    }

    // Prints out details of an object
    public void view(int ref) {

        for (int i = 0; i < IList.size(); i++) {
            if (IList.get(i).getModuleCode() == ref) {
                IList.get(i).toString();
            }
        }
    }
//        if ((find(ref) == true) && (ref != -1)) {
//            System.out.println("Module Code: " + IList[ref].getModuleCode());
//            System.out.println("Module Title: " + IList[ref].getModuleTitle());
//            System.out.println("Module Tutor: " + IList[ref].getModuleTutor());
//            System.out.println("Coursework No.: " + IList[ref].getCourseNumber());
//            System.out.println("Coursework Title: " + IList[ref].getCoursetitle());
//            System.out.println("Issue date: " + IList[ref].getCourseIssue());
//            System.out.println("Due date & time: " + IList[ref].getCourseDue());
//            System.out.println("Assessment type: " + IList[ref].getCourseType());
//            System.out.println("Module mark (%): " + IList[ref].getCourseMark());
//        } else {
//            System.out.println("not found ");
//        }
// Finds an object with a given ref value as a parameter
//    public boolean find(int ref) {
//        boolean found = false;
//        int i = 0;
//        do {
//            if (IList[i].getModuleCode() == ref) {
//                found = true;
//            }
//            i++;
//        } while ((i < IList.length) && (!found));
//        return found;
//    }
// Removes an object with a given ref value as a parameter
    public void delete(int ref) {
        for (int i = 0; i < IList.size(); i++) {
            if (IList.get(i).getModuleCode() == ref) {
                IList.remove(i);
            }
        }
    }

    // Prints out details of all the objects stored within the list
    public void viewAll() {
        for (int i = 0; i < IList.size(); i++) {
            if (IList.get(i).getModuleCode() != -1) {
                System.out.print("Module Code: " + IList.get(i).getModuleCode() + "\t");
                System.out.print("Module Title: " + IList.get(i).getModuleTitle() + "\t");
                System.out.print("Module Tutor: " + IList.get(i).getModuleTutor() + "\t");
                System.out.print("Coursework No.: " + IList.get(i).getCourseNumber() + "\t");
                System.out.print("Coursework Title: " + IList.get(i).getCoursetitle() + "\t");
                System.out.print("Issue date: " + IList.get(i).getCourseIssue() + "\t");
                System.out.print("Due date & time: " + IList.get(i).getCourseDue() + "\t");
                System.out.print("Assessment type: " + IList.get(i).getCourseType() + "\t");
                System.out.print("Module mark (%): " + IList.get(i).getCourseMark() + "\t");
            }
        }
    }
}
