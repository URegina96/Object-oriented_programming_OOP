package test;
public class Main {
    private static MyArrayList emloyees;

    public static void main(String[] args) {
        MyArrayList employees = getEmployees();
        employees.add("Hthfs");
        employees.remove("Cgdr");
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }

    private static MyArrayList getEmployees() {
        MyArrayList employees = new MyArrayList();
        employees.add("Agdr");
        employees.add("Brawr");
        employees.add("Cgdr");
        employees.add("Dgwe4ra");
        employees.add("Gr");
        return employees;
    }

}