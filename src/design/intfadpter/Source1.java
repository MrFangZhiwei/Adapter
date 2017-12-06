package design.intfadpter;

/**
 * @Title: Adapter
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 10:01
 * @version:1.0
 */
public class Source1 extends Wrapper
{
    @Override
    public void method1()
    {
        System.out.println("123");
    }

    @Override
    public void method2()
    {
        System.out.println("123");
    }
}