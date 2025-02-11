package com.sorattorafa.contactbook.controller.request;

import com.sorattorafa.contactbook.entity.Contact;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class ContactRequest {
    private String name;
    private String phone;
    private String cep;
    private Integer numero;

    public Contact toEntity(){
        return Contact.builder()
                .name(name)
                .phone(phone)
                .cep(cep.contains("-")? cep.replace("-", ""): cep)
                .numero(numero)
                .build();
    }
}
