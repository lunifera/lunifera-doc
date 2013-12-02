package samples.doc.dto;

import java.util.List;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.lunifera.doc.dsl.api.document.IDTOProperty;
import org.lunifera.doc.dsl.api.document.IMetaDTO;

@SuppressWarnings("all")
public class MyDTO implements IMetaDTO {
	@SuppressWarnings("all")
	public class PropA implements IDTOProperty {
	}

	@SuppressWarnings("all")
	public class PropB implements IDTOProperty {
	}

	private String name;

	private String dtoClass;

	private String description;

	private List<IDTOProperty> properties;

	public MyDTO() {
		this.name = "doc.dto.MyDTO";
		this.dtoClass = "org.lunifera.sample.MyDTO";
		this.properties = new java.util.ArrayList<IDTOProperty>();
		this.properties.add(new PropA());
		this.properties.add(new PropB());

	}

	public CharSequence serializeDescription() {
		StringConcatenation _builder = new StringConcatenation();
		_builder.newLine();
		_builder.append("<h1>");
		_builder.append("This is MyDTO.");
		_builder.append("</h1>");
		_builder.newLineIfNotEmpty();
		_builder.newLine();
		_builder.append("This is an ");
		_builder.append("<a href=\"");
		_builder.append("http://www.example.org");
		_builder.append("\">");
		_builder.append("example url");
		_builder.append("</a>");
		_builder.newLineIfNotEmpty();
		_builder.newLine();
		return _builder;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDtoClass() {
		return this.dtoClass;
	}

	public void setDtoClass(final String dtoClass) {
		this.dtoClass = dtoClass;
	}

	public String getDescription() {
		return serializeDescription().toString();
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public List<IDTOProperty> getProperties() {
		return this.properties;
	}

	public void setProperties(final List<IDTOProperty> properties) {
		this.properties = properties;
	}
}