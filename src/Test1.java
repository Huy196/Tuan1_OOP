public class Test1 {
    public static void main(String[] args) {

        int radius = 6;
        double pi = 3.14;
        int area;
//        Ví dụ 1
//        if (radius >= 0){
//            area = radius * radius * pi;
//            System.out.println("The area for the circle  radius " + radius + " is " + area);
//        }else {
//            System.out.println("Sai rồi cu");
//        }
        if (radius % 2 == 0 ){
            System.out.println("Số " +radius+ " Là số chẵn");
        }else {
            System.out.println(  "Số " +radius +" Là số lẻ");
        }

    }
}
