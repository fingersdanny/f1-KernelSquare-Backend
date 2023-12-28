package com.kernel360.kernelsquare.domain.answer.dto;

import com.kernel360.kernelsquare.domain.answer.entity.Answer;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record FindAnswerResponse(
    Long id,
    Long questionId,
    String content,
    String rankImageUrl,
    String memberImageUrl,
    String createdBy,
    String answerImageUrl,
    String createdDate,
    Long voteCount
) {
    public static FindAnswerResponse from(Answer answer) {
        return new FindAnswerResponse(
                answer.getId(),
                answer.getQuestion().getId(),
                answer.getContent(),
                "rankUrl",
                answer.getMember().getImageUrl(),
                answer.getMember().getNickname(),
                answer.getImageUrl(),
                answer.getCreatedDate().toLocalDate().toString(),
                answer.getVoteCount()
        );
    }
}