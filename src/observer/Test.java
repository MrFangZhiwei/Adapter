package observer;

/**
 * @Title: Adapter
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 15:39
 * @version:1.0
 */
public class Test
{
    public static void main(String[] args)
    {
        Subject subject=new MySubject();
        Observer ob1=new Observer1();
        Observer ob2=new Observer2();
        subject.add(ob1);
        subject.add(ob2);
        subject.notifyAllObserver();
    }
}