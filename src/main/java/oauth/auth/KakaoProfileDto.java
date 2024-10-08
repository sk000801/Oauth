package oauth.auth;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class KakaoProfileDto {
    private long id;
    private String connected_at;
    private Properties properties;
    private KakaoAccount kakao_account;

    @Getter
    public static class Properties {
        private String nickname;
    }

    @Getter
    public static class KakaoAccount {
        private boolean profile_nickname_needs_agreement;
        private Profile profile;
        private boolean has_email;
        private boolean email_needs_agreement;
        private boolean is_email_valid;
        private boolean is_email_verified;
        private String email;

        @Getter
        public static class Profile {
            private String nickname;
            private boolean is_default_nickname;
        }
    }
}
