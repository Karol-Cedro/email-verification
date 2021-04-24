package com.kcedro.emailverification.registration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;
import java.util.regex.Pattern;

@Service
public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String email) {
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";//RFC 5322
        Pattern pattern = Pattern.compile(regex);
        if (email == null)
            return false;
        return pattern.matcher(email).matches();
    }
}
