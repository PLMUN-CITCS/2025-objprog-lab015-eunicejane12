public class VariableScope {

    // Global variable: accessible in both main and showScope methods
    static int globalCount = 100;

    public static void main(String[] args) {
        // Printing the globalCount variable in the main method
        System.out.println("Global Count (from main): " + globalCount);

        // Calling showScope method
        showScope();
    }

    // Method to demonstrate variable scope
    public static void showScope() {
        // Local variable: accessible only within the showScope method
        int localCount = 50;

        // Printing both global and local variables
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
