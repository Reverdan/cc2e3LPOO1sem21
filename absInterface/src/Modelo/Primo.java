package Modelo;

public class Primo extends absPropriedades
{

    public Primo(Integer num)
    {
        super(num);
    }
    
    @Override
    public void executar()
    {
        this.resposta = "É primo";
        for (int i = 2; i < this.num / 2 + 1; i++)
        {
            if (this.num % i == 0)
            {
                this.resposta = "Não é primo";
                break;
            }
        }
    }
}
