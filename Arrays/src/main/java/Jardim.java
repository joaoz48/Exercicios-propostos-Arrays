public class Jardim {
    Arvore[] arvores = new Arvore[10];
    String nomeDono;
    String contato;
    String endereco;

    public Jardim(){}

    public Jardim(String nomeDono, String contato, String endereco){
        this.nomeDono = nomeDono;
        this.contato = contato;
        this.endereco = endereco;
    }

    public void addArvore(Arvore arvore){
        for(int j=0; j<arvores.length; j++){
            if(arvores[j] != null){
                arvores[j] = arvore;
            }
        }
    }

    public void replantar() {
        for (int j = 0; j < arvores.length; j++) {
            if (arvores[j] != null) {
                if (arvores[j].altura > 0.5 && arvores[j].diametro > 0.3) {
                    System.out.println("A arvore da especie " + arvores[j].especie + " ja deve ser replantada!");
                }

            }

        }
    }

    public void precoMedio(){
        float soma = 0;
        int cont = 0;

        for (int j = 0; j < arvores.length; j++) {
            if (arvores[j] != null) {
                soma += arvores[j].preco;
                cont++;
            }

        }

        int r = (int) (soma/cont);

        System.out.println("Media preco: "+r);
    }

    public void mostraInfo(){
        System.out.println("Nome do dono do Jardim: "+nomeDono);
        System.out.println("Contato :" + contato);
        System.out.println("Endereco: "+ endereco);

        System.out.println("---- Arvores Plantadas ----");
        System.out.println();
        for (Arvore arvore : arvores) {
            if (arvore != null) {
                System.out.println("Especie: "+ arvore.especie);
                System.out.println("Altura: "+ arvore.altura);
                System.out.println("Diametro: "+ arvore.diametro);
                System.out.println("Preco: "+ arvore.preco);
                System.out.println("----------------------");
                System.out.println();
            }
        }
    }
}
