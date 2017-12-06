package observer;

/**
 * @Title: 主题
 * @Description:
 * 主题改变的时候就要通知观察者
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 15:18
 * @version:1.0
 */

public interface Subject
{
    void add(Observer o);
    void notifyAllObserver();
}