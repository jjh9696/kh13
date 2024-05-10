package com.kh.springtest01.vo.room;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import lombok.Data;

//채팅방 1개
@Data 
public class RoomVO {
	//채팅방은 중복없이 사용자를 여러명 보유할 수있다
	private Set<UserVO> users = new CopyOnWriteArraySet<>();
	
	//방에 대한 여러 가지 기능들을 메소드로 구현
	//-입장, 퇴장, 검색, 메세지전송, ...

    // 새로운 사용자를 방에 추가하는 메서드
    public void addUser(UserVO user) {
        users.add(user);
    }

    // 사용자를 방에서 제거하는 메서드
    public void removeUser(UserVO user) {
        users.remove(user);
    }

    // 방에 속한 사용자 목록을 반환하는 메서드
    public Set<UserVO> getUsers() {
        return users;
    }
	
}