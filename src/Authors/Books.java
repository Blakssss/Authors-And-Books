package Authors;

public class Books{
private String title;
private Authors author;
private int numPages;

   Books(String title, Authors author){
       this.title=title;
       this.author=author;
    }

    public String getTitle() {
        return title;
    }

    public Authors getAuthor(){
        return author;
    }

    public int getNumPages() {
        return numPages;
    }

}

