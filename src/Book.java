public class Book implements Printable{
    String name;
    String author;
    public void print(){}
    public void printBooks(Printable[] p){
        System.out.println("Книга: " + name + ", автор: " + author);
    }
}
