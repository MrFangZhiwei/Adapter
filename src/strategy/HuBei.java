package strategy;

/**
 * @Title: Adapter
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 11:08
 * @version:1.0
 */
public class HuBei extends AbstractAction
{
    public static String type = "湖北";
    @Override
    public void todo()
    {
        System.out.println("我是湖北处理中心,我只处理湖北业务");
    }

    @Override
    public boolean isMyJob(String type)
    {
        return HuBei.type.equals(type);
    }
    //@Override
    //public void todo(String type)
    //{
    //    if (HuBei.type.equals(type))
    //    {
    //        System.out.println("我是湖北处理中心,我只处理湖北业务");
    //    } else
    //    {
    //        Action action=this.getAction();
    //        if(action!=null){
    //            action.todo(type);
    //        }else {
    //            super.todo(type);
    //        }
    //    }
    //
    //}
}