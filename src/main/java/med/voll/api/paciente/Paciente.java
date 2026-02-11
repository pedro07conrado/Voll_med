package med.voll.api.paciente;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.controller.DadosAtualizacaoMedico;
import med.voll.api.endereco.Endereco;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.Especialidade;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //Serve para dizer para o banco de dados que quem gera esse ID é o banco.
    private Long id;
    private boolean ativo;
    private String nome;
    private String email;
    private String telefone;

    @Embedded // serve para mapear onde está a outra tabela (Como classe é tabela)
    private Endereco endereco;

    public Paciente (DadosCadastroPaciente dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }


    /*O motivo do if é para validar se o dado não é null, pois se eu não tivesse
    * esse If e fosse null eu estaria sobreescrevendo com valor null*/
    public void AtualizarInformacoes (@Valid DadosAtualizacaoPaciente dados){
        if (dados.nome() != null){
            this.nome = dados.nome();
        }
        if (dados.email() != null){
            this.email = dados.email();
        }
        if (dados.telefone() != null){
            this.telefone = dados.telefone();
        }
    }

    public void excluir () {
        this.ativo = false;
    }

}
