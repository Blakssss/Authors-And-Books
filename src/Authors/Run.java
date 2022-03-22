package Authors;


public class Run {
    public static void main(String[] args) {
        System.out.println("AUTHORS AND BOOKS:\n");
        Authors author1 = new Authors("JK Rowling",'F',"Matti.b@gmail.com");
        Authors author2 = new Authors("J. R. R. Tolkien",'M',"HisWifesEmail@gmail.com");
        Books firstBook = new Books("Harry Potter 1", author1);
        Books secondBook = new Books("Harry Potter 2",author1);
        Books firstBookJR = new Books("The Fellowship of the Ring",author2);
        author1.addBook(secondBook);
        System.out.println(author1.getName() + "         " + author1.getGender() + "   " + author1.getEmail());
        firstBook.numPages=223;
        System.out.println("    " + firstBook.title + "                       " + firstBook.numPages);
        System.out.println(author2.getName() + "   " + author2.getGender() + "    " + author2.getEmail());
        firstBookJR.numPages=423;
        System.out.println("    " + firstBookJR.title + "           " + firstBookJR.getNumPages());


        System.out.println("\n");
        System.out.println(firstBook.title + firstBook.author.getName()+firstBook.author.getGender()+firstBook.author.getEmail());
        System.out.println(firstBook.getTitle()+firstBook.getAuthor().getEmail());
        author1.setEmail("mattimatti@gmail.com");
        System.out.println(author1.getEmail());
        System.out.println(firstBook.getNumPages());

    }
}
