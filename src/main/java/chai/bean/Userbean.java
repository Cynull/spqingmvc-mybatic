package chai.bean;

public class Userbean {
   private  String  id;
   private  String  username;
   private  int   age;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Userbean(String id, String username, int age) {
	super();
	this.id = id;
	this.username = username;
	this.age = age;
}
public Userbean() {}
@Override
public String toString() {
	return "Userbean [id=" + id + ", username=" + username + ", age=" + age + "]";
}

   
	
}
