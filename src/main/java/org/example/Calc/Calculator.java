package org.example.Calc;
/*
Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
Не забудьте написать тесты для проверки этого поведения
.*/
public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    /**
     * Метод рассчитывает стоимость со скидкой исходя из:
     * @param purchaseAmount - стоимость товара
     * @param discountAmount - процент скидки
     * @return
     */
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double resultSum = 0;

        if(purchaseAmount <= 0.0 || discountAmount < 0 || discountAmount >= 100) {
            throw new ArithmeticException("Недопустимые входные параметры!");
        }

        resultSum = purchaseAmount * (double) (100. - discountAmount) / 100.;
        return resultSum;
    }
}