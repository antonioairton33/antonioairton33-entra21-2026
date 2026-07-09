package interfaces;

import java.util.List;

import modelos.Pig;

public interface ICRUD {
   Pig salvar(Pig pig);
   void deletar(int id);
   void alterar(Pig pig);
   Pig consultar(int id);
   List<Pig> consultar();
}
