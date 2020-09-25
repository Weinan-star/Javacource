package com.bjpowernode.javase.ruanzhu;

    /*
     * 我的窗体配置
     * com.jlong.myWindow.java
     */
    import javax.swing.JFrame;
    import javax.swing.SwingUtilities;

public class MyWindow {
    public static void
    run(final JFrame f, final int width, final int height){
        SwingUtilities.invokeLater(new Runnable(){

            public void run(){


                //标题栏图标
                //f.setIconImage(new ImageIcon("e:/JavaWS/52b1443632f42/QQ.png").getImage());
                //标题
                //f.setTitle(f.getClass().getSimpleName());
                f.setTitle("myDesign");
                //窗口退出行为
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //设置窗口大小不可变
                f.setResizable(false);
                //设置窗口打开居中
                f.setLocationRelativeTo(null);
                //窗口大小
                f.setSize(width, height);
                //展示窗口
                f.setVisible(true);
            }
        });
    }

}


