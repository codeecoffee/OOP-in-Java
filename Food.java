/*
Fellipe Ferreira Lopes
CS 202 - Assignment 4-5

This file contains the implementation of a derived class from vendor
 */

public class Food extends Vendor //Class derives from vendor
{
    protected String food_offered;
    protected float food_cost;
    //defaulr constructor
    public Food()//default constructor
    {
        super();//calls the default constructor from vendor
        food_offered= "none";
        food_cost= 0;
        System.out.println("no value entered. Correct your input");
    }
    //overloaded constructor
    public Food(String nome, String tipo, String comida, float valor)//overloaded constructor
    {
        super(nome, tipo);//derivation list
        food_offered= comida;
        food_cost= valor;
    }
    //copy constructor
    public Food(final Food comida)//copy constructor
    {
        super(comida);//calls the copy constructor from Vendor
        food_offered= comida.food_offered;
        food_cost= comida.food_cost;
    }
    //display function
    public void display() //displays info about the food vendor --OK
    {
        super.display();
        System.out.println(this.food_offered + "\n"+ this.food_cost);
    }
}
