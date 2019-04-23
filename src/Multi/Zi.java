package Multi;

/**
 * @author luyang
 * @ClassName Zi
 * @description 〈功能详细描述〉
 * @time 2019/3/1317:22
 * @modificationHistory <记录修改历史记录 who where what>
 */
public class Zi extends Fu{
    int num = 20;

    @Override
    public void showNum() {
        super.showNum();
        System.out.println("子类方法"+num);
    }
}
