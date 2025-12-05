package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {


    @NotBlank(message = "기존에 사용하시던 비밀번호를 입력해주세요")
    private String oldPassword;

    @NotBlank(message = "새롭게 변경하실 새 비밀번호를 입력해주세요")
    @Size(min = 8, message = "새 비밀번호는 최소 8자여야 합니다")
    @Pattern(
            regexp =  "^(?=.*[0-9])(?=.*[A-Z]).+$",
            message = "새 비밀번호는 숫자와 대문자를 포함해야 합니다."
    )
    private String newPassword;
}
