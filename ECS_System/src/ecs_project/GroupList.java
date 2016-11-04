package ecs_project;

import java.util.ArrayList;
import java.util.List;

public class GroupList {

    // A list variable that stores IndividualClass objects is defined.
    private List<Group> GList;

    // 100 Individual objects are being initialized within the list.
    public GroupList() {
        GList = new ArrayList<>();
    }

    // Returns the list
    public List<Group> getList() {
        return GList;
    }

    // Adds new object into the list
    public void add(int modulecode, String moduletitle, String moduletutor, int courseno, String coursetitle, String courseissue, String coursedue, double coursemark) {
        Group coursework = new Group(modulecode, moduletitle, moduletutor, courseno, coursetitle, courseissue, coursedue, coursemark);
        GList.add(coursework);;
    }

    // Prints out details of an object
    public void view(int ref) {

        for (int i = 0; i < GList.size(); i++) {
            if (GList.get(i).getModuleCode() == ref) {
                GList.get(i).toString();
            }
        }
//        if ((find(ref) == true) && (ref != -1)) {
//            System.out.println("Module Code: " + GList[ref].getModuleCode());
//            System.out.println("Module Title: " + GList[ref].getModuleTitle());
//            System.out.println("Module Tutor: " + GList[ref].getModuleTutor());
//            System.out.println("Coursework No.: " + GList[ref].getCourseNumber());
//            System.out.println("Coursework Title: " + GList[ref].getCoursetitle());
//            System.out.println("Issue date: " + GList[ref].getCourseIssue());
//            System.out.println("Due date & time: " + GList[ref].getCourseDue());
//            System.out.println("Assessment type: " + GList[ref].getCourseType());
//            System.out.println("Module mark (%): " + GList[ref].getCourseMark());
//        } else {
//            System.out.println("not found ");
//        }
    }

    // Finds an object with a given ref value as a parameter
//    public boolean find(int ref) {
//        boolean found = false;
//        int i = 0;
//        do {
//            if (GList[i].getModuleCode() == ref) {
//                found = true;
//            }
//            i++;
//        } while ((i < GList.length) && (!found));
//        return found;
//    }
    // Removes an object with a given ref value as a parameter
    public void delete(int ref) {
        for (int i = 0; i < GList.size(); i++) {
            if (GList.get(i).getModuleCode() == ref) {
                GList.remove(i);
            }
        }
    }
    // Prints out details of all the objects stored within the list

    public void viewAll() {
        for (int i = 0; i < GList.size(); i++) {
            if (GList.get(i).getModuleCode() != -1) {
                System.out.print("Module Code: " + GList.get(i).getModuleCode() + "\t");
                System.out.print("Module Title: " + GList.get(i).getModuleTitle() + "\t");
                System.out.print("Module Tutor: " + GList.get(i).getModuleTutor() + "\t");
                System.out.print("Coursework No.: " + GList.get(i).getCourseNumber() + "\t");
                System.out.print("Coursework Title: " + GList.get(i).getCoursetitle() + "\t");
                System.out.print("Issue date: " + GList.get(i).getCourseIssue() + "\t");
                System.out.print("Due date & time: " + GList.get(i).getCourseDue() + "\t");
                System.out.print("Assessment type: " + GList.get(i).getCourseType() + "\t");
                System.out.print("Module mark (%): " + GList.get(i).getCourseMark() + "\t");
            }
        }
    }
}
