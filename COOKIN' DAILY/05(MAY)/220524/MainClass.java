class MainClass{
	public static void main(String[] args) {
		Vehicle V = new Vehicle();
		V.pollutionCertificate();
		Bike B = new Bike();
		B.pollutionCertificate();
		B.engine();
		Honda H = new Honda();
		H.pollutionCertificate();
		H.engine();
		H.CC();
	}
}