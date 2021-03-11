package com.thread.demo13_WaitAndNotifyFurther;

/**
 * @author Christine
 * @date 2020-06-15 9:11
 */
public class BaoZiPu extends Thread {
    private BaoZi baoZi;
    //带参构造方法
    public BaoZiPu(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count =0;
        while (true){
           synchronized (baoZi){
                if (baoZi.flag == true){
                   //有包子就不用生产
                   try {
                       baoZi.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
                if (count%2==0){
                    baoZi.pi = "薄皮";
                    baoZi.xian="三鲜馅";
                }else{
                    baoZi.pi = "冰皮";
                    baoZi.xian = "牛肉大葱馅";
                }
                count++;
                System.out.println("包子铺正在生产" + baoZi.pi+baoZi.xian + "的包子");
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               //生产完包子唤醒顾客吃包子,修改包子的状态
                baoZi.flag = true;
                baoZi.notify();
                System.out.println("包子铺就已经生产好了包子，顾客可以开始吃了");
               }
       }
    }
}
