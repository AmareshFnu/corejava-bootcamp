package example.com.nonaccessspecifierclass;

class PackageParentClass {

	private String _private;

	public String get_private() {
		return _private;
	}

	public void set_private(String _private) {
		this._private = _private;
	}

	public String get_protected() {
		System.out.println(_protected);
		return _protected;
	}

	public void set_protected(String _protected) {
		this._protected = _protected;
	}

	public String get_public() {
		return _public;
	}

	public void set_public(String _public) {
		this._public = _public;
	}

	protected String _protected;
	public String _public;
	String _default;

	public String get_default() {
		System.out.println(_default);
		return _default;
	}

	public void set_default(String _default) {
		this._default = _default;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
