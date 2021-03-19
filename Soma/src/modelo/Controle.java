package modelo;

public class Controle 
{
    public String num1;
    public String num2;
    public String mensagem;
    public String operacao;
    public String resultado;
    
    public void executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.num1 = this.num1;
        validacao.num2 = this.num2;
        validacao.operacao = this.operacao;
        validacao.validar();
        if (validacao.mensagem.equals(""))
        {
            Calcular calcular = new Calcular();
            calcular.numero1 = validacao.numero1;
            calcular.numero2 = validacao.numero2;
            calcular.operacao = this.operacao;
            calcular.resolver();
            this.resultado = calcular.resultado;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
}

