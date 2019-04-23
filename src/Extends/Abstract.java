package Extends;

/**
 * @author luyang
 * @ClassName Abstract
 * @description 〈功能详细描述〉
 * @time 2019/3/150:13
 * @modificationHistory <记录修改历史记录 who where what>
 */
public class Abstract {

    private static int x = 10;

    public void show() {
        final int m = 1;
        class Inner {
            public void show(){
                System.out.println(m);
            }
        }
        new Inner().show();
    }

    public static void main(String[] args) {
        Abstract abs = new Abstract();
        abs.show();

        new Runnable() {
            @Override
            public void run() {
                System.out.println("走起来！");
            }
        }.run();
    }
}
