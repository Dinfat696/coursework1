public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Иванов Иван Иванович1", 1, 1000);
        Employee employee2 = new Employee("Иванов Иван Иванович2", 1, 2000);
        Employee employee3 = new Employee("Иванов Иван Иванович3", 2, 3000);
        Employee employee4 = new Employee("Иванов Иван Иванович4", 2, 4000);
        Employee employee5 = new Employee("Иванов Иван Иванович5", 3, 5000);
        Employee employee6 = new Employee("Иванов Иван Иванович6", 3, 6000);
        Employee employee7 = new Employee("Иванов Иван Иванович7", 4, 7000);
        Employee employee8 = new Employee("Иванов Иван Иванович8", 4, 8000);
        Employee employee9 = new Employee("Иванов Иван Иванович9", 5, 9000);
        Employee employee10 = new Employee("Иванов Иван Иванович10", 5, 10000);

        EmployeeManagement.addEmployee(employee1);
        EmployeeManagement.addEmployee(employee2);
        EmployeeManagement.addEmployee(employee3);
        EmployeeManagement.addEmployee(employee4);
        EmployeeManagement.addEmployee(employee5);
        EmployeeManagement.addEmployee(employee6);
        EmployeeManagement.addEmployee(employee7);
        EmployeeManagement.addEmployee(employee8);
        EmployeeManagement.addEmployee(employee9);
        EmployeeManagement.addEmployee(employee10);



        EmployeeManagement.printAllEmployees(); // выводим всех сотрудников
        System.out.println("Cумма затрат на зарплаты.: " + EmployeeManagement.calculateMonthlySalaryCost()); // считаем сумму затрат на зарплаты
        System.out.println("Сотрудник с минимальной зарплатой: " + EmployeeManagement.findEmployeeWithMinSalary().toString()); // находим сотрудника с минимальной зарплатой
        System.out.println("Сотрудник с максимальной зарплатой:: " + EmployeeManagement.findEmployeeWithMaxSalary().toString()); // находим сотрудника с максимальной зарплатой
        System.out.println("Средняя зарпалата: " + EmployeeManagement.calculateAverageSalary()); // считаем среднее значение зарплат
        EmployeeManagement.printAllEmployeeNames(); // выводим Ф.И.О. всех сотрудников

    }


}

