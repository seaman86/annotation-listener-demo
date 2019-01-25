package com.seaman.annotation.annotations;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-01-25 9:44
 * 功能描述:
 * 修改历史:
 */
public class ListenerAnnotationPrecess {

    public static void precess(Object object) {
        try {
            Class cl = object.getClass();
            //获取全部成员属性
            Field[] fields = cl.getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                //获取属性的ListenerAnnotation注解
                ListenerAnnotation annotation = field.getAnnotation(ListenerAnnotation.class);
                //获取属性对象
                Object fieldObj = field.get(object);

                if (annotation != null && fieldObj != null
                        && fieldObj instanceof AbstractButton) {

                    Class<? extends ActionListener> listenerClass = annotation.listener();
                    ActionListener listener = listenerClass.newInstance();

                    AbstractButton button = (AbstractButton) fieldObj;
                    button.addActionListener(listener);
                }
            }

        } catch (Exception ex) {

        }
    }

}
