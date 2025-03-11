package ExceptionsCatching;

public class NPEException {
    public static void main(String args[]) {
        String s=null;
        int len;
        try{
            len=s.length();
        } catch (NullPointerException e) {
            System.out.println("Variable not Initialized.\n"+e);
        } finally {
            System.out.println("End");
        }
    }
}
