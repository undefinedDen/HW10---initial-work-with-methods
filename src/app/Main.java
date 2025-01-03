package app;

public class Main {
    public static void main(String[] args) {

    }
    private static int calculateSquareNum(int num) {
        return num * num;
    }

    private static double calculateCylinderVolume(double radius, double high) {
        return radius * high;
    }

    private static int calculateArraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
        //TODO сделать запрос на длину масива а потом и на ввод||
    }

    private static String turnTheRowOver(String row) {
        //coздаём объект StringBuilder с именем inverting и передаём в него значение  row
        StringBuilder inverting = new StringBuilder(row);
        //переворачиваем строку с помощью метода reverse() который встроен в StringBuilder
        inverting.reverse();
        // возвращаем значение row обратно в строковое
        String invertedRow = inverting.toString();
        return invertedRow;
    }

    private static int raiseToAPower(int a, int b) {
        int res = (int) Math.pow(a, b);
        return res;
    }

    private static void repeatText(int a, String text) {
        int count = 0;
        while (count < a) {
            count++;
            System.out.println(count + ") " + text);
        }
    }

}
