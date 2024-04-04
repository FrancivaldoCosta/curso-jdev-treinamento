package cursojava.classes;

//Essa classe Disciplina servirá para todos os objetos e instancias de notas e materias

import java.util.Objects;

public class Disciplina {

	private double nota1;
	private String disciplina1;

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public String getDisciplina1() {
		return disciplina1;
	}

	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplina1, nota1);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina1, other.disciplina1)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1);
	}

	@Override
	public String toString() {
		return "Disciplina [nota1=" + nota1 + ", disciplina1=" + disciplina1 + "]";
	}

}
