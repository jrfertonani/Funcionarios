package back._config.Enums;

import lombok.Getter;

@Getter
public enum Genres {
    // aqui são os enums
    ACAO(0,"AÇÃO"),
    COMEDIA(1,"COMEDIA"),
    AVENTURA(2,"AVENTURA");

    //aqui as instancias
    private final Integer codigo;
    private final String descricao;

    //aqui construtor
    Genres(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    //aqui um codigo para verificar se existe ou não de enum
    //se existir retorna ele se não retorna uma exceção (não necessario)
    public static Genres toEnum(Integer cod){
        if( cod == null){
            return null;
        }
        for(Genres x : Genres.values()){
            if(cod.equals(x.getCodigo())){
                return x;
            }
        }
        throw new IllegalArgumentException(" Invalid gender: " + cod);
    }

}
