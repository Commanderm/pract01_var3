package ru.mirea.pract01_var3;

public class Book {
    private String name;
    private String author;
    private int age;

    public Book(String n, String d, int a){
        name = n;
        author = d;
        age = a;
    }

    public Book(String n, String d){
        name = "Сказка о царе Салтане";
        author = "А. Пушкин";
        age = 0;
    }


    public void setAge(int age){
        this.age = age;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setName(String name){
        this.name = name;
    }



    public String getName(String name){
        return name;
    }
    public String getAuthor(String author){
        return author;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return this.name+ ", автор "+ this.author+ ", страниц - "+ this.age;
    }
}
