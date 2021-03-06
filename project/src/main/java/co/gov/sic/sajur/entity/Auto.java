package co.gov.sic.sajur.entity;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Auto implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "AUTO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "AUTO_ID_SEQ", name = "AUTO_ID_GENERATOR")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label(value = "strTipo")
	private java.lang.String strTipo;

	public Auto() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getStrTipo() {
		return this.strTipo;
	}

	public void setStrTipo(java.lang.String strTipo) {
		this.strTipo = strTipo;
	}

	public Auto(java.lang.Long id, java.lang.String strTipo) {
		this.id = id;
		this.strTipo = strTipo;
	}

}