
import java.util.*;
import java.util.LinkedList;
public class Helloworld{


    public static void main (String args[]){
        System.out.println("Hello World");
        int[] array = new int[5]; // Array Initialization
        int[][] array2d = new int[5][6];  //2D Array initializetion
        int temp = 1;
        int r = array2d.length;
        int c = array2d[3].length; // Because Row has columns. Row[0]-> [1|2|3|4|5]
        for (int i=0; i<r ; i++){
            for (int j=0; j<c; j++){
                array2d[i][j] = temp;
                temp += 1;
            }
        }
        for (int i=0; i<r ; i++){  // Row wise access
    
            for (int j=0; j<c; j++){   // B Because Row has columns. Row[0]-> [1|2|3|4|5]
                System.out.print(array2d[i][j]+"  ");
            }
            System.out.println();
        }



        //Matrix from User Input (Scanner)
        Scanner sc = new Scanner(System.in); //

        System.out.println("Enter No. of Rows");
        int row = sc.nextInt();

        System.out.println("Enter No. of Columns");
        int col = sc.nextInt();

        int[][] arrayMatrix = new int[row][col];  //2D Array initializetion
        System.out.println("Start entering nos for the matrix");

        for (int i=0; i<arrayMatrix.length ; i++){
            for (int j=0; j<arrayMatrix[0].length; j++){
                arrayMatrix[i][j] = sc.nextInt();
                
            }
        }
        for (int i=0; i<arrayMatrix.length ; i++){
    
            for (int j=0; j<arrayMatrix[0].length; j++){
                System.out.print(arrayMatrix[i][j]+"  ");
            }
            System.out.println();
        }


        
        //Variable Initialization
        int num = 10;
        char myChar = 'S';

        //Array Initialization types
        char[] charArray = new char[] {'a','b', 'c'};
        String[] stringArray = new String[] {"Sanj" , "ana", "nakhwa"};
        boolean firstName = true;
        String myName = "Sanjana Nakhwa";

        LinkedList <String> ll = new LinkedList<String>(); // LinkedList Initialization
        ArrayList <String> al = new ArrayList<String>(); //Array list Initialization (Always go for arraylist rather than Ll)

        al.add("ghi");
        al.add("jkl");
        System.out.println(al);

        ll.add("abc");
        ll.add("pqe");
        System.out.println(ll);

        for (int i = 0 ; i<5 ; i++){
            array[i] = num;
            num += 10;
        }
        int[] array2 = {1,2,3,4,5};
        int[] array3 = new int[] {100,200,300};
        
        for (int i : array3){

            System.out.println(i);

        }

        if (firstName == true){
            System.out.println(myName.split(" ")[0]);
        }
        else{
            System.out.println(myName.split(" ")[1]);

        }
    }
}

