package learning;

public class TransientDemo {
//修飾子
//public：公開的，可以被任何地方訪問。
//protected：受保護的，可以被同一包內的類訪問，或者是繼承自該類的子類訪問。
//private：私有的，只能被該類內部的其他方法訪問，對於外部的類是不可見的。
//static：靜態的，表示該成員屬於類本身，而不是屬於該類的任何實例。
//final：最終的，表示該成員的值在初始化之後不可更改。
//abstract：抽象的，表示該類或方法是抽象的，不能實例化，必須由子類實現。
//synchronized：同步的，用於多線程編程，表示該方法或代碼塊在同一時間只能被一個線程訪問。
//volatile：易變的，用於多線程編程，表示該變量可能被多個線程同時訪問，需要額外的處理來保證線程安全。
//transient：瞬時的，表示該變量不需要序列化，當對象序列化時，該變量將被忽略。
//strictfp：精確浮點數，表示該方法或類中所有的浮點運算都按照IEEE 754標準進行計算。
	public static void main(String[] args) throws Exception {
		User u = new User("kim", "passwd");
		System.out.println(u.getPasswd());

	}

	public static class User {
		private String user;
		private transient String passwd;

		public User(String user, String passwd) {
			this.user = user;
			this.passwd = passwd;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getPasswd() {
			return this.passwd;
		}

		public void setPasswd(String passwd) {
			this.passwd = passwd;
		}

	}
}
