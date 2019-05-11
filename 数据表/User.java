public class User {

    private Long Id;  //主键

    private String name;  // 真名
    
    private String username;  // 用户名
    
    private String password;  // 密码

    private Long role; // 角色

    private String email;  // 邮箱

    private String phone; //手机号码

    private Date birthday; // 生日

    private Long headPortrait; //头像

    private Date createTime; //注册时间

    private Date lastLogin; //最后登录时间

    private int status;  // 状态： 未激活：0   已激活：1    禁用：2

}