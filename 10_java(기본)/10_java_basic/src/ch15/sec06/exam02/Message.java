package ch15.sec06.exam02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString

public class Message {
    public String command;
    public String to;
}
