package guru.springframework.springrestclientexamples.api.domain;

public class Location {

    private String street;
    private String city;
    private String state;
    private String postcode;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostcode() {
        return postcode;
    }

    public static final class Builder {
        private String street;
        private String city;
        private String state;
        private String postcode;

        private Builder() {
        }

        public static Builder aLocation() {
            return new Builder();
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Builder postcode(String postcode) {
            this.postcode = postcode;
            return this;
        }

        public Location build() {
            Location location = new Location();
            location.city = this.city;
            location.state = this.state;
            location.postcode = this.postcode;
            location.street = this.street;
            return location;
        }
    }
}
