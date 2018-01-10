import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;

/**
 * @author 赵泽宇  ZhaoZeyu
 * @team 从零开始  zero
 * @date 2018.1.8
 */
public class Worker implements Callable<Integer>{

    int num;
    int money;
    @Override
    public Integer call() throws Exception {
        System.out.println(num+"线程");
        return money;
    }


}
