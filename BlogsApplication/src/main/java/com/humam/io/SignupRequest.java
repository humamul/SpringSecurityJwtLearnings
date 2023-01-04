package com.humam.io;

import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SignupRequest {
	    @NotBlank
	    @Size(min = 3, max = 20)
	    private String username;
	    
	    
	    @NotBlank
	    @Size(min = 6, max = 40)
	    private String password;
	    private Set<String> role;
}
