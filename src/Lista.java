class Lista {

    private Nodo head;

    public Lista() {
        head = null;
    }

    //Aggiungi nodo in testa
    public void aggiungiTesta(Object info) {
        head = new Nodo(info, head);
    }

    //Rimuovi in testa
    public void rimuoviInTesta(){
        head = head.getLink();
    }

    //ToString
    public String toString(){

        String s = "";

        for (Nodo p = head; p != null; p = p.getLink()){
            s = p.getInfo() + " ";

        }
        return s;
    }


    /*ToString ricorsivo
    public String toString() {
        return toString(head);
    }

    private String toString(Nodo p) {
        if (p == null)
            return "";
        else
            return p.getInfo() + " " + toString(p.getLink());
    }
     */

    //ricerca
    public boolean cerca(Object info) {
        boolean trovato = false;

        for (Nodo p = head; p != null && !trovato; p.getLink()) {
            trovato = p.getInfo().equals(info);
        }

        return trovato;
    }

    //ricerca ricorsiva
    /*
    private boolean cerca(Object info, Nodo p){
        if(p == null)
            return false;
        else
            return p.getInfo().equals(info) || cerca (info, p.getLink());
    }

    public boolean cerca (Object info){
        return cerca (info, head);
    }
     */

    //Inserimento alla fine della lista
    public void inserisciInCoda(Object info){
        if (head == null){
            aggiungiTesta(info);
        }
        else{
            Nodo p = head;
            for (; p.getLink() != null; p = p.getLink()){
                ;
            }
            p.setLink(new Nodo(info, null));
        }
    }


    /*Controlla se pari, solo per int
    public boolean tuttiPari(){
        boolean controllo = true;
        for(Nodo p = head; p != null && controllo; p = p.getLink())
            controllo = (p.getInfo() % 2) == 0;
        return controllo;
    }
    */

    //Rimuovi alla fine
    public void removeFine(){
        if (head != null) {
            if(head.getLink() == null)
                head = null;
            else {
                Nodo p = head;
                for(;p.getLink().getLink() != null; p = p.getLink() )
                    ;
                p = null;
            }
        }
    }

    //Calcola grandezza
    public int size(){
        int i = 0;
        Nodo p = head;
        for(; p != null; p = p.getLink())
            ++i;
        return i;
    }

    //Svuota la lista
    public void clear(){
        head = null;
    }

    //Rimuovi un determinato oggetto
    public void rimuovi(Object x) {
        Nodo prima = head;

        for (Nodo p = head; p != null; p = p.getLink()) {
            if (((Object)p.getInfo()).equals((Object) x)) {
                prima.setLink(p.getLink());
            }
            prima = p;
        }
    }
}
