import java.util.Scanner;

public class project11 {

	public static void main(String[] args) {
		// 7.35 ÓÎÏ·£º²Â×Ö´ÊÓÎÏ·
		String[] words = {"write", "that", "program", "java", "software", "system", "project", "chess"};
        Scanner input = new Scanner(System.in);
        char c;
        do{
            int missCount = 0;
            int t = (int) (Math.random() * (words.length));
            String str = words[t];
            String m = "";
            for (int i = 0; i < str.length(); i++)
                m += '*';
            while(str.compareTo(m) != 0){
                System.out.print("(Guess) Enter a letter in word " + m + " > ");
                char letter = input.next().charAt(0);
                if(str.indexOf(letter) != -1){
                    if(m.indexOf(letter) != -1)
                        System.out.println("    " + letter + " is already in the word");
                    else{
                        String alter = "";
                        for (int i = 0; i < str.length(); i++) {
                            if (str.charAt(i) == letter)
                                alter += letter;
                            else
                                alter += m.charAt(i);
                        }
                        m = alter;
                    }
                }else {
                    System.out.println("    " + letter + " is not in the word");
                    missCount++;
                }
            }
            System.out.println("The word is " + str + ". " +
                    "You missed " + missCount + " time" + ((missCount > 1) ? 's' : ""));
            System.out.print("Do you want to guess another word? Enter y or n > ");
            c = input.next().charAt(0);
        }while(c == 'y');
    }
}
