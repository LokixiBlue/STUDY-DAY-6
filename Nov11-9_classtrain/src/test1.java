import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //录入值
        Scanner sc = new Scanner(System.in);
        System.out.print("输入第一个整数 a：");
        int a = sc.nextInt();
        System.out.print("输入第二个整数 b：");
        int b = sc.nextInt();
        System.out.print("输入第三个整数 c：");
        int c = sc.nextInt();
        //创建一个数组用来装载录入的值
        int[] arr = {a, b, c};
        //冒泡算法
        //arr.length用于读取arr数组的长度
        // arr.length-1：“循环次数是数组长度-1，因为最后一位无需比较，只用比较数组长度-1轮次”
        //外循环用于比较轮次
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环用于每次比较
            //if中的语句代表，数组元素与后一位元素比较，如果比后一位元素大，就用temp变量作为一个空杯子去交换他们的值，最后进入arr数组
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //用num作为变量，将arr中的值循环输出，+空格用于美观
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
