package Ex02.Modelos;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private int codigo;
    private String nome;
    private List<Automovel> automoveisDaPessoa;

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.automoveisDaPessoa = new ArrayList<>();
    }

    public Pessoa() {
    }

    public void insereAutomovel(Automovel automovel, int codigoAddAuto, List<Pessoa> listaDePessoas) {
        boolean automovelAdicionado = false;

        for (Pessoa pessoa: listaDePessoas) {
            if (pessoa.getCodigo() == codigoAddAuto) {
                automoveisDaPessoa.add(automovel);
                automovelAdicionado = true;
                System.out.println("AUTOMÓVEL ADICIONADO COM SUCESSO!");
            }
        }
        if (!automovelAdicionado) {
            System.out.println("PESSOA NÃO ENCONTRADA!");
        }
    }

    public void removeAutomovel(Pessoa pessoa, int codigoRemoveAuto,
                                String marcaRemoveAuto, String modeloRemoveAuto) {
        boolean automovelRemovido = false;

        for (Automovel automovel: automoveisDaPessoa) {
            if (pessoa.getCodigo() == codigoRemoveAuto) {
                if (automovel.getMarca().equals(marcaRemoveAuto) && automovel.getModelo().equals(modeloRemoveAuto)) {
                    automoveisDaPessoa.remove(automovel);
                    automovelRemovido = true;
                    break;
                }
            }
        }
        if (!automovelRemovido) {
            System.out.println("AUTOMÓVEL NÃO ENCONTRADO!");
        }
    }

    @Override
    public String toString() {
        String informacoes = "CÓDIGO: " + this.getCodigo() +
                " NOME: " + this.getNome();
        return informacoes;
    }

    public void toStringCompleto(int codigoMostaPessoa, List<Pessoa> listaDePessoas) {
        for (Pessoa pessoa: listaDePessoas) {
            if (pessoa.getCodigo() == codigoMostaPessoa) {
                String carros = "";
                for (Automovel automovel: pessoa.getAutomoveisDaPessoa()) {
                    carros += " " + automovel;
                }
                System.out.println(pessoa.toString() + "\n" + carros);
            }
        }
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public List<Automovel> getAutomoveisDaPessoa() {
        return automoveisDaPessoa;
    }
}
