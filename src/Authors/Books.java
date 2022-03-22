package Authors;

public class Books{
String title;
Authors author;
int numPages;

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

