public class Main {

    public static void main(String[] args) {
        char[] arr = {'w' ,'a' ,'p' ,'q' ,'x' };
        String s = new String(arr);
        System.out.println( "s = " + s);
        System.out.println(s.compareTo(s));

        new Main().printValue();
    }

    static int value = 33;

    private void printValue(){
        int value = 3;
        System.out.println(this.value);
    }

}
