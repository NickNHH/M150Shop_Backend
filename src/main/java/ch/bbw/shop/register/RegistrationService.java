package ch.bbw.shop.register;

import com.google.common.hash.Hashing;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RegistrationService {
    private Map<String, User> tmpRegisteredUsers = new HashMap<>();


    @PostMapping("registration")
    public ResponseEntity register(RegistrationData registrationData) {
        String pwHash = Hashing.sha256().hashString(registrationData.getPassword(), StandardCharsets.UTF_8).toString();
        String token = UUID.randomUUID().toString();

        return null;
    }
}
