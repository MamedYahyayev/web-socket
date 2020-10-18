package az.maqa.spring.websocket.controller;

import az.maqa.spring.websocket.model.WsMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin
@Slf4j
public class ChatController {

    @Autowired
    private SimpMessagingTemplate template;

    @MessageMapping("/chat")
    public void chatEndPoint(@Payload WsMessage message) {
        log.info(message.toString());
        template.convertAndSend("/topic", message);
    }


}
