import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {
                7, -3, 9, -11, 18, 99, 2, 11
        };
        //Максимальный и минимальный элемент массива
        minAndMaxElems(nums);

        //Элементы массива, больше впереди стоящих элементов
        nextElemMore(nums);

        //Положительные и отрицательные элементы в массиве
        posAndNeg(nums);

        //Четные элементы массива
        evenElems(nums);

        //Все элементы массива, кроме первого и последнего
        allElemsExceptFirstAndLast(nums);

        //Вторая половина массива
        secondHalf(nums);

        //Первая половина массива
        firstHalf(nums);

        //Первые три элемента массива
        firstThreeElems(nums);

        //Последние три элемента массива
        lastThreeElems(nums);

        //Инициализация первого массива из случайных чисел размером заданное с консоли.
        //Создание второго массива из четных чисел первого массива
        evenElemsOfFirstArray();

        //Инициализация массива из случайных чисел в диапазоне [-15; 15]
        //Вывод максимального элемента из созданного массива и его индекс
        maxElemOfRandomArray();
    }

    public static void minAndMaxElems(int[] nums) {
        System.out.println("Изначальный массив: " + Arrays.toString(nums));
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.format("Максимальный элемента массива: %s\n"
                + "Минимальный элемент массива: %s", max, min);
    }

    public static void nextElemMore(int[] nums) {
        System.out.println("Изначальный массив: " + Arrays.toString(nums));
        System.out.print("Элементы, больше впереди стоящих элементов: ");
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                System.out.print(nums[i]);
                if (i != nums.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }

    public static void posAndNeg(int[] nums) {
        int positiveCount = 0;
        int negativeCount = 0;
        System.out.println("Изначальный массив: " + Arrays.toString(nums));
        for (int num : nums) {
            if (num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
        System.out.format("Число положительных элементов: %s\n"
                        + "Число отрицательных элементов: %s",
                positiveCount,
                negativeCount);
    }

    public static void evenElems(int[] nums) {
        System.out.println("Изначальный массив: " + Arrays.toString(nums));
        System.out.print("Четные элементы массива: ");
        for (int i = 1; i < nums.length; i += 2) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void allElemsExceptFirstAndLast(int[] nums) {
        System.out.println("Изначальный массив: " + Arrays.toString(nums));
        System.out.print("Элементы массива, кроме первого и последнего: ");
        for (int i = 1; i < nums.length - 1; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 2) {
                System.out.print(", ");
            }
        }
    }

    public static void firstHalf(int[] nums) {
        System.out.println("Изначальный массив: " + Arrays.toString(nums));
        System.out.print("Элементы первой половины массива: ");
        int half = nums.length / 2;
        for (int i = 0; i < half; i++) {
            System.out.print(nums[i]);
            if (i != half - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void secondHalf(int[] nums) {
        System.out.println("Изначальный массив: " + Arrays.toString(nums));
        System.out.print("Элементы второй половины массива: ");
        int half = nums.length / 2;
        for (int i = half; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void firstThreeElems(int[] nums) {
        System.out.println("Изначальный массив: " + Arrays.toString(nums));
        System.out.print("Первые три элемента массива: ");
        int count = 3;
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i]);
            if (i != count - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void lastThreeElems(int[] nums) {
        System.out.println("Изначальный массив: " + Arrays.toString(nums));
        System.out.print("Последние три элемента массива: ");
        int count = 3;
        for (int i = nums.length - count; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void evenElemsOfFirstArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива (натуральное число больше трех): ");
        int size = scanner.nextInt();

        while (size < 3) {
            System.out.print("Неверное число. Попробуйте еще раз: ");
            size = scanner.nextInt();
        }

        int[] first = new int[size];
        for (int i = 0; i < first.length; i++) {
            first[i] = (int) (Math.random() * (size + 1));
        }
        System.out.println("Массив из случайных чисел:" + Arrays.toString(first));
        ArrayList<Integer> second = new ArrayList<>();
        for (int number : first) {
            if (number % 2 == 0) {
                second.add(number);
            }
        }
        System.out.println(second);
    }

    public static void maxElemOfRandomArray() {
        int[] numbers = new int[12];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(16 + 16) - 16;
        }
        System.out.println("Массив из случайных чисел:" + Arrays.toString(numbers));

        int maxElem = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxElem) {
                maxElem = numbers[i];
                index = i;
            }
        }
        System.out.format("Максимальный элемент массива: %s\n" +
                "Индекс максимального элемента: %s", maxElem, index);
    }
}