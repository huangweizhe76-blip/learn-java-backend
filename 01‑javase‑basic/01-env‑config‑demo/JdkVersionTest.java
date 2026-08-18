public class JdkVersionTest {
    public static void main(String[] args) {
        System.out.println("JDK版本:" + System.getProperty("java.version"));
        System.out.println("JDK供应商:" + System.getProperty("java.vendor"));
        System.out.println("项目运行路径:" + System.getProperty("user.dir"));
    }
}