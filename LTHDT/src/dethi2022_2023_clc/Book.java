package dethi2022_2023_clc;

public class Book {
    private String name ;
    Author[] authors ;
    private  double price ;
    private int qty = 0 ;

    public String getName() {
        return name;
    }
    public Book()
    {
        name = null ;
        Author[] authors = null ;
        price = 0.0 ;
    }
//    public Book(String name , Author[] authors , double price )
//    {
//        this.name = name ;
//        this.authors = authors ;
//        this.price = price;
//    }
    public Book (String name , Author[] authors , double price , int qty)
    {
        this.name = name ;
        this.authors = authors ;
        this.price = price;
        this.qty = qty ;
    }
    public Author[] getAuthors(){
        return authors ;
    }
    public double getPrice(){
        return price ;
    }
    public void setPrice(double price) {
        this.price = price ;
    }
    public int getQty() {
        return qty ;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String authorsString = "";
        for (int i = 0; i < authors.length; i++) {
            authorsString.concat("[name:" + authors[i].getName() + ",email=" + authors[i].getEmail() + ",gender=" + authors[i].getGender() + "]");
            if (i < authors.length - 1) {
                authorsString.concat(",");
            }
        }
        return "Book[name=" + name + ",authors={Author" + authorsString + "},price=" + price + ",qty=" + qty + "]";
    }
//    public String getAuthorNames()
//    {
//        String[] temp = {"authorName1" , "authorName2"};
//        for (String s : temp){
//            System.out.println(s);
//        }
//        return null ;
//    }
    public String getAuthorNames() {
        String authorNames = "";
        for (int i = 0; i < authors.length; i++) {
            authorNames.concat(authors[i].getName());
            if (i < authors.length - 1) {
                authorNames.concat(",");
            }
        }
        return authorNames;
    }
    public Book dauSachLonNhat(Book[] list)
    {
        if (list.length == 0 ) {
            return  null ;
        }
        Book max = list[0] ;
        for (Book q: list){
            if(max.getQty() < q.getQty())
                max = q;
        }
        return max;
    }

    public static void main(String[] args) {
       Book[] oop = new Book[5];
       Author[] oop1 = new Author[1];
       oop1 = new Author[]{new Author("a", "abc", '1')};
       oop[0] = new Book("A" , oop1 , 2.1 , 133515);
       oop[1] = new Book("B" , oop1 , 2.1 , 123);
       oop[2] = new Book("C" , oop1 , 2.1 , 13515);
       oop[3] = new Book("C" , oop1 , 2.1 , 13515);
       oop[4] = new Book("C" , oop1 , 2.1 , 13515);
       Book abc = new Book() ;
       abc = abc.dauSachLonNhat(oop) ;
        System.out.println(abc);
    }
}
