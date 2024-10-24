package com.example.demo1;
public class Calculator {

    private double op1; // Первое оперант
    private double op2; // Второе оперант
    private char operator; // Оператор
    private double result; // Результат вычисления
    private boolean isError; // Флаг ошибки

    // Метод для выполнения вычислений
    public double calculate() {
        this.isError = false; // Сбрасываем флаг ошибки

        // Выполняем вычисление в зависимости от оператора
        if (this.operator == '+') {
            this.result = this.op1 + this.op2; // Сложение
        } else if (this.operator == '-') {
            this.result = this.op1 - this.op2; // Вычитание
        } else if (this.operator == '*') {
            this.result = this.op1 * this.op2; // Умножение
        } else if (this.operator == '/') {
            // Проверяем деление на ноль
            if (this.op2 != 0) {
                this.result = this.op1 / this.op2; // Деление
            } else {
                this.isError = true; // Ошибка: деление на ноль
                this.result = Double.NaN; // Используем NaN для обозначения ошибки
            }
        } else {
            this.isError = true; // Ошибка: неизвестный оператор
            this.result = Double.NaN; // Используем NaN для обозначения ошибки
        }

        // Печатаем результат
        printResult(this.result);
        return this.result; // Возвращаем результат
    }

    // Метод для вывода результата
    private void printResult(double result) {
        // Проверяем, является ли результат целым числом
        if (result % 1 == 0) {
            System.out.println((int) result); // Выводим как int
        } else {
            System.out.println(result); // Выводим как double
        }
    }

    // Геттеры и сеттеры
    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public boolean isError() {
        return isError;
    }

}
