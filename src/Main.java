import entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "emrah","kızıltan"));
        employees.add(new Employee(2, "ali","kızıltan"));
        employees.add(new Employee(2, "emra","kızıltan"));
        employees.add(new Employee(2, "emre","kızıltan"));
        employees.add(new Employee(3, "ahmet","kızıltan"));
        employees.add(new Employee(3, "can","kızıltan"));
        employees.add(new Employee(4, "hazal","kızıltan"));
        employees.add(new Employee(4, "sertaç","kızıltan"));


        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees= new ArrayList<>();

        Iterator<Employee> iterator =  employees.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if(employee==null){
                System.out.println("null data bulundu");
                continue;
            }
            if(employeeMap.containsKey(employee.getId())){
                removedEmployees.add(employee);
                iterator.remove();
            }else{
                employeeMap.put(employee.getId(),employee);
            }
        }
        System.out.println("mevcut:");
        System.out.println(employees);
        System.out.println("tekiller:");
        System.out.println(employeeMap);
        System.out.println("silinenler: ");
        System.out.println(removedEmployees);
    }
}