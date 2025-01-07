public class Months {
    public static void main(String[] args) {
        String[] MonthsArr = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        System.out.println("Months of the Year:");

        /*
         * for each is like for each element in this array
         * for (Datatype variable_name:Array)   <---- Syntax of for-each Loop
         * the name of the variable u want to store each array element
         * - Reduces usage of for-i and Simply iterates through the entire array
         */
        int MonthNum = 1; // To track the month number
        for (String MonthName : MonthsArr) {
            // Print each month with its corresponding number
            System.out.println(MonthNum + " : " + MonthName);
            MonthNum++;
        }
    }
}