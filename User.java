import java.util.Date;

public class User {
    private String name;
    private Date birthdate;
    private int size;
    private Photo[] photos;
    private Address address;

    public User(String name, Date birthdate, int size, Photo[] photos, Address address) {
        this.name = name;
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }


    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}





