package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import med.voll.api.endereco.DadosEndereco;
import org.springframework.scheduling.support.SimpleTriggerContext;

public record DadosCadastroPaciente(

        @NotBlank // para verificar se não é nulo
        String nome,

        @NotBlank
        @Email // serve pra verificar se o email é valido, pois ele verifica se tem @, dominio, formato valido.
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Valid
        DadosEndereco endereco
) {
}
