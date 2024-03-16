package ru.relex.service;

import ru.relex.utils.dto.MailParams;

public interface MailSenderService {
    void send(MailParams mailParams);
}