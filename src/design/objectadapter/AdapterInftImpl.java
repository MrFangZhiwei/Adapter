package design.objectadapter;

/**
 * @Title: AdapterInftImpl
 * @Description:对象适配
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 9:15
 * @version:1.0
 */
public class AdapterInftImpl implements AdapterInft
{
    Source source;

    public AdapterInftImpl(Source source)
    {
        this.source = source;
    }

    @Override
    public void method1()
    {
        source.method1();
    }

    public void method2()
    {
        System.out.println("第二期的功能扩展,我·要扩展功能");
    }
}