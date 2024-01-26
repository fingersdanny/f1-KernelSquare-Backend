package com.kernel360.kernelsquare.domain.member.controller;

import static com.kernel360.kernelsquare.global.common_response.response.code.MemberResponseCode.*;

import com.kernel360.kernelsquare.domain.member.dto.UpdateMemberIntroductionRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kernel360.kernelsquare.domain.member.dto.FindMemberResponse;
import com.kernel360.kernelsquare.domain.member.dto.UpdateMemberProfileRequest;
import com.kernel360.kernelsquare.domain.member.service.MemberService;
import com.kernel360.kernelsquare.global.common_response.ApiResponse;
import com.kernel360.kernelsquare.global.common_response.ResponseEntityFactory;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MemberController {
	private final MemberService memberService;

	@PutMapping("/members/{memberId}/profile")
	public ResponseEntity<ApiResponse> updateMemberProfile(@PathVariable Long memberId,
		@RequestBody UpdateMemberProfileRequest updateMemberProfileRequest) {
		memberService.updateMemberProfile(memberId, updateMemberProfileRequest);
		return ResponseEntityFactory.toResponseEntity(MEMBER_PROFILE_UPDATED);
	}

	@PutMapping("/members/{memberId}/introduction")
	public ResponseEntity<ApiResponse> updateMemberIntroduction(@PathVariable Long memberId,
		@Valid @RequestBody UpdateMemberIntroductionRequest updateMemberIntroductionRequest) {
		memberService.updateMemberIntroduction(memberId, updateMemberIntroductionRequest);
		return ResponseEntityFactory.toResponseEntity(MEMBER_INTRODUCTION_UPDATED);
	}


	@PutMapping("/members/{memberId}/password")
	public ResponseEntity<ApiResponse> updateMemberPassword(@PathVariable Long memberId,
		@RequestBody String password) {
		memberService.updateMemberPassword(memberId, password);
		return ResponseEntityFactory.toResponseEntity(MEMBER_PASSWORD_UPDATED);
	}

	@GetMapping("/members/{memberId}")
	public ResponseEntity<ApiResponse<FindMemberResponse>> findMember(@PathVariable Long memberId) {
		FindMemberResponse findMemberResponse = memberService.findMember(memberId);
		return ResponseEntityFactory.toResponseEntity(MEMBER_FOUND, findMemberResponse);
	}

	@DeleteMapping("/members/{memberId}")
	public ResponseEntity<ApiResponse> deleteMember(@PathVariable Long memberId) {
		memberService.deleteMember(memberId);
		return ResponseEntityFactory.toResponseEntity(MEMBER_DELETED);
	}
}
