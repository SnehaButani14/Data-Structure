import java.util.Scanner;

public class Temperature36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperatureConverter t1 = new TemperatureConverter();
        System.out.print("Enter choice for celcius or fernhit (1 or 2) : ");
        int choice = sc.nextInt();
        if(choice==1){
            double result = t1.celciusToFernhit();
            System.out.println(result);
        }
        else{
            double result = t1.feranhitToCelsius();
            System.out.println(result);
        }
        }
    }
     class TemperatureConverter{
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        public double celciusToFernhit(){
        System.out.print("Enter celsius: ");
        celsius = sc.nextDouble();
        return (celsius * 9/5) + 32;
        }
        public double feranhitToCelsius(){
        System.out.print("Enter fahrenheit: ");
        fahrenheit = sc.nextDouble();
        return (fahrenheit - 32) * 5/9;
        }
}
