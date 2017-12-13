public class Knight extends Protagonist{

	public Knight(String username){
		super(username);
		health *= 1.1;
		strength *= 1.2;
		defense *= 1.3;
		attack *= 1.3;
	}

	public String toString(){
        return "Knight: " + name + " hp=" + health + " strength=" + strength + " def=" + defense + " atk=" + attack + System.lineSeparator();
    }
}