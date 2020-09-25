package com.bjpowernode.javase.ruanzhu;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static com.bjpowernode.javase.ruanzhu.MyWindow.*;
import static com.bjpowernode.javase.ruanzhu.MyWindow.run;

public class MyDesign extends JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    //设置一个Panel容器面板和Label标签存放背景图片
    private JPanel
            contentPanel = new JPanel();
    private JLabel
            label,
            label2;

    //设置按钮组件
    private JButton
            login = new JButton("登录"),
            password = new JButton(),
            admin = new JButton(),
            registered = new JButton("注册");
            //forgetPassword = new JButton("忘记密码");

    //设置文本框组件
    private JTextField
            admin1 = new JTextField(),
            password1 = new JTextField();

    //设置复选框组件
    //private JCheckBox
            //forgetPassword = new JCheckBox("忘记密码"),
            //rememberPassword = new JCheckBox("记住密码");

    /*
     * 我的设计
     */
    public MyDesign(){

        //初始化各组件
        admin1.setText("账号:");
        password1.setText("密码:");

        //实例化图片
        ImageIcon image1 = new ImageIcon("D://person/street.jpg");
        ImageIcon image2 = new ImageIcon("D://person/1.jpg");

        JLabel backLabel = new JLabel();
        JLabel backLabel2 = new JLabel();
        backLabel.setIcon(image1);
        backLabel2.setIcon(image2);

        label=new JLabel(image1);
        label2 = new JLabel(image2);
        //设置标签大小与位置
        label.setBounds(0, 0,500,350);
        label2.setBounds(0, 0, 501, 350);
        //在LayeredPane最底层上添加两个带图片的标签，并且label2在label上方
        this.getLayeredPane().add(label2,new Integer(Integer.MIN_VALUE));
        this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
        //将内容面板设置为透明，就能够看见添加在LayeredPane上的背景。
        ((JPanel)this.getContentPane()).setOpaque(false);

        /*
         * 添加组件到contentPanel容器中
         * 布局方式为自由布局。
         */
        contentPanel.setLayout(null);
        add(admin1);
        add(password1);
        add(admin);
        add(password);
        add(login);
        //add(rememberAdmin);
        //add(rememberPassword);
        add(registered);
        //add(forgetPassword);

        /*
         * 组件绝对位置
         */
        admin1.setBounds(95,130,60,25);
        password1.setBounds(95,170,60,25);
        admin.setBounds(140, 130, 240, 25);
        password.setBounds(140, 170, 240, 25);
        //rememberAdmin.setBounds(95, 180, 100, 14);
        //rememberPassword.setBounds(315, 180, 100, 14);
        registered.setBounds(95, 225, 90, 20);
        //forgetPassword.setBounds(95, 180, 100, 14);
        login.setBounds(290, 225, 90, 20);



        /*
         * 组件透明化
         */
        admin.setOpaque(false);
        password.setOpaque(false);
        contentPanel.setOpaque(false);
        //rememberAdmin.setOpaque(false);
        //rememberPassword.setOpaque(false);
        getContentPane().add(contentPanel);

        /*
         * 组件边框颜色
         */
        //textSet(admin);
        //textSet(password);
        //rememberAdmin.setBorder(new LineBorder(null, Color.OPAQUE));

        /*
         * 监听事件
         */
        admin.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int c = e.getButton();
                if(c == MouseEvent.BUTTON1 && admin.getText().equals("账号") &&e.getClickCount()==1) {
                    admin.setText(null);
                    password.setText("密码");
                }
            }
        });

        admin1.addCaretListener(new CaretListener(){
            public void caretUpdate(CaretEvent e){

            }
        });

        password.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int c = e.getButton();
                if(c == MouseEvent.BUTTON1 && password.getText().equals("密码") &&e.getClickCount()==1) {
                    password.setText(null);
                    admin.setText("账号");
                }
            }
        });

    }

    /*
     * JTextField文本框设置方法.
     */
    public void textSet(JTextField field) {
        field.setBackground(new Color(255, 255, 255));
        field.setPreferredSize(new Dimension(150, 28));
        MatteBorder border = new MatteBorder(0, 0, 2, 0, new Color(192, 192,
                192));
        field.setBorder(border);
    }

    public static void main(String[] args){
        run(new MyDesign(),500,350);
    }

}


