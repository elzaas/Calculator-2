package com.example.demo1;
import javafx.fxml.FXML;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    Calculator calc = new Calculator();

    @FXML
    private TextField textField2;

    // Обработка нажатия кнопки "1"
    @FXML
    private void onClickBut1() {
        String val = textField2.getText();
        val = val + "1"; // Добавляем "1" к текущему значению
        textField2.setText(val); // Устанавливаем новое значение
    }

    // Обработка нажатия кнопки "2"
    @FXML
    private void onClickBut2() {
        String val = textField2.getText();
        val = val + "2"; // Добавляем "2"
        textField2.setText(val);
    }

    // Обработка нажатия кнопки "3"
    @FXML
    private void onClickBut3() {
        String val = textField2.getText();
        val = val + "3"; // Добавляем "3"
        textField2.setText(val);
    }

    // Обработка нажатия кнопки "4"
    @FXML
    private void onClickBut4() {
        String val = textField2.getText();
        val = val + "4"; // Добавляем "4"
        textField2.setText(val);
    }

    // Обработка нажатия кнопки "5"
    @FXML
    private void onClickBut5() {
        String val = textField2.getText();
        val = val + "5"; // Добавляем "5"
        textField2.setText(val);
    }

    // Обработка нажатия кнопки "6"
    @FXML
    private void onClickBut6() {
        String val = textField2.getText();
        val = val + "6"; // Добавляем "6"
        textField2.setText(val);
    }

    // Обработка нажатия кнопки "7"
    @FXML
    private void onClickBut7() {
        String val = textField2.getText();
        val = val + "7"; // Добавляем "7"
        textField2.setText(val);
    }

    // Обработка нажатия кнопки "8"
    @FXML
    private void onClickBut8() {
        String val = textField2.getText();
        val = val + "8"; // Добавляем "8"
        textField2.setText(val);
    }

    // Обработка нажатия кнопки "9"
    @FXML
    private void onClickBut9() {
        String val = textField2.getText();
        val = val + "9"; // Добавляем "9"
        textField2.setText(val);
    }

    // Обработка нажатия кнопки "0"
    @FXML
    private void onClickBut0() {
        String val = textField2.getText();
        val = val + "0"; // Добавляем "0"
        textField2.setText(val);
    }

    // Обработка нажатия кнопки "-"
    @FXML
    private void onMinusClick() {
        String op1 = textField2.getText();
        textField2.setText(""); // Очищаем текстовое поле
        calc.setOp1(Double.parseDouble(op1)); // Устанавливаем первое операнд
        calc.setOperator('-'); // Устанавливаем оператор
    }

    // Обработка нажатия кнопки "/"
    @FXML
    private void onDivideClick() {
        String op1 = textField2.getText();
        String op2Str = textField2.getText(); // Получаем текст второго операнда

        // Очищаем текстовое поле
        textField2.setText("");

        // Устанавливаем первое значение
        calc.setOp1(Double.parseDouble(op1));
        calc.setOperator('/'); // Устанавливаем оператор
    }

    // Обработка нажатия кнопки "*"
    @FXML
    private void onMultipClick() {
        String op1 = textField2.getText();
        textField2.setText(""); // Очищаем текстовое поле
        calc.setOp1(Double.parseDouble(op1)); // Устанавливаем первое операнд
        calc.setOperator('*'); // Устанавливаем оператор
    }

    // Обработка нажатия кнопки "+"
    @FXML
    private void onPlusClick() {
        String op1 = textField2.getText();
        textField2.setText(""); // Очищаем текстовое поле
        calc.setOp1(Double.parseDouble(op1)); // Устанавливаем первое операнд
        calc.setOperator('+'); // Устанавливаем оператор
    }

    // Обработка нажатия кнопки "="
    @FXML
    private void onEqualClick() {
        String op2 = textField2.getText();
        calc.setOp2(Double.parseDouble(op2)); // Устанавливаем второе значение

        // Проверка на деление на ноль
        if (calc.getOperator() == '/' && calc.getOp2() == 0) {
            textField2.setText("Error: Division by Zero"); // Выводим ошибку
        } else {
            calc.calculate(); // Выполняем вычисление
            textField2.setText("" + calc.getResult()); // Отображаем результат
        }
    }

    // Обработка нажатия кнопки сброса
    @FXML
    private void onResetClick() {
        textField2.setText(""); // Очищаем текстовое поле
    }
}
