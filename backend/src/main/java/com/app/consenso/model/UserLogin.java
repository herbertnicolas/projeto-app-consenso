package com.app.consenso.model;

import io.micrometer.common.lang.NonNull;
import lombok.Data;

@Data
public class UserLogin {
    //https://www.baeldung.com/hibernate-notnull-vs-nullable
    @NonNull
    private String email;
    private String password;

}
