//Aaron Prince Anu
class quadraticFormula
{
    public static void main(String[] args) 
    {
        //initialize vars
        double a = 0;
        double b = 0;
        double c = 0;
        double root1;
        double root2;
        double discriminant;
        boolean end = false; //while loop => on/off switch
        char yn;

        //loop for whole code
        while (end == false) 
        {
            //ask question
            System.out.println("Do you want to solve a quadratic equation? (y/n)");
            yn = In.getChar();

            //decision if-else
            if (yn == 'y') 
            { //run

                //declare a, b, c
                System.out.println("What is your 'a' variable?");
                a = In.getInt();
                System.out.println("What is your 'b' variable?");
                b = In.getInt();
                System.out.println("What is your 'c' variable?");
                c = In.getInt();

                //discriminant

                discriminant = Math.pow(b, 2) - (4 * a * c);

                //math --> root 1
                root1 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);

                //math --> root 2
                root2 = ((- 1 * b) + Math.sqrt(discriminant)) / (2 * a);

                System.out.println("discriminant is " + discriminant);

                /*if statement for discriminant

                 if discriminant is less than 0*/
                if (discriminant < 0) 
                {
                    //make discriminant +ve
                    double iImaginary = Math.sqrt(-discriminant) / (2 * a);

                    //redo root
                    double rootReal = -b / (2 * a);

                    System.out.println("The equation has two complex roots: " + rootReal + " + " + iImaginary + "i and " + rootReal + " - " + iImaginary + "i"); 

                } else 
                {
                    //if discriminant is 0
                    if (discriminant == 0) 
                    {
                        System.out.println("\nYou have one root, your root is " + root1 + ".\nYour discriminant is " + discriminant + "\n");
                    } else 
                    {
                        //if discriminant is greater than 0
                        if (discriminant > 0) 
                        {
                            System.out.println("\nYour roots are " + root1 + " and " + root2 + ".\nYour discriminant is " + discriminant + "\n");
                        }
                    }
                }
            } else 
            { //end
                if (yn == 'n') 
                {
                    System.out.println("\nEnd\n");
                    end = true;
                }
            }
        }
    }
}