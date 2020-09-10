package ru.mirea.pract01_var3;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("Война и мир","Л. Толстой", 153);
        Book b2 = new Book("Евгений Онегин", "А. Пушкин", 195);
        Book b3 = new Book("Три товарища", "Э. Ремарк");
        b3.setAge(84);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


    }
}
