package how2j;

public class class1 {     //todo 一个偶数线程，一个奇数线程
    public static void main(String[] args) {
    Thread t1=new Thread()
    {
        public  void run()
        {

                try{
                    Thread.sleep(100);
                    for(int i=2;i<=100;i=i+2)
                        System.out.println(i);
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }


        }
    };
    t1.start();
    try{
        t1.join();
    }catch(InterruptedException e)
    {
        e.printStackTrace();
    }
    Thread t2=new Thread()
    {
        public void run()
        {

                try{
                    Thread.sleep(100);
                    for(int i=1;i<=99;i=i+2)
                        System.out.println(i);
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }


    };
    t2.start();
    }
}
