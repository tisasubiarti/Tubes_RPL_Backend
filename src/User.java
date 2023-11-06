import java.util.ArrayList;
import java.util.List;
public class User {
    private String nama;
    private String email;
    private String username;
    private String password;

    public User(String nama, String email, String username, String password) {
        this.nama = nama;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public static void Register(List<User> users, String nama, String email, String username, String password ){
        User newUser = new User(nama, email, username, password);
        users.add(newUser);
        System.out.println("User " + username + " has been registered.");
    }



    public void login() {
        // Check database if user any give back response true
        Boolean user = false;

        if(user){
            Boolean checkPassword = false;
            // Get role from databse
            String  role = "user";
            // First one if to check the password if that password is not same on database give back response 400
            if(!checkPassword) {
            } else {
                // Give back to the resposne json {"role": "user" || "admin", "accessToken": "ASDLASKDASLDKASLDKASL"}

            }
        } else {
            // Check database if user empty give back response false with status code 400
        }
    }

    public void logout() {
        System.out.println("User " + username + " logged out.");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
