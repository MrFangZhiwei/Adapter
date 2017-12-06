package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title:
 * @Description:观察者模式用于订阅群发
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 15:29
 * @version:1.0
 */
public abstract class AbstractObserver implements Subject
{
    List<Observer> obLists=new ArrayList<Observer>();
    public void add(Observer o)
    {
        obLists.add(o);
    }

    @Override
    public void notifyAllObserver()
    {
        if(obLists.size()<=0)
            return;
        for (Observer obList : obLists)
        {
            obList.notifyme("有内容更新请及时查阅");
        }
    }
}