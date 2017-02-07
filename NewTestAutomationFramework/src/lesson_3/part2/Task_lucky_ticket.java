package lesson_3.part2;

public class Task_lucky_ticket {
public int quantityOfLuckyTickets(){
	int quantity=0;
	for(int a=0; a<=9; a++){
		for(int b=0; b<=9; b++){
			for(int c=0; c<=9; c++){
				for(int d=0; d<=9; d++){
					for(int e=0; e<=9; e++){
						for(int f=1; f<=9; f++){
							if(a+b+c==d+e+f){
								quantity++;
							}
						}
					}
					
				}
				
			}
			
		}
	}
	return quantity;
}
	public static void main(String[] args) {
		Task_lucky_ticket myInstance=new Task_lucky_ticket();
		System.out.println(myInstance.quantityOfLuckyTickets());
	}

}
