package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author luyang
 * @ClassName ThreadDemo
 * @description 〈功能详细描述〉
 * @time 2019/3/1510:38
 * @modificationHistory <记录修改历史记录 who where what>
 */
public class ThreadDemo {

    public static void main(String[] args) {
        TaskDemo td = new TaskDemo();
        ExecutorService pool = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            pool.execute(td);
        }

        System.out.println(29<<0);
        pool.shutdown();
    }


}
