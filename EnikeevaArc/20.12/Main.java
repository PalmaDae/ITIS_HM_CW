import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String city = scanner.nextLine(); 
        // Считываем строку (например, название города) из ввода.

        // int lengthOfCity = city.length(); 
        // Определяем длину строки `city`.

        // if (lengthOfCity % 2 == 0) { 
        // Проверяем, является ли длина строки чётной.
            // System.out.println("Чётное");
        // Если чётное, выводим "Чётное".
        // } else { 
        // Иначе (если длина нечётная) выполняем следующее.
            // System.out.println("Нечётное");
        // Выводим "Нечётное".
        // }

        String word = scanner.nextLine(); 
        // Считываем строку `word` из ввода.

        // int index = scanner.nextInt(); 
        // Считываем целое число (например, индекс символа).

        // char charSecond = word.charAt(1); 
        // Получаем символ строки `word` на позиции 1 (второй символ).

        // char charFourth = word.charAt(3); 
        // Получаем символ строки `word` на позиции 3 (четвёртый символ).

        // System.out.println(charSecond == charFourth); 
        // Проверяем, равны ли второй и четвёртый символы, и выводим результат.

        // char first = word.charAt(0); 
        // Получаем первый символ строки `word`.

        // char last = word.charAt(word.length()-1); 
        // Получаем последний символ строки `word`.

        // System.out.println(first + " " + last); 
        // Выводим первый и последний символы через пробел.

        // int polovina = word.length()/2; 
        // Находим половину длины строки (целочисленное деление).

        // char[] answer = new char[polovina]; 
        // Создаём массив символов длиной в половину строки.

        // word.getChars(0, polovina, answer, 0); 
        // Копируем первые `polovina` символов строки `word` в массив `answer`.

        // System.out.println(answer); 
        // Выводим массив символов (первые `polovina` символов строки).

        // int number = Integer.parseInt(word); 
        // Преобразуем строку `word` в число (если это возможно).

        // int sum = 0; 
        // Инициализируем переменную для суммы цифр числа.

        // int max = Integer.MIN_VALUE; 
        // Инициализируем переменную для максимальной цифры (минимальное значение).

        // for (int i = 0; i <= word.length(); i++) { 
        // Цикл для перебора цифр числа.
            // sum += number%10; 
            // Добавляем последнюю цифру числа к сумме.
            // if (number%10 > max) { 
            // Проверяем, больше ли текущая цифра, чем `max`.
                // max = number%10; 
                // Обновляем максимальную цифру.
            // }
            // number/=10; 
            // Удаляем последнюю цифру числа.
        // }

        // System.out.println(sum); 
        // Выводим сумму цифр числа.

        // System.out.println(max); 
        // Выводим максимальную цифру числа.

        String digits = word.replaceAll("\\D", ""); 
        // Удаляем все нецифровые символы из строки `word` и сохраняем результат.

        System.out.println(digits); 
        // Выводим строку, содержащую только цифры.

        // int count = word.length() - word.replace(".", "").length(); 
        // Считаем количество точек в строке `word`.

        // System.out.println(count); 
        // Выводим количество точек.
		
		
		// Пример использования indexOf:
		// Определяет первое вхождение символа 'a' в строке.
		// String example = "Java programming";
		// int index = example.indexOf('a'); // Находит индекс первого 'a'.
		// System.out.println("Первое вхождение 'a': " + index);

		// Определяет первое вхождение подстроки "prog" в строке.
		// int substringIndex = example.indexOf("prog");
		// System.out.println("Первое вхождение 'prog': " + substringIndex);
		
		
		// Пример использования toCharArray:
		// Преобразует строку в массив символов.
		// String text = "Hello";
		// char[] characters = text.toCharArray(); // Преобразует строку в массив символов.
		// System.out.println("Символы строки:");
		// for (char ch : characters) {
			// System.out.println(ch); // Выводит каждый символ строки.
		// }
		
		// Пример использования isDigit:
		// Проверяет, является ли символ цифрой.
		// char symbol = '5';
		// if (Character.isDigit(symbol)) {
			// System.out.println(symbol + " - это цифра.");
		// } else {
			// System.out.println(symbol + " - это не цифра.");
		// }

		// Проверяет все символы строки, чтобы найти цифры.
		// String mixed = "abc123xyz";
		// for (char ch : mixed.toCharArray()) {
			// if (Character.isDigit(ch)) {
				// System.out.println(ch + " - это цифра.");
			// }
		// }

    }
}
