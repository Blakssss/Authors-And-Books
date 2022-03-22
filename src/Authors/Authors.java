package Authors;

public class Authors {
    private String name;
    private char gender;
    private String email;
    private Books[] book;

    Authors(String name, char gender, String email){
        this.name=name;
        this.gender=gender;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public Books[] getBooks() {
        return book;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Books addBook(Books book) {
        return book;
    }

}
