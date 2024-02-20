package com.kernelsquare.memberapi.domain.reservation_article.dto;

import java.util.List;

import com.kernelsquare.domainmysql.domain.member.entity.Member;
import com.kernelsquare.domainmysql.domain.reservation_article.entity.ReservationArticle;
import com.kernelsquare.memberapi.domain.hashtag.dto.UpdateHashtagRequest;
import com.kernelsquare.memberapi.domain.member.dto.UpdateMemberIntroductionRequest;
import com.kernelsquare.memberapi.domain.reservation.dto.UpdateReservationRequest;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import org.springframework.web.ErrorResponse;
@Builder
public record UpdateReservationArticleRequest(
	Long memberId,
	Long articleId,
	@NotBlank(message = "예약창 제목을 입력해 주세요.")
	@Size(max = 100, message = "예약창 제목은 100자를 넘을 수 없습니다.")
	String title,
	@NotBlank(message = "예약창 내용을 입력해 주세요.")
	@Size(max = 1000, message = "예약창 내용은 1000자를 넘을 수 없습니다.")
	String content,
	List<UpdateHashtagRequest> changeHashtags,
	List<UpdateReservationRequest> changeReservations
) {
}