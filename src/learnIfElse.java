import java.util.Scanner;

public class learnIfElse {
    public static void main(String[] args) {

       // grade();
        //discount();
       // signalTraffic();
       // salaryBonus();
       // ticketPrice();
       // environment();
       // login();
        //userRegisValidator();
        //twoFA();
        //carInspection();
        //gameAccess();
//        salaryTax();
        //switch1();
        count(4,7);


        /*
        var score = 99;
        var abs = 4;

        var lulusScore = score >= 78;
        var lulusAbs = abs >= 87;
        var lulusSemua = lulusAbs && lulusScore;

        if (lulusSemua){
            System.out.println("selamat!");
        } else {
            System.out.println("ga selamat");
        }

        if (score >= 90 && abs >=90 ) {
            System.out.println("A");
        } else if (score >= 80 && abs >=80 ) {
            System.out.println("A");
    }
        */

//        int salary = 10000;
//        if(salary > 8000) {
//            salary = salary + 8000;
//        } else {
//            salary = salary + 200;
//        }
//        System.out.println(salary);
//        System.out.println("------");
//        //loops
//

//        for (int i=1; i<=10; i++){
//            System.out.println(i);
//        }
        //print from input
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i=1; i<=n; i++){
//            System.out.print(i+" ");
//        }
        //Discount Calculation System



    }
    public static void discount(){
        int totalAmount = 800;
        double  finalPrice;
        if (totalAmount >= 1000) {
            finalPrice = totalAmount - (totalAmount*10/100.0);
            System.out.println("discounted "+ finalPrice);
        } else if(totalAmount >= 500 && totalAmount <= 999) {
            finalPrice = totalAmount -(totalAmount*5/100.0);
            System.out.println("discounted "+ finalPrice);
        } else {
            System.out.println("no discount");
        }
    }

    public static void grade(){
        int score = 0;
        if (score >= 90 && score <= 100) {
            System.out.println("grade A");
        } else if (score >= 80) {
            System.out.println("grade B");
        } else if (score >= 70) {
            System.out.println("grade C");
        } else if (score >= 60 ) {
            System.out.println("grade D");
        } else if (score <60) {
            System.out.println("fail");
        } else {
            System.out.println("out of range");
        }
    }
    public static void signalTraffic(){
        var lamp ="yellow";
        String traffic ;
        traffic = switch (lamp){
            case "red" : yield "STOP";
            case "yellow" : yield "Ready to move";
            case "green" : yield "GO";
            default : yield "Invalid signal";
        };
        System.out.println(traffic);
    }

    public static void salaryBonus(){
        var type ="Manager";
        String bonus;

        bonus = switch (type.toLowerCase()){
            case "manager" : yield "20% bonus";
            case "developer" : yield "15% bonus";
            case "tester" : yield "10% bonus";
            default : yield "5% bonus";
        };
        System.out.println(bonus);
    }

    static void ticketPrice(){
        int age=17;
        if(age <0){
            System.out.println("Invalid age");
        } else if (age <12 ){
            System.out.println("price is 5000");
        } else if (age <18) {
            System.out.println("price is 7000");
        } else if (age <60) {
            System.out.println("price is 10000");
        } else if (age >= 60) {
            System.out.println("price is 6000");
        }
    }

    static void environment(){
        String env="1";
       String print = switch (env){
            case "1" : yield "Development";
            case "2" : yield "Staging";
            case "3" : yield "Production";
            default : yield "Invalid environment";
        };
        System.out.println(print);
    }

    static void login(){
        String username = "admin";
        String password = "1234";

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("logged in");
        } else {
            System.out.println("access denied");
        }
    }

    static void userRegisValidator(){
        String username = "";
        String password = "123455";
        String confirmPassword = "123456";
        if (username.trim().isEmpty() || username==null) {
            System.out.println("Username required");
        } else if (password.length() <6){
            System.out.println("Password too short");
        } else if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
        } else if (username != null && password.length() >=6 && password == confirmPassword) {
            System.out.println("Registration successful");
        }
    }

    static void twoFA(){
        String username = "admin";
        String password = "1234a12";
        boolean otpVerified = false;
        if(username.equals("admin") && password.equals("1234") && otpVerified == true){
            System.out.println("Access granted");
        } else if(!username.equals("admin") || !password.equals("1234")){
            System.out.println("Invalid credentials");
        } else if (username.equals("admin") && password.equals("1234") && !otpVerified ) {
            System.out.println("OTP verification failed");
        }

    }

    static void carInspection(){
        String vehicle = "peTrol";
        int year = 2018;

        if(vehicle.equalsIgnoreCase("electric") && year >= 2020){
            System.out.println("Pass: EV inspection OK");
        } else if (vehicle.equalsIgnoreCase("petrol") && year < 2020) {
            System.out.println("Pass: Standard inspection OK");
        } else {
            System.out.println("Fail: Requires manual inspection");
        }
    }

    static void gameAccess(){
        int age =13;
        boolean parentalConsent = true;

        if(age >= 18 || (age >= 13 && parentalConsent)){
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }

    static void salaryTax(){
        String employment ="conTRAct";
        double salary = 11000000;
        double taxed = 0;
        if(employment.equalsIgnoreCase("permanent") && salary >= 10000000){
            taxed = salary -(salary*0.15);
           // System.out.println(salary+ ","+"taxed: "+ taxed);
        } else if (employment.equalsIgnoreCase("permanent") && salary < 10000000){
            taxed = salary -(salary*0.10);
         //   System.out.println(salary+ ","+"taxed: "+ taxed);
        } else if (employment.equalsIgnoreCase("contract") && salary >= 10000000){
            taxed = salary -(salary*0.12);
          //  System.out.println(salary+ ","+"taxed: "+ taxed);
        } else if (employment.equalsIgnoreCase("contract") && salary < 10000000){
            taxed = salary -(salary*0.8);
           // System.out.println(salary+ ","+"taxed: "+ taxed);
        }
        System.out.println("employement :" + employment + ",net salary :" + taxed);
    }

    static void switch1(){
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch(day){
            case 1 -> System.out.println("sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("tuesday");
            case 4 -> System.out.println("wednesday");
        }
    }

    static void count(int a, int b){
        int c=a+b;
        System.out.println(c);
    }

}
