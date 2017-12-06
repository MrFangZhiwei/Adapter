package strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: Adapter
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 10:55
 * @version:1.0
 */
public class Test
{
    public static void main(String[] args)
    {
        String type="湖南";
        HuNan huNan=new HuNan();
        HuBei huBei = new HuBei();
        JangXi jiangxi = new JangXi();
        GuangDong guangDong = new GuangDong();

        //List<Action> lists = new ArrayList<Action>();
        //lists.add(huNan);
        //lists.add(huBei);
        //lists.add(jiangxi);
        //lists.add(guangDong);
        //for (Action action : lists)
        //{
        //       if (action.isMyJob(type)){
        //           action.todo();
        //           break;
        //       }
        //}
        Map map=new HashMap();
        map.put("湖南",huNan);
        map.put("湖北",huBei);
        map.put("江西",jiangxi);
        map.put("广东",guangDong);
        Action action = (Action) map.get(type);
        action.todo();
        //huNan.setAction(huBei);
        //huBei.setAction(jiangxi);
        //jiangxi.setAction(guangDong);
        ////如果处理不了交给他爹取处理
        //guangDong.setAction(null);
        //huNan.todo("湖南");

    }
}