import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lIndex=-1,oIndex=-1,vIndex=-1,eIndex=-1;
        System.out.println("Please enter little Jhool's message:");
        Scanner sc=new Scanner(System.in);
        String msg=sc.nextLine();
        //Check if msg is alphanumeric
        if (!msg.matches("[a-zA-Z0-9]+")) {
            System.out.println("Invalid message (NOT alphanumeric)");
            return;
        } else {
        //Check msg length
        if(!(msg.length()>=1&&msg.length()<=100)) {
            System.out.println("Invalid msg length");
        return;}
        else
            for (int i=0;i<msg.length();i++)
                if (msg.charAt(i)=='l'){
                    lIndex=i;
                    break;}
            for (int i=lIndex;i<msg.length();i++)
                if (msg.charAt(i)=='o'){
                    oIndex=i;
                    break;}
            for (int i=oIndex;i<msg.length();i++)
                if (msg.charAt(i)=='v'){
                    vIndex=i;
                    break;}
            for (int i=vIndex;i<msg.length();i++)
                if (msg.charAt(i)=='e'){
                    eIndex=i;
                    break;}
        }


        if(lIndex!=-1 && oIndex!=-1 && vIndex!=-1 && eIndex!=-1)
            System.out.println("I love you, too!");
        else System.out.println("Let's breakup!");
    }
}
