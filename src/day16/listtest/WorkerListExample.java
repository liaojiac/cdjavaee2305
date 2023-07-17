package day16.listtest;
import java.util.*;


public class WorkerListExample {
    public static void main(String[] args) {
        // 创建一个List来存储工人信息
        List<Worker> workers = new ArrayList<>();

        // 添加三个工人的信息
        workers.add(new Worker("zhang3", 18, 3000));
        workers.add(new Worker("li4", 25, 3500));
        workers.add(new Worker("wang5", 22, 3200));

        // 在li4之前插入一个工人
        workers.add(1, new Worker("zhao6", 24, 3300));

        // 删除wang5的信息
        workers.removeIf(worker -> worker.getName().equals("wang5"));

        // 利用for循环遍历，打印List中所有工人的信息
        System.out.println("所有工人的信息：");
        for (Worker worker : workers) {
            System.out.println(worker);
        }
        
        // 利用迭代器遍历，对List中所有的工人调用work方法
        System.out.println("使用迭代器遍历：");
        Iterator<Worker> iterator = workers.iterator();
        while (iterator.hasNext()) {
            Worker worker = iterator.next();
            worker.work();
        }
      System.out.println(workers.get(1).equals(workers.get(2)));  
    }
}
