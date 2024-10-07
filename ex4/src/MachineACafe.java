public class MachineACafe {

	public enum State {
		INACTIF{
			/*@Override
			public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {
				machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()+piece.getValeur());
				machineACafe.afficherMontant();
				machineACafe.setState(State.COLLECTE);
			}

			@Override
			public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
				machineACafe.afficherPasAssez(toucheBoisson);
				machineACafe.setState(State.PAS_ASSEZ);
			}

			@Override
			public void rendreMonnaie(MachineACafe machineACafe) {
				machineACafe.setState(State.INACTIF);
			}*/
		},
		COLLECTE{
			@Override
			public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {
				machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()+piece.getValeur());
				machineACafe.afficherMontant();
			}

			@Override
			public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
				if (toucheBoisson.getPrix()> machineACafe.getMontantEnCours()) {
					machineACafe.afficherPasAssez(toucheBoisson);
					machineACafe.setBoisson(toucheBoisson);
					machineACafe.setState(State.PAS_ASSEZ);
				} else {
					machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()-toucheBoisson.getPrix());
					machineACafe.afficherBoisson(toucheBoisson);
					machineACafe.afficherMontant();
					if (machineACafe.getMontantEnCours() == 0) {
						machineACafe.setState(State.INACTIF);
					} else {
						machineACafe.setState(State.COLLECTE);
					}
				}
			}

			@Override
			public void rendreMonnaie(MachineACafe machineACafe) {
				machineACafe.afficherRetour();
				machineACafe.setMontantEnCours(0);
				machineACafe.setBoisson(null);
				machineACafe.setState(State.INACTIF);
			}
		},
		PAS_ASSEZ{
			@Override
			public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {
				machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()+piece.getValeur());
				machineACafe.afficherMontant();
				machineACafe.setState(State.COLLECTE);
			}

			@Override
			public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
				throw new IllegalStateException();
			}

			@Override
			public void rendreMonnaie(MachineACafe machineACafe) {
				machineACafe.afficherRetour();
				machineACafe.setMontantEnCours(0);
				machineACafe.setBoisson(null);
				machineACafe.setState(State.INACTIF);
			}
		};

		public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {
			machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()+piece.getValeur());
			machineACafe.afficherMontant();
			machineACafe.setState(State.COLLECTE);
		}

		public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
			machineACafe.afficherPasAssez(toucheBoisson);
			//machineACafe.setState(State.PAS_ASSEZ);
		}

		public void rendreMonnaie(MachineACafe machineACafe) {
			machineACafe.setState(State.INACTIF);
		}

	}

	private State state;
	/*public final int idle = 0;
	public final int collecte = 1;
	public final int pasAssez = 2;*/
	
	private int montantEnCours = 0;
	//private int etatCourant = idle;
	private ToucheBoisson boisson = null;

	public MachineACafe() {
		setState(State.INACTIF);
	}

	public State getState() {
		return state;
	}

	public int getMontantEnCours() {
		return montantEnCours;
	}

	public ToucheBoisson getBoisson() {
		return boisson;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void setMontantEnCours(int montantEnCours) {
		this.montantEnCours = montantEnCours;
	}

	public void setBoisson(ToucheBoisson boisson) {
		this.boisson = boisson;
	}

	public void afficherMontant() {
		System.out.println(montantEnCours + " cents disponibles");
	}
	
	public void afficherRetour() {
		System.out.println(montantEnCours + " cents rendus");
	}
	
	public void afficherPasAssez(ToucheBoisson toucheBoisson) {
		System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
		System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
	}

	public void afficherBoisson(ToucheBoisson toucheBoisson) {
		System.out.println("Voici un " + toucheBoisson);
		
	}

	public void entrerMonnaie(Piece piece) {
		state.entrerMonnaie(this, piece);
	}

	/*public void entrerMonnaie(Piece piece) {
		montantEnCours += piece.getValeur();
		afficherMontant();
		if ( etatCourant != pasAssez)
			etatCourant = collecte;
		else if (boisson.getPrix() > montantEnCours) {
				afficherPasAssez(boisson);
		} else {
			montantEnCours -= boisson.getPrix();
			afficherBoisson(boisson);
			boisson = null;
			afficherMontant();
			if (montantEnCours == 0)
				etatCourant =  idle;
			else
				etatCourant =  collecte;
		}
	}*/

	public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
		state.selectionnerBoisson(this, toucheBoisson);
	}

	/*public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
		if (etatCourant == pasAssez)
			throw new IllegalStateException();
		if (etatCourant == idle) {
			afficherPasAssez(toucheBoisson);
			return;			
		}
		if (toucheBoisson.getPrix() > montantEnCours) {
			boisson = toucheBoisson;
			afficherPasAssez(boisson);
			boisson = toucheBoisson;
			etatCourant =  pasAssez;
			return;
		}
		montantEnCours -= toucheBoisson.getPrix();
		afficherBoisson(toucheBoisson);
		afficherMontant();
		if (montantEnCours == 0)
			etatCourant = idle;
		else
			etatCourant = collecte;
	}*/

	public void rendreMonnaie() {
		state.rendreMonnaie(this);
	}

	/*public void rendreMonnaie() {
		if (etatCourant != idle) {
			afficherRetour();
			montantEnCours = 0;
			boisson = null;
		}
		etatCourant = idle;
	}*/
}
