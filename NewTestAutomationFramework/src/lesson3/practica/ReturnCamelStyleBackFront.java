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


//- ��������� �� ������� � ����
//
//-substring  ������ ������ ����� �� ���������
//-ascii table �������� ������� �� ���������
//-��������  ������ ����� �� �����
//
//0 ��������� ���� �� ���� ������ � ������
//1.������ ������ ����� �� ���������
//2.���� ����� ������ �� ��� �� ��������� � � ��������� ����� ���� ����� �������
//3.��������� �������� � ���������� ����������
//
//1.��������� ���� �� ��������� ����� �� ������
//2.���������� �������� ��������� � ����� ������

