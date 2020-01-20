public class IdiomaFactory {

    public Idioma crear(String etqIdioma){

        switch(etqIdioma){
            case "es": return new IdiomaEspañol();
            case "en": return new IdiomaIngles();
            case "it": return new IdiomaItaliano();
            case "ma": return new IdiomaMalatí();
            case "epo": return new IdiomaEsperanto();
            default: return new IdiomaEspañol();
        }
    }
}
