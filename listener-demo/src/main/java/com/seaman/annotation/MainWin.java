package com.seaman.annotation;

import com.seaman.annotation.annotations.ListenerAnnotation;
import com.seaman.annotation.annotations.ListenerAnnotationPrecess;
import com.seaman.annotation.listener.CancelListener;
import com.seaman.annotation.listener.OkListener;

import javax.swing.*;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-01-25 10:13
 * 功能描述:
 * 修改历史:
 */
public class MainWin {
    private JFrame mainWin = new JFrame("使用注解绑定事件监听器");

    @ListenerAnnotation(listener = OkListener.class)
    private JButton ok = new JButton("ok");

    @ListenerAnnotation(listener = CancelListener.class)
    private JButton cancel = new JButton("cancel");

    public void init() {
        JPanel jp = new JPanel();
        jp.add(ok);
        jp.add(cancel);
        mainWin.add(jp);

        ListenerAnnotationPrecess.precess(this);

        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.pack();
        mainWin.setVisible(true);
    }
}
