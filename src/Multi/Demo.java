package Multi;

/**
 * @author luyang
 * @ClassName Demo
 * @description 〈功能详细描述〉
 * @time 2019/3/1317:23
 * @modificationHistory <记录修改历史记录 who where what>
 */
public class Demo {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        Fu fu = new Zi();
        System.out.println(fu.num);
        fu.showNum();

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        out:
        for (int x = 0; x < 3; x++) {
            inner:
            for (int y = 0; y < 4; y++) {
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                break out;
            }
        }

        int x = 3;

       x = show(x);

        System.out.println(x);

    }
        public static int show(int x){
        x = 4;
        return x;
        }

}
