// class name = file name
public class Hello {
    // main method
    public static void main(String[] args) {
        System.out.println("Hello Java!");
        // primitive types
        int myInt = 10000;
        // calling greet method
        greet();
        // calling greet(String student) method
        greet("Cole");
        // calling add method
        add(10,20);
        // calling OneTo255 method
        OneTo255();
    }

    // Methods (remember: Our main method is static therefore all methods that are called by the main method must also be static)
    public static void greet() {
        System.err.println("Welcome Student!");
    }

    public static void greet(String student){
        System.err.printf("Welcome %s", student);
    }

    public static int add(int i, int j) {
        return i+j;
    }

    public static void OneTo255() {
        for(int i=1;i<=20;i++){
            // practice conditionals
            if(i==10){
                System.out.println("Hey this is 10");
            }
           else if(i%2==0){
                System.out.println("This is " + i);
            }
            else{
                System.out.println("This is Odd");
            }
        }
    }
}
