package com.mediacom.extensions.Model;

import lombok.Data;

@Data
public class DomainDTO {

        private String dominio;

        public DomainDTO(String dominio) {
                this.dominio = dominio;
        }


}
