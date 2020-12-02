package inicio;

public class Programa {

	public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 3;

        if(c > a) System.out.println("Si a=2 y c=3, c es mayor que a");

        System.out.println("*******************************************");
        if (a == b)
        {
            System.out.println("Si a=2 y b=2, a y b son iguales");
        }

        System.out.println("*******************************************");
        if (b < c) System.out.println("Si b=2 y c=3, c es mayor que b");
        else System.out.println("Si b=2 y c=3, b es mayor que c");

        System.out.println("*******************************************");
        if (a == c)
        {
            System.out.println("Si a=2 y c=3, a y c son iguales");
        }
        else
        {
            System.out.println("Si a=2 y c=3, a y c son distintos");
        }

        System.out.println("*******************************************");
        if (b != c && b < c)
        {
            System.out.println("-------------------------------------------");
            System.out.println("Si b=2 y c=3, b y c son distintos");
            System.out.println("Si b=2 y c=3, b es menor estricto que c");
            System.out.println("-------------------------------------------");
        }
        else System.out.println("Si b=2 y c=3, b y c son iguales");

        System.out.println("*******************************************");
        if (b != a) System.out.println("Si a=2 y b=2, a y b son distintos");
        else
        {
            System.out.println("-------------------------------------------");
            System.out.println("Si a=2 y b=2, a y b son iguales");
            System.out.println("-------------------------------------------");
        }

        System.out.println("*******************************************");
        if (b != c)
        {
            System.out.println("-------------------------------------------");
            System.out.println("Si b=2 y c=3, b y c son distintos");
            System.out.println("-------------------------------------------");
        }
        else
        {
            System.out.println("-------------------------------------------");
            System.out.println("Si b=2 y c=3, b y c son iguales");
            System.out.println("-------------------------------------------");
        }

        System.out.println("*******************************************");
        if (a > b)
        {
            System.out.println("-------------------------------------------");
            System.out.println("Si a=2 y b=2, a es mayor que b");
            System.out.println("-------------------------------------------");
        }else if(a < b)
        {
            System.out.println("-------------------------------------------");
            System.out.println("Si a=2 y b=2, b es mayor que a");
            System.out.println("-------------------------------------------");
        }else
        {
            System.out.println("-------------------------------------------");
            System.out.println("Si a=2 y b=2, a y b son iguales");
            System.out.println("-------------------------------------------");
        }

        System.out.println("*******************************************");
        if (a != c)
        {
            System.out.println("Si a=2 y c=3, a y c son distintos");
            if(a <= c)
            {
                System.out.println("Si a=2 y c=3, a es menor o igual a c");
                if (a < c)
                {
                    System.out.println("Si a=2 y c=3, a es menor estricto que c");
                }else
                {
                    System.out.println("Si a=2 y c=3, a y c son iguales");
                }
            }
            else
            {
                System.out.println("Si a=2 y c=3, a es mayor o igual a c");
            }
        }
        else
        {
            System.out.println("Si a=2 y c=3, a y c son iguales");
        }	}

}
