class Car implements Vehicle.Radio {
	public void startRadio() {
		System.out.println("Start Radio...");
	}

	public void stopRadio() {
		System.out.println("Stop Radio...");
	}

	public static void main(String args[]) {
		Vehicle.Radio tata = new Car();
		tata.startRadio();
		tata.stopRadio();
	}
}