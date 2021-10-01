public class ImportDemoTest {
    public static void main(String[] args) {
        // Import Importdemo.java file to allow use of methods
        ImportDemo iD = new ImportDemo();
        // call iD(ImportDemo.java file) and specific method (getCurrentDate)
        String currentDate = iD.getCurrentDate();
        // Tell Java to print out method
        System.out.println(currentDate);
    }
}