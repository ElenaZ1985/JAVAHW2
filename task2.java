/**
 * К калькулятору из предыдущего дз добавить логирование.
 */

 java import.util.Сканер;
 исключение java  import.io.IOException;
 java import.util.logging.Обработчик файлов;
 java import.util.logging.Уровень;
 java import.util.logging.Регистратор;
 java import.util.logging.SimpleFormatter;
 
 публичный класс task2   {
     main  void  static  public(строка[] аргументы) вызывает исключение IOException  { 
         число  1 двойное = 0;
         число  двойных 2 = 0;
         loger Logger = Logger.getLogger(task2.class.getName());
         fHandler  FileHandler = новый  обработчик файлов ("task2.txt ", верно);
         sFormatter  SimpleFormatter = новый  SimpleFormatter();
         fHandler.setFormatter(форматирование);
         loger.AddHandler(fHandler);
 
         сканирующий  сканер = новый  сканер (System.in );
         попробуй {
         System.out.print("Введите первое число: "); 
         num1 = scan.nextDouble (); 
         loger.info("Первое введенное число: " + String.valueOf(num1)); 
 }поймать (исключение  e) { 
             loger.log(Уровень.СУРОВЫЙ,
                     "не верный ввод первого числа", e);
         }
         
         попробуй {
         System.out.print("Введите второе число: "); 
         num2 = scan.nextDouble ();
         loger.info("Второе введенное число: " + String.valueOf(num2)); 
 }поймать (исключение  e) { 
             loger.log(Уровень.СУРОВЫЙ,
                     "не верный ввод второго числа", e);
         }      
         
         
         Сканер  scan1 = новый  сканер(System.in );
         System.out.print("Введите операцию: ");
         строка операции  = scan1.nextLine(); 
         loger.info("Операция: " + operation); 
        
         переключатель (операция){
             "+" случай:
                 System.out.println(num1 + " + " + num2 + " = " + (num1+ num2)); 
                 loger.info("Результат: " + (num1+num2)); 
                 перерыв;
             "-" дело:
                 System.out.println(num1 + " - " +num2 + " = " + (num1-num2));
                 loger.info("Результат: " + (num1-num2));
                 перерыв;
             "*" дело:
                 System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                 loger.info("Результат: " + (num1*num2));
                 перерыв;
             "/" дело:
                 System.out.println(num1 + " / " + num2 + " = " + (num1/ num2));
                 loger.info("Результат: " + (num1/num2));
                 перерыв;
             По умолчанию:
                 System.out.println("нет такой операции :(");
                 loger.info("нет такой операции : " + operation);
                 
         }
    }    
 } 
