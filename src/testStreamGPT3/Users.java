package testStreamGPT3;


import lombok.Data;

@Data
public class Users {
  private String name;
  private Sex sex;

  public Users(String name, Sex sex) {
    this.name = name;
    this.sex = sex;
  }

  public Sex getSex() {
    return sex;
  }

}
