public class Factorial {
    public static void main(String args[]) {
        int fact=1, i=1;
        while(i<=10){
            fact*=i;
            System.out.println(i+"! = "+ fact);
            i++;
        }
    }

}
