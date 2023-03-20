package theory.lecture0320;

public class DoWhileSample_14p {
    public static void main(String[] args) {
        char c = 'a';

        do{
            System.out.print(c);
            c = (char)(c+1);
        }while(c <= 'z');
    }
}
