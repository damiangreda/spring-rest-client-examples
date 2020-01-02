package guru.springframework.springrestclientexamples.api.domain;

public class ExpirationDate {

    private String date;
    private String timezoneType;
    private String timezone;

    public String getTimezone() {
        return timezone;
    }

    public String getDate() {
        return date;
    }

    public String getTimezoneType() {
        return timezoneType;
    }

    public static final class Builder {
        private String date;
        private String timezoneType;
        private String timezone;

        private Builder() {
        }

        public static Builder anExpirationDate() {
            return new Builder();
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder timezoneType(String timezoneType) {
            this.timezoneType = timezoneType;
            return this;
        }

        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        public ExpirationDate build() {
            ExpirationDate expirationDate = new ExpirationDate();
            expirationDate.timezone = this.timezone;
            expirationDate.date = this.date;
            expirationDate.timezoneType = this.timezoneType;
            return expirationDate;
        }
    }
}
