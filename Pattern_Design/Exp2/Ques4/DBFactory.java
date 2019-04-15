public interface DBFactory{
	public abstract  Connection createConnection();
	public abstract  Statement createStatement();
}

