package 상속;

public class Employee {
	// + : public
	//   : default
	// # : protected
	// - : private
	public String name;
	String address;
	protected int salary;
	private int rrn;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
}
