package Modelo;

public class Controle extends absPropriedades
{

    public Controle(String tipo, String temp)
    {
        super(tipo, temp);
    }

    @Override
    public void executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(temp);
        if (validacao.mensagem.equals(""))
        {
            Conversao conversao = new Conversao(tipo, validacao.temperatura);
            this.resposta = conversao.resposta;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }

}
