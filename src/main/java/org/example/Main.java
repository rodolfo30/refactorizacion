package org.example;

public class Main {
    public static void main(String[] args) {
        // --- PRUEBA EJERCICIO 1 ---
        User testUser = new User("Juan", "Pérez", 30, true);


        ReportGenerator generator = new ReportGenerator();


        System.out.println("Iniciando generación de reporte...");
        generator.generateUserReport(testUser);
        // Al finalizar, deberías ver un archivo llamado "user_report.txt"
        // en la carpeta raíz de tu proyecto.

        // --- PRUEBA EJERCICIO 2 ---
        AccountType premiumType = new AccountType(true);
        Account myAccount = new Account(premiumType, 10);

        System.out.println("Cargos bancarios (Premium): " + myAccount.bankCharge());

        AccountType normalType = new AccountType(false);
        Account normalAccount = new Account(normalType, 10);
        System.out.println("Cargos bancarios (Normal): " + normalAccount.bankCharge());

        // --- PRUEBA EJERCICIO 3 ---
        Sale mySale = new Sale();
        PriceCalculator calculator = new PriceCalculator();

        double finalPrice = calculator.calculateFinalPrice(mySale);
        System.out.println("Precio final calculado: " + finalPrice);

        // --- PRUEBA EJERCICIO 4 ---
        Order myOrder = new Order(100.0);
        OrderService orderService = new OrderService();

        double finalAmount = orderService.calculateFinalAmount(myOrder);
        System.out.println("Monto final del pedido: " + finalAmount);

        // --- PRUEBA EJERCICIO 5 ---
        Character myMage = new Mage(10);
        Character myWarrior = new Warrior(10);
        DamageCalculator damageCalc = new DamageCalculator();

        System.out.println("Daño del Mago: " + damageCalc.calculateDamage(myMage));
        System.out.println("Daño del Guerrero: " + damageCalc.calculateDamage(myWarrior));

        // --- PRUEBA EJERCICIO 6 ---
        TaxService taxService = new TaxService();
        double amount = 1200;

        System.out.println("Impuesto Local para " + amount + ": " + taxService.calculateLocalTax(amount));
        System.out.println("Impuesto Federal para " + amount + ": " + taxService.calculateFederalTax(amount));
    }

}
