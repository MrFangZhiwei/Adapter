package reponsibility;

/**
 * @Title: Adapter
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 11:08
 * @version:1.0
 */
public class JangXi extends AbstractAction
{
    public static String type = "江西";

    @Override
    public void todo(String type)
    {
        if (JangXi.type.equals(type))
        {
            System.out.println("我是江西处理中心,我只处理江西业务");
        } else
        {
            Action action=this.getAction();
            if(action!=null){
                action.todo(type);
            }else {
                super.todo(type);
            }
        }

    }
}