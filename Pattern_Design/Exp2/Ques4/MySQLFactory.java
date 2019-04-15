public class MySQLFactory implements DBFactory{
	public Connection createConnection(){
		System.out.println("创建了一个MySQLConnection");
		return new MySQLConnection();
	}

	 public Statement createStatement(){
		System.out.println("创建了一个MySQLStatement");
		return new MySQLStatement();
	}
}

