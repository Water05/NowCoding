package cn.thread;
/**银行取钱，账户类*/
public class Account {
/*	private String accountNo;
	private double balance;
	private  String accountName;
	public Account(){
		super();
	}
	public Account(String accountNo,String accountName,double balance){
		super();
		this.accountNo=accountNo;
		this.balance=balance;
		this.accountName=accountName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	@Override
	public int hashCode(){
		return accountNo.hashCode();
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj!=null&&obj.getClass()==Account.class){
			Account target=(Account) obj;
			return target.getAccountNo().equals(accountNo);
		}
		return false;
	}*/
	
	
	private String accountNo;
	private double balance;
	// 标示账户是否已有存款(此项目为了测试存入款就需要马上取出)  
	private boolean flag=false;
	
	public Account(String accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public Account() {
		super();
	}
	
	public synchronized void draw(double drawAmount,int i){
		try{
			if(!flag){//flag=false,取款中
				System.out.println("！！！！！！等待取钱"+i); 
				this.wait();
			}else{
				System.out.println(Thread.currentThread().getName()+"---->取钱："+drawAmount+i);  
				balance-=drawAmount;  
				System.out.println("账户余额: "+balance);  
				   //设置flag（限定一个操作只能取一次钱）  
				flag=false;  
				//唤醒其他wait（）线程  
				this.notifyAll();//cond.signalAll();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	
	public synchronized void deposit(double depositAmount,int i){
		//如果flag为真，证明有人存钱了，存钱阻塞  
		try {  
		if (flag) {  
			System.out.println("！！！！！！等待存钱"+i); 
		this.wait(); //cond.await();  
		
		}  
		//否则执行存款  
		else  
		{  // System.out.println("账户余额："+balance);  
		System.out.println(Thread.currentThread().getName()+"---->存钱："+depositAmount +i);  
		balance+=depositAmount;  
		System.out.println("账户余额: "+balance);  
		   //设置flag（限定一个操作只能取一次钱）  
		flag=true;  
		//唤醒其他wait（）线程   取钱
		this.notifyAll(); //cond.signalAll();  
		}  
		} catch (InterruptedException e) {  
		e.printStackTrace();  
		}
	}
	
	// DDD设计模式重写equals和hashcode(判断用户是否一致，只需要判断他们的账号编码就可以了，不需要再判断整个对象，提高性能)  
	@Override  
	public int hashCode() {  
	return accountNo.hashCode();  
	}  
	@Override  
	public boolean equals(Object obj) {  
	if (obj != null && obj.getClass() == Account.class) {  
	Account account = (Account) obj;  
	return account.getAccountNo().equals(accountNo);  
	}  
	return false;  
	}  
	public String getAccountNo() {  
	return accountNo;  
	}  
	public void setAccountNo(String accountNo) {  
	this.accountNo = accountNo;  
	}
	
	
}
