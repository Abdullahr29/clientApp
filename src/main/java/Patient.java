import java.io.Serializable;

public class Patient implements Serializable {
    String name;
    int id;
    String phoneNumber;
    public Patient(String name, int id, String phone){
        this.name = name;
        this.id = id;
        phoneNumber = phone;
    }
}
