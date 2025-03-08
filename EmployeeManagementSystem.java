package employee;
import java.util.List;
import java.util.ArrayList;

public class EmployeeManagementSystem 
{
	public static void main(String[] args)
	{
		Employee employee1=new Employee(100,"ABC",100000.0);
		Employee employee2=new Employee(101,"BAC",200000.0);
		Employee employee3=new Employee(102,"CBA",300000.0);
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		for(int i=0;i<employeeList.size();i++)
		{
			Employee employee=employeeList.get(i);
			employee.displayDetails();
		}
	}
}
