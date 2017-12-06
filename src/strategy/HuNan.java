package strategy;

/**
 * @Title: Adapter
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 11:00
 * @version:1.0
 */
public class HuNan extends AbstractAction
{
    public static String type="湖南";
    @Override
    public void todo()
    {
        System.out.println("我是湖南处理中心,我只处理湖南业务");
    }

    @Override
    public boolean isMyJob(String type)
    {
        return HuNan.type.equals(type);
    }
    //@Override
    //public void todo(String type)
    //{
    //    if(HuNan.type.equals(type)){
    //        System.out.println("我是湖南处理中心,我只处理湖南业务");
    //    }else {
    //        Action action=this.getAction();
    //        if(action!=null){
    //            action.todo(type);
    //        }else {
    //            super.todo(type);
    //        }
    //    }
    //}
}