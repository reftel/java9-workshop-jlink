package no.hamre.java9workshop.jlink.app;

import java.util.List;

import no.hamre.java9workshop.jlink.api.Student;

import static java.lang.System.*;

public class Main {

  public static void main(String[] args) {
    List<Student> students = List.of(
        new Student(1L, "Bjørn", 100.50),
        new Student(1L, "Bjarne", 10_000.00),
        new Student(1L, "Bjarte", 64_000.00)
    );

    students
        .forEach(out::println);
  }
}
