public class main {
	public static void main(String[] args) {
		Employee worker=new Employee();
		worker.inputEmployee();
		System.out.println("Employee Id="+worker.getEmId());
		System.out.println("Employee Name="+worker.getEmName());
		System.out.println("Salary="+worker.getSalary());
	}
}