package reponsibility;

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
        HuNan huNan=new HuNan();
        HuBei huBei = new HuBei();
        JangXi jiangxi = new JangXi();
        GuangDong guangDong = new GuangDong();

        huNan.setAction(huBei);
        huBei.setAction(jiangxi);
        jiangxi.setAction(guangDong);
        //如果处理不了交给他爹取处理
        guangDong.setAction(null);
        huNan.todo("湖南");
    }
}