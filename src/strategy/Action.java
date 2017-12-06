package strategy;

/**
 * @Title: 策略模式用来避免长的if else用来横向扩展
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 10:55
 * @version:1.0
 */
public interface Action
{

    void todo();

    boolean isMyJob(String type);
}
