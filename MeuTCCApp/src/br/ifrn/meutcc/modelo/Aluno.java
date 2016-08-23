package br.ifrn.meutcc.modelo;

import java.util.ArrayList;

import br.ifrn.meutcc.persistencia.AlunoDAO;
import br.ifrn.meutcc.persistencia.FabricaDAO;

public class Aluno implements Assunto {
	private AlunoDAO dao;
	private static boolean status;
	private static ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public Aluno() {
		super();
		dao = FabricaDAO.getInstancia("mysql").createAlunoDAO();
	}
	
	public void setStatus(boolean valor){
		status = valor;
		notificaObservers();
	}
	
	public boolean getStatus(){
		return status;
	}
	
	public boolean addCandidato(int idTema, int idCandidato){
		return dao.addCandidato(idTema, idCandidato);
	}

	public int countCandidatos(int idTema) {
		return dao.countCandidatos(idTema);
	}

	
	//metodos dos observadores
	public ArrayList<Observer> getObservers() {   
        return observers;   
    }
	
    public void setObservers(ArrayList<Observer> observers) {   
        Aluno.observers = observers;   
    }
    
	@Override
	public void registraObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);		
	}

	@Override
	public void notificaObservers() {
		System.out.println("Todos os observadores serao notificados!");
		for (Observer ob : observers) {
			ob.update(this);
		}		
	}


}
