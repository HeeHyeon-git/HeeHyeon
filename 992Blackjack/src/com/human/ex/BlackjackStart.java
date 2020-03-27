package com.human.ex;
import java.util.*;
import java.util.Random;

public class BlackjackStart {

	public static void main(String[] args) {
		int deck[]=new int[52];//deck �����������
		
		//ī�� ���
		String cardShape[]= {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};
		
		//ī�� ����
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10",
				"J","Q","k"};
		
		//ī�� ����
		for(int i=0; i<52; i++) {
			deck[i]=i;
		}
		
		//ī�� ����
		Random rd=new Random();
		for(int i=0; i<10000; i++) {
			int rNumber=rd.nextInt(52);
			int temp;
			temp=deck[0];
			deck[0]=deck[rNumber];
			deck[rNumber]=temp;
		}
		
		//ī�带 �� �徿 �̾Ƽ� �÷��̾�� �ִ� �۾�
		int deckIndex=0;
		int userADeck[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int userBDeck[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};		
		int userAIndex=0;
		int userBIndex=0;
		boolean userAFlag=true;
		boolean userBFlag=true;
		Scanner sc=new Scanner(System.in);
		int scoreASum=0;
		int scoreBSum=0;
		
		for(int j=0; j<10; j++) {
			if(userAFlag) {
			System.out.println("Auser�� ī�带 �����ðڽ��ϱ� (0-no, 1-yes)");
			if(sc.nextLine().equals("0")) {
				userAFlag=false;
				};
			}	
			if(userBFlag) {
			System.out.println("Buser�� ī�带 �����ðڽ��ϱ�(0-no, 1-yes)");
			if(sc.nextLine().equals("0")) {
				userBFlag=false;
				};
			}	
			if(!(userAFlag || userBFlag)) {
				break;
			}
			
			if(userAFlag) {
				userADeck[userAIndex]=deck[deckIndex];
				deckIndex++;
				userAIndex++;
			}
			if(userBFlag) {
				userBDeck[userBIndex]=deck[deckIndex];
				deckIndex++;
				userBIndex++;
			}	
		
		//��Ʈ�� ����ǥ �ּ�
		//��Ʈ�� ��Ʈ ��Ȱ
  
		//userA�� userB�� � ī�带 �޾Ҵ��� ����غ���.
		System.out.println("AuserCard");
		for(int i:userADeck) {
			if(i!=-1) {
				//System.out.println(i+" "); //�ʱ����
				System.out.print("ī�� ��� "+cardShape[i/cardNumber.length]);
				System.out.print("ī�� ���� "+cardNumber[i%cardNumber.length]);
			}
		}
		
		System.out.println(" ");
		System.out.println("BuserCard");
		for(int i=0; i<userBIndex;i++) {
			
			//System.out.println(userBDeck[i]+" "); //�ʱ����
			System.out.print("ī�� ��� "+cardShape[userBDeck[i]/cardNumber.length]);
			System.out.print("ī�� ���� "+cardNumber[userBDeck[i]%cardNumber.length]);
			
		}
		   System.out.println("");
		 
		//���� ���   
		//userADeck �������
		scoreASum=0;
		
		for(int i=0; i<userAIndex; i++) {
			int scoureA=0;
			scoureA=userADeck[i]%13+1;
			if(scoureA>10) {
				scoureA=10;
			}
			scoreASum=scoreASum+scoureA;
		}
		
		//A�� 1 or 11 �� ��
		for(int i=0; i<userAIndex;i++) {
			if(userADeck[i]%13==0) {
				//A ������ 10��	 ���ؼ� 22�� ���� ������ scoureASum�� 10�� 
				//�����ְ� ������ �� �����ָ� �ȴ�. 
				if((scoreASum+10)<=21) {
					scoreASum=scoreASum+10;
				}
			}		
		}
		System.out.println("totalAUser: "+scoreASum);
		if(scoreASum>21) {
			System.out.println("21�� �ʰ�");
			break;
		}
		
		//userBDeck �������
		scoreBSum=0;
		for(int i=0; i<userBIndex; i++) {
			int scoureB=0;
			scoureB=userBDeck[i]%13+1;
			if(scoureB>10) {
				scoureB=10;
			}
			scoreBSum=scoreBSum+scoureB;
		}
		
		//A 1 or 10
		for(int i=0; i<userBIndex;i++) {
			if(userBDeck[i]%13==0) {		
				if((scoreBSum+10)<=21) {
					scoreBSum=scoreBSum+10;
					}
				}	
			}
		System.out.println("totalBUser: "+scoreBSum);
		if(scoreBSum>21) {
			System.out.println("21�� �ʰ�");
			break;
		}
		}	
		
		 //userA�� userB�� � ī�带 �޾Ҵ��� ����غ���.
		  System.out.println("AUserCard");
		  for(int i:userADeck) {
		   if(i!=-1) {
		    
		    //System.out.print(i+" ");
		    System.out.print(" ī����"
		      +cardShape[i/cardNumber.length]);
		    System.out.print(" ī�� ����"
		      +cardNumber[i%cardNumber.length]);
		   }
		  }
		  System.out.println("");
		  System.out.println("BUserCard");
		  for(int i=0;i<userBIndex;i++) {
		   //System.out.println(userBDeck[i]+" ");
		   System.out.print(" ī����"
		     +cardShape[userBDeck[i]/cardNumber.length]);
		   System.out.print(" ī�� ����"
		     +cardNumber[userBDeck[i]%cardNumber.length]);
		  }
		  System.out.println("");
		  
		  
		  //���� ����
		  //��A�¸���, ��B�¸���, �����ºΡ�
		  String playState="���";
		  if(scoreASum>21) {
		   playState="B�¸�";
		  }else {
		   if(scoreBSum>21) {
		    playState="A�¸�"; 
		   }else {
		    if(scoreASum>scoreBSum) {
		     playState="A�¸�";
		    }else if(scoreASum==scoreBSum) {
		     playState="���º�";
		    }else {
		     playState="B�¸�";
		    } 
		   }
		  }
		  System.out.println(playState);
		  
		  
		  //ī�� ���
		//  for(int i:deck) {
		//   System.out.println(i+" ");
		//   System.out.println("ī����"
//		     +cardShape[i/cardNumber.length]);
		//   System.out.println("ī�� ����"
//		     +cardNumber[i%cardNumber.length]);
		//   
		//   
		//  }
		  
		  


		 }

		}


