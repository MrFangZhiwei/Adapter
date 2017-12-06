package design.classadapter;

/**
 * @Title: Adapter
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 9:18
 * @version:1.0
 */
public class Test
{
    public static void main(String[] args)
    {
        AdapterInft intf=new AdapterInftImpl();
        intf.method1();
        intf.method2();
    }
}