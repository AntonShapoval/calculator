package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;



public class Calculator implements ActionListener {
	static Window w;
	static String s="0";
	char mas[];
	double a,b,rez1,v,temp;
	int i=0, j=0;
	boolean flagPlMin=true, flagNull=false, flagBackSp=true;
	Object plus=null, min=null, mult=null, div=null;
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				w=new Window(s);
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Ввод чисел
		if (e.getSource()==w.b1){if(s.equals("0"))s=""; s+="1";w.tf1.setText(s);flagNull=false;}
		else if (e.getSource()==w.b2){if(s.equals("0"))s=""; s+="2";w.tf1.setText(s);flagNull=false;}
		else if (e.getSource()==w.b3){if(s.equals("0"))s=""; s+="3";w.tf1.setText(s);flagNull=false;}
		else if (e.getSource()==w.b4){if(s.equals("0"))s=""; s+="4";w.tf1.setText(s);flagNull=false;}
		else if (e.getSource()==w.b5){if(s.equals("0"))s=""; s+="5";w.tf1.setText(s);flagNull=false;}
		else if (e.getSource()==w.b6){if(s.equals("0"))s=""; s+="6";w.tf1.setText(s);flagNull=false;}
		else if (e.getSource()==w.b7){if(s.equals("0"))s=""; s+="7";w.tf1.setText(s);flagNull=false;}
		else if (e.getSource()==w.b8){if(s.equals("0"))s=""; s+="8";w.tf1.setText(s);flagNull=false;}
		else if (e.getSource()==w.b9){if(s.equals("0"))s=""; s+="9";w.tf1.setText(s);flagNull=false;}
		else if (e.getSource()==w.b0){if(s.equals("0"))s=""; s+="0";w.tf1.setText(s);flagNull=true;}
		else if (e.getSource()==w.bZap&&!s.contains(".")){s+=".";w.tf1.setText(s);}
		//Корректировка и очистка
		else if (e.getSource()==w.bBackspace){
		if (flagBackSp&&!s.equals("0")){
			if (s.length()==1){s="0"; w.tf1.setText(s);temp=0;}
			else{
		mas=s.toCharArray();
		s="";
		for (int i=0;i<mas.length-1;i++)s+=mas[i];
		w.tf1.setText(s);}
		
		}
		}
		else if (e.getSource()==w.bClear){s="0";w.tf1.setText(s); 
		temp=0;
		flagPlMin=true; flagBackSp=true;
		plus=null; min=null; mult=null; div=null;}
		//Плюс-минус
		else if (e.getSource()==w.bPlMin){
			if (flagPlMin&&!s.equals("0")){s="-"+s; flagPlMin=false;w.tf1.setText(s);}
			else if (flagPlMin&&!flagBackSp){s=""; s="-"+temp;flagPlMin=false;w.tf1.setText(s);}
			else if (!flagPlMin){mas=s.toCharArray();
			s="";
			for (int i=1;i<mas.length;i++)s+=mas[i];
			flagPlMin=true;
			w.tf1.setText(s);}
			
			}
		
		//Математические операции
		//		
		else if (e.getSource()==w.bPlus){if (s.equals("0"))a=temp;
		else {temp=a=Double.parseDouble(s); s="0";}
		
		plus=e.getSource(); min=null; mult=null; div=null;
		flagPlMin=true; flagBackSp=true;
		}
		//
		else if (e.getSource()==w.bMinus){if (s.equals("0"))a=temp;
		else {temp=a=Double.parseDouble(s); s="0";}
		
		plus=null; min=e.getSource(); mult=null; div=null;
		flagPlMin=true; flagBackSp=true;
		}
		//
		else if (e.getSource()==w.bMult){if (s.equals("0"))a=temp;
		else {temp=a=Double.parseDouble(s); s="0";}
		
			plus=null; min=null; mult=e.getSource(); div=null;
			flagPlMin=true; flagBackSp=true;
			}
		//
		else if (e.getSource()==w.bDiv){if (s.equals("0")){a=temp; System.out.println(a+" "+temp);}
		else {temp=a=Double.parseDouble(s); s="0";}
		
			plus=null; min=null; mult=null; div=e.getSource();
			flagPlMin=true; flagBackSp=true;
			}
		//Получение результата
		else if (e.getSource()==w.bEqual&&plus!=null){
			
			if (s.equals("0")){s=""; temp+=a; s+=temp; w.tf1.setText(s); s="0"; flagBackSp=false;flagPlMin=true;}
			
			else {b=Double.parseDouble(s); s="";
		temp=a+b; s+=temp; w.tf1.setText(s); a=b; s="0";
		flagBackSp=false;
		flagPlMin=true;
		}
		}
		//
		else if (e.getSource()==w.bEqual&&min!=null){
			if (s.equals("0")){s=""; temp-=a; s+=temp; w.tf1.setText(s); s="0"; flagBackSp=false;flagPlMin=true;}
			
			else {b=Double.parseDouble(s); s="";
		temp=a-b; s+=temp; w.tf1.setText(s); a=b; s="0";
		flagBackSp=false;
		flagPlMin=true;
		}
		}
		//
		else if (e.getSource()==w.bEqual&&mult!=null){
			if (s.equals("0")){s=""; temp*=a; s+=temp; w.tf1.setText(s); s="0"; flagBackSp=false;flagPlMin=true;}
			
			else {b=Double.parseDouble(s); s="";
		temp=a*b; s+=temp; w.tf1.setText(s); a=b; s="0";
		flagBackSp=false;
		flagPlMin=true;
		}
		}
		//
		else if (e.getSource()==w.bEqual&&div!=null){
			if (s.equals("0")&&!flagNull){if (a==0){s="Ðåçóëüòàò íå îïðåäåëåí"; w.tf1.setText(s); s="0";}
			else {s=""; temp/=a; s+=temp; w.tf1.setText(s); s="0"; flagBackSp=false;flagPlMin=true;}
			}
			else {b=Double.parseDouble(s); s="";
			if (b==0){s="Äåëåíèå íà íîëü íå âîçìîæíî"; w.tf1.setText(s); s="0";}
			else{
		temp=a/b; s+=temp; w.tf1.setText(s); a=b; s="0";
		flagBackSp=false;
		flagPlMin=true;
			}
		}
		}
		
	}

}
