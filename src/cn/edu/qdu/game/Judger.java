package cn.edu.qdu.game;

public class Judger {
     int total = 0 ;
     Person person = new Person();
     Computer computer = new Computer() ;
     
     public void startGame(){
    	 System.out.println("               *****************");
    	 System.out.println("               **  ��ȭ����ʼ    **");
    	 System.out.println("               *****************");
    	 System.out.println("��ȭ����1.����2.ʯͷ3.��");
     }
     public void askName(){
    	 String p1 ;
    	 String c1 ;
    	c1 = computer.inputName();
    	p1 = person.inputName();
    	System.out.println(p1+" VS " + c1 + "��ս");
     }
     public void playGame(){
    	 int p2 ;
    	 int c2 ;
    	 int p3 = 0;//�ĳ�PERSON�е�winningTimes
    	 int c3 = 0;//�ĳ�Computer�е�winningTimes
    	 p2 = person.myFist();
    	 if(p2==1){
    		 System.out.println("���ȭ��������");
    	 }else if(p2==2){
    		 System.out.println("���ȭ��ʯͷ��");
    	 }else{
    		 System.out.println("���ȭ��   ����");
    	 }
    	 
    	 c2 = computer.myFist();
    	 if(c2==1){
    		 System.out.println( "��ȭ��������");
    	 }else if(c2==2){
    		 System.out.println("���ȭ��ʯͷ��");
    	 }else{
    		 System.out.println("���ȭ��   ����");
    	 }
    	 if ((p2==1&&c2==1)||(p2==2&&c2==2)||(p2==3&&c2==3)) {
			System.out.println("���˵�����Ǵ����ƽ��");
		}else if((p2==1&&c2==2)||(p2==2&&c2==3)||(p2==3&&c2==1)){
			System.out.println("���˵����ϲ�㣬����һ��");
			p3++ ;
		}else{
			System.out.println("���˵��^_^�������ˣ��汿��");
			c3++ ;
		}
     }
     public void finalResult(){
    	 System.out.println();
     }
}
