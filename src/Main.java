import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


public class Main {

    public static void main(String[] args) throws Exception {
        W1 t1=new W1();
        W2 t2=new W2();
        List l=new ArrayList();
        l.add(t1);
        l.add(t2);
        int sum=0;
        ExecutorService es = Executors.newCachedThreadPool();
        List<Future> list = es.invokeAll(l);
        for(int i=0;i<list.size();i++){
            int a=(int)list.get(i).get();
            sum=a+sum;
            System.out.println(a+"元");
        }
        System.out.println("总计"+sum+"元");
    }
}
