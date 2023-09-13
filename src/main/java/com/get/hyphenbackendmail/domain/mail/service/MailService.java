package com.get.hyphenbackendmail.domain.mail.service;

import com.get.hyphenbackendmail.domain.mail.presentation.dto.response.MailResponse;

public interface MailService {

    MailResponse sendMessage(String to)throws Exception;
}
