package day25.ds;

public class DBCPDataSource implements DataSource{

	@Override
	public void getConnectin() {
		System.out.println("获取到DBCP");
	}

}
