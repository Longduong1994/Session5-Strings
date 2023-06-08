import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // String
        String string = "Rikkei Academy";
        String string2 = "       Rikkei Academy";
        // Khởi tạo đối tượng
        String str = new String("Rello JV03");
        System.out.println(string);
        System.out.println(str);
        // gọi phương thức changeString
        // dộ dài chuỗi
        System.out.println("Dộ dài của chuỗi là "+string.length());
        System.out.println("kí tự tại vị trí index =5  của chuỗi là "+string.charAt(5));

        String newString = string.concat(" Phạm Hùng      ");
        System.out.println(newString);
        String space = "                                    ";
        System.out.println(space.trim());
        System.out.println("so sánh 2 chuỗi : "+(string.equals(string2)));
        // hiệu của 2 chuỗi
        System.out.println(string.compareTo(str));
        System.out.println(string.startsWith("Rikki"));
        System.out.println(string.contains("i A "));
        String.valueOf(10); // "10"

        String test = "Welcome To Java";
        System.out.println(test.lastIndexOf('o',7));

//        System.out.println("Chuỗi cũ : "+ str);
//        changeString(str);
//        System.out.println("Chuỗi cũ : "+ str);

        //Lớp StringBulder // sửa đổi chuỗi linh hoạt
        StringBuilder stringBuilder    = new StringBuilder(test);
        System.out.println(stringBuilder);
        // append, nối phahanf tử vào cuối chuỗi
        stringBuilder.append(" Java 03");
        // insert : chèn chuỗi vào 1 vị trí bâts kì
        stringBuilder.insert(6 ," inserted ");
        System.out.println(stringBuilder);
        // delete
        stringBuilder.delete(6,16);
        System.out.println(stringBuilder);

//        String pattern = "^[\\w]{10}$"; // độ dài  kí tự từ 10-16
        System.out.println(checkEmail("hung@gmail.com"));

    }
    public  static void changeString(String oldStr){
        oldStr += "Update";
    }
    public static boolean checkEmail(String input){
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return Pattern.matches(regex,input);
//        return regex.matches(input);
    }
}