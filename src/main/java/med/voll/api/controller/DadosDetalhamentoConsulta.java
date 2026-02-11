package med.voll.api.controller;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(

        Long id,

        Long idmedico,

        @NotNull
        Long idPaciente,

        @NotNull
        @Future
        LocalDateTime data) {
}
