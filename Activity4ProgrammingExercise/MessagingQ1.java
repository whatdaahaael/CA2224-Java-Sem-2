/*
 * Question 1:
 * Develop a message abstract class which contains playMessage
 * abstract method. Write a different subclasses like
 * TextMessage, VoiceMessage and FaxMessage classes for implementing
 * the playMessage method.
 *
 *
 * 242BCA16
 * Sujan
 */

package Activity4ProgrammingExercise;

abstract class Mes{
    abstract void playMessage(String s);
}

class TextMessage extends Mes{
    @Override
    void playMessage(String s) {
        System.out.println("Text Message:\n"+s);
    }
}
class VoiceMessage extends Mes{
    @Override
    void playMessage(String s) {
        System.out.println("Voice Message:\n"+s);
    }
}
class FaxMessage extends Mes{
    @Override
    void playMessage(String s) {
        System.out.println("Fax Message:\n"+s);
    }
}
public class MessagingQ1 {
    public static void main(String args[]) {
        TextMessage tm=new TextMessage();
        VoiceMessage vm=new VoiceMessage();
        FaxMessage fm=new FaxMessage();
        tm.playMessage("Hi!");
        vm.playMessage("Hello!");
        fm.playMessage("World");
    }
}
