public class Question2 {
    public class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public class Student extends Person {
        private String studentID;

        public Student(String name, int age, String studentID) {
            super(name, age);
            this.studentID = studentID;
        }

        public String getStudentID() {
            return studentID;
        }

        public void setStudentID(String studentID) {
            this.studentID = studentID;
        }

        public void displayInfo() {
            super.displayInfo();
            System.out.println("Student ID: " + studentID);
        }
    }

    public class Teacher extends Person {
        private int salary;
        public Teacher(String name, int age, int salary) {
            super(name, age);
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public void displayInfo() {
            super.displayInfo();
            System.out.println("Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();
        Student student = question2.new Student("Alice", 20, "S12345");
        Teacher teacher = question2.new Teacher("Bob", 40, 50000);

        System.out.println("Student Information:");
        student.displayInfo();

        System.out.println("\nTeacher Information:");
        teacher.displayInfo();
    }
}
