package guru.springframework.springrestclientexamples.api.domain;

public class Card {

    private String type;
    private String number;
    private ExpirationDate expirationDate;

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public static final class Builder {
        private String type;
        private String number;
        private ExpirationDate expirationDate;


        private Builder() {
        }

        public static Builder aCard() {
            return new Builder();
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder number(String number) {
            this.number = number;
            return this;
        }

        public Builder expirationDate(ExpirationDate expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Card build() {
            Card card = new Card();
            card.number = this.number;
            card.type = this.type;
            card.expirationDate = this.expirationDate;
            return card;
        }
    }
}
