package chapter17;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingInvoice {
    public static void main(String[] args) {
        List<Invoice> invoices = List.of(
                new Invoice("83", "electric sander", 7, 57.98),
                new Invoice("24", "power saw", 18, 99.99),
                new Invoice("7","sledge hammer", 11, 21.50),
                new Invoice("77", "Hammer", 76, 11.99),
                new Invoice("39", "Lawn Mower", 3, 79.50),
                new Invoice("68", "Screw Driver", 106, 6.99),
                new Invoice("56", "Jig Saw", 21, 11.00),
                new Invoice("3", "Wrench", 34, 7.50)
        );

        System.out.println("List of part Description");
        invoices.stream()
                .map(Invoice::getPartDescription)
                .sorted()
                .forEach(System.out::println);


        System.out.printf("%nList of price per item%n");
        invoices.stream()
                .map(Invoice::getPricePerItem)
                .sorted().toList()
                .forEach(System.out::println);


//        Map<String, Integer> map = new HashMap<>();
//        System.out.printf("%nInvoices sorted by Quantity and Part Description%n");
//        invoices.stream()
//                .map(i->map.put(i.getPartDescription(), i.getItemQuantity()))
//                .collect(Collectors.toList());
//        System.out.println(map);


        System.out.printf("%nInvoices sorted by Quantity and Part Description%n");
        System.out.println(invoices.stream()
                .collect(Collectors.toMap(Invoice::getPartDescription, Invoice::getItemQuantity)));

        System.out.printf("%nOrder by Invoice Value%n");
        System.out.println(invoices.stream()
                .collect(Collectors.toMap(Invoice::getPartDescription, Invoice::getInvoiceValue)));


        Predicate<Invoice> predicate = x -> (x.getInvoiceValue() >= 200 && x.getInvoiceValue() <= 500);
        System.out.printf("%nInvoices within the range of 200 to 500%n");
        invoices.stream()
                .filter(predicate)
                .sorted(Comparator.comparing(Invoice::getInvoiceValue))
                .forEach(System.out::println);

    }
}
