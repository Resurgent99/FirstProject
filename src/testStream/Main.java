package testStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Student> students = Arrays.asList(
     new Student("Sasha", 89),
    new Student("Nikita", 80),
     new Student("Stas", 30)
    );

    List<String> filtredName = students.stream()
        .filter(student -> student.getGrade() > 75)
        .sorted(Comparator.comparing(Student::getName))
        .map(Student::getName)
        .collect(Collectors.toList());
    System.out.println(filtredName);
  }

}
