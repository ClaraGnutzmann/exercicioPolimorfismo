package entities;

public class FuncionarioTercerizado extends Funcionario {
    private double horasAdicionais;

    public FuncionarioTercerizado() {
        super();
    }

    public FuncionarioTercerizado(String nome, Integer horas, Double valorPorHoras, double horasAdicionais) {
        super(nome, horas, valorPorHoras);
        this.horasAdicionais = horasAdicionais;
    }

    public double getHorasAdicionais() {
        return horasAdicionais;
    }

    public void setHorasAdicionais(double horasAdicionais) {
        this.horasAdicionais = horasAdicionais;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + horasAdicionais * 1.1;
    }
}
