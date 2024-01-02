package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test09카드게임2포커 {

	public static void main(String[] args) {
		/*
		Test09카드게임
		트럼프 카드에서 사용자가 입력한 장수 만큼의 카드를 랜덤으로 섞은 뒤 추첨하는 프로그램을 구현하려고 합니다. 콘솔 환경이기 때문에 그래픽으로 구현하긴 어려우니 글자로 대체해서 보여주려고 합니다.
		(ex : 하트3, 스페이드A)

		카드는 총 52장이 있습니다.
		52장은 4종류의 모양으로 구분됩니다(하트/스페이드/클로버/다이아)
		각각의 모양에는 A,2,3,4,5,6,7,8,9,10,J,Q,K가 존재합니다.

		카드 한 덱(52장)을 생성
		카드덱을 셔플
		사용자가 원하는 만큼 출력
		
		추가)
		다 구현한 뒤 4명이 포커를 친다고 가정하고 한 사람당 7장씩 카드를 나눠준 뒤 각자가 가진 패를 출력해보세요.
		*/
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		List <String> shape = new ArrayList<>();
		List <String> num = new ArrayList<>();
		
		shape.add("하트");
		shape.add("스페이드");
		shape.add("클로버");
		shape.add("다이아");
		num.add("A");
		num.add("J");
		num.add("Q");
		num.add("K");
		
		for(int i=2;i<=10;i++) {
			num.add(String.valueOf(i));
		}
		
		Collections.shuffle(shape);
		Collections.shuffle(num);
		
        System.out.println("\n4명이 포커를 친다면");
        List <String> card = new ArrayList<>();
        
        for(int k = 1; k<=4;k++) {
        	System.out.println("플레이어"+k+"의 패");
        	for (int i = 0; i <= 6; i++) {
        		String draw = shape.get(r.nextInt(4)) + " " + num.get(r.nextInt(13));
        		
        		if(card.contains(draw)) {
        			i--;
        		}
        		else {
        			System.out.println(draw);
        			card.add(draw);
        		}
        			
        	}
        	System.out.println();
        }
	}

}
