import java.util.Scanner;

public class BST //BST class
{
    private Vendor root; //root of the tree


    public void add()
    {
        Scanner sc = new Scanner(System.in); // "#include<iostream>
        Vendor temp;
        String decision;
        String nome;
        System.out.println("What type of vendor do you want to add?");
        System.out.println("Art " + "\n" + "Food ");
        System.out.println("Rides");
        decision = sc.nextLine();

        System.out.println("What is the name of the attraction you are adding?");
        nome = sc.nextLine();

        switch (decision)
        {
            case "Art": //Get info about art vendors
            {
                String arte_tipo;
                String necessario;
                System.out.println("What is the specific Art?");
                arte_tipo = sc.nextLine();

                System.out.println("What is the area needed for it?");
                necessario = sc.nextLine();

                temp = new Art(nome, decision, arte_tipo, necessario);
                break;
            }
            case "Food": //Get info about food vendors
            {
                String comida;
                float preco;

                System.out.println("What type of food is offered?");
                comida = sc.nextLine();

                System.out.println("What is the cost of the food?");
                preco = sc.nextFloat();

                temp = new Food(nome, decision, comida, preco);
                break;
            }
            case "Rides": //Get info about Rides
            {
                String area;
                int idade_minima;

                System.out.println("What are the dimensions of the area needed for this ride?");
                area = sc.nextLine();
                System.out.println("What is the minimum age to ride it ?");
                idade_minima = sc.nextInt();

                temp = new Ride(nome, decision, area, idade_minima);
                break;
            }
            default: //Default case
            {
                temp = null;
                System.out.println("Not today satan!");
                break;

            }
        }
        add(root,temp);//add temp as a new node
        return;
    }
    private void add(Vendor root, Vendor temp)//recursive add function
    {
        if(root == null)
        {
            root= temp;
            root.right= null;
            root.left= null;
            System.out.println("added");
            return;
        }
        else if(root.get_name().compareTo(temp.get_name())< 1) //temp is smaller than root
        {
            add(root.get_left(), temp);
        }
        else //temp is bigger than root
        {
            add(root.get_right(), temp);
        }
        //System.out.println("added");
        return;
    }
    public void display() { display(root);} // calls the recursive display function

    protected void display(Vendor root) //recursive in order display
    {
        if(root == null)
        {
            //System.out.println("Nothing to display at this moment");
            return;
        }
        display(root.get_left()); //recursive call left

        root.display(); //uses the display from the obj

        display(root.get_right()); //recursive call right
    }

    public void remove_all()
    {
        remove_all(root);
    } //recursive remove function call
    protected void remove_all(Vendor root) // recursive remove function
    {
        if(root == null)
            return;
        remove_all(root.get_left()); //function call left

        if(root.get_left() == null && root.get_right() == null)
        {
            root= null; // "deletes" the node
        }

        remove_all(root.get_right());//function call right
    }

}


