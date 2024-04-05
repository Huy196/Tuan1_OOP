import java.util.Scanner;

public class Dich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc");
        int number = sc.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Vượt giới hạn cho phép !");
        } else if (number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (number < 20) {
            switch (number) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            switch (tens) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            if (ones > 0) {
                System.out.print("-");
                switch (ones) {
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }
            }
        } else {
            int hundreds = number / 100;
            int remainder = number % 100;
            switch (hundreds) {
                case 1:
                    System.out.print("one hundred");
                    break;
                case 2:
                    System.out.print("two hundred");
                    break;
                case 3:
                    System.out.print("three hundred");
                    break;
                case 4:
                    System.out.print("four hundred");
                    break;
                case 5:
                    System.out.print("five hundred");
                    break;
                case 6:
                    System.out.print("six hundred");
                    break;
                case 7:
                    System.out.print("seven hundred");
                    break;
                case 8:
                    System.out.print("eight hundred");
                    break;
                case 9:
                    System.out.print("nine hundred");
                    break;
            }

            if (remainder > 0) {
                System.out.print(" ");
                if (remainder < 10) {
                    switch (remainder) {
                        case 1:
                            System.out.println("one");
                            break;
                        case 2:
                            System.out.println("two");
                            break;
                        case 3:
                            System.out.println("three");
                            break;
                        case 4:
                            System.out.println("four");
                            break;
                        case 5:
                            System.out.println("five");
                            break;
                        case 6:
                            System.out.println("six");
                            break;
                        case 7:
                            System.out.println("seven");
                            break;
                        case 8:
                            System.out.println("eight");
                            break;
                        case 9:
                            System.out.println("nine");
                            break;
                    }
                } else if (remainder < 20) {
                    switch (remainder) {
                        case 10:
                            System.out.println("ten");
                            break;
                        case 11:
                            System.out.println("eleven");
                            break;
                        case 12:
                            System.out.println("twelve");
                            break;
                        case 13:
                            System.out.println("thirteen");
                            break;
                        case 14:
                            System.out.println("fourteen");
                            break;
                        case 15:
                            System.out.println("fifteen");
                            break;
                        case 16:
                            System.out.println("sixteen");
                            break;
                        case 17:
                            System.out.println("seventeen");
                            break;
                        case 18:
                            System.out.println("eightteen");
                            break;
                        case 19:
                            System.out.println("nineteen");
                            break;
                    }
                } else {
                    int tens1 = remainder / 10;
                    int ones1 = remainder % 10;
                    switch (tens1) {
                        case 2:
                            System.out.print("twenty");
                            break;
                        case 3:
                            System.out.print("thirty");
                            break;
                        case 4:
                            System.out.print("forty");
                            break;
                        case 5:
                            System.out.print("fifty");
                            break;
                        case 6:
                            System.out.print("sixty");
                            break;
                        case 7:
                            System.out.print("seventy");
                            break;
                        case 8:
                            System.out.print("eighty");
                            break;
                        case 9:
                            System.out.print("ninety");
                            break;
                    }
                    if (ones1 > 0) {
                        System.out.print("-");
                        switch (ones1) {
                            case 1:
                                System.out.println("one");
                                break;
                            case 2:
                                System.out.println("two");
                                break;
                            case 3:
                                System.out.println("three");
                                break;
                            case 4:
                                System.out.println("four");
                                break;
                            case 5:
                                System.out.println("five");
                                break;
                            case 6:
                                System.out.println("six");
                                break;
                            case 7:
                                System.out.println("seven");
                                break;
                            case 8:
                                System.out.println("eight");
                                break;
                            case 9:
                                System.out.println("nine");
                                break;
                        }
                    }
                }
            }
        }
    }
}
