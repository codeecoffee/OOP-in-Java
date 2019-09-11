//Fellipe Ferreira Lopes
//CS202 Assignment 4-5
/*
    This file contains the Main function in java. this is a
    stand alone function. The Import Scanner allows us to input
    info in Java.


 */
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //List obj = new List(); syntax by Karla
        //String smt= "CS202" or String smt= new String("CS202")
        //inData.readLine();
        BST list = new BST(); //Creates the obj of CLL
        Scanner sc= new Scanner (System.in); //Input part
        int decision = 0;
        do
        {

            System.out.println("Main Menu");
            System.out.println("What do you wanna do?");
            System.out.println("1- Add new vendor");
            System.out.println("2- Display all vendors");
            System.out.println("3- Remove all vendors");
            System.out.println("4- EXIT");

            decision = sc.nextInt();

            switch (decision)
            {
                case 1: //add
                {
                    list.add();
                    break;
                }
                case 2: //Display all
                {
                    list.display();
                    break;
                }
                case 3: //Remove all
                {
                    list.remove_all();
                    break;
                }
                case 4: //Exit
                {
                    System.out.println("Exiting...");
                    break;
                }
                default:
                    break;
            }

        }while(decision!= 4);
    }
}
