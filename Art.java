/*
        Fellipe Ferreira Lopes
        CS 202 - Assignment 4-5

        This file contains the implementation of a class derived from Vendor
 */
public class Art extends Vendor //derive the class from Vendor
{
    protected String specific_art;
    protected String area_needed;

    //default constructor
    public Art() //default constructor
    {
        super();//calls de default constructor from the base class
        specific_art= "none";
        area_needed= "none";

        System.out.println("Check your input. The obj is empty");
    }
    //overloaded constructor
    public Art(String nome, String tipo, String art, String area)//overloaded constructor
    {
        super(nome, tipo); //calls overloaded constructor
        specific_art= art;
        area_needed= area;
    }
    //copy constructor
    public Art(final Art arte)//copy constructor
    {
        super(arte);
        specific_art= arte.specific_art;
        area_needed= arte.area_needed;
    }
    //display function
    public void display() // shows info about the art taking place --OK
    {
        super.display();
        System.out.println(this.specific_art+ "\n" + this.area_needed);
    }
}
