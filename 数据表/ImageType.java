public class ImagesType {

    private Long Id;        //主键

    private String name;    // 图片分类名称 头像 插图  二维码
    
    private int widthLimit;   // 限制长 pixel

    private int heightLimit;  // 限制高 pixel
    
    private double sizeLimit;    //  限制大小    
    
    private Date createTime; //创建时间

    private int status;  // 状态： 未激活：0   已激活：1    禁用：2

}