package design.objectadapter;

/**
 * @Title: Adapter
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/12/6 9:13
 * @version:1.0
 */
public interface AdapterInft
{
    void method1();

    void method2();

    /**
     * @Title: 该类是以前的老版本,是第一版本功能
     * @Description:
     * @Company:www.keyonecn.com
     * @author:fzw
     * @date:2017/12/6 9:10
     * @version:1.0
     */
    class Source
    {
        public void method1(){
            System.out.println("我是被适配的类method方法");
        }
    }
}
