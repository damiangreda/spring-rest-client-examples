package guru.springframework.springrestclientexamples.api.domain;

public class Job {

    private String title;
    private String company;

    public static final class Builder {
        private String title;
        private String company;

        private Builder() {
        }

        public static Builder aJob() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder company(String company) {
            this.company = company;
            return this;
        }

        public Job build() {
            Job job = new Job();
            job.title = this.title;
            job.company = this.company;
            return job;
        }

        public String getTitle() {
            return title;
        }

        public String getCompany() {
            return company;
        }
    }
}
