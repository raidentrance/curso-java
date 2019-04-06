class Persona{
	String nombre;
	int edad;
	float sueldo;

	static final int MAYORIA_DE_EDAD=18;

	void caminar(){
		System.out.println("Caminando ando");
	}

	boolean esMayoDeEdad(){
		if(edad<MAYORIA_DE_EDAD){
			return false;
		}else{
		return true;
		}
	}

	


}