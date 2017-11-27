package modelo.bean;

import java.util.Date;

public class LoginBean {

	private String nombre;
	private String password;
	private String tipo;
	private Date fecha;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String comprobar() {
		String r;
		return (nombre.equals("fulanito") ? "error" : verificar());
		//if (nombre.equals("fulanito")) return "error"; else return "ok";
	}
	
	public String verificar() {
		String d = fecha.toString();
		if(nombre.length() >= 2 && password.length() >= 1 && !d.isEmpty())
		return "ok";
		return "error";
	}

}
