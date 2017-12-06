package observer;

/**
 * @Title: Adapter
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 15:38
 * @version:1.0
 */
public class Observer2 implements Observer
{

    @Override
    public void notifyme(String msg)
    {
        System.out.println("我是观察者2,我收到消息"+msg);
    }
}