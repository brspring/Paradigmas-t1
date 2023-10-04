abstract class CentroEsportivo {
    protected String nome;
    protected String localizacao;
    protected int quantidadeMembros;
    protected float mensalidade;
    protected String telefone;
    protected List<AtividadeEsportiva> atividades;

    CentroEsportivo(String nome, String localizacao, int quantidadeMembros, float mensalidade, String telefone) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.quantidadeMembros = quantidadeMembros;
        this.mensalidade = mensalidade;
        this.telefone = telefone;
        this.atividades = new ArrayList<>();
    }
    // tem que ver se ela quer isso no codigo, disse que queria algo curto
    void adicionarAtividade(AtividadeEsportiva atividade) {
        atividades.add(atividade);
    }

    public abstract void gerarFaturamento();
    public abstract void listarAtividadesEsportivas();
}


abstract class AtividadeEsportiva implements GarantirSupervisor{
    protected String nome;
    protected int idadeMinima;
    protected List<String> equipamentos;

    AtividadeEsportiva(String nome, int idadeMinima) {
        this.nome = nome;
        this.idadeMinima = idadeMinima;
        this.equipamentos = new ArrayList<>();
    }

    void adicionarEquipamento(String equipamento) {
        equipamentos.add(equipamento);
    }
    
    @Override
    public String obterInformacoesSupervisor() {
        return "Supervisor: " + nomeSupervisor;
    }

    abstract void listarEquipamentos();
    abstract String descreverAtividade();
}


class CentroEsportivoAmador extends CentroEsportivo {
    CentroEsportivoAmador(String nome, String localizacao, int quantidadeMembros, float mensalidade, String telefone, int capacidade) {
        super(nome, localizacao, quantidadeMembros, mensalidade, telefone);
    }

    @Override
    void exibirInformacoes() {
        System.out.println("Centro Esportivo Amador - Nome: " + nome + ", Capacidade: " + capacidade);
    }

    @Override
    void adicionarAtividade(AtividadeEsportiva atividade) {
    }
}

class CentroEsportivoProfissional extends CentroEsportivo implements VerificaProfissionalismo {
    CentroEsportivoProfissional(String nome, String localizacao, int quantidadeMembros, float mensalidade, String telefone, int capacidade) {
        super(nome, localizacao, quantidadeMembros, mensalidade, telefone);
    }

    @Override
    void exibirInformacoes() {
        System.out.println("Centro Esportivo Profissional - Nome: " + nome + ", Capacidade: " + capacidade);
    }

    @Override
    void adicionarAtividade(AtividadeEsportiva atividade) {
    }

    @Override
    public boolean verificarProfissionalismo() {
        return true; 
    }
}

// INTERFACESsssssssssssssssssssssssssssssssssssssss 

public interface VerificaProfissionalismo {
    boolean abstract verificarProfissionalismo();
}

public interface GarantirSupervisor {
    String abstract GarantirSupervisor();
}

public class abstract AtividadeEsportivaColetiva extends AtividadeEsportiva {
    AtividadeEsportivaColetiva() {
        super();
    }
}

main() {
    list<>
}