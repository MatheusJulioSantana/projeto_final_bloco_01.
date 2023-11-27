package Instrumentos.controller;

import Instrumentos.model.Instrumento;
import Instrumentos.repository.InstrumentosRepository;

import java.util.ArrayList; 

public class InstrumentosController implements InstrumentosRepository {
    private ArrayList<Instrumento> listaInstrumentos = new ArrayList<>(); 
    int id=0;
    @Override
    public void procurarPorId(int id) {
        var instrumento = buscarNaCollection(id);
        if (instrumento != null)
            instrumento.visualizar();
        else
            System.out.println("\nO instrumento de id: " + id + " não foi encontrado!");
    }

    @Override
    public void listarTodos() {  
        for (var instrumento : listaInstrumentos) {
            instrumento.visualizar();
        }
    }

    @Override
    public void cadastrar(Instrumento instrumento) {
        listaInstrumentos.add(instrumento);
        System.out.println("\nO instrumento foi adicionado com sucesso!");
    }

    @Override
    public void atualizar(Instrumento instrumento) {
        var buscaInstrumento = buscarNaCollection(instrumento.getId());
        if (buscaInstrumento != null) {
            listaInstrumentos.set(listaInstrumentos.indexOf(buscaInstrumento), instrumento);
            System.out.println("\nO instrumento de id: " + instrumento.getId() + " foi atualizado com sucesso!");
        } else {
            System.out.println("\nO instrumento de id: " + instrumento.getId() + " não foi encontrado!");
        }
    }

    @Override
    public void deletar(int id) {
        var instrumento = buscarNaCollection(id);

        if (instrumento != null) {
            if (listaInstrumentos.remove(instrumento)) {
                System.out.println("\nO instrumento de id: " + id + " foi deletado com sucesso!");
            }
        } else {
            System.out.println("\nO instrumento de id: " + id + " não foi encontrado!");
        }
    }

    public int gerarId() {
        return ++id;
    }

    public Instrumento buscarNaCollection(int id) {
        for (var conta : listaInstrumentos) {
            if (conta.getId() == id) {
                return conta;
            }
        }
        return null;
    }
}

    
    
    
    
    
    
