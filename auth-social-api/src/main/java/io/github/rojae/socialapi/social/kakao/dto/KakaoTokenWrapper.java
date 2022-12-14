package io.github.rojae.socialapi.social.kakao.dto;

public class KakaoTokenWrapper {
    private String token_type;
    private String access_token;
    private String refresh_token;
    private String scope;

    public KakaoTokenWrapper() {
    }

    public String getToken_type() {
        return token_type;
    }

    public String getAccess_token() {
        return access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public String getScope() {
        return scope;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "KakaoTokenWrapper{" +
                "token_type='" + token_type + '\'' +
                ", access_token='" + access_token + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                ", scope='" + scope + '\'' +
                '}';
    }
}
