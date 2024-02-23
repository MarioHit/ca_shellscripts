import java.util.Stack;

public class Eau02 {
    public static void main(String[] args) {

        if(args.length > 0) {
           for(int i= args.length-1;i>0 ; i--) {
               System.out.println(args[i]);
               System.out.println("-"+i+" - ");
           }

            String[] args2 = args;
            Stack<String> stack = new Stack<>();
            for ( String s : args2) {
                stack.push(s);
            }

            while(!stack.empty()) {
                String arg = stack.pop();
                System.out.println(arg);
            }

        } else {
            System.out.println("Erreur argument");
        }
    }
}
