package com.company;

import java.util.*;

/*У всіх завданнях написати функцію, що приймає звичайний масив як аргумент і
        повертає динамічний масив зростаючої довжини (див. лістинг 2), як результат. Розмір
        звичайного масиву передається як аргумент. Початковий масив заповнити випадковими
        числами в діапазоні від –50 до +50. Додати в масив-результат суму і середнє арифметичне за
        абсолютною величиною
        Варіант 5.
        Поділити всі непарні числа на середнє арифметичне за абсолютною величиною.*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Уведіть довжину масива: ");
        int length = sc.nextInt();
        System.out.println(createRandomArray(length).toString());
    }

    public static ArrayList<Double> createRandomArray(int arrayLength) {
        Double[] array1 = new Double[arrayLength];
        double sum = 0;
        double avg;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (Math.random() * 100 - 50);
            sum += array1[i];
        }
        avg = sum / arrayLength;

        System.out.println(Arrays.toString(array1));

        System.out.println("*/Сума: " + sum);
        System.out.println("*/Середнє арифметичне: " + avg);


        System.out.println("\n\t***Динамічний масив***\t");
        ArrayList<Double> result = new ArrayList<>(ArrayToListConversion(array1));

        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) % 2 != 0){
                System.out.println(">Число " + result.get(i) + " замінено на ");
                result.set(i, result.get(i) / avg);
                System.out.print(result.get(i) / avg + "\n");
                System.out.println("---\n");
            }
        }
        result.add(sum);
        result.add(avg);
        return result;
    }

    public static <T> List<T> ArrayToListConversion(T[] arr)
    {
        return Arrays.asList(arr);
    }
}
