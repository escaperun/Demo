package Thread;

import java.util.concurrent.TimeUnit;

/**
 * @author luyang
 * @ClassName TaskDemo
 * @description 〈功能详细描述〉
 * @time 2019/3/1616:49
 * @modificationHistory <记录修改历史记录 who where what>
 */
public class TaskDemo implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ""+"is running!");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
