public class Ques4{
	public static void main(String[] args){
		DBFactory dbf;
		Connection con;
		Statement st;
		dbf = new OracleFactory();
		con = dbf.createConnection();
		st = dbf.createStatement();
		System.out.println("***********************");
		dbf = new MySQLFactory();
		con = dbf.createConnection();
		st = dbf.createStatement();

}
}
