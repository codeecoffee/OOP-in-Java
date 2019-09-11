/*
Fellipe Ferreira Lopes
CS202 - Assignment 4-5

This file contains the implementation of the base class Vendor. This
class is going to be the parent class of 3 other classes.
 */

public class Vendor
{
    private String name;
    private String type;
    Vendor right; //right pointer
    Vendor left; //left pointer

    //overloaded constructor
    public Vendor(String name, String type) //overloaded constructor
    {
        this.name= name;
        this.type= type;
        right= null;
        left= null;

    }
    //copy constructor
    public Vendor(final Vendor seller) //copy constructor
    {
        name= seller.name;
        type= seller.type;
        right= seller.right;
        left= seller.left;
    }
    //default constructor
    public Vendor()
    {
        this.name= null;
        this.type= null;
        this.right= null;
        this.left= null;
    }
    //display function
    public void display()
    {
        System.out.println(this.name+ "\n" + this.type + "\n");
    }
    //setter
    public void set_right(Vendor ptr)
    {
        this.right= ptr;
    }
    public void set_left(Vendor ptr)
    {
        this.left= ptr;
    }
    //getter
    public Vendor get_right()
    {
        return this.right;
    }
    public Vendor get_left() {return this.left; }
    //aux getter
    public String get_type(){return type;}
    public String get_name(){return name;}
}
