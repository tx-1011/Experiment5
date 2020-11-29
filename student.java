  
package text5;

public class student {
	String name; //姓名
	String sex; //性别
	int age;   //年龄
	String departments;//院系
	student(String n,String s,int a,String d){     
		 this.name=n;    
		 this.sex=s;  
		 this.age=a;
		 this.departments=d;
		 
		 }
	public String toString() {
		return "姓名："+name+"\n"+"性别："+sex+"\n"+"年龄："+age+"\n"+"院系班级："+departments;
	}

}
