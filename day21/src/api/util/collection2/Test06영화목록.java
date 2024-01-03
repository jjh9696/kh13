package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test06영화목록 {

	public static void main(String[] args) {
		/*
		마리오와 루이지는 각각 2023년 한 해 동안 다음과 같은 영화를 봤습니다.

		마리오 : 서울의 봄, 그대들은 어떻게 살 것인가, 3일의 휴가, 괴물
		루이지 : 나폴레옹, 사랑은 낙엽을 타고, 서울의 봄, 괴물, 쏘우 X

		마리오와 루이지가 모두 본 영화 목록을 출력
		마리오와 루이지 중 한 명만 본 영화 목록을 출력
		*/
		
		Set<String> mario = new TreeSet<>();
		Set<String> luigi = new TreeSet<>();
		
		mario.addAll(Set.of("서울의 봄", "그대들은 어떻게 살 것인가", "3일의 휴가", "괴물"));
		luigi.addAll(Set.of("나폴레옹", "사랑은 낙엽을 타고", "서울의 봄", "괴물", "쏘우 X"));
		
		Set<String> allMovie = new TreeSet<>();
		allMovie.addAll(mario);
		allMovie.addAll(luigi);
		System.out.println("모두 본 영화"+allMovie);
		
		Set<String> marioMovie = new TreeSet<>();
		marioMovie.addAll(mario);
		marioMovie.removeAll(luigi);
		System.out.println("마리오만 본 영화"+marioMovie);
		
		Set<String> luigiMovie = new TreeSet<>();
		luigiMovie.addAll(luigi);
		luigiMovie.removeAll(mario);
		System.out.println("루이지만 본 영화"+luigiMovie);
		
		Set<String> aloneMovie = new TreeSet<>();
		aloneMovie.addAll(marioMovie);
		aloneMovie.addAll(luigiMovie);
		System.out.println("서로 혼자 본 영화"+aloneMovie);
		
		
	}

}
