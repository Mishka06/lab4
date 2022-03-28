

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size = input.nextInt();
        int [] mas1 = new int[size];
        for (int i = 0; i < size; i++) {
            mas1[i] = input.nextInt();
        }
        int sr = 0;
        for (int i = 0; i < size; i++) {
            sr += mas1[i];
        }
        sr/=size;
        System.out.println("Среднее:"+sr);

        int min = mas1[0];
        for(int i=0;i<size;i++){
            if (min>mas1[i]){
                min=mas1[i];
            }
        }
        System.out.println("Минимальное значение:"+min);
        int sum = sr -min;
        System.out.println("Сумма ср и минимального значения:"+sum);

    }
}