package com.ms.user.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

//NOtBlank nao permitir o usuario enviar dados vazios ou nulos
// @Email para validar se eh um email
public record UserRecordDto(@NotBlank String name, @NotBlank @Email String email) {

}
