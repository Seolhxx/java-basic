package ref;

public class Method1 {
    public static void main(String[] args) {
        // 생성과 초기화
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);//참조값을 넘겨서 메서드가 받아서 출력
        printStudent(student2);

    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름:" +  student.name + " 나이:" + student.age + " 성적" + student.grade);

    }
}

