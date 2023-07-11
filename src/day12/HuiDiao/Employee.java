package day12.HuiDiao;

public class Employee {
	private ICallBack callBack;
	public void setCallBack(ICallBack callBack) {
		this.callBack =callBack;}
	public void doSome() {
		// 1.开始干活了
		for (int i = 0; i < 10; i++) {
			System.out.println("第【" + i + "】事情干完了！"+System.currentTimeMillis());
		}

		// 2.告诉老板干完了
		// 完成之后调用接口变量的方法把数据传给该方法，执行该方法实际是执行子类的该方法，这就是接口回调真正做的事。
		callBack.execute();
	}
}

