package samples.doc.dto;

import java.util.List;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.lunifera.doc.dsl.api.document.IDtoDocument;
import org.lunifera.doc.dsl.api.document.IDtoField;

@SuppressWarnings("all")
public class MyDTO implements IDtoDocument {
	@SuppressWarnings("all")
	public class PropA implements IDtoField {
		private String name;

		private String description;

		public PropA() {
			this.name = "propA";
			this.description = serializeDescription().toString();

		}

		public CharSequence serializeDescription() {
			StringConcatenation _builder = new StringConcatenation();
			_builder.newLine();
			_builder.append("This is the description of property A.");
			_builder.newLine();
			_builder.newLine();
			return _builder;
		}

		public String getName() {
			return this.name;
		}

		public void setName(final String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(final String description) {
			this.description = description;
		}
	}

	@SuppressWarnings("all")
	public class PropB implements IDtoField {
		private String name;

		private String description;

		public PropB() {
			this.name = "propB";
			this.description = serializeDescription().toString();

		}

		public CharSequence serializeDescription() {
			StringConcatenation _builder = new StringConcatenation();
			_builder.newLine();
			_builder.append("This is the description of property B.");
			_builder.newLine();
			_builder.newLine();
			return _builder;
		}

		public String getName() {
			return this.name;
		}

		public void setName(final String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(final String description) {
			this.description = description;
		}
	}

	private String name;

	private String dtoClass;

	private String description;

	private List<IDtoField> properties;

	public MyDTO() {
		this.name = "doc.dto.MyDTO";
		this.dtoClass = "org.lunifera.sample.MyDTO";
		this.description = serializeDescription().toString();
		this.properties = new java.util.ArrayList<IDtoField>();
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

	public List<IDtoField> getProperties() {
		return this.properties;
	}

	public void setProperties(final List<IDtoField> properties) {
		this.properties = properties;
	}
}
