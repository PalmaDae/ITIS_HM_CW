import java.util.Random;
import java.util.Scanner;


public class Main{
	
	public static void main(String args[]) {
		
		Random random = new Random();
		int numberToGuess = random.nextInt(100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
/* 		boolean b = true;
		
		boolean not_b = false;
		
		System.out.println(b & not_b);
		System.out.println(b | not_b);
		System.out.println(b & !not_b);
		System.out.println(b ^not_b);
		System.out.println("O_O"); */
		
		/* int b1 = 10, c1 = 20, ind = 2, b2 = 5, big = 20;
		
		System.out.println("/ by zero Error");	
		System.out.println((b1 < c1) && (b2 == -99) || (ind >= 0) );
		System.out.println((b1 | c1) & (big ^ b1) );
		System.out.println((b1<<3 + c1<<2) % (b2>>5 / b1>>>2));
		System.out.println("0_0");
		
		int numb1 = 10;
		int numb2 = 1;
		int numb3 = 20;
		int numb30 = 30;
		
		switch(numb1){
			case 1:
				System.out.println("Первое число равно единице");
				break;
			case 30:
				System.out.println("Первое число равно тридцати");
				break;
			default:
				System.out.println("Да я вообще хз что это за число");
		}
		System.out.println("O_O"); */
		
		
/* 		System.out.println("Угадайте число от 1 до 100:");
		
		int userGuess = scanner.nextInt();
		
		while (userGuess != numberToGuess) {
			
			System.out.println(numberToGuess); //Готовый ответ
			
			if (userGuess > numberToGuess){
				System.out.println("Твоё число больше");
			} else{
				System.out.println("Твоё число меньше");
			}
		
			userGuess = scanner.nextInt();	
		}
		
		System.out.println("Ты угадал, чумба");	 */
		
/* 		int a = 5;
		String result = (a>0) ? "Положительное" : "Отрицательное";
		
		System.out.println(result); */
		
/* 		System.out.println("Введите ваше число");
		
		int userNumber = scanner.nextInt();
		
		if (userNumber%2 == 0){
			System.out.println("Число чётное");
		} else {
			System.out.println("Число нечётное");
		}
		 */
/* 		double userNumber1 = scanner.nextDouble();
		double userNumber2 = scanner.nextDouble();
		
		double answer = userNumber1>userNumber2 ? userNumber1 : userNumber2;
		
		System.out.println(answer); */
		
		
/* 		System.out.println("Введите свой балл, целое число");
		
		while (!scanner.hasNextInt()){
			System.out.println("Вы ввели не то");
			System.out.println("Попробуйте снова");
			scanner.next();
		}
		
		int schoolBall = scanner.nextInt();
		
		if (schoolBall >= 0 && schoolBall<=59){
			System.out.println("Неудолетворительно");
		} else if (schoolBall>=60 && schoolBall<=74){
			System.out.println("Удолетворительно");
		} else if (schoolBall>=75 && schoolBall <= 89){
			System.out.println("Хорошо");
		} else if (schoolBall>=90 && schoolBall<=100){
			System.out.println("Отлично");
		} else {
			System.out.println("Чёт ты напутал");
		} */
		
/* 		int sum = 0;
		
		for (int i =1; i<=100; i++){
			sum+=i;
		}
		System.out.println(sum);
		
		int userNumber = scanner.nextInt();
		
		int sumz = 1;
		
		for(int i = 1; i<=userNumber; i++){
			sumz*=i;
		}
		System.out.println(sumz);
		
		
		for (int i = 1; i <= 20; i++){
			if (i%2==0){
				System.out.println(i + " - Чётное");
			}else{
				System.out.println(i + " - Нечётное");
			}
		} */
		/*
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		System.out.println(number1+number2); */
		
	/* 	double number3 = scanner.nextDouble();
		double number4 = scanner.nextDouble();
		
		String truth = (number3==number4) ? "Yes" : "NO";
		
		System.out.println(truth); */
		
		/* double numb1 = scanner.nextDouble();
		double numb2 = scanner.nextDouble();
		
		if (numb1<=numb2){
			numb1=0;
			System.out.println(numb1 + " " + numb2);
		} else{
			System.out.println(numb1 + " " + numb2);
		} */
		
		/* double a,b,c;
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
 
        if (a>=0) {
            double n = a * a;
            System.out.println(n);
        }
		if (b>=0) {
            double y = b * b;
            System.out.println(y);
        }
 
        if (c>=0) {
            double z = c * c;
            System.out.println(z);
        } */
		
		
		/* int num = scanner.nextInt();
		
		int sum = 0;
		
		while (num >0){
			sum += num%10;
			num/=10;
		}
		System.out.println(sum); */
		
		
		/* double a,b,c;
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
		
		if (a>1 && a<3) {
            System.out.println(a);
        }
		if (b>1 && b<3) {
            System.out.println(b);
        }
 
        if (c>1 && c <3) {
            System.out.println(c);
        } */

		/* int k = scanner.nextInt();
		
		for (int i = 2; i<=9; i++){
			int ans = i*k;
			System.out.println(i+"*"+k+"="+ans);	
		} */
	/* 	
 		double a,b,c,d;
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		d = scanner.nextDouble();
				
		
		if (a<=b && b<=c && c<=d){
			System.out.println(""+d+" "+d+" "+d+" "+d);
		} else if (a>b && b>c && c>d){
			System.out.println(""+a+" "+b+" "+c+" "+d);
		}else{
			System.out.println(""+(a*a)+" "+(b*b)+" "+(c*c)+" "+(d*d));
		} */
	/* 	
		double x,y,z;
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		z = scanner.nextDouble();
		double max_numb_prom = Math.max(x,y);
		double max_numb = Math.max(z,max_numb_prom);
		double min_numb_prom = Math.min(x,y);
		double min_numb = Math.min(min_numb_prom,z);
		double mid_numb = max_numb - min_numb;
		if ((x+y)>z){
			System.out.println("Существует");
			if ((max_numb*max_numb)< ((mid_numb*mid_numb)+(min_numb*min_numb))){
				System.out.println("Остроугольный");
			} else{
				System.out.println("Другой");
			}
		} else{
			System.out.println("Не существует");
		}
		 */
		
/* 		double x,y,z;
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		z = scanner.nextDouble();
		
		if (x!=z && z!=y){
			if ((z+x+y)<1){
				if (z<y && z<x){
					z= (y+x)/2;
					System.out.println(""+x+" "+y+" "+z);
				} else if(y<z && y<x){
					y = (z+x)/2;
					System.out.println(""+x+" "+y+" "+z);
				} else if(x<y && x<z){
					x = (z+y)/2;
					System.out.println(""+x+" "+y+" "+z);
				}
			} else{
				if (x<y){
					x = (y+z)/2;
					System.out.println(""+x+" "+y+" "+z);
				} else{
					y = (x+z)/2;
					System.out.println(""+x+" "+y+" "+z);
				}
			}
		}else {
			System.out.println("Числа не попарно различимы");
		} */
		
		
	/* 	double a,b,c;
		
		a = scanner.nextDouble;
		b = scanner.nextDouble;
		c = scanner.nextDouble;
		
		if (a!= 0){
			double D = (b*b)-(4*a*c);
			if (D>0){
				double D2 = Math.sqrt(D);
				double x1 = (-b +D2)/2*a;
				double x2 = (-b -D2)/2*a;
			}else{
				System.out.println("Действительных корней нет");
			}
		}else{
			System.out.println("A равен нулю");
		}
		 */
		
		
/* 		int x;
		x = scanner.nextInt();
		
		if (x>=0){
			System.out.println(Integer.toBinaryString(x));
		}else {
			System.out.println("Число не подходит");
		}
		  */
		
		/* int x;
		x = scanner.nextInt();
		int i = x;
		while(i>=x){
			i =scanner.nextInt();
		}
		System.out.println("Число оказалось меньше");
		 
		 
		*/
		
		/* System.out.print("Введите длину массива: ");
		int length = scanner.nextInt();
		int[] array = new int[length];
		 */
		
	/* 	System.out.println("Введите элементы массива");
		for (int i = 0; i < length; i++){
			array[i] = scanner.nextInt();
		}
		 */
 		/* for (int i =0; i <length; i++){
			array[i] = random.nextInt(100);
		}
		
		for (int i = 0; i <length; i++){
			System.out.println("array[" + (i+1) + "] = " + array[i]);
		}
 		
		for (int arr : array){
			System.out.print(arr);
		} */
		
	/* 	int k = scanner.nextInt();
		
		switch (k){
			case 1:
				System.out.println("плохл");
				break;
			case 2:
				System.out.println("неудол");
				break;
			case 3:
				System.out.println("удол");
				break;
			case 4:
				System.out.println("хорошо");
				break;
			case 5:
				System.out.println("отлично");
				break;
			default:
				System.out.println("ошибка");
				break;
		} */
		
		/* int time = scanner.nextInt();
		
		if (time>=5 && time <12){
			System.out.println("Доброе утро");
		} else if (time >= 12 && time <16){
			System.out.println("Добрый день");
		} else if (time >= 16 && time <20){
			System.out.println("Добрый вечер");
		} else if (time >= 20 && time <24){
			System.out.println("Доброй ночи");
		} else{
			System.out.println("Мне кажется ты чё-то перепутал");
		} */
		
		/* double x = scanner.nextDouble();
		System.out.print("Введите номер действия: ");
		int k = scanner.nextInt();
		
		switch (k){
			case 1:
				System.out.println(x*x);
				break;
			case 2:
				System.out.println(Math.sqrt(x));
				break;
			case 3:
				System.out.println(Math.sin(Math.toRadians(x)));
				break;
			case 4:
				System.out.println(Math.cos(Math.toRadians(x)));
				break;
			default:
				System.out.println("Мне кажется ты что-то перепутал");
				break;
		} */
		
	/* 	String b = scanner.nextLine();
		
		switch (b){
			case "a":
				System.out.println("A");
				break;
			case "b":
				System.out.println("B");
				break;
			case "c":
				System.out.println("C");
				break;
			case "d":
				System.out.println("D");
				break;
			case "e":
				System.out.println("E");
				break;
			case "f":
				System.out.println("F");
				break;
			default:
				System.out.println("Ты чё-то перепутал");
				break;
		} */
		
		
		/* int month = scanner.nextInt();
		if (month>= 1 && month <= 12){
			System.out.println(12-month+1);
		} else{
			System.out.println("Ыааа");
		} */
		
		/* int n, m;
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		
		for (int i = 1; i <=m; i++){
			System.out.println("1".repeat(n));
		} */
	/* 	
		int a,b,x;
		double z;
		a = scanner.nextInt();
		b = scanner.nextInt();
		z = scanner.nextDouble();
		
		x = a%b;
		
		if (x == 0){
			System.out.println("0");
		}else{
			double answ = (z/x);
			System.out.println(answ);
		}  */
		
		/* int sum = 0;
		int z = 0;
		System.out.print("Введите длину массива: ");
		int length = scanner.nextInt();
		int[] array = new int[length];
		
		
		System.out.println("Введите элементы массива");
		for (int i = 0; i < length; i++){
			array[i] = scanner.nextInt();
		}
		
		for (int i = 0; i <length; i++){
			if (array[i]%5==0 && array[i]%7!=0){
				z+=1;
				sum += array[i];
			}
		}
		System.out.println("Число элементов: " +z+" Сумма элементов: " + sum); */
		
		/* double sum = 0;
		System.out.print("Введите длину массива: ");
		int length = scanner.nextInt();
		Double[] array = new Double[length];
		
		System.out.println("Введите элементы массива");
		for (int i = 0; i < length; i++){
			array[i] = scanner.nextDouble();
		}
		
		for (int i =0; i<length; i++){
			if (array[i]>=0){
				sum+=array[i];
			}
		}
		System.out.println(sum*2); */
		
		/* int product = 1;
		
		System.out.print("Введите длину массива: ");
		int length = scanner.nextInt();
		Double[] array = new Double[length];
		
		System.out.println("Введите элементы массива");
		for (int i = 0; i < length; i++){
			array[i] = scanner.nextDouble();
		}
		for (int i = 0; i <length; i++){
			if (array[i]%7==0){
				product*=array[i];
			}
		}
		System.out.println(product); */
		
		/* double a;
		a = scanner.nextDouble();
		
		if (a<2 && a >=-2){
			System.out.println(a*a);
		} else{
			System.out.println(4);
		} */
		/* double a;
		a = scanner.nextDouble();
		
		
		if (a<=2){
			System.out.println(a*a+4*a+5);
		} else{
			System.out.println(1/(a*a+4*a+5));
		} */
		
		/* double a = scanner.nextDouble();
		
		int n = scanner.nextInt();
		
		double x =1;
		
		double y = 0;
		
		System.out.println(Math.pow(a,n));
		
		for (int i = 1; i<=n; i++){
			x*=(a+(i-1));
			System.out.println(x);
		}
		
		double sum = 0;
        double denominator = a;
        for (int i = 1; i <= n; i++) {
            sum += 1 / denominator;
            denominator *= (a + i);
        }
		System.out.println(sum); */
		
		// 7
		
		/* int n = scanner.nextInt();
		int sum = 0;
		if (n>0 && n <=100){
			System.out.println(String.valueOf(n).length());
			int b = n;
			while (b>0){
				sum+= b%10;
				b/=10;
			}
			System.out.println(sum);
			System.out.println(String.valueOf(n).charAt(0));
			if(n>=10){
				System.out.println(String.valueOf(n).charAt(1));
			}else{
				System.out.println("n<10");
			}
		}else{
			System.out.println("Ошибка");
		} */
		
		/* System.out.print("Введите длину массива: ");
		int length = scanner.nextInt();
		int[] array = new int[length];
		
		for (int i = 0; i < length; i++){
			int n = 2;
			array[i] = 1+2;
			int b  = 4;
			array[i+1] = array[i] -b;
		}
		
		
		for (int arr : array){
            System.out.println(arr);
        } */
		
		/* int length = scanner.nextInt();
		double[] array = new double[length];
		
		for (int i = 0; i < length; i ++){
			array[i] = scanner.nextDouble();
		}
		
		for (int i = 0; i < length; i++){
			if (array[i] <0){
				array[i]+=0.5;
			}else{
				array[i] = 0.1;
			}
			System.out.println(array[i]);
		} */
		
		/* int length = scanner.nextInt();
		int[] array = new int[length];
		
		for (int i = 0; i<length; i++){
			if(i%2==0){
				array[i] = (length-4)+(2*i);
			}else{
				array[i] = (-1) *((length-4)+(i*2));
			}
			System.out.println(array[i]);
		} */
		
		/* int age = scanner.nextInt();
		String n = String.valueOf(age);
		String b = "" + n.charAt(n.length()-1);
		int c = Integer.parseInt(b);
		
		if (age>=0&&age<=100){
			if (c == 1){
				System.out.println(n + " год");
			}else if(c>=2 && c<5){
				System.out.println(n + " года");
			}else{
				System.out.println(n + " лет");
			}
		}else{
			System.out.println("Слишком старый");
		} */
		
	/* 	double x = scanner.nextDouble(); */
		
	/* 	if (x<=0){
			System.out.println(0);
		}else if(x>0&&x<=1){
			System.out.println(x);
		}else{
			System.out.println(Math.pow(x,4));
		} */
		
	/* 	if (x<=0){
			System.out.println(0);
		}else if(x>0&&x<=1){
			System.out.println(Math.pow(x,2) - x);
		}else{
			System.out.println(Math.pow(x,2)-Math.sin(Math.PI*x	));
		} */
		
	/* 	
		double PI = 3.141592653589793;
		
		int n,m;
		n = scanner.nextInt();
		m = scanner.nextInt();
		double n_m = n/m;
		double m_n = m/n;
		
		
		if (Math.abs(PI - m/n) < Math.abs(PI - n/m)){
			System.out.println(m*10+" "+n);
		}else{
			System.out.println(m+" "+n*2);
		} */
		
	/* 	int length = scanner.nextInt();
		int[] array = new int[length];
		int n = 0;
		
		for (int i = 0; i < length; i ++){
			array[i] = scanner.nextInt();
		}
		
		
		for (int i = 0; i < length; i++){
			if (String.valueOf(array[i]).length() ==5 || String.valueOf(array[i]).length() ==3 ){
				n+=1;
			}
				
		} 
		System.out.println(n); */
		
		
		
		
		
	}
}