
package javaRush20Externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Apartment implements Externalizable {

  private String address;
  private int rooms;
  private transient String owner;

  public Apartment() {

  }

  public Apartment(String address, int rooms, String owner) {
    this.address = address;
    this.rooms = rooms;
    this.owner = owner;
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeUTF(address);
    out.writeInt(rooms);
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    address = in.readUTF();
    rooms = in.readInt();
  }

  public String getAddress() {
    return address;
  }

  public int getRooms() {
    return rooms;
  }

  public String getOwner() {
    return owner;
  }

  @Override
  public String toString() {
    return "Apartment{" +
        "address='" + address + '\'' +
        ", rooms=" + rooms +
        ", owner='" + owner + '\'' +
        '}';
  }
}
