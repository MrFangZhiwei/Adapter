package reponsibility;

/**
 * @Title: Adapter
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 11:08
 * @version:1.0
 */
public class GuangDong extends AbstractAction
{
    public static String type = "广东";

    @Override
    public void todo(String type)
    {
        if (GuangDong.type.equals(type))
        {
            System.out.println("我是广东处理中心,我只处理广东业务");
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