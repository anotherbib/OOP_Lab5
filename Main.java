public class Main {
    public static void main(String[] args) {
        Student Taylor = new Student.StudentBuilder("Taylor", "KMITL")
            .age(19)
            .build();
        System.out.println(Taylor);
    }
}
