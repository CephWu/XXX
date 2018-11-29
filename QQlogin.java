import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

public class QQlogin extends JFrame {


    public   QQlogin(){
        initComponent();
    }

    private void initComponent(){
        setTitle("Login");




        //上部图片
        URL image=QQlogin.class.getClassLoader().getResource("qq4.jpg");
        JLabel imageLogo=new JLabel(new ImageIcon(image) );
        add(imageLogo,BorderLayout.NORTH);



        //QQ号与密码
        //账号
        JPanel jp=new JPanel();
        JPanel jpAccount=new JPanel();
        URL image1=QQlogin.class.getClassLoader().getResource("qq5.jpg");    //假装是头像的图片
        JLabel imageLogo1=new JLabel(new ImageIcon(image1) );
        jpAccount.add(imageLogo1,BorderLayout.WEST);
        jpAccount.add(new Label("Account"));
        JTextField userTextField=new JTextField(15);
        jpAccount.add(userTextField);
        jpAccount.add(new JButton("Regieter"),BorderLayout.EAST);
        jp.add(jpAccount);

        //密码
        JPanel jppass=new JPanel();
        jppass.add(new Label("Password"));
        JPasswordField passwordField=new JPasswordField(15);
        jppass.add(passwordField);
        jppass.add(new JButton("Forget Password"),BorderLayout.EAST);
        jp.add(jppass);

        //登陆时的状态栏
        JPanel status=new JPanel();
        status.add(new Label("status"));
        JComboBox statuscombobox=new JComboBox();
        statuscombobox.addItem("online");
        statuscombobox.addItem("offline");
        statuscombobox.addItem("busy");
        statuscombobox.addItem("welcome");
        statuscombobox.addItem("invisible");
        status.add(statuscombobox);
        status.add(new JCheckBox("Remember Password"));
        status.add(new JCheckBox("Auto Login"));
        jp.add(status);
        add(jp);

        //底部的按钮
        JPanel buttom=new JPanel();
        buttom.setLayout(new BorderLayout());
        buttom.add(new JButton("option"),BorderLayout.WEST);
        JButton jb=new JButton("login");
        buttom.add(jb,BorderLayout.EAST);
        add(buttom,BorderLayout.SOUTH);



        //设置输入密码用户名正确时登陆
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userTextField.getText().trim().length()==0||passwordField.getText().trim().length()==0){
                    JOptionPane.showMessageDialog(null,"your account and paasword can not be null");
                }else if(userTextField.getText().trim().equals("whr")&&passwordField.getText().trim().equals("123456")){
                    JOptionPane.showMessageDialog(null,"login successfully");
                    Notepad01 np=new Notepad01();
                    /*啊啊啊，这里我不知道怎么把原窗口销毁了，我找不到jp的JFrame.
*/
                }else{
                    JOptionPane.showMessageDialog(null,"account or password iis wrong");
                }

            }
        });




        setSize(420,340);
        setResizable(true);

        //关闭程序
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    //启动
    public static void main(String args[]){

        new QQlogin().setVisible(true);



    }
}
