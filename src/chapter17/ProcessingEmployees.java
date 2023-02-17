package chapter17;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees {
    public static void main(String[] args) {
//        Employee[] employees = {
//                new Employee("Jason", "Red", 5000, "IT"),
//                new Employee("Ashley", "Green", 7600, "IT"),
//                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
//                new Employee("James", "Indigo", 4700.77, "Marketing"),
//                new Employee("Luke", "Indigo", 6200, "IT"),
//                new Employee("Jason", "Blue", 3200, "Sales"),
//                new Employee("Wendy", "Brown", 4236.4, "Marketing")};


        // List<Employee> list = new ArrayList<>( Arrays.asList(employees));

        List<Employee> list = List.of(
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing"));


//        System.out.println("processed employees");
//        list.stream().forEach(System.out::println);


        Predicate<Employee> empl = employee -> (employee.getSalary() >= 4000 && employee.getSalary() <= 6000);
        System.out.println("Employee's salary between $4000 - $6000");
        list.stream()
                .filter(empl)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
        System.out.println("\n");

        //Predicate<Employee> employ = employee -> (employee.getLastName().startsWith("I"));
        System.out.println("Employee's");
        System.out.println(list.stream()
                .filter(empl)
                .findFirst()
                .get());

        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);

        System.out.printf("%nSorted list by last name %n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);

        System.out.printf("%nSorted list by last name in descending order %n");
        list.stream()
                .sorted(lastThenFirst.reversed())
                .forEach(System.out::println);

        System.out.printf("%nUnique employee lastName %n");
        list.stream()
                .map(Employee::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.printf("%n Sorted Employee by last then first name%n");
        list.stream()
                .sorted(lastThenFirst)
                .map(Employee::getName)
                .forEach(System.out::println);

        System.out.printf("%n Employees by department %n");
        Map<String, List<Employee>> groupedByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));
        groupedByDepartment.forEach(
                (department, employeesInDepartment) -> {
                    System.out.printf("%n%s%n", department);
                    employeesInDepartment.forEach(employee -> System.out.printf("     %s%n", employee));
                }
        );
        System.out.printf("%nCount of Employee by Department:%n");
        Map<String, Long> countByDept =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        countByDept.forEach((department, count) -> System.out.printf("%s has %d employee(s) %n", department, count));


        System.out.printf("%nSum of Employees salaries via(Sum Method): %.2f%n",
        list.stream()
                .mapToDouble(Employee::getSalary)
                .sum());

        System.out.printf("%nsum of Employees salaries vai(reduce method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .reduce(0, (value1, value2) -> value1 + value2));
        System.out.printf("%nSum of employees salaries via (reduce method using the unbound instance method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .reduce(0, Double::sum));

        System.out.printf("%nAverage of employees salary: %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .getAsDouble());
    }
}


