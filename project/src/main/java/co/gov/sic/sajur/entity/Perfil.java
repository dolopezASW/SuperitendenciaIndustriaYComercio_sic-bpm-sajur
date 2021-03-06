package co.gov.sic.sajur.entity;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Perfil implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Dependencia")
	private int dependencia;
	@org.kie.api.definition.type.Label(value = "Trámite")
	private int tramite;
	@org.kie.api.definition.type.Label(value = "Evento")
	private int evento;
	@org.kie.api.definition.type.Label(value = "Actuación")
	private int actuacion;
	@org.kie.api.definition.type.Label(value = "Nombre de Trámite")
	private java.lang.String nombreTramite;
	@org.kie.api.definition.type.Label(value = "Nombre de Evento")
	private java.lang.String nombreEvento;
	@org.kie.api.definition.type.Label(value = "Nombre de Actuación")
	private java.lang.String nombreActuacion;
	@org.kie.api.definition.type.Label(value = "Nombre de Dependencia")
	private java.lang.String nombreDependencia;

	public Perfil() {
	}

	public int getDependencia() {
		return this.dependencia;
	}

	public void setDependencia(int dependencia) {
		this.dependencia = dependencia;
	}

	public int getTramite() {
		return this.tramite;
	}

	public void setTramite(int tramite) {
		this.tramite = tramite;
	}

	public int getEvento() {
		return this.evento;
	}

	public void setEvento(int evento) {
		this.evento = evento;
	}

	public int getActuacion() {
		return this.actuacion;
	}

	public void setActuacion(int actuacion) {
		this.actuacion = actuacion;
	}

	public java.lang.String getNombreTramite() {
		return this.nombreTramite;
	}

	public void setNombreTramite(java.lang.String nombreTramite) {
		this.nombreTramite = nombreTramite;
	}

	public java.lang.String getNombreEvento() {
		return this.nombreEvento;
	}

	public void setNombreEvento(java.lang.String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public java.lang.String getNombreActuacion() {
		return this.nombreActuacion;
	}

	public void setNombreActuacion(java.lang.String nombreActuacion) {
		this.nombreActuacion = nombreActuacion;
	}

	public java.lang.String getNombreDependencia() {
		return this.nombreDependencia;
	}

	public void setNombreDependencia(java.lang.String nombreDependencia) {
		this.nombreDependencia = nombreDependencia;
	}

	public Perfil(int dependencia, int tramite, int evento, int actuacion,
			java.lang.String nombreTramite, java.lang.String nombreEvento,
			java.lang.String nombreActuacion, java.lang.String nombreDependencia) {
		this.dependencia = dependencia;
		this.tramite = tramite;
		this.evento = evento;
		this.actuacion = actuacion;
		this.nombreTramite = nombreTramite;
		this.nombreEvento = nombreEvento;
		this.nombreActuacion = nombreActuacion;
		this.nombreDependencia = nombreDependencia;
	}

}