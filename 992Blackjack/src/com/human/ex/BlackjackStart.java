package com.human.ex;
import java.util.*;
import java.util.Random;

public class BlackjackStart {

	public static void main(String[] args) {
		int deck[]=new int[52];//deck 저장공간생성
		
		//카드 모양
		String cardShape[]= {"스페이드","클로바","다이아","하트"};
		
		//카드 숫자
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10",
				"J","Q","k"};
		
		//카드 생성
		for(int i=0; i<52; i++) {
			deck[i]=i;
		}
		
		//카드 섞기
		Random rd=new Random();
		for(int i=0; i<10000; i++) {
			int rNumber=rd.nextInt(52);
			int temp;
			temp=deck[0];
			deck[0]=deck[rNumber];
			deck[rNumber]=temp;
		}
		
		//카드를 한 장씩 뽑아서 플레이어에게 주는 작업
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
			System.out.println("Auser님 카드를 받으시겠습니까 (0-no, 1-yes)");
			if(sc.nextLine().equals("0")) {
				userAFlag=false;
				};
			}	
			if(userBFlag) {
			System.out.println("Buser님 카드를 받으시겠습니까(0-no, 1-yes)");
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
		
		//컨트롤 물음표 주석
		//컨트롤 제트 부활
  
		//userA와 userB가 어떤 카드를 받았는지 출력해보자.
		System.out.println("AuserCard");
		for(int i:userADeck) {
			if(i!=-1) {
				//System.out.println(i+" "); //초기숫자
				System.out.print("카드 모양 "+cardShape[i/cardNumber.length]);
				System.out.print("카드 숫자 "+cardNumber[i%cardNumber.length]);
			}
		}
		
		System.out.println(" ");
		System.out.println("BuserCard");
		for(int i=0; i<userBIndex;i++) {
			
			//System.out.println(userBDeck[i]+" "); //초기숫자
			System.out.print("카드 모양 "+cardShape[userBDeck[i]/cardNumber.length]);
			System.out.print("카드 숫자 "+cardNumber[userBDeck[i]%cardNumber.length]);
			
		}
		   System.out.println("");
		 
		//점수 계산   
		//userADeck 점수계산
		scoreASum=0;
		
		for(int i=0; i<userAIndex; i++) {
			int scoureA=0;
			scoureA=userADeck[i]%13+1;
			if(scoureA>10) {
				scoureA=10;
			}
			scoreASum=scoreASum+scoureA;
		}
		
		//A가 1 or 11 일 때
		for(int i=0; i<userAIndex;i++) {
			if(userADeck[i]%13==0) {
				//A 있으면 10을	 더해서 22가 넘지 않으면 scoureASum에 10을 
				//더해주고 넘으면 안 더해주면 된다. 
				if((scoreASum+10)<=21) {
					scoreASum=scoreASum+10;
				}
			}		
		}
		System.out.println("totalAUser: "+scoreASum);
		if(scoreASum>21) {
			System.out.println("21을 초과");
			break;
		}
		
		//userBDeck 점수계산
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
			System.out.println("21을 초과");
			break;
		}
		}	
		
		 //userA와 userB가 어떤 카드를 받았는지 출력해보자.
		  System.out.println("AUserCard");
		  for(int i:userADeck) {
		   if(i!=-1) {
		    
		    //System.out.print(i+" ");
		    System.out.print(" 카드모양"
		      +cardShape[i/cardNumber.length]);
		    System.out.print(" 카드 숫자"
		      +cardNumber[i%cardNumber.length]);
		   }
		  }
		  System.out.println("");
		  System.out.println("BUserCard");
		  for(int i=0;i<userBIndex;i++) {
		   //System.out.println(userBDeck[i]+" ");
		   System.out.print(" 카드모양"
		     +cardShape[userBDeck[i]/cardNumber.length]);
		   System.out.print(" 카드 숫자"
		     +cardNumber[userBDeck[i]%cardNumber.length]);
		  }
		  System.out.println("");
		  
		  
		  //승패 결정
		  //“A승리”, “B승리”, “무승부”
		  String playState="계속";
		  if(scoreASum>21) {
		   playState="B승리";
		  }else {
		   if(scoreBSum>21) {
		    playState="A승리"; 
		   }else {
		    if(scoreASum>scoreBSum) {
		     playState="A승리";
		    }else if(scoreASum==scoreBSum) {
		     playState="무승부";
		    }else {
		     playState="B승리";
		    } 
		   }
		  }
		  System.out.println(playState);
		  
		  
		  //카드 출력
		//  for(int i:deck) {
		//   System.out.println(i+" ");
		//   System.out.println("카드모양"
//		     +cardShape[i/cardNumber.length]);
		//   System.out.println("카드 숫자"
//		     +cardNumber[i%cardNumber.length]);
		//   
		//   
		//  }
		  
		  


		 }

		}


