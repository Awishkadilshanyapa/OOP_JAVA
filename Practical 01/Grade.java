
package grade;

public class Grade {
    public static void main(String[] args)
    {
        char grade='A';
        switch(grade)
        {
            case 'A':
                System.out.print("Excellent");
                break;

            case 'D':
                System.out.print("You Passed");

            case 'F':
                System.out.print("Better Try Again");
                break;

            default:
                System.out.print("Invalid Grade");

        }System.out.print("\n");

        System.out.print("Your Grade is " +grade);
    }
}