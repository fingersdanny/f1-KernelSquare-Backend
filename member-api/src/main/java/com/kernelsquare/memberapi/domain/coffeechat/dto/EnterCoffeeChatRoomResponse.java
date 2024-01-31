package com.kernelsquare.memberapi.domain.coffeechat.dto;

import com.kernelsquare.domainmysql.domain.coffeechat.entity.ChatRoom;

import lombok.Builder;

@Builder
public record EnterCoffeeChatRoomResponse(
	String articleTitle,
	String roomKey,
	Boolean active
) {
	public static EnterCoffeeChatRoomResponse of(String articleTitle, ChatRoom chatRoom) {
		return EnterCoffeeChatRoomResponse.builder()
			.articleTitle(articleTitle)
			.roomKey(chatRoom.getRoomKey())
			.active(chatRoom.getActive())
			.build();
	}
}