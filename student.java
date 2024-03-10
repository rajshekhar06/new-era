public class student {
    public void stud_det() {
        String name = "Joker";
        String prg = "BCA";
        String dept = "MCA";
        String[] course = {"DevOps", "Machine Learning", "C#"};
        System.out.println("Name of the student is = " + name);
        System.out.println("Program of the student is = " + prg);
        System.out.println("Department of the student is = " + dept);
        System.out.println("Student registered courses are:");
        for (int i = 0; i < course.length; i++) {
            System.out.println(course[i]);
        }
    }

    public static void main(String[] args) {
        student student = new student();
        student.stud_det();
    }
}
