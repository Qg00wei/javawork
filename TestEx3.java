package asd;
public class TestEx3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		     DepositAccount saver = new DepositAccount("1234567890","zhangsan",5000);
		     DepositAccount.setInterest(0.023);//����������
		     saver.queryBalance();
		     saver.deposit(3500);
		     System.out.println("����Ϣ�ǣ�"+saver.calYearInterest());
		 }
}
	class DepositAccount{
		     private String accountNum;//�˺�
		     private String name;//����
		     private double balance;//����Ϊʵ����Ա����
		     static double interest;//�����ʣ����Ա����
		     static void setInterest(double d){  //����������
		    interest = d;
		     }
		     public DepositAccount(String num,String na,double ba){ // ���������췽��
		     this.accountNum = num;
		     this.name = na;
		     this.balance = ba;
		     }
		     public double calYearInterest(){
		     //��������Ϣ
		     return balance*interest;
		     }
		     public void deposit(double cash){
		     //���
		     System.out.println("�����˻�ԭ����"+balance);
		     System.out.println("�����ڴ���:"+cash);
		     balance+=cash;
		     System.out.println("���ɹ�����������ǣ�"+balance);
		     }
		     public void queryBalance(){ //��ѯ���
		     System.out.println("��������ǣ�"+balance);

	}
}

