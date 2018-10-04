package pers.amber.factory;

/**
 * @Author: Amber
 * @Date: 2018/10/4 16:42
 */
public interface BeanFactory {

    /**
     * 从容器中获取bean对象
     * @param var1
     * @return
     */
    Object getBean(String var1);

    /**
     * 判断容器中是否包含bean对象
     * @param var1
     * @return
     */
    boolean containsBean(String var1);
}
