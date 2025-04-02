package testStreanGPT2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {

  private String name;
  private int age;


  @Override
  public String toString() {
    return name + "(" + age + ")";
  }
}
