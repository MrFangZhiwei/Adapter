package strategy;

/**
 * @Title: Adapter
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 10:57
 * @version:1.0
 */
public abstract class AbstractAction implements Action
{
    public Action action;
    @Override
    public void todo()
    {
        System.out.println("我是你爸爸");
    }

    public Action getAction()
    {
        return action;
    }

    public void setAction(Action action)
    {
        this.action = action;
    }
}