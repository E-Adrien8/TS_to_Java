import java.sql.Date;
import java.util.ArrayList;


public class User{

    private Date birthdate;
    private float size;
    private ArrayList<Photo> photos;
    private String address;
    
    public User (Date birthdate, Float size, ArrayList<Photo> photos, String address) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }
    
    public Date getBirthdate() {return birthdate;}
    public void setBirthdate(Date birthdate) {this.birthdate = birthdate;}

    public Float getSize() {return size;}
    public void setSize(Float size) {this.size = size;}

    public ArrayList<Photo> getPhotos() {return photos;}
    public void setPhotos(ArrayList<Photo> photos) {this.photos = photos;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

}
    