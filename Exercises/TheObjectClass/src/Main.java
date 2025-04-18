public class Main extends Object{
    public static void main(String[] args) {
        Student student = new Student("Joaquin", 20);
        System.out.println(student);

        PrimarySchoolStudent pss = new PrimarySchoolStudent("Sebastian", 11, "Jeraldine");
        System.out.println(pss);
    }
}

class Student{
    private String name;
    private int age;

    Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old";
    }
}


class PrimarySchoolStudent extends Student{
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + " is the parent of " + super.toString().replace(" is ", " who is ");
    }
}
