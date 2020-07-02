package net.sovliv.controllers;

import net.sovliv.entity.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Вся реализация задачи в этом классе.
 * @author Solovyov Vladimir
 */

@RestController
@RequestMapping("/controller")
public class MessageController {

    /**
     * Logger
     */
    Logger logger = LoggerFactory.getLogger(MessageController.class);

    /**
     * Класс, в котором задаются все параметры для объекта.
     * @return JSON Object.
     */
    @GetMapping("/get")
    public Message createMessage() {
        Message message = new Message();

        //задаю рандомное значение для первого параметра объекта
        message.setMsisdn(Math.random()*100);
        //рандомно задаю значение для второго параметра объекта
        message.setAction(message.getMsisdn() > 50 ? "PURCHASE" : "SUBSCRIPTION");
        //задаю дату
        message.setTimestamp(System.currentTimeMillis());

        if (message.getAction() == null || message.getTimestamp() == null) {
            logger.error("*******OBJECT CREATED INCORRECT*******");
        }
        logger.info("*******OBJECT CREATED*******{}", message.toString());

        return message;
    }
}
