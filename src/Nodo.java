class Nodo {

    private Object info;
    private Nodo link;

    //costruttore
    public Nodo (Object info, Nodo link){
        this.info = info;
        this.link = link;
    }

    //metodi get e setter
    public Object getInfo(){
        return info;
    }

    public Nodo getLink(){
        return link;
    }

    public void setLink(Nodo link){
        this.link = link;
    }

    public void setInfo(int info){
        this.info = info;
    }

}
