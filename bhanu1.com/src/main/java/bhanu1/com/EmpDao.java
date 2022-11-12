package bhanu1.com;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao 
{
private JdbcTemplate jdbcTemplate;
public void setjdbcTemplate(JdbcTemplate jdbcTemplate)
{
	this.jdbcTemplate = jdbcTemplate;
}

public int save(Employee emp)
{
	String sql= "insert into charitha values("+emp.getId()+",'"+emp.getName()+"','"+emp.getCmp()+"')";
	return jdbcTemplate.update(sql);
}
public int update(Employee emp)
{
	String sql = "update charitha setname='"+emp.getName()+"',where id='"+emp.getId()+"'";
	return jdbcTemplate.update(sql);
}

public int delete(Employee emp)
	{
	String sql = "delete";
	return jdbcTemplate.update(sql);
	}

public int listEmployee()
{
String sql= "select";
return jdbcTemplate.update(sql);
}

}


