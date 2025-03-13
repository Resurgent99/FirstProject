
package javaRush20Externalizable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

//Реализуйте интерфейс Externalizable для класса Apartment
//Подумайте, какие поля не нужно сериализовать
public class Main {

  public static void main(String[] args) {
    Apartment apartment = new Apartment();

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("apartment.ser"))) {

      apartment.readExternal(ois);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println("Deserialized Apartment: " + apartment);
  }

}
