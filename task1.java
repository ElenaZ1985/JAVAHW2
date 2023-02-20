/**
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */

 исключение java  import.io.IOException;
java import.util.Массивы;
java import.util.Случайный;
java import.util.logging.Обработчик файлов;
java import.util.logging.Регистратор;
java import.util.logging.SimpleFormatter;

задача  1 открытый класс  {

    int static public[] randomArr() {
        рандомный  = новый  случайный();
        arr  int[] = новый  int[10];
        для (int  i = 0; i < arr.length; i++) {
            arr[i] = ранд.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        возвращение arr ;
    }

    int  static  public[] bblsrt(int  arr[]) вызывает исключение IOException  {
        loger Logger = Logger.getLogger(task1.class.getName());
        fHandler  FileHandler = новый  обработчик файлов ("Task1.txt ");
        sFormatter  SimpleFormatter = новый  SimpleFormatter();
        fHandler.setFormatter(форматирование);
        loger.AddHandler(fHandler);

        temp int;
        для (int  i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length - 1; j++) {
                если (arr[j] <arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = темп;
                }
            }

            loger.info (Arrays.toString(arr));
        }
        возвращение arr ;

    }

    вывести  пустую  статическую  общедоступную (int[] arr) {
        для (int  i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    main  void  static  public(строка[] аргументы) вызывает исключение IOException  {

        печать(bblsrt(randomArr()));
    }

}
