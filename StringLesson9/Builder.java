package StringLesson9;

public class Builder {
    //1)Дано два числа, например 3 и 56, необходимо составить следующие строки:
//3 + 56 = 59
//3 – 56 = -53
//3 * 56 = 168.
//Используем метод StringBuilder.append().
//2)Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
//3)Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
    public static void main(String[] args) {
        StringBuilder sb1 = CalculateOfSumm(3, 56);
        StringBuilder sb2 = CalculateOfSumm(5,34);
        System.out.println(sb1);
        System.out.println(sb2);
    }

    private static StringBuilder CalculateOfSumm(int a, int b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a).append("+").append(b).append("=").append(a + b).append("\n")
                .append(a).append("-").append(b).append("=").append(a - b).append("\n")
                .append(a).append("*").append(b).append("=").append(a * b).append("\n");
        return sb;
    }
}
