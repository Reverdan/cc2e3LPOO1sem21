package modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String numero)
    {
        super(numero);
        this.validarNumero();
    }
    
    private void validarNumero()
    {
        this.setMensagem("");
        try
        {
            this.setNum(Integer.parseInt(this.getNumero()));
        }
        catch (Exception e)
        {
            this.setMensagem("Número inválido");
        }
    }
}
