package guru.springframework.springrestclientexamples.api.domain;

public class Login {
    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMd5() {
        return md5;
    }

    public String getSha1() {
        return sha1;
    }

    public String getSha256() {
        return sha256;
    }

    public static final class Builder {
        private String username;
        private String password;
        private String md5;
        private String sha1;
        private String sha256;

        private Builder() {
        }

        public static Builder aLogin() {
            return new Builder();
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder md5(String md5) {
            this.md5 = md5;
            return this;
        }

        public Builder sha1(String sha1) {
            this.sha1 = sha1;
            return this;
        }

        public Builder sha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }

        public Login build() {
            Login login = new Login();
            login.username = this.username;
            login.sha1 = this.sha1;
            login.sha256 = this.sha256;
            login.md5 = this.md5;
            login.password = this.password;
            return login;
        }
    }
}
