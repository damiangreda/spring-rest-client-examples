package guru.springframework.springrestclientexamples.api.domain;

import java.util.List;

public class UserResponse {

    private List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
