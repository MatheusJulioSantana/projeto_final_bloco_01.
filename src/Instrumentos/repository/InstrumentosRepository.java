package Instrumentos.repository;

import Instrumentos.model.Instrumento;

public interface InstrumentosRepository {
	
	
    void procurarPorId(int id);

    void listarTodos();

    void cadastrar(Instrumento instrumento);

    void atualizar(Instrumento instrumento);

    void deletar(int id);
}
