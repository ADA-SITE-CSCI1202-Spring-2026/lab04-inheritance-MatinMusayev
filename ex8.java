class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person() {
    }

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean equals(Person p) {
        if (p == null) return false;
        return firstName.equals(p.firstName) &&
                lastName.equals(p.lastName) &&
                gender.equals(p.gender);
    }

    public String toString() {
        return firstName + " " + lastName + " (" + gender + ")";
    }
}

class Teacher extends Person {
    private String department;
    private String courses;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String gender, String department, String courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;
        return super.equals(t) &&
                department.equals(t.department) &&
                courses.equals(t.courses);
    }

    public String toString() {
        return super.toString() + " Department: " + department + ", Courses: " + courses;
    }
}

class Student extends Person {
    private String studentId;

    public Student() {
    }

    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public boolean equals(Student s) {
        if (s == null) return false;
        return super.equals(s) &&
                studentId.equals(s.studentId);
    }

    public String toString() {
        return super.toString() + " ID: " + studentId;
    }
}

class PhdStudent extends Student {
    private String department;
    private String courses;

    public PhdStudent() {
    }

    public PhdStudent(String firstName, String lastName, String gender, String studentId, String department, String courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public boolean equals(PhdStudent pStud) {
        if (pStud == null) return false;
        return super.equals(pStud) &&
                department.equals(pStud.department) &&
                courses.equals(pStud.courses);
    }

    public String toString() {
        return super.toString() + " Department: " + department + ", Courses: " + courses;
    }
}

public class ex8 {
    public static void main(String[] args) {
        Person p = new Person("Ali", "Karimov", "Male");
        Teacher t = new Teacher("Leyla", "Hasanova", "Female", "Computer Science", "OOP");
        Student s = new Student("Rauf", "Mammadov", "Male", "S12345");
        PhdStudent phd = new PhdStudent("Nigar", "Aliyeva", "Female", "P54321", "Physics", "Quantum Mechanics");

        System.out.println(p);
        System.out.println(t);
        System.out.println(s);
        System.out.println(phd);

        Person p2 = new Person("Ali", "Karimov", "Male");
        System.out.println(p.equals(p2));

        Teacher t2 = new Teacher("Leyla", "Hasanova", "Female", "Computer Science", "OOP");
        System.out.println(t.equals(t2));

        Student s2 = new Student("Rauf", "Mammadov", "Male", "S12345");
        System.out.println(s.equals(s2));

        PhdStudent phd2 = new PhdStudent("Nigar", "Aliyeva", "Female", "P54321", "Physics", "Quantum Mechanics");
        System.out.println(phd.equals(phd2));
    }
}