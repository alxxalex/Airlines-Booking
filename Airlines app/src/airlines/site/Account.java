package airlines.site;

/* @author radoi alexandru*/
public class Account {

    String username, password, email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return username + "," + password + "," + email;
    }

}
