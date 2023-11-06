public class Manager extends User {
    public Manager(String nama, String email, String username, String password) {
        super(nama, email, username, password);
    }

    public String getUserType(){
        return "Manager";
    }
}
