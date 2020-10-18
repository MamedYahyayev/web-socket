package az.maqa.spring.websocket.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class WsMessage implements Serializable {
    private String sender;
    private String message;
}
