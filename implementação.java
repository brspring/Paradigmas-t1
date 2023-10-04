import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Instancia uma lista equipamentos de natação
        ArrayList<String> equipamentosNatacao = new ArrayList<String>();
        equipamentosNatacao.add("óculos");
        equipamentosNatacao.add("touca");
        AtividadeEsportiva atividadeNatacao = new Natacao(equipamentosNatacao, 10, 8, 50, "costa");

        // Instancia uma lista equipamentos de futebol
        ArrayList<String> equipamentosFutebol = new ArrayList<String>();
        equipamentosFutebol.add("bola");
        equipamentosFutebol.add("chuteira");
        AtividadeEsportiva atividadeFutebol = new Futebol(equipamentosFutebol, 11, 9, 11, "campo 90min");

        // Instancia uma lista equipamentos de musculação
        ArrayList<String> equipamentosMusculacao = new ArrayList<String>();
        equipamentosMusculacao.add("halter");
        equipamentosMusculacao.add("anilha");
        AtividadeEsportiva atividadeMusculacao = new Musculacao(equipamentosMusculacao, 11, 9, 12);

        // Instancia uma lista de atividades e adiciona equipamentosNatacao, equipamentosMusculacao e equipamentosFutebol
        ArrayList<AtividadeEsportiva> atividades = new ArrayList<AtividadeEsportiva>();
        atividades.add(atividadeNatacao);
        atividades.add(atividadeFutebol);
        atividades.add(atividadeMusculacao);

        // Instancia uma centro esportivo amador
        CentroEsportivoAmador pracaOswaldoCruz = new CentroEsportivoAmador("Oswaldo Cruz", "Batel", 0.0, 76, "41999163247", atividades, true);
    }
}