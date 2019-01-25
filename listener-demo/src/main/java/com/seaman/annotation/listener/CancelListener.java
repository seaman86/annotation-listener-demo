package com.seaman.annotation.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-01-25 9:37
 * 功能描述:
 * 修改历史:
 */
public class CancelListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "点击cancel！999999999999999999999999999999999");
    }
}
