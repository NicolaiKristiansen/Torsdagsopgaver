package Task1;

public class Customer {
    private String firstname;
    private String lastname;
    private String username;
    private int id;
    private static int counter = 1;

    Customer(String firstname, String lastname, String username){
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.id = counter;
        counter++;
    }

    public String getFirstName(){
        return this.firstname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String getUsername(){
        return this.username;
    }

    public int getId(){
        return this.id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString(){
        return "Firstname: " + firstname + "- Lastname: "
                + lastname + "- ID: " + id;
    }
}
