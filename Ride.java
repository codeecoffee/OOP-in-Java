/*
Fellipe Ferreira Lopes
CS 202 - Assignment 4-5

This file contains the implementation of a class derived from Vendor
 */
public class Ride extends Vendor //Derived from Vendor
{
    protected String dimensions;
    protected int minimum_age;

    //default constructor
    public Ride()
    {
        super();
        dimensions= null;
        minimum_age= 0;
    }
    //overloaded constructor
    public Ride(String nome, String tipo, String dimencoes, int idade)
    {
        super(nome, tipo);
        dimensions = dimencoes;
        minimum_age= idade;
    }
    //copy constructor
    public Ride(final Ride diversao)
    {
        super(diversao);
        dimensions= diversao.dimensions;
        minimum_age= diversao.minimum_age;
    }
    //display function
    public void display()
    {
        super.display();
        System.out.println(this.dimensions + this.minimum_age);
    }
}
