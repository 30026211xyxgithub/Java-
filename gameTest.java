package test;

import java.awt.EventQueue;  //将来自于基础同位体类和受信任的应用程序类的事件列入队列

public class gameTest {
    public static void main(String[] args) throws InterruptedException {
        
        EventQueue.invokeLater(new Runnable(){   // 创建一个线程  好处:这个方法调用完毕后，它会被销毁
            public void run(){
                try{
                    test frame = new test();
                    frame.setVisible(true);
                    //  Thread thread = new Thread(frame);
                    //  thread.start();
                }
                catch(Exception e1){   // 捕捉异常
                    e1.printStackTrace();
                }
            }
        });
    }
    
}
