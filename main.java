import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String phrase = keyboard.nextLine();

        for(int i = 0; i < phrase.length(); i++){
            String letter = phrase.substring(i,i+1);
            System.out.println(letter);
        }

        keyboard.close();
    }
}