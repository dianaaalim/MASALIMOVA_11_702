package ru.itis.OOPall;

//    public interface Building {
//        void toHost();
//    }
//
//
//    public interface TypeOfSchool {
//        void toTeach();
//    }
//
//
//    public class Main {
//
//
//        public static void main(String[] args) {
//
//            ComprehensiveSchool school = new ComprehensiveSchool(1200, 23, "Elementary");
//            school.toHost();
//            school.amountOfTeachers();
//            school.name();
//
//
//            Gymnasium gymnasium = new Gymnasium(60, 1000, "", 4);
//            gymnasium.amountOfTeachers();
//
//            Lyceum lyceum = new Lyceum(50, 2000, "Math");
//            lyceum.toTeach();
//        }
//
//    }
//
//
//    public class Lyceum implements TypeOfSchool {
//
//        public void toTeach(){
//            System.out.println("We study " + this.nameOfItem + " here.");
//        }
//
//        public void toHoldVebinar(){
//            System.out.println("We can present everything for " + this.amountOfStudents + " students");
//        }
//
//        int amountOfTeachers;
//        int amountOfStudents;
//        String nameOfItem;
//
//        Lyceum(int amountOfTeachers, int amountOfStudents){
//            this.amountOfStudents = amountOfStudents;
//            this.amountOfTeachers = amountOfTeachers;
//
//        }
//
//        Lyceum(int amountOfTeachers, int amountOfStudents, String name){
//            this(amountOfStudents, amountOfTeachers);
//            this.nameOfItem = name;
//        }
//    }
//
//
//    public class Gymnasium extends ComprehensiveSchool
//            implements TypeOfSchool {
//
//        int dateOfOpening;
//
//        public void toTeach(){
//            System.out.println("We study German here.");
//        }
//
//        public void amountOfTeachers(){
//            System.out.println("We have more than " + this.amountOfTeachers + " best teachers");
//        }
//
//
//        public void toHost(){
//            System.out.println("We are glad to new students and guests.");
//        }
//
//        public void toGiveOpenLesson(){
//            System.out.println("Our students are wonderful.");
//        }
//
//        Gymnasium(int amountOfTeachers, int amountOfStudents, String name, int date){
//            super(amountOfTeachers, amountOfStudents, name);
//            this.dateOfOpening = date;
//        }
//    }
//
//
//
//    public class ComprehensiveSchool implements TypeOfSchool, Building{
//
//        public void toTeach(){
//            System.out.println("We teach whatever we want.");
//        }
//
//
//        public void toHost(){
//            System.out.println("We can teach " + this.amountOfStudents + " at once.");
//        }
//
//        public void amountOfTeachers(){
//            System.out.println("We have more than " + this.amountOfTeachers + " teachers");
//        }
//
//        public void name(){
//            System.out.println("Our name " + this.nameOfSchool);
//        }
//
//        int amountOfTeachers;
//        int amountOfStudents;
//        String nameOfSchool;
//
//        ComprehensiveSchool(int amountOfTeachers, int amountOfStudents){
//            this.amountOfStudents = amountOfStudents;
//            this.amountOfTeachers = amountOfTeachers;
//
//        }
//
//        ComprehensiveSchool(int amountOfTeachers, int amountOfStudents, String name){
//            this(amountOfStudents, amountOfTeachers);
//            this.nameOfSchool = name;
//        }
//
//        void amountOfStudents() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    }

