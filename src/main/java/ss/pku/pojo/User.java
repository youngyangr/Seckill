package ss.pku.pojo;

import lombok.*;

import java.util.Date;
/**
 * @program: SeckillProject
 * @description: 用户实体类
 * @author: Mr.Li
 * @create: 2020-05-30 15:29
 **/
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private int id;
	private String userName;
	private String phone;
	private String password;
	private String salt;
	private String head;
	private int loginCount;
	private Date registerDate;
	private Date lastLoginDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}