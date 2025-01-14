package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println("student1=" + student1 );
        Student student2 = createStudent("학생2", 16, 80);
        // student1.name = "나";
        System.out.println("student2=" + student2 );

        printStudent(student1);//참조값을 넘겨서 메서드가 받아서 출력
        printStudent(student2);

    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student(); // 생성 : x001
        //System.out.println("student=" + student);
        student.name = name; // 매개변수 전달뱓은 값 대입
        student.age = age;
        student.grade = grade;
        System.out.println("student=" + student);
        return  student; // 만들어진 student의 참조값 반환 : x001
    }

    static void printStudent(Student student) {
        System.out.println("이름:" +  student.name + " 나이:" + student.age + " 성적" + student.grade);

    }
}

