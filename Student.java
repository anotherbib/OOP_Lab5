public class Student{
    private String name;
    private String university;
    private int age;

    public Student(StudentBuilder stdBuilder){
        this.name = stdBuilder.name;
        this.university = stdBuilder.university;
        this.age = stdBuilder.age;
    }

    public static class StudentBuilder{
        private String name;
        private String university;
        private int age;
        public StudentBuilder(String name, String uni){
            this.name = name;
            this.university = uni;
        }
        public StudentBuilder age(int age){
            this.age = age;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name + "\n");
        sb.append("University: " + university + "\n");
        if (age != 0 && age > 0) sb.append("Age: " + age + "\n");
        return sb.toString();
    }
}