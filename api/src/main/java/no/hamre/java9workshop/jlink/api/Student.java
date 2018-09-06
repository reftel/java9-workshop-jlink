package no.hamre.java9workshop.jlink.api;

public class Student {
  private Long id;
  private String name;
  private Double studentLoan;

  public Student(Long id, String name, Double studentLoan) {
    this.id = id;
    this.name = name;
    this.studentLoan = studentLoan;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Double getStudentLoan() {
    return studentLoan;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", studentLoan=" + studentLoan +
        '}';
  }
}
