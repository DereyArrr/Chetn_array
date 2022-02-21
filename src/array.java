public class array {
    public static void main(String[] args) {
        //создаем начальный массив и заполняем его рандомными числами от 0 до 5
        int k = 10;
        int[] myArray = new int[k];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = ((int) (Math.random() * 20));
            System.out.print(myArray[i]);//выводим начальный массив
            System.out.print(" ");
        }

//находим кол-во эл-ов нового массива
        int T = 0;//счетчик кол-ва эл-ов нового массива
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                T++;
            }
        }
        System.out.print("; T=");
        System.out.print(T);
        System.out.print("; ");

//создаем новый массив
        int[] array = new int[T];
        int index = 0;//счетчик для определения места в массиве, на которое поставим эл-т
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                array[index] = myArray[i];
                index++;
                System.out.print(myArray[i]);//выводим массив
                System.out.print(" ");
            }

        }
    }
}
