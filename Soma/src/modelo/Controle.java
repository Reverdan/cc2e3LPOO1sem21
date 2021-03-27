package modelo;

public class Controle extends absPropriedades
{
    public Controle(String num1, String num2, String operacao)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
        this.executar();
    }
    
    private void executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(this.num1, this.num2, this.operacao);
        if (validacao.getMensagem().equals(""))
        {
            Calcular calcular = new Calcular(validacao.getNumero1(), validacao.getNumero2(), this.operacao);
            this.resultado = calcular.getResultado();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
        
    }

}

