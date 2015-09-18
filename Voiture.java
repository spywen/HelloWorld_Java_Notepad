public class Voiture {

	public int nbrOfWheel;
	public int nbrOfPassenger;

	public Voiture(int nbrOfWheel, int nbrOfPassenger){
		this.nbrOfWheel = nbrOfWheel;
		this.nbrOfPassenger = nbrOfPassenger;
	}

	public int GetNbrOfWheel(){
		return this.nbrOfWheel;
	}

	public int GetNbrOfPassenger(){
		return this.nbrOfPassenger;
	}

	public void GetDetails(){
		System.out.println("Number of wheel: " + GetNbrOfWheel());
		System.out.println("Number of passenger: " + GetNbrOfPassenger());
	}
}