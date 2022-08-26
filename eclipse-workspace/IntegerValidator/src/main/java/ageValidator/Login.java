package ageValidator;

public class Login {
	
		private String userName;
		private int age;
		
		public String execute(){
			if(age > 17) {
				return "success";
			}else{
				return "fail";
			}
		}	

		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
}
