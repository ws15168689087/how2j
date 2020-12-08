package how2j;

import java.util.ArrayList;
import java.util.List;

public class 多线程破解密码 {
    public static void main(String[] args) {
        char[]c=new char[3];
        for(int i=0;i<3;i++)
        {
            c[i]=(char)((Math.random()*26+65));  //生成三个随机数;
        }
        String answer=""+c[0]+c[1]+c[2];
        //System.out.println(answer);
        List<String>password=new ArrayList<>();

        Thread t1=new Thread(){                //破解线程
            public void run()
            {
                char[]m1=new char[3];
                boolean flag=false;
                for(char i='A';i<='Z';i++)
                {
                    m1[0]=i;
                    for(char j='A';j<='Z';j++)
                    {
                        m1[1]=j;
                        for(char k='A';k<='Z';k++)
                        {
                            m1[2]=k;
                            String ps=""+m1[0]+m1[1]+m1[2];
                            password.add(ps);
                            if(ps.equals(answer))
                            {
                                flag=true;
                                System.out.println("find the password!");
                                break;
                            }
                        }
                        if(flag)
                            break;
                    }if(flag)
                        break;
                }
            }
        };

        Thread t2=new Thread()    //线程加值;
        {
            public void run()
            {
                while(true)
                {
                    if(password.isEmpty())
                    {
                        System.out.println("the password is empty!");
                        Thread.yield();
                    }
                    else
                    {
                        System.out.println("password:"+password.remove(0));
                    }

                }
            }
        };
        t1.start();
        t2.setDaemon(true);
        t2.start();
    }
}
