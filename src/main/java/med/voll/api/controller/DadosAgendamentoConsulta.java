package med.voll.api.controller;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(

        Long idMedico,

        @NotNull
        Long idPaciente,

        @NotNull  // campo não pode ser nulo
        @Future // Isso serve para que a pessoa não consiga agendar uma consulta em datas antigas
        LocalDateTime data) {
}
