package guru.springframework.springrestclientexamples.api.domain;

public class User {

    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private String phone;
    private Job job;
    private Billing billing;
    private String language;
    private String currency;

    public String getGender() {
        return gender;
    }

    public Name getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public Login getLogin() {
        return login;
    }

    public String getPhone() {
        return phone;
    }

    public Job getJob() {
        return job;
    }

    public Billing getBilling() {
        return billing;
    }

    public String getLanguage() {
        return language;
    }

    public String getCurrency() {
        return currency;
    }

    public static final class Builder {
        private String gender;
        private Name name;
        private Location location;
        private String email;
        private Login login;
        private String phone;
        private Job job;
        private Billing billing;
        private String language;
        private String currency;

        private Builder() {
        }

        public static Builder anUser() {
            return new Builder();
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder name(Name name) {
            this.name = name;
            return this;
        }

        public Builder location(Location location) {
            this.location = location;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder login(Login login) {
            this.login = login;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        public Builder billing(Billing billing) {
            this.billing = billing;
            return this;
        }

        public Builder language(String language) {
            this.language = language;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public User build() {
            User user = new User();
            user.gender = this.gender;
            user.name = this.name;
            user.billing = this.billing;
            user.email = this.email;
            user.currency = this.currency;
            user.phone = this.phone;
            user.location = this.location;
            user.language = this.language;
            user.job = this.job;
            user.login = this.login;
            return user;
        }
    }
}
