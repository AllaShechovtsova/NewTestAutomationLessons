package lesson3.practica;

public class ReturnCamelStyleBackFront {
public String convertMySentence(String mySentence){
	String result="";
	for (int i=0; i<mySentence.length();i++){
		if(i==0){
			result+=(char)((int)mySentence.charAt(0)+32);

			
		}
		else{
			if(mySentence.charAt(i)==' '){
				i+=1;
				result+=(char)((int)mySentence.charAt(i)-32);
			}
			else{
				result+=mySentence.charAt(i);
			}
		}
//		(int)mySentence.charAt(i)-32
	}
	String tempSentense="";
	
	for(int i=result.length()-1;i>=1;i--){
		tempSentense+=result.charAt(i);
	}
	result=tempSentense;
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ReturnCamelStyleBackFront myInstance=new ReturnCamelStyleBackFront();
		String mySentence="This is my first sentence";
		System.out.println(myInstance.convertMySentence(mySentence));
	}

}


//- перевести из стринга в инты
//
//-substring  меняем первую букву на маленькую
//-ascii table условием меняеем на маленькие
//-условием  меняем задом на перед
//
//0 запустить цикл по всем буквам с втроке
//1.меняем первую букву на маленькую
//2.если нашли пробел то его не учитывать б а следующую после него букву большой
//3.результат записуем в стринговую переменную
//
//1.запускаем цикл от последней буквы до первой
//2.побуквенно записуем результат в новый стринг

