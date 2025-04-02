package testStream;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

  private String name;
  private int grade;


  @Override
  public String toString() {
    return name + "(" + +grade + ")";
  }

}
