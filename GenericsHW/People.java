/*
package GenericsHW;

import Lesson12.Product;

import java.util.Set;
import java.util.TreeSet;

public class People {
    private Set<Employee> employees;

    public People() {
        employees = new TreeSet<>();
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployees(Employee employee) {
        if (!isContainById(employee)) {
            employees.add(employee);
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
            }
        }
    }

    public void printConsole() {
        for (Employee employee1 : employees) {
            System.out.printf("\nid: %d; name: %s; lastName: %s;", employee1.getId(), employee1.getName(), employee1.getLastName());
        }
    }

    private boolean isContainById(Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employee.get(i).getId() == employee.getId()) {
                return true;
            }
        }
        return false;
    }

    private boolean isContainById(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

}*/
