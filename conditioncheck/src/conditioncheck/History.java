package conditioncheck;

public class History {
	public String get_env() {
		return _env;
	}
	public void set_env(String _env) {
		this._env = _env;
	}
	public Boolean get_status() {
		return _status;
	}
	public void set_status(Boolean _status) {
		this._status = _status;
	}
	private String _env;
	private Boolean _status;
}
