package ecs_project;

public class IndividualList {

    // A list variable that stores IndividualClass objects is defined.
    private Individual[] IList;
    private int count = 0;

    // 100 Individual objects are being initialized within the list.
    public IndividualList() {
        IList = new Individual[100];
    }

    // Returns the list
    public Individual[] getList() {
        return IList;
    }

    // Adds new object into the list
    public void add(int modulecode, String moduletitle, String moduletutor, int courseno, String coursetitle, String courseissue, String coursedue, double coursemark) {
        Individual coursework = new Individual(modulecode, moduletitle, moduletutor, courseno, coursetitle, courseissue, coursedue, coursemark);
        coursework.setModuleCode(count);
        IList[count] = coursework;
        count++;
    }

    // Prints out details of an object
    public void view(int ref) {
        
        for (int i = 0; i < IList.length; i++) {
            if (IList[i].getModuleCode() == ref) {
                IList[i].toString();
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
    }

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
        Individual[] tempList = new Individual[100];
        for (int i = 0; i < tempList.length; i++) {
            tempList[i] = new Individual();
        }

        int count = 0;
        for (int i = 0; i < IList.length; i++) {
            if (IList[i].getModuleCode() != ref) {
                tempList[count] = IList[i];
                count++;
            }
        }
        IList = tempList;
    }

    // Prints out details of all the objects stored within the list
    public void viewAll() {
        for (int i = 0; i < IList.length; i++) {
            if (IList[i].getModuleCode() != -1) {
                System.out.print("Module Code: " + IList[i].getModuleCode() + "\t");
                System.out.print("Module Title: " + IList[i].getModuleTitle() + "\t");
                System.out.print("Module Tutor: " + IList[i].getModuleTutor() + "\t");
                System.out.print("Coursework No.: " + IList[i].getCourseNumber() + "\t");
                System.out.print("Coursework Title: " + IList[i].getCoursetitle() + "\t");
                System.out.print("Issue date: " + IList[i].getCourseIssue() + "\t");
                System.out.print("Due date & time: " + IList[i].getCourseDue() + "\t");
                System.out.print("Assessment type: " + IList[i].getCourseType() + "\t");
                System.out.print("Module mark (%): " + IList[i].getCourseMark() + "\t");
            }
        }
    }
}
