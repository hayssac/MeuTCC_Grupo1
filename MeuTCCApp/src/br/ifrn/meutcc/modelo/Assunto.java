package br.ifrn.meutcc.modelo;

public interface Assunto {
	public void registraObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notificaObservers();

}
