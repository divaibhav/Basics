import java.util.Arrays;

public class BasicsComponent {
    //executable class -> the class that can run / execute
    // that class must contain main method
    public static void main(String[] args) {
        // args -> its is a string array , because declaration of args is String[]
        // it stores arguments, command line argument
        // command line arguments are values supplied during execution with java ProgramName arguments
        /*
            C:\Users\Vaibhav.Diwan\Desktop>java BasicsComponent // no arguments
            args array length= 0

            C:\Users\Vaibhav.Diwan\Desktop>java BasicsComponent 10 20 30 // three arguments
            args array length= 3
            |10|20|30| --> array args
         */
        System.out.println("args array length= " + args.length);
        //for(initialization; condition; increment or decrement){
        // statements;
        // }

        for (int i = 0; i < args.length; i++) {
            System.out.println("args " + i + " index = " + args[i]);

        }

        // variable declaration
        // type variableName;
        // type -> data type
        int number;
        char gender;
        String name;
        // initializing variable -> by value, by some other variable, by a method call
        // variableName = value / type literals
        number = 10;// 10 is integer literal
        gender = 'M';// 'M' is character literal
        name = "Vaibhav"; //"Vaibhav" string literal

        // declaration and initialization can be combined
        int num1 = 20;
        // initializing by another variable
        int num2 = number; // number is another variable which is initialized
        // initializing by method call
        double squareOfNum1 = Math.pow(num1, 2);
        // this method is going to return one value of type double, that value will be stored in squareOfNum1 variable
        System.out.println("Square of Num1 is = " + squareOfNum1);

        // work on array
        // declaration
        // we are creating a variable of type array
        // how to identify array, by square brackets
        // syntax
        // type[] arrayName; --> type can be any thing, primitive and non-primitive

        int[] arr;
        String[] listArray;
        Math[] mathArray;

        // initializing , by allocating memory with new and providing size of array
            //  syntax -> arrayVariableName = new type[int size]; size is number of elements in array
        //              , by another array
        //              , by method call, which is going to return an array
        arr = new int[10];
        Math[] list = new Math[10];
      for(int element : arr){
          System.out.print( element + ", ");
      }
        System.out.println();
        for (Math math : list) {
            System.out.print(math + ", ");
        }
        int[] brr = demoMethod(10,25,'n');
        System.out.println();
        System.out.println(brr);
        BasicsComponent obj = new BasicsComponent();
        System.out.println("obj = " + obj);

        // printing arrays using Arrays class, static toString method
        System.out.println(Arrays.toString(brr));
    }

    public static int[] demoMethod(int no1, double d1, char gender){
       /* int[] response = new int[5];
        response[0] = 10;
        response[1] = 20;
        response[2] = 30;
        response[3] = 40;
        response[4] = 50;
        return response;*/
        return new int[] {10,20,30,40,50};
    }
}
