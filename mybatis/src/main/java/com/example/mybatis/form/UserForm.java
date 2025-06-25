package com.example.mybatis.form;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class UserForm {

  @Id
  private String userId;

  @NotBlank
  private String userPassword;
  
}
