package ch18.sec10;

import java.io.Serializable;

public class Member implements Serializable{
    private static final long serialVersionUID = -6222354336363535432L;
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
