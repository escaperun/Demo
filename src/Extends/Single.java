package Extends;

/**
 * @author luyang
 * @ClassName Single
 * @description 〈功能详细描述〉
 * @time 2019/3/1422:35
 * @modificationHistory <记录修改历史记录 who where what>
 */
public class Single {

    private static Single single = new Single();

    private Single(){}

    public static Single getInstance(Single single){
        return single;
    }
}
