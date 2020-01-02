package guru.springframework.springrestclientexamples.api.domain;

public class Billing {

    private Card card;
    private String swift;
    private String iban;

    public Card getCard() {
        return card;
    }

    public String getSwift() {
        return swift;
    }

    public String getIban() {
        return iban;
    }

    public static final class Builder {
        private Card card;
        private String swift;
        private String iban;

        private Builder() {
        }

        public static Builder aBilling() {
            return new Builder();
        }

        public Builder card(Card card) {
            this.card = card;
            return this;
        }

        public Builder swift(String swift) {
            this.swift = swift;
            return this;
        }

        public Builder iban(String iban) {
            this.iban = iban;
            return this;
        }

        public Billing build() {
            Billing billing = new Billing();
            billing.swift = this.swift;
            billing.card = this.card;
            billing.iban = this.iban;
            return billing;
        }
    }
}
