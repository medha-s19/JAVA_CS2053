class BookDetails
{
public String Title;
public String Author;
public String Publication;
public double rating;
public int NoPages;
public BookDetails(String Title, String Author, String Publication,double rating,int NoPages)
{
this.Title=Title;
this.Author=Author;
this.Publication=Publication;
this.rating=rating;
this.NoPages=NoPages;
}
public void display()
{
System.out.println("Book Title is"+Title);
System.out.println("Publication"+Publication);
System.out.println("Total number of pages:"+NoPages);
System.out.println("Book rating:"+rating);
}
}
public class Book
{
public static void main(String args[])
{
BookDetails book=new BookDetails("Java: The Complete Reference","Herbert Schildt","McGraw",4.5,1312);
book.display();
}
}