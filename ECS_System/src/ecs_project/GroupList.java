package ecs_project;

public class GroupList {

    // A list variable that stores IndividualClass objects is defined.
    private Group[] GList;
    private int count = 0;

    // 100 Individual objects are being initialized within the list.
    public GroupList() {
        GList = new Group[100];
    }

    // Returns the list
    public Group[] getList() {
        return GList;
    }

    // Adds new object into the list
    public void add(int modulecode, String moduletitle, String moduletutor, int courseno, String coursetitle, String courseissue, String coursedue, double coursemark) {
        Group coursework = new Group(modulecode, moduletitle, moduletutor, courseno, coursetitle, courseissue, coursedue, coursemark);
        coursework.setModuleCode(count);
        GList[count] = coursework;
        count++;
    }

    // Prints out details of an object
    public void view(int ref) {

        for (int i = 0; i < GList.length; i++) {
            if (GList[i].getModuleCode() == ref) {
                GList[i].toString();
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
        Group[] tempList = new Group[100];
        for (int i = 0; i < tempList.length; i++) {
            tempList[i] = new Group();
        }

        int count = 0;
        for (int i = 0; i < GList.length; i++) {
            if (GList[i].getModuleCode() != ref) {
                tempList[count] = GList[i];
                count++;
            }
        }
        GList = tempList;
    }

    // Prints out details of all the objects stored within the list
    public void viewAll() {
        for (int i = 0; i < GList.length; i++) {
            if (GList[i].getModuleCode() != -1) {
                System.out.print("Module Code: " + GList[i].getModuleCode() + "\t");
                System.out.print("Module Title: " + GList[i].getModuleTitle() + "\t");
                System.out.print("Module Tutor: " + GList[i].getModuleTutor() + "\t");
                System.out.print("Coursework No.: " + GList[i].getCourseNumber() + "\t");
                System.out.print("Coursework Title: " + GList[i].getCoursetitle() + "\t");
                System.out.print("Issue date: " + GList[i].getCourseIssue() + "\t");
                System.out.print("Due date & time: " + GList[i].getCourseDue() + "\t");
                System.out.print("Assessment type: " + GList[i].getCourseType() + "\t");
                System.out.print("Module mark (%): " + GList[i].getCourseMark() + "\t");
            }
        }
    }
}
