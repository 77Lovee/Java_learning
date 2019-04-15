public class OracleFactory implements DBFactory{
	public  Connection createConnection(){
		System.out.println("创建了一个OrcleConnection");
		return new OracleConnection();
	}

	public  Statement createStatement(){
		System.out.println("创建了一个OracleStatement");
		return new OracleStatement();
	}
}

