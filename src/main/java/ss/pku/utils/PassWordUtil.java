package ss.pku.utils;

public class PassWordUtil {

    static String regex_number = "[\\p{Digit}]+";// 数字
    static String regex_lower = "[\\p{Lower}]+";// 小写字母
    static String regex_upper = "[\\p{Upper}]+";// 大写字母
    static String regex_char = "[\\p{Punct}]+";// 特殊字符

    public static boolean matchesPass(String user_username,String user_password){
        if(user_password==null){
            //校验失败，密码不符合要求，密码不为空；
            return false;
        }

        if(user_password==user_username){
            //校验失败，密码不符合要求，密码和用户名不能相同；
            return false;
        }

        if(user_password.length()<8){
            //校验失败，密码不符合要求，长度至少为8；
            return false;
        }

        if (user_password.matches(regex_number)
                || user_password.matches(regex_upper)
                || user_password.matches(regex_lower)
                || user_password.matches(regex_char)) {
            //校验失败，密码不符合要求，大写+小写+数字+字符（至少包含2种）;
            return false;
        }
        return true;
    }
}
