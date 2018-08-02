package cn.Reflex;

public class Book {

    private String bookname;
    public  String bookage ;
    protected String  booktype;
    char aa;

    public Book(){
        System.out.println("我是图书+无参构造");
    }

    {
        System.out.println("我是图书+13年份+普通方法");
    }

    static {
        System.out.println("我是图书+历史+静态方法");
    }

    private double getsum(double a){
        System.out.println("11111111");
        return 50.00;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookage() {
        return bookage;
    }

    public void setBookage(String bookage) {
        this.bookage = bookage;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public char getAa() {
        return aa;
    }

    public void setAa(char aa) {
        this.aa = aa;
    }

}
