package cn.edu.qdu.game;

public class Judger {
     int total = 0 ;
     Person person = new Person();
     Computer computer = new Computer() ;
     
     public void startGame(){
    	 System.out.println("               *****************");
    	 System.out.println("               **  猜拳，开始    **");
    	 System.out.println("               *****************");
    	 System.out.println("出拳规则：1.剪刀2.石头3.布");
     }
     public void askName(){
    	 String p1 ;
    	 String c1 ;
    	c1 = computer.inputName();
    	p1 = person.inputName();
    	System.out.println(p1+" VS " + c1 + "对战");
     }
     public void playGame(){
    	 int p2 ;
    	 int c2 ;
    	 int p3 = 0;//改成PERSON中的winningTimes
    	 int c3 = 0;//改成Computer中的winningTimes
    	 p2 = person.myFist();
    	 if(p2==1){
    		 System.out.println("你出拳：剪刀！");
    	 }else if(p2==2){
    		 System.out.println("你出拳：石头！");
    	 }else{
    		 System.out.println("你出拳：   布！");
    	 }
    	 
    	 c2 = computer.myFist();
    	 if(c2==1){
    		 System.out.println( "出拳：剪刀！");
    	 }else if(c2==2){
    		 System.out.println("你出拳：石头！");
    	 }else{
    		 System.out.println("你出拳：   布！");
    	 }
    	 if ((p2==1&&c2==1)||(p2==2&&c2==2)||(p2==3&&c2==3)) {
			System.out.println("结果说：你们打成了平手");
		}else if((p2==1&&c2==2)||(p2==2&&c2==3)||(p2==3&&c2==1)){
			System.out.println("结果说：恭喜你，拿下一份");
			p3++ ;
		}else{
			System.out.println("结果说：^_^，你输了，真笨！");
			c3++ ;
		}
     }
     public void finalResult(){
    	 System.out.println();
     }
}
