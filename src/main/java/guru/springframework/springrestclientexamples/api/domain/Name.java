package guru.springframework.springrestclientexamples.api.domain;

public class Name {
    private String title;
    private String first;
    private String last;

    public String getTitle() {
        return title;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public static final class Builder {
        private String title;
        private String first;
        private String last;

        private Builder() {
        }

        public static Builder aName() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder first(String first) {
            this.first = first;
            return this;
        }

        public Builder last(String last) {
            this.last = last;
            return this;
        }

        public Name build() {
            Name name = new Name();
            name.first = this.first;
            name.last = this.last;
            name.title = this.title;
            return name;
        }
    }
}
