import java.rmi.MarshalException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Основной экран приложения */
        try (Scanner scanner = new Scanner(System.in)) {
            /* Сообщение пользователю */
            System.out.println("Введите размер матрицы:");
            /* Получение от пользователя размера матриц */
            int size = scanner.nextInt();

            /* Экземпляр класса Matrix - первая матрица */
            Matrix firstMatrix = new Matrix(size);
            /* Экземпляр класса Matrix - вторая матрица */
            Matrix secondMatrix = new Matrix(size);
            /* Экземпляр класса Matrix */
            Matrix mathMatrix = new Matrix(size);

            /* Сообщение пользователю */
            System.out.println("Первая матрица:\n" + firstMatrix.getMatrix());
            /* Сообщение пользователю */
            System.out.println("Вторая матрица:\n" + secondMatrix.getMatrix());

            /* Сообщение пользователю */
            System.out.println("Ввведите столбец для вывода:");
            /* Получение от пользователя столбца матрицы */
            int column = scanner.nextInt();
            /* Сообщение пользователю */
            System.out.println("Столбец первой матрицы: " + firstMatrix.getColumnMatrix(column));
            /* Сообщение пользователю */
            System.out.println("Столбец второй матрицы: " + secondMatrix.getColumnMatrix(column));

            /* Сообщение пользователю */
            System.out.println("Ввести стороку для вывода:");
            /* Получение от пользователя строки матрицы */
            int row = scanner.nextInt();
            /* Сообщение пользователю */
            System.out.println("Строка первой матрицы: " + firstMatrix.getRowMatrix(row));
            /* Сообщение пользователю */
            System.out.println("Строка второй матрицы: " + secondMatrix.getRowMatrix(row));

            /* Сообщение пользователю */
            System.out.println("Главная диагональ первой матрицы: " + firstMatrix.getMainDiagonalMatrix());
            /* Сообщение пользователю */
            System.out.println("Главная диагональ второй матрицы: " + secondMatrix.getMainDiagonalMatrix());

            /* Сообщение пользователю */
            System.out.println("Боковая диагональ первой матрицы: " + firstMatrix.getSideDiagonalMatrix());
            /* Сообщение пользователю */
            System.out.println("Боковая диагональ второй матрицы: " + secondMatrix.getSideDiagonalMatrix());

            /* Сообщение пользователю */
            System.out.println("Результат сложения матрицы: " + mathMatrix.getSumMatrix(firstMatrix, secondMatrix));
            /* Сообщение пользователю */
            System.out.println("Результат вычитания матрицы: " + mathMatrix.getSubtractionsMatrix(firstMatrix, secondMatrix));
            /* Сообщение пользователю */
            System.out.println("Результат умножения матрицы: " + mathMatrix.getMultiplicationMatrix(firstMatrix, secondMatrix));

        } catch (Exception e) {
            /* Сообщение пользователю */
            System.out.println(e.getMessage());
        }
    }
}
